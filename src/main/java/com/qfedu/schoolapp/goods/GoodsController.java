package com.qfedu.schoolapp.goods;

import com.qfedu.service.sgoods.ISGoodsService;
import com.qfedu.tool.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "商品类")
public class GoodsController {
    @Autowired
    private ISGoodsService service;
    @GetMapping("showGoods.do")
    @ApiOperation(value = "展示所有需要交换的商品")
    @CrossOrigin
    public ResultVo showAllGoods(){
        return service.getAllGoods();
    }

    @PostMapping("addGoods.do")
    @ApiOperation(value = "自定义添加商品，需传入商品名，商品描述，想要交换的意向，上传用户的学号")
    @CrossOrigin
    public ResultVo addGoods(String gName, String gContent,String gUwant,String gUsernum){
        return service.addGoods(gName,gContent,gUwant,gUsernum);
    }

}
