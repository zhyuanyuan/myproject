package com.web.service;

import data.framework.service.AbstractService;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lenovo on 2016/3/13.
 */

@Service
public class TestService extends AbstractService {

    @Autowired
    private SqlSessionTemplate template;

    public void sayHello(){
        System.out.println("this is say hello word");
    }

}

