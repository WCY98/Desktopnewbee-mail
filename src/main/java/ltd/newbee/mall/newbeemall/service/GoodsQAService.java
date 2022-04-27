package ltd.newbee.mall.newbeemall.service;

import java.util.List;

import ltd.newbee.mall.newbeemall.vo.GoodsQAVO;

public interface GoodsQAService {
	
	List<GoodsQAVO> getGoodsQA(int pageNo, int pageLimitNumber,long goodsId);


}
