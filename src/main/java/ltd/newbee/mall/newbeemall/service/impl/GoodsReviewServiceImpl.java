package ltd.newbee.mall.newbeemall.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.GoodsReviewMapper;
import ltd.newbee.mall.newbeemall.entity.GoodsReview;
import ltd.newbee.mall.newbeemall.entity.NewBeeMallGoods;
import ltd.newbee.mall.newbeemall.service.GoodsReviewService;
import ltd.newbee.mall.newbeemall.util.BeanUtil;
import ltd.newbee.mall.newbeemall.vo.GoodsQAFirstVO;
import ltd.newbee.mall.newbeemall.vo.GoodsQASecondVO;
import ltd.newbee.mall.newbeemall.vo.GoodsReviewAvgSecondVO;
import ltd.newbee.mall.newbeemall.vo.GoodsReviewAvgVO;
import ltd.newbee.mall.newbeemall.vo.GoodsReviewVO;
import ltd.newbee.mall.newbeemall.vo.NewBeeMallGoodsVO;

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
	public List<GoodsReviewAvgVO> getReviewButNoReview(long goodsId) {
		// TODO Auto-generated method stub
		List<GoodsReview> entityList1 = goodsReviewMapper.countRatingButNoReview(goodsId);
		List<GoodsReview> entityList2 = goodsReviewMapper.countReviewAndRating(goodsId);
		
//		List<GoodsQAFirstVO> voList = new ArrayList<GoodsQAFirstVO>();
//		GoodsQAFirstVO vo = new GoodsQAFirstVO();
//		    vo.setTotalCount(totalCount);
//		    vo.setCurrentPage(currentPage);
//		    vo.setTotalPage(totalPage);
//		    List<GoodsQASecondVO> voList2 = BeanUtil.copyList(entityList, GoodsQASecondVO.class);
//		    vo.setGoodsQAVOS(voList2);
//		    voList.add(vo);
		
//		for(NewBeeMallGoods entity : entityList) {
//			NewBeeMallGoodsVO vo = new NewBeeMallGoodsVO();
//			BeanUtil.copyProperties(entity, vo);
//		----------------------------------------------------------------------
		List<GoodsReviewAvgVO> voList = new ArrayList<GoodsReviewAvgVO>();
		
		for (GoodsReview entity1 : entityList1) {
			GoodsReviewAvgVO vo = new GoodsReviewAvgVO();
			BeanUtil.copyProperties(entity1, vo);
		

		List<GoodsReviewAvgSecondVO> voList2 = BeanUtil.copyList(entityList2,GoodsReviewAvgSecondVO.class);
		vo.setGoodsReviewAvgSecondVOS(voList2);
		voList.add(vo);
		}
		return voList;
	}

	@Override
	public int countReviewRating(long goodsId) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}

