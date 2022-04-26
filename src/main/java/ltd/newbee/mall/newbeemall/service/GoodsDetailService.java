package ltd.newbee.mall.newbeemall.service;

import java.util.ArrayList;
import java.util.List;

import ltd.newbee.mall.newbeemall.entity.GoodsImage;
import ltd.newbee.mall.newbeemall.vo.GoodsDetailVO;

public interface GoodsDetailService {
	List<GoodsDetailVO> getGoodsDetail(long goodsId);
	List<ArrayList<GoodsImage>> getGoodsImages(long goodsId);
}