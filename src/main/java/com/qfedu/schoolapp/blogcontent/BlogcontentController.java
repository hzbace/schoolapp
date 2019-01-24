package com.qfedu.schoolapp.blogcontent;

import com.qfedu.service.sblogcontent.ISBlogcontentService;
import com.qfedu.tool.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api
public class BlogcontentController {
    @Autowired
    private ISBlogcontentService service;

    @PostMapping("addBlogContent.do")
    @CrossOrigin
    @ApiOperation(value = "添加文章内容，需要传入Blog对应文章的id，文章内容")
    public ResultVo addBlogContent(Integer blcBid, String blcContent){
        return service.addBlogContent(blcBid, blcContent);
    }
}
