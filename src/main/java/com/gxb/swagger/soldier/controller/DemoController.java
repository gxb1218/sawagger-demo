/**
 * @Description: TODO
 * @author: scott
 * @date: 2021年03月20日 15:54
 */
package com.gxb.swagger.soldier.controller;

import com.gxb.swagger.soldier.interfaceDemo.NotIncludeSwagger;
import com.gxb.swagger.soldier.pojo.People;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/people")
@Api(tags = {"myDemo"}, description = "DemoController描述")
public class DemoController {
    @RequestMapping("/getPeople")
    @ApiOperation(value = "接口描述", notes = "提示信息")
    public People getPeople(Long id, @ApiParam(value = "姓名,这个是参数描述",required = true) String name) {
        People people = new People();
        people.setId(id);
        people.setName(name);
        people.setAddress("南宁");
        return people;
    }

    @RequestMapping("/getPeople2")
    @NotIncludeSwagger
    public People getPeople2(Long id, String name, String address) {
        People people = new People();
        people.setId(id);
        people.setName(name);
        people.setAddress(address);
        return people;
    }
}
