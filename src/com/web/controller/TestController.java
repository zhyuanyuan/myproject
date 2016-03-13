package com.web.controller;

import com.web.service.TestService;
import data.framework.controller.AbstractBaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by lenovo on 2016/3/13.
 */
@Controller
@RequestMapping("pages/testpage")
public class TestController extends AbstractBaseController {
//    private TestService hahaservice;

 /*   @Override
    protected void init(ModelMap model, HttpServletRequest request) {

    }*/

    @RequestMapping(params = "command=search")
    public void getAllMessage() throws Exception{
        System.out.println("test go");
//        hahaservice.sayHello();
    }


    @Override
    protected void init(ModelMap model, HttpServletRequest request) {
        System.out.println("ื฿มหรป");
    }
}
