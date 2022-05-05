package ltd.newbee.mall.newbeemall.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.GoodsQAMapper;
import ltd.newbee.mall.newbeemall.entity.GoodsQA;
import ltd.newbee.mall.newbeemall.service.GoodsQAService;
import ltd.newbee.mall.newbeemall.util.BeanUtil;
import ltd.newbee.mall.newbeemall.vo.GoodsQASecondVO;
import ltd.newbee.mall.newbeemall.vo.GoodsQAFirstVO;

@Service
public class GoodsQAServiceImpl implements GoodsQAService{
	
	@Resource
	GoodsQAMapper goodsQAMapper;

	@Override
	public List<GoodsQAFirstVO> getGoodsQA(int pageNo, int pageLimitNumber,long goodsId,String orderByCol) {
		
		int startOffsetIndex = ((pageNo-1)*pageLimitNumber);
		//dao                                    
		List<GoodsQA> entityList = goodsQAMapper.findGoodsQA(startOffsetIndex, pageLimitNumber, goodsId, orderByCol);
	
		int totalCount = goodsQAMapper.findGoodsQANumAndPage(goodsId);
		int currentPage = startOffsetIndex;
		int totalPage = 0;
		
		if (totalCount != 0) {
			if(totalCount % pageLimitNumber != 0) {
				totalPage = (totalCount / pageLimitNumber) + 1;	
		} else {
			totalPage = totalCount / pageLimitNumber;
		}
	}
		
		List<GoodsQAFirstVO> voList = new ArrayList<GoodsQAFirstVO>();
		GoodsQAFirstVO vo = new GoodsQAFirstVO();
		    vo.setTotalCount(totalCount);
		    vo.setCurrentPage(currentPage);
		    vo.setTotalPage(totalPage);
		    List<GoodsQASecondVO> voList2 = BeanUtil.copyList(entityList, GoodsQASecondVO.class);
		    vo.setGoodsQAVOS(voList2);
		    voList.add(vo);
	
		return voList;
	
	}

	@Override
	public int insertGoodsQALikeOrNot(long userId, long anwserId) {
		// TODO Auto-generated method stub
		return goodsQAMapper.insertGoodsQALikeOrNot(userId, anwserId);
	}

	@Override
	public int insertGoodsQALike(Map<String, Object> qaLike) {
		// TODO Auto-generated method stub
		qaLike.replace("likeDate", new Date());
		return goodsQAMapper.insertGoodsQALike(qaLike);
	}

	

	@Override
	public int selectMaxQuestionId(HashMap<String, Object> mapQuestion) {
		long newQuestionId=goodsQAMapper.selectMaxQuestionId()+1;
		mapQuestion.replace("questionId", newQuestionId);
		mapQuestion.replace("questionDate", new Date());
		return goodsQAMapper.insertGoodsQuestion(mapQuestion);
		
	}

	

}

