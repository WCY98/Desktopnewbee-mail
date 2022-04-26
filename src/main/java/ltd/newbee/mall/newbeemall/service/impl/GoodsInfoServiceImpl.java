package ltd.newbee.mall.newbeemall.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.hutool.core.bean.BeanUtil;
import ltd.newbee.mall.newbeemall.dao.GoodsInfoMapper;
import ltd.newbee.mall.newbeemall.entity.NewBeeMallGoods;
import ltd.newbee.mall.newbeemall.service.GoodsInfoService;
import ltd.newbee.mall.newbeemall.vo.NewBeeMallGoodsVO;

@Service
public class GoodsInfoServiceImpl implements GoodsInfoService{
	
	@Resource
	GoodsInfoMapper goodsInfoMapper;

	@Override
	public List<NewBeeMallGoodsVO> getGoodsInfo(long goodsId) {
		// TODO Auto-generated method stub
		List<NewBeeMallGoodsVO> volist = new ArrayList<>();
		List<NewBeeMallGoods>entityList = goodsInfoMapper.findGoodsInfo(goodsId);
		
		for(NewBeeMallGoods entity : entityList) {
			NewBeeMallGoodsVO vo = new NewBeeMallGoodsVO();
			BeanUtil.copyProperties(entity, vo);
			
			volist.add(vo);
		}
		return volist;
	}
	
	
}
