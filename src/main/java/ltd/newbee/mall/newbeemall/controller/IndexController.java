package ltd.newbee.mall.newbeemall.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.entity.RunRecommendApiHistory;
import ltd.newbee.mall.newbeemall.service.CheckUserExistsService;
import ltd.newbee.mall.newbeemall.service.NewBeeMallCarouselService;
import ltd.newbee.mall.newbeemall.service.NewBeeMallCategoryService;
import ltd.newbee.mall.newbeemall.service.NewBeeMallIndexConfigService;
import ltd.newbee.mall.newbeemall.service.NewBeeMallRescentCheckGoodsService;
import ltd.newbee.mall.newbeemall.service.RunRecommendApiHistoryService;
import ltd.newbee.mall.newbeemall.service.GoodsDetailService;
import ltd.newbee.mall.newbeemall.service.GoodsInfoService;
import ltd.newbee.mall.newbeemall.util.Result;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;

@Controller
public class IndexController {
	@Resource
	private NewBeeMallIndexConfigService newBeeMallIndexConfigService;
	
	@Resource
	private NewBeeMallCategoryService newBeeMallCategoryService;
	
	@Resource
	private NewBeeMallCarouselService newBeeMallCarouselService;
	
	@Resource
	private NewBeeMallRescentCheckGoodsService newBeeMallRescentCheckGoodsService ; 
	
	@Resource
	private CheckUserExistsService checkUserExistsService;
	
	@Resource
	private RunRecommendApiHistoryService runRecommendApiHistoryService;
	
	@Resource
	private GoodsDetailService goodsDetailService;
	
	@Resource
	private GoodsDetailService goodsImageService;
	
	@Resource
	private GoodsInfoService goodsInfoService;
	
//	@GetMapping("/newGoods")
//    @ResponseBody
//    public Result hello() {
//		
//        return ResultGenerator.genSuccessResult(newBeeMallIndexConfigService.getConfigGoodsesForIndex(3, 5));
//    }
//	@GetMapping("/recommandGoodses")
//    @ResponseBody
//    public Result hello() {
//		
//        return ResultGenerator.genSuccessResult(newBeeMallIndexConfigService.getConfigGoodsesForIndex(5, 5));
//    }
//	两方法高度雷同，共通化
	@GetMapping("/Goodses")
    @ResponseBody
    
    public Result getGoodses(int configType) {
		
		
        return ResultGenerator.genSuccessResult(newBeeMallIndexConfigService.getConfigGoodsesForIndex(configType, 5));
    
	}
	
	
	@GetMapping("/Categories")
    @ResponseBody
    
    public Result getCategories() {
		
		
        return ResultGenerator.genSuccessResult(newBeeMallCategoryService.getCategoriesForIndex());
    
	}
	
	
	@GetMapping("/Carousel")
    @ResponseBody
    
    public Result getCarousel() {
		
		
        return ResultGenerator.genSuccessResult(newBeeMallCarouselService.getCarouselsForIndex(3));
    
	}
	
//	@GetMapping("/recentcheckedproducts")
//    @ResponseBody
//    
//    public Result getrecentcheckedproducts() {
//		
//		
//        return ResultGenerator.genSuccessResult(newBeeMallRecentCheckedProductsService.getRecentCheckedProductsForIndex(10));
//    
//	}
//	
//	@GetMapping("/test")
//    @ResponseBody
//    
//    public Result test() {
//		
//		
//        return ResultGenerator.genFailResult("failed");
//    
//	}
	@GetMapping("/user")
    @ResponseBody
    public Result user(long userId) {
		//MallUser user = checkUserExistsService.checkUserExists(userId);
		int count = checkUserExistsService.checkUserExistsReturnCount(userId);
		if(count == 0 ) {
			return ResultGenerator.genFailResult("failed");
		}else {
//			return ResultGenerator.genSuccessResult("successs");
			//List<vo> = xxxService.xxxMethod();
			//return List
			return ResultGenerator.genSuccessResult(newBeeMallRescentCheckGoodsService.getRescentCheckGoodsForIndex(userId,6));
		}
		
	}
	
	
	@GetMapping("/RunRecommendApi")
    @ResponseBody
    
    public Result getRunRecommendApi(){
		
		List<RunRecommendApiHistory> list = runRecommendApiHistoryService.selectRecCat();
		
		for (RunRecommendApiHistory r:list) {
			r.setRunDate(new Date());
		}
		int count = runRecommendApiHistoryService.insertRunRecommendApiHistory(list);
		
		if (count == 0) {
			return ResultGenerator.genFailResult("failed");
		}else {
			return ResultGenerator.genSuccessResult("successs");
		}
	}
		
		@GetMapping("/GoodsDetail")
	    @ResponseBody
	    
	    public Result getGoodsDetail(long goodsId) {
			
			
			return ResultGenerator.genSuccessResult(goodsDetailService.getGoodsDetail(goodsId));
	    
		}
		
		@GetMapping("/GoodsImage")
	    @ResponseBody
	    
	    public Result getGoodsImage(long goodsId) {
			
			
			return ResultGenerator.genSuccessResult(goodsDetailService.getGoodsImages(goodsId));
	    
		}
		

	
	
	}	

