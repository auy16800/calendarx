package com.auy.controller;


import com.auy.api.SimpleApi;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SimpleController implements SimpleApi {


    @RequestMapping(value = "/ls/{id}",method = RequestMethod.GET)
    public String lishuang() {
        return "niasdlqwe";
    }
}
