package ltd.newbee.mall.newbeemall.service;

import java.util.List;

//import ltd.newbee.mall.newbeemall.entity.NewBeeMallGoods;
import ltd.newbee.mall.newbeemall.vo.NewBeeMallGoodsVO;
import ltd.newbee.mall.newbeemall.vo.NewBeeMallIndexCategoryVO;

public interface NewBeeMallIndexConfigService {
	List<NewBeeMallGoodsVO> getConfigGoodsesForIndex(int configType ,int number);
	
	List<NewBeeMallIndexCategoryVO>getCategoriesForIndex();
}