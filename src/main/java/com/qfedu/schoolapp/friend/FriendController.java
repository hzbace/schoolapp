package com.qfedu.schoolapp.friend;

import com.qfedu.service.sfriend.ISFriendService;
import com.qfedu.tool.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "好友类")
public class FriendController {
    @Autowired
    private ISFriendService service;
    @GetMapping("showAllFriend.do")
    @ApiOperation(value = "展示所有好友")
    @CrossOrigin
    public ResultVo showAllFriend(String token){
        return service.getAllFriend(token);
    }
}
