package ltd.newbee.mall.newbeemall.dao;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.GoodsQA;
import ltd.newbee.mall.newbeemall.vo.GoodsQAVO;

public interface GoodsQAMapper {

	List<GoodsQA> findGoodsQA(int pageNo, int pageLimitNumber,long goodsId);
	

}
