package com.qfedu.schoolapp.userdetail;

import com.qfedu.dao.sudetail.SUdetailMapper;
import com.qfedu.entity.sudetail.SUdetail;
import com.qfedu.service.sudetail.ISUdetailService;
import com.qfedu.tool.vo.ResultVo;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Date;

@RestController
@Api(value = "用户登录,用户退出，审核账号")
public class UserDetailController {

    @Autowired
    ISUdetailService service;

    @PostMapping("updateUserDetail.do")
    @CrossOrigin
    public ResultVo updateUserDetail(SUdetail sUdetail){
        return ResultVo.setOK(service.updateById(sUdetail));
    }


}
