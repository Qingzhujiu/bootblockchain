package com.mrli.bootblockchain.controller;

import com.mrli.bootblockchain.common.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.UUID;

@RestController
@RequestMapping("/common")
@Slf4j
public class CommonController {
    /**
     * 获取.yaml配置文件中写入的指定存入地址
     */
    @Value("${bootblockchain.path}")
    public String basePath;


    /**
     * 实现文件上传功能
     * @param file
     * @return
     */
    @RequestMapping(value = "/upload")
    public R<String> upload(MultipartFile file){
        //此时的file为一个临时文件，存储在系统的临时文件夹中，需要进行转存，否则本次请求完成后临时文件将会消失
        log.info(file.toString());

        //获取原始文件名  通过截取获得文件的后缀
        String originalFilename = file.getOriginalFilename();
        //通过截取原始文件名 来获得原始文件的后缀
        String originalFileSuffix = originalFilename.substring(originalFilename.lastIndexOf("."));

        //使用UUID来生成文件名，防止文件名重复导致上传文件被覆盖
        String fileName = UUID.randomUUID().toString();
        fileName = fileName + originalFileSuffix;
        //防止进行存储时，目录不存在导致报错
        //创建一个目录对象
        File dir = new File(basePath);
        //判断当前目录是否存在
        if (!dir.exists()) {
            //目录不存在则进行创建
            dir.mkdirs();
        }

        try {
            //将临时文件进行转存
            String finalFileName = basePath +fileName;
            file.transferTo(new File(finalFileName));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return R.success(fileName,1);
    }

    /**
     * 实现文件下载功能
     * @param name
     * @param response
     */
    @RequestMapping("/download")
    public void download(String name, HttpServletResponse response){
        FileInputStream fileInputStream = null;
        ServletOutputStream outputStream = null;
        try {
            //构建输入流，将指定文件进行读入
            fileInputStream =new FileInputStream(new File(basePath+name));

            //获取请求页面的输出流，通过输出流将文件写回浏览器，在浏览器中展示
            outputStream = response.getOutputStream();
            //（可选）设置返回数据的类型
            //response.setContentType("image/jpeg");

            int len = 0;
            byte[] bytes = new byte[1024];
            while ((len = fileInputStream.read(bytes)) != -1) {
                outputStream.write(bytes,0,len);
                outputStream.flush();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //关闭流资源
            try {
                fileInputStream.close();
                outputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }


}
