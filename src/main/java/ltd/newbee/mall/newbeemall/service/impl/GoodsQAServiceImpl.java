package ltd.newbee.mall.newbeemall.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.GoodsQAMapper;
import ltd.newbee.mall.newbeemall.entity.GoodsQA;
import ltd.newbee.mall.newbeemall.service.GoodsQAService;
import ltd.newbee.mall.newbeemall.vo.GoodsQAVO;

@Service
public class GoodsQAServiceImpl implements GoodsQAService{
	
	@Resource
	GoodsQAMapper goodsQAMapper;

	@Override
	public List<GoodsQAVO> getGoodsQA(int pageNo, int pageLimitNumber,long goodsId) {
		
		
		int start = ((pageNo-1)*pageLimitNumber);
		List<GoodsQA> entityList = goodsQAMapper.findGoodsQA(start,pageLimitNumber,goodsId);
	
//		List<GoodsQAVO> voList = BeanUtil.copyToList(entityList, GoodsQAVO.class);
		List<GoodsQAVO> voList = new ArrayList<>();
	
	
	return voList;

	}
}

