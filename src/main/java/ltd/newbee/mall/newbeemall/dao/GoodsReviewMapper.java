package ltd.newbee.mall.newbeemall.dao;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.GoodsReview;

public interface GoodsReviewMapper {
	List<GoodsReview> findReviewByGoodsId(long goodsId);
	

}
