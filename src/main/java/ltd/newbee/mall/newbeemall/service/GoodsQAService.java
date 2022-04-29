package ltd.newbee.mall.newbeemall.service;

import java.util.List;

import ltd.newbee.mall.newbeemall.vo.GoodsQAFirstVO;

public interface GoodsQAService {
	
	List<GoodsQAFirstVO> getGoodsQA(int startOffsetIndex, int pageLimitNumber,long goodsId,String orderByCol);

}
