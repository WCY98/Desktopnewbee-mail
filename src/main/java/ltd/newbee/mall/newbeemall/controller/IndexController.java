package ltd.newbee.mall.newbeemall.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.service.NewBeeMallCategoryService;
import ltd.newbee.mall.newbeemall.service.NewBeeMallIndexConfigService;
import ltd.newbee.mall.newbeemall.service.NewBeeMallCarouselService;
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
	
}

