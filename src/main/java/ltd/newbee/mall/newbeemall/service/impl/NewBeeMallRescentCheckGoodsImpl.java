package ltd.newbee.mall.newbeemall.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.RescentCheckGoodsMapper;
import ltd.newbee.mall.newbeemall.entity.Carousel;
import ltd.newbee.mall.newbeemall.entity.NewBeeMallGoods;
import ltd.newbee.mall.newbeemall.service.NewBeeMallRescentCheckGoodsService;
import ltd.newbee.mall.newbeemall.vo.NewBeeMallGoodsVO;

@Service 
 public class NewBeeMallRescentCheckGoodsImpl implements NewBeeMallRescentCheckGoodsService{
		
		@Resource
		private RescentCheckGoodsMapper rescentCheckGoodsMapper;

		@Override
		public List<NewBeeMallGoodsVO> getRescentCheckGoodsForIndex(long userId,int limit) {
			
			List<NewBeeMallGoodsVO> list = new ArrayList<NewBeeMallGoodsVO>();	
			
			List<NewBeeMallGoods> entityList = new ArrayList<NewBeeMallGoods>();
			entityList = rescentCheckGoodsMapper.findRescentCheckGoodsByUserId(userId, 6);
			
			
			if (entityList != null) {
				for(NewBeeMallGoods newBeeMallGoods : entityList) {
					NewBeeMallGoodsVO vo = new NewBeeMallGoodsVO();
					vo.setGoodsId(newBeeMallGoods.getGoodsId());
					vo.setGoodsName(newBeeMallGoods.getGoodsName());
					vo.setOriginalPrice(newBeeMallGoods.getOriginalPrice());
					list.add(vo);
				}
				
			}
			
			return list;
		 
	}

}
