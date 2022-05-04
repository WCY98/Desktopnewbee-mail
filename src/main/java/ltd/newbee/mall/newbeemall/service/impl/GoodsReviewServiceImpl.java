package ltd.newbee.mall.newbeemall.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.GoodsReviewMapper;
import ltd.newbee.mall.newbeemall.entity.GoodsReview;
import ltd.newbee.mall.newbeemall.service.GoodsReviewService;
import ltd.newbee.mall.newbeemall.util.BeanUtil;
import ltd.newbee.mall.newbeemall.vo.GoodsReviewAvgSecondVO;
import ltd.newbee.mall.newbeemall.vo.GoodsReviewAvgVO;
import ltd.newbee.mall.newbeemall.vo.GoodsReviewVO;

@Service
public class GoodsReviewServiceImpl implements GoodsReviewService{

	@Resource
	GoodsReviewMapper goodsReviewMapper;
	
	@Override
	public List<GoodsReviewVO> getGoodsReview(int rating,long start,long number,long goodsId) {
		// TODO Auto-generated method stub
		List<GoodsReview> entityList = goodsReviewMapper.findReviewByGoodsId(rating, start, number, goodsId);
		List<GoodsReviewVO> VoList = BeanUtil.copyList(entityList, GoodsReviewVO.class);

		return VoList;

	}

	@Override
	public List<GoodsReview> findReviewWrittenByGoodsId(long goodsId, long userId) {
		// TODO Auto-generated method stub
		
		return goodsReviewMapper.findReviewWrittenByGoodsId(goodsId,userId);
	}

	@Override
	public int insertGoodsReview(Map<String, Object> review) {
			//採番
			long newReviewId = goodsReviewMapper.selectMaxReviewId() + 1;
			review.replace("reviewId", newReviewId);
			review.replace("reviewDate", new Date());
			return goodsReviewMapper.insertGoodsReview(review);
		}

	@Override
	public GoodsReviewAvgVO getReviewButNoReview(long goodsId) {
		// TODO Auto-generated method stub
		List<GoodsReview> entityList1 = goodsReviewMapper.countRatingButNoReview(goodsId);
		List<GoodsReview> entityList2 = goodsReviewMapper.countReviewRating(goodsId);
		int countReviewAndRating = goodsReviewMapper.countReviewAndRating(goodsId);
		
//		List<GoodsReviewAvgVO> voList = new ArrayList<GoodsReviewAvgVO>();
		
		GoodsReviewAvgVO vo = new GoodsReviewAvgVO();
		for (GoodsReview entity1 : entityList1) {
			BeanUtil.copyProperties(entity1, vo);
		}

		List<GoodsReviewAvgSecondVO> voList2 = BeanUtil.copyList(entityList2,GoodsReviewAvgSecondVO.class);
		vo.setGoodsReviewAvgSecondVOS(voList2);
//		voList.add(vo);
		return vo;
		
//		return voList;
	}

	@Override
	public int findReviewLikeOrNot(long reviewId, long userId) {
		// TODO Auto-generated method stub
		return goodsReviewMapper.findReviewLikeOrNot(reviewId, userId);
	}

	@Override
	public int insertReviewLike(Map<String, Object> reviewLike) {
		// TODO Auto-generated method stub
		reviewLike.replace("likeDate", new Date());
		return goodsReviewMapper.insertReviewLike(reviewLike);
	}

	


}

