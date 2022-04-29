package ltd.newbee.mall.newbeemall.dao;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.GoodsQA;

public interface GoodsQAMapper {

	List<GoodsQA> findGoodsQA(int startOffsetIndex, int pageLimitNumber,long goodsId,String orderByCol);
	int findGoodsQANumAndPage(long goodsId);

}
