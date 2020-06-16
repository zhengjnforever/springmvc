package cn.tx.controller;

import cn.tx.pojo.log;
import cn.tx.pojo.message;
import cn.tx.service.usergentService;
import cn.tx.util.UserAgentUtils;
import cz.mallat.uasparser.OnlineUpdater;
import cz.mallat.uasparser.UASparser;
import cz.mallat.uasparser.UserAgentInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: tx_ssm
 * @description: usergent
 * @author: Sam
 * @create: 2020-06-09 15:48
 **/
@Controller

public class CheckUserGent {

    @Autowired
    private usergentService service;

    @RequestMapping(value = "/")
    public ModelAndView usergent(HttpServletRequest request) throws IOException {


        UASparser uasParser=new UASparser(OnlineUpdater.getVendoredInputStream());
        //获取usergent信息
        String usergent=request.getHeader("User-Agent");
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("useragentmessage");
        //操作系统
        String systemname= UserAgentUtils.getOs(usergent);
        //设备型号
        String mechine=UserAgentUtils.getOsName(usergent);
        //ip地址
        String ip=request.getRemoteAddr();
        //浏览器
        String browser=UserAgentUtils.getBorderName(usergent);
        //通信协议获取
        String network=request.getScheme();
        //端口
        int port=request.getServerPort();
        //访问时间
        long l=System.currentTimeMillis();
        Date date=new Date(l);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time=dateFormat.format(date);
        //运行环境
        String enviroment=UserAgentUtils.getDeviceManufacturer(usergent);

        message m=new message(network,port,time,enviroment);


        log log=new log(systemname,mechine, ip,browser);

        if(systemname!= "Unknown"){
            service.insertlog(log);
        }
        modelAndView.addObject("log",log);
        modelAndView.addObject("usergent",usergent);
        modelAndView.addObject("m",m);
        return modelAndView;
    }
}
