package ltd.newbee.mall.newbeemall.dao;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.GoodsDetail;

public interface GoodsDetailMapper {
	List <GoodsDetail> findGoodsDetailByGoodsId(long goodsId);;

}
