/**
 * @Description: TODO
 * @author: scott
 * @date: 2021年03月20日 15:52
 */
package com.gxb.swagger.soldier.pojo;

import io.swagger.annotations.ApiModel;

@ApiModel(value = "姓名：人类",description = "描述")
public class People {
    private Long id;
    private String name;
    private String address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
