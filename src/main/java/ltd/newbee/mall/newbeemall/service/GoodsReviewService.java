package ltd.newbee.mall.newbeemall.service;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.GoodsReview;
import ltd.newbee.mall.newbeemall.vo.GoodsReviewVO;

public interface GoodsReviewService {
	List<GoodsReviewVO> getGoodsReview(long goodsId);
	List<GoodsReview> getReviewWrittenByGoodsId(long goodsId);

}
