package ltd.newbee.mall.newbeemall.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.GoodsReviewMapper;
import ltd.newbee.mall.newbeemall.entity.GoodsReview;
import ltd.newbee.mall.newbeemall.service.GoodsReviewService;
import ltd.newbee.mall.newbeemall.util.BeanUtil;
import ltd.newbee.mall.newbeemall.vo.GoodsReviewVO;

@Service
public class GoodsReviewServiceImpl implements GoodsReviewService{

	@Resource
	GoodsReviewMapper  goodsReviewMapper;
	
	@Override
	public List<GoodsReviewVO> getGoodsReview(long goodsId) {
		// TODO Auto-generated method stub
		List<GoodsReview> entityList = goodsReviewMapper.findReviewByGoodsId(goodsId);
		List<GoodsReviewVO> VoList = BeanUtil.copyList(entityList, GoodsReviewVO.class);

		return VoList;

	}

}
