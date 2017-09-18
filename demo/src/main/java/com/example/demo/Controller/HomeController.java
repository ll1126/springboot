package com.example.demo.Controller;

import com.example.demo.Entity.User;
import com.example.demo.Service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.example.demo.Mapper.*;

@RestController      //就是Controller
@Api(description = "首页")
@RequestMapping("/")
public class HomeController {
    @GetMapping(value = "/hello")
    public String hello(){
        return "hello";
    }
}
