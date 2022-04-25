package ltd.newbee.mall.newbeemall.service;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.GoodsDetail;

public interface GoodsDetailService {
	List <GoodsDetail> getGoodsDetailByGoodsId(long goodsId);
}