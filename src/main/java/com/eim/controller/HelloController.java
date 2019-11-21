package com.eim.controller;

import com.eim.entity.Country;
import com.eim.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 */
@RestController
public class HelloController {
    @Autowired
    CountryService countryService;

    @RequestMapping("/hello")
    public Country login(){
        return  countryService.select();
    }
}
