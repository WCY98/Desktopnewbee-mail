package ltd.newbee.mall.newbeemall.service;

import java.util.List;

import ltd.newbee.mall.newbeemall.vo.NewBeeMallIndexCategoryVO;

public interface NewBeeMallCategoryService {
	
//	List<NewBeeMallGoodsVO> getConfigGoodsesForIndex(int configType ,int number);

	List<NewBeeMallIndexCategoryVO> getCategoriesForIndex();

}