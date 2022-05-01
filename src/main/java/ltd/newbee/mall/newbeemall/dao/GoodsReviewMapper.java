package ltd.newbee.mall.newbeemall.dao;

import java.util.List;
import java.util.Map;

import ltd.newbee.mall.newbeemall.entity.GoodsReview;

public interface GoodsReviewMapper {
	List<GoodsReview> findReviewByGoodsId(int rating,long start,long number,long goodsId);
	
	List<GoodsReview> findReviewWrittenByGoodsId(long goodsId,long userId);
	
	int insertGoodsReview(Map<String,Object> review);

	long selectMaxReviewId();

}
