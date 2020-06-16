package cn.tx.controller;

import cz.mallat.uasparser.OnlineUpdater;
import cz.mallat.uasparser.UASparser;
import cz.mallat.uasparser.UserAgentInfo;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @program: tx_ssm
 * @description: usergent
 * @author: Sam
 * @create: 2020-06-09 15:48
 **/
@Controller
@RequestMapping("/check")
public class CheckUserGent {

    @RequestMapping("/useagent")
    public ModelAndView usergent(HttpServletRequest request) throws IOException {

        UASparser uasParser=new UASparser(OnlineUpdater.getVendoredInputStream());
        String usergent=request.getHeader("User-Agent");
        UserAgentInfo userAgentInfo = uasParser.parse(usergent);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("useragentmessage");
        modelAndView.addObject("czxt",userAgentInfo.getOsFamily());
        modelAndView.addObject("usergent",usergent);
        return modelAndView;
    }
}
