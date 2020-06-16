package cn.tx.controller;

import cn.tx.domain.Account;
import cn.tx.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @program: tx_ssm
 * @description: 的
 * @author: Sam
 * @create: 2020-06-07 16:14
 **/

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService service;

    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        System.out.println("表现层：查询所有账号");

        List<Account> list=service.findAll();
        for (Account account:list) {
            System.out.println(account);
        }
        ModelAndView mv = new ModelAndView();
        mv.setViewName("suc");
        return mv;
    }
}
