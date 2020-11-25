package com.hw.web.controller;

import com.hw.domain.Sakila;
import com.hw.query.LoginQuery;
import com.hw.service.SakilaService;
import com.hw.util.AjaxResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "权限")
@RestController
@RequestMapping("/sakila")
public class SakilaController {

    @Autowired
    private SakilaService sakilaService;

    @GetMapping("/findAll")
    @ApiOperation(value = "查询所有",notes = "查询所有")
    public AjaxResult findAll(){
        List<Sakila> result = sakilaService.selectAll();
        return AjaxResult.me().setResultObj(result);
    }

//    @GetMapping("/login")
//    @ApiOperation(value = "登录",notes = "登录")
//    public AjaxResult login(@RequestBody LoginQuery query){
//        Sakila result = sakilaService.login(query);
//        return AjaxResult.me().setResultObj(result);
//    }

}
