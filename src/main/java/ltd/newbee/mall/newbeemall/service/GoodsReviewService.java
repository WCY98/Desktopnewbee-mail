package ltd.newbee.mall.newbeemall.service;

import java.util.List;
import java.util.Map;

import ltd.newbee.mall.newbeemall.entity.GoodsReview;
import ltd.newbee.mall.newbeemall.vo.GoodsReviewAvgVO;
import ltd.newbee.mall.newbeemall.vo.GoodsReviewVO;

public interface GoodsReviewService {
	
	List<GoodsReviewVO> getGoodsReview(int rating, long start, long number, long goodsId);
	
//	int insertGoodsReview(List<GoodsReview> list);

//	List<GoodsReview> findReviewWrittenByGoodsId (long goodsId, long userId);

	int insertGoodsReview(Map<String,Object> review);

	List<GoodsReview> findReviewWrittenByGoodsId(long goodsId, long userId);

	
//	---------------------------------------------------------------------------------------
    GoodsReviewAvgVO getReviewButNoReview(long goodsId);
//	
//	int countReviewRating(long goodsId);
    
  //-------------------------------------------------------------------------------
  	//是否能点赞reviewLike
    int findReviewLikeOrNot(long reviewId, long userId);
	 
	 int insertReviewLike(Map<String,Object> reviewLike);
  	
	
}
