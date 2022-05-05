package ltd.newbee.mall.newbeemall.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.entity.GoodsQA;
import ltd.newbee.mall.newbeemall.entity.GoodsReview;
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
	private GoodsReviewService goodsReviewService;
	
	@GetMapping("/GoodsInfo")
    @ResponseBody
    
    public Result getGoodsInfo(long goodsId) {
		
		
		return ResultGenerator.genSuccessResult(goodsInfoService.getGoodsInfo(goodsId));
    
	}
	
	@GetMapping("/GoodsQA")
    @ResponseBody
    
    public Result getGoodsQA(int pageNo, int pageLimitNumber, long goodsId,String orderByCol) {
		
		
		return ResultGenerator.genSuccessResult(goodsQAService.getGoodsQA(pageNo,pageLimitNumber,goodsId,orderByCol));
    
	}
	
	@PostMapping("/GoodsQA/insert")
    @ResponseBody
    
    public Result insertGoodsQA(@RequestBody HashMap<String,Object> mapQuestion) {
		
		
		return ResultGenerator.genSuccessResult(goodsQAService.selectMaxQuestionId(mapQuestion));
    
	}
	
	@PostMapping("/GoodsQA/insertQaLike")
    @ResponseBody
    public Result insertQaLike(@RequestBody HashMap<String, Object> mapQALike) {
		//object转成String
		String userId1 = mapQALike.get("userId").toString();
		String answerId1 = mapQALike.get("answerId").toString();
		
		long answerId = Long.parseLong(answerId1);
		long userId = Long.parseLong(userId1);
		
		//如果count是1不可插入如果count是0可以插入
		int checkCount = goodsQAService.insertGoodsQALikeOrNot(userId, answerId);
		
//		if (count != 0) {
//		return ResultGenerator.genFailResult("Failed!!");
//	}else
//	return ResultGenerator.genSuccessResult(goodsReviewService.insertGoodsReview(mapReviewLike)); 
//}
		//先判断这一条点赞的数据存不存在
	if (checkCount == 0) {
		int insertCount = goodsQAService.insertGoodsQALike(mapQALike);
		//判断插入成不成功
		if(insertCount > 0 ) {
			return ResultGenerator.genSuccessResult("Succeed!!"); 
		}else {
			return ResultGenerator.genFailResult("Failed!!");
		}
	}else {
		return ResultGenerator.genFailResult("Failed!");
	}
			
		}
	
	//------------------------------------------------------------------------------------------------------
	
	
	@GetMapping("/GoodsReview")
    @ResponseBody
    public Result getGoodsReview(int rating,long start,long number,long goodsId) {
		return ResultGenerator.genSuccessResult(goodsReviewService.getGoodsReview(rating,start,number,goodsId)); 
    }
	
//	@GetMapping("/GoodsReview/Check")
//    @ResponseBody
//    public Result getGoodsReviewCheck(long goodsId,long userId) {
//		
//		return ResultGenerator.genSuccessResult(goodsReviewService.getGoodsReview(rating,start,number,goodsId)); 
//    }
	
	@PostMapping("/GoodsReview/insert")
    @ResponseBody
    public Result insertReview(@RequestBody HashMap<String,Object> mapReview) {
		//object转成String
		String userId1 = mapReview.get("userId").toString();
		String goodsId1 = mapReview.get("goodsId").toString();
		
		long goodsId = Long.parseLong(goodsId1);
		long userId = Long.parseLong(userId1);
		
		List<GoodsReview>entityList = goodsReviewService.findReviewWrittenByGoodsId(goodsId,userId);
		
		if (entityList !=null && entityList.size()== 0) {
			return ResultGenerator.genFailResult("Failed!!");
		}else
		return ResultGenerator.genSuccessResult(goodsReviewService.insertGoodsReview(mapReview)); 
    }
	
	//显示平均分
	@GetMapping("/GoodsReview/countReview")
    @ResponseBody
    public Result countReview(long goodsId) {
		return ResultGenerator.genSuccessResult(goodsReviewService.getReviewButNoReview(goodsId)); 
		
	}
	
	@PostMapping("/GoodsReview/insertReviewLike")
    @ResponseBody
    public Result insertReviewLike(@RequestBody HashMap<String, Object> mapReviewLike) {
		//object转成String
		String userId1 = mapReviewLike.get("userId").toString();
		String reviewId1 = mapReviewLike.get("reviewId").toString();
		
		long reviewId = Long.parseLong(reviewId1);
		long userId = Long.parseLong(userId1);
		
		//如果count是1不可插入如果count是0可以插入
		int checkCount = goodsReviewService.findReviewLikeOrNot(reviewId, userId);
		
//		if (count != 0) {
//			return ResultGenerator.genFailResult("Failed!!");
//		}else
//		return ResultGenerator.genSuccessResult(goodsReviewService.insertGoodsReview(mapReviewLike)); 
//    }
		if (checkCount == 0) {
			int insertCount = goodsReviewService.insertReviewLike(mapReviewLike);
			if(insertCount > 0 ) {
				return ResultGenerator.genSuccessResult("Succeed"); 
			}else {
				return ResultGenerator.genFailResult("Failed!!");
			}
		}else {
			return ResultGenerator.genFailResult("Failed!");
				
			}
		}
	
    
	
	
}