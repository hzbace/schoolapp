package com.qfedu.schoolapp.userdetail;


import com.qfedu.entity.sudetail.SUdetail;
import com.qfedu.service.sudetail.ISUdetailService;
import com.qfedu.tool.vo.ResultVo;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Api(value = "修改个人信息")
public class UserDetailController {

    @Autowired
    private ISUdetailService service;

    @PostMapping("updateUserDetail.do")
    @CrossOrigin
    public ResultVo updateUserDetail(SUdetail sUdetail){
        return service.updateUserDetail(sUdetail);
    }

}
