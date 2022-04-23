package ltd.newbee.mall.newbeemall.dao;


import java.util.List;

import ltd.newbee.mall.newbeemall.entity.NewBeeMallGoods;

public interface RescentCheckGoodsMapper {
	

	List<NewBeeMallGoods> findRescentCheckGoodsByUserId(long userId, int limit);
	
}
