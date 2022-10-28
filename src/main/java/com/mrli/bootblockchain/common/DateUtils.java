package com.mrli.bootblockchain.common;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    /**
     * 对指定的date对象进行格式化：yyyy-mm-dd hh:mm:ss
     * @param date
     * @return
     */
    public static String formateDateTime(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr=sdf.format(date);
        return dateStr;
    }

    /**
     * 对指定的date对象进行格式化：yyyy-mm-dd
     * @param date
     * @return
     */
    public static String formateDate(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateStr=sdf.format(date);
        return dateStr;
    }

    /**
     * 对指定的date对象进行格式化：hh:mm:ss
     * @param date
     * @return
     */
    public static String formateTime(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String dateStr=sdf.format(date);
        return dateStr;
    }

}
