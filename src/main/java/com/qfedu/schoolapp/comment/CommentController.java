package com.qfedu.schoolapp.comment;

import com.qfedu.service.scomment.ISCommentService;
import com.qfedu.tool.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api
public class CommentController {
    @Autowired
    private ISCommentService service;
    @PostMapping("showAllComment.do")
    @ApiOperation(value = "传入该文章id，获取该文章所有评论")
    @CrossOrigin
    public ResultVo showAllContent(Integer cmId){
        return service.showAllComment(cmId);
    }

    @PostMapping("addComment.do")
    @ApiOperation(value = "传入该文章id，获取该文章所有评论")
    @CrossOrigin
    public ResultVo addComment(Integer cmId, String token, String cmContent){
        return service.addComment(cmId, token, cmContent);
    }

}
