package com.example.demo.Controller;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.example.demo.Entity.User;
import com.example.demo.Service.IUserService;
import com.example.demo.Util.ApiResult;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Api(description = "用户接口",value = "用户接口")   //接口文档的注解
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @ApiOperation(value ="根据用户ID获得用户信息")   //接口文档方法名注解
    @ApiImplicitParam(name = "id",value = "用户ID",required = true)  //接口文档入参注解
    @GetMapping(value = "/{id}")
    public ApiResult<User> Get(@PathVariable int id){
        return new ApiResult(0,"", userService.selectById(id));
    }

    @ApiOperation(value ="添加用户")
    @ApiImplicitParam(name="user",value = "用户信息",dataType = "user")
    @PostMapping(value = "/add")
    public boolean Add(User user){
        return userService.insert(user);
    }

    @ApiOperation(value ="删除用户")
    @ApiImplicitParam(name="id",value = "用户ID",required = true)
    @DeleteMapping(value = "/")
    public boolean Del(int id){
        return userService.deleteById(id);
    }

    @ApiOperation(value ="修改用户性别")
    @PutMapping(value = "/")                                                               // 下面这个是接口文档参数名注解
    public boolean Update(@ApiParam(name="id",value ="用户ID",required = true) int id,@ApiParam(name = "sex",value = "性别") String sex){
        User u=userService.selectById(id);
        u.setSex(sex);

        return userService.updateById(u);
    }
}
