package ltd.newbee.mall.newbeemall.service.impl;

import java.util.ArrayList;
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
		
		List<GoodsReview> entityList = goodsReviewMapper.findReviewByGoodsId(rating, start, number, goodsId);
		List<GoodsReviewVO> VoList = BeanUtil.copyList(entityList, GoodsReviewVO.class);

		return VoList;

	}

	@Override
	public List<GoodsReview> findReviewWrittenByGoodsId(long goodsId, long userId) {
		
		
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
		GoodsReview entity1 = goodsReviewMapper.countRatingButNoReview(goodsId);
		//计算星星的个数返回的只有一个数据所以不用list
		List<GoodsReview> entityList = goodsReviewMapper.countReviewRating(goodsId);
		
//		List<GoodsReviewAvgVO> voList = new ArrayList<GoodsReviewAvgVO>();
		
		GoodsReviewAvgVO vo = new GoodsReviewAvgVO();
		BeanUtil.copyProperties(entity1, vo);
		//(61)=(63-65)
//		vo.setRatingAvg(entity1.getRatingAvg());
//		vo.setReviewCount(entity1.getReviewCount());
//		vo.setTitleCount(entity1.getTitleCount());
		

//		List<GoodsReviewAvgSecondVO> voList2 = BeanUtil.copyList(entity,GoodsReviewAvgSecondVO.class);
//		vo.setGoodsReviewAvgSecondVOS(voList2);
//		voList.add(vo);
		List<GoodsReviewAvgSecondVO> voList = BeanUtil.copyList(entityList,GoodsReviewAvgSecondVO.class);
		                                                      //entityList名，VO名.class
		
		vo.setGoodsReviewAvgSecondVOS(voList);
		
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

