package com.qfedu.schoolapp.sschedule;

import com.qfedu.service.sschedule.ISScheduleService;
import com.qfedu.tool.vo.ResultVo;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "日程表查询")
public class SScheduleController {
    @Autowired
    private ISScheduleService service;

    @PostMapping("selectClassByMjid.do")
    @CrossOrigin
    public ResultVo selectClassByMjid(Integer sdMjid){
        System.out.println(sdMjid);
        return service.selectByMjid(sdMjid);


    }
}
