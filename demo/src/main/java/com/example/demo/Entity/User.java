package com.example.demo.Entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;

@TableName("t_user")    //对应哪张表
@ApiModel( description = "用户信息")    //实体类注解
public class User {

    public User(int _id,String _userName,String _password,String _sex){
        id=_id;
        UserName=_userName;
        Password=_password;
        Sex=_sex;
    }

    @TableId
    private int id;

    private String UserName;

    private String Password;

    private String Sex;
    @ApiModelProperty(notes = "用户ID")   //实体类返回参数注解
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ApiModelProperty(notes = "用户名",required = true)
    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    @ApiModelProperty(notes = "密码",required =true)
    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @ApiModelProperty(notes = "性别")
    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }
}
