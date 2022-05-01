package ltd.newbee.mall.newbeemall.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.service.GoodsInfoService;
import ltd.newbee.mall.newbeemall.service.GoodsQAService;
import ltd.newbee.mall.newbeemall.service.GoodsReviewService;
import ltd.newbee.mall.newbeemall.util.Result;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;

@Controller
public class GoodsController {
	
	@Resource
	private GoodsInfoService goodsInfoService;
	
	@Resource
	private GoodsQAService goodsQAService;
	
	@Resource
	private GoodsQAService goodsQANumAndPageService;
	
	@Resource
	private GoodsReviewService goodsReviewService;
	
	@GetMapping("/GoodsInfo")
    @ResponseBody
    
    public Result getGoodsInfo(long goodsId) {
		
		
		return ResultGenerator.genSuccessResult(goodsInfoService.getGoodsInfo(goodsId));
    
	}
	
	@GetMapping("/GoodsQA")
    @ResponseBody
    
    public Result getGoodsQA(int startOffsetIndex, int pageLimitNumber, long goodsId,String orderByCol) {
		
		
		return ResultGenerator.genSuccessResult(goodsQAService.getGoodsQA(startOffsetIndex,pageLimitNumber,goodsId,orderByCol));
    
	}
	
	@GetMapping("/GoodsReview")
    @ResponseBody
    public Result getGoodsReview(int rating,long start,long number,long goodsId) {
		return ResultGenerator.genSuccessResult(goodsReviewService.getGoodsReview(rating,start,number,goodsId)); 
    }
	
	
}