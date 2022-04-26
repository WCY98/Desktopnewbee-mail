package ltd.newbee.mall.newbeemall.dao;
import java.util.List;

import ltd.newbee.mall.newbeemall.entity.GoodsDetail;
import ltd.newbee.mall.newbeemall.entity.GoodsImage;

public interface GoodsDetailMapper {
	List<GoodsDetail> getGoodsDetail(long goodsId);
	List<GoodsImage> getGoodsImages(long goodsId);
}