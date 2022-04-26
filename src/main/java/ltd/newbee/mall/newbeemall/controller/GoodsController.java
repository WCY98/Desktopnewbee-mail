package ltd.newbee.mall.newbeemall.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.service.GoodsInfoService;
import ltd.newbee.mall.newbeemall.util.Result;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;

public class GoodsController {
	
	@Resource
	private GoodsInfoService goodsInfoService;
	
	@GetMapping("/GoodsInfo")
    @ResponseBody
    
    public Result getGoodsInfo(long goodsId) {
		
		
		return ResultGenerator.genSuccessResult(goodsInfoService.getGoodsInfo(goodsId));
    
	}
}
