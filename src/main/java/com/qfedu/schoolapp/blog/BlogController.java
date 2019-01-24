package com.qfedu.schoolapp.blog;

import com.qfedu.service.sblog.ISBlogService;
import com.qfedu.tool.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "学习交流")
public class BlogController {
    @Autowired
    private ISBlogService service;

    @PostMapping("addBlog.do")
    @CrossOrigin
    @ApiOperation(value = "审核发表文章是否文明，文明则添加，需要传入文章的风格1~5，你们规定是什么风格int类型，传入token，传入标题")
    public ResultVo addBlog(Integer blStyle, String token, String blItem){
        return service.checkBlog(blStyle, token, blItem);
    }

    @PostMapping("showAllBlog.do")
    @CrossOrigin
    @ApiOperation(value = "展示所有的文章")
    public ResultVo showAllBlog(){
        return service.showAllBlog();
    }


    @PostMapping("updateShare.do")
    @CrossOrigin
    @ApiOperation(value = "点击点赞按钮则可是点赞数加一，需要传入文章id和需要修改后（一般加一）的点赞数量")
    public ResultVo updateShare(Integer blId, Integer blSharenum){
        return service.updateShare(blId, blSharenum);
    }



}
