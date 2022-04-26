package ltd.newbee.mall.newbeemall.service;

import java.util.List;

import ltd.newbee.mall.newbeemall.vo.NewBeeMallGoodsVO;

public interface GoodsInfoService {
	List<NewBeeMallGoodsVO> getGoodsInfo(long goodsId);

}
