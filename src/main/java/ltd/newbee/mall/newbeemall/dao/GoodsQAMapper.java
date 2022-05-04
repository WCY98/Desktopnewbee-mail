package ltd.newbee.mall.newbeemall.dao;

import java.util.List;
import java.util.Map;

import ltd.newbee.mall.newbeemall.entity.GoodsQA;

public interface GoodsQAMapper {
   //返回entity<>
	List<GoodsQA> findGoodsQA(int startOffsetIndex, int pageLimitNumber,long goodsId,String orderByCol);
	
	int findGoodsQANumAndPage(long goodsId);
	
	int insertGoodsQuestion(Map<String,Object> question);

	long selectMaxQuestionId();
	
	//确认是否能插入以及插入qalike
	int insertGoodsQALikeOrNot(long userId,long anwserId);
	
	int insertGoodsQALike(Map<String,Object> qaLike);

}
