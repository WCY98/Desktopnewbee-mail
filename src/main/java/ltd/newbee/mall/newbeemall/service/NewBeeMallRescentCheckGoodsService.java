package ltd.newbee.mall.newbeemall.service;

import java.util.List;

import ltd.newbee.mall.newbeemall.vo.NewBeeMallGoodsVO;

public interface NewBeeMallRescentCheckGoodsService {
	
    List<NewBeeMallGoodsVO> getNewBeeMallRescentCheckGoodsForIndex(long userId,int limit);
}