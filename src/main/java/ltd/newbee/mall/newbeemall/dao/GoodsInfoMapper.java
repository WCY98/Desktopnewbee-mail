package ltd.newbee.mall.newbeemall.dao;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.NewBeeMallGoods;

public interface GoodsInfoMapper {
	List<NewBeeMallGoods> findGoodsInfo(long goodsId);

}
