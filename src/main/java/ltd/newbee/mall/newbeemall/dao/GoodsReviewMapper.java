package ltd.newbee.mall.newbeemall.dao;

import java.util.List;
import java.util.Map;

import ltd.newbee.mall.newbeemall.entity.GoodsReview;

public interface GoodsReviewMapper {
	//展示review页面                                    eg:从start开始显示number数
	List<GoodsReview> findReviewByGoodsId(int rating,long start,long number,long goodsId);
	
	//-------------------------------------------------------------------------------------
	
	//check是否能写review
//	List<GoodsReview> findReviewWrittenByGoodsId(long goodsId,long userId);
	List<GoodsReview> findReviewWrittenByGoodsId(long goodsId, long userId);
	//insert
	                     //key和value过多、将要输入的东西换成map形式可以一次性导入
	                     //数字类型不同，用object
	int insertGoodsReview(Map<String,Object> review);
    //采番 
	long selectMaxReviewId();
	
	
	//----------------------------------------------------------------------
   
	
	List<GoodsReview> countReviewAndRating(long goodsId);
	
	int countReviewRating(long goodsId);

	List<GoodsReview> countRatingButNoReview(long goodsId);

}
