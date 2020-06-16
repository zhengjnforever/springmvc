package cn.tx.util;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: springmvcstudy
 * @description: 把string转成date
 * @author: Sam
 * @create: 2020-05-31 14:51
 **/

public class StringTodDate implements Converter<String, Date> {
    /**
     * @param s
     * @return java.util.Date
     * @author yuxin
     * @creed: 进行类型转换的方法
     * @date 2020/5/31 14:55
     */
    @Override
    public Date convert(String s) {

        if(null == s){
            throw new RuntimeException("请输入内容");
        }
        //进行转换
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MMM-dd");

        try {
           return sdf.parse(s);
        }catch (ParseException e){
            throw new RuntimeException("请输入内容");
        }


    }
}
