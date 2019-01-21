package com.qfedu.schoolapp.userapp;

import com.qfedu.service.suser.ISUserService;
import com.qfedu.tool.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "用户登录,用户退出，审核账号")
public class UserController {
    @Autowired
    private ISUserService service;

    @GetMapping("checkstunum.do")
    @CrossOrigin
    @ApiOperation(value = "审核账号接口：需要传入用户学号，该方法用于检验该用户的学号是否可用,是否重复")
    public ResultVo check(String usernum){
        return service.check(usernum);
    }

    @PostMapping("login.do")
    @CrossOrigin
    @ApiOperation(value = "用户登录接口：需传入用户id和用户密码")
    public ResultVo login(String usernum, String userpassword){
        return service.login(usernum, userpassword);
    }

    @GetMapping("loginout.do")
    @CrossOrigin
    @ApiOperation(value = "用户登出接口：需传入token")
    public ResultVo loginOut(String token){
        return service.loginout(token);
    }

}
