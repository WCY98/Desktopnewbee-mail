package ltd.newbee.mall.newbeemall.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ltd.newbee.mall.newbeemall.vo.GoodsQAFirstVO;

public interface GoodsQAService {
	
	List<GoodsQAFirstVO> getGoodsQA(int startOffsetIndex, int pageLimitNumber,long goodsId,String orderByCol);

	int insertGoodsReview(HashMap<String, Object> mapQuestion);
	
	
	//确认是否能插入以及插入qalike
	int insertGoodsQALikeOrNot(long userId,long anwserId);
	
	int insertGoodsQALike(Map<String,Object> qaLike);
}
