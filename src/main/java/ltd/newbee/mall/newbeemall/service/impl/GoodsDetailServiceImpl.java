package ltd.newbee.mall.newbeemall.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.GoodsDetailMapper;
import ltd.newbee.mall.newbeemall.entity.GoodsDetail;
import ltd.newbee.mall.newbeemall.service.GoodsDetailService;
import ltd.newbee.mall.newbeemall.vo.GoodsDetailVO;

@Service
public class GoodsDetailServiceImpl implements GoodsDetailService{
	
	@Resource
	GoodsDetailMapper goodsDetailMapper;

	@Override
	public List<GoodsDetailVO> getGoodsDetailByGoodsId(long goodsId) {
		// TODO Auto-generated method stub
		List<GoodsDetailVO> volist = new ArrayList<>();
		List<GoodsDetail>list = goodsDetailMapper.findGoodsDetailByGoodsId(goodsId);
		for (GoodsDetail g : list) {
			GoodsDetailVO vo = new GoodsDetailVO();
			vo.setColor(g.getColor());
			vo.setGoodsId(g.getGoodsId());
			
			vo.setSize(g.getSize1Name());
			
		}
		
		return 
	}

}
