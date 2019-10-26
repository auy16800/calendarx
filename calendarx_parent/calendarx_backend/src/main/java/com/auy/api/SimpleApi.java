package com.auy.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Api(value="数据字典",description = "新增课程中的数据字典，管理、查询功能")
public interface SimpleApi {

    @ApiOperation("数据字典_课程等级动态查询")
    public String lishuang();

}
