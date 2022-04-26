package ltd.newbee.mall.newbeemall.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.GoodsDetailMapper;
import ltd.newbee.mall.newbeemall.entity.GoodsDetail;
import ltd.newbee.mall.newbeemall.entity.GoodsImage;
import ltd.newbee.mall.newbeemall.service.GoodsDetailService;
import ltd.newbee.mall.newbeemall.vo.GoodsDetailVO;

@Service
public class GoodsDetailServiceImpl implements GoodsDetailService{
	
	@Resource
	GoodsDetailMapper goodsDetailMapper;

	@Override
	public List<GoodsDetailVO> getGoodsDetail(long goodsId) {
		// TODO Auto-generated method stub
		List<GoodsDetail>entitylist = goodsDetailMapper.getGoodsDetail(goodsId);
		List<GoodsDetailVO> volist = new ArrayList<>();
		for (GoodsDetail e : entitylist) {
			GoodsDetailVO vo = new GoodsDetailVO();
			vo.setColor(e.getColor());
			vo.setGoodsId(e.getGoodsId());
			vo.setMaterial(e.getMaterial());

			String size = "";
			
			if(e.getSize1()!=null && e.getSize1()!=0) {
				size = e.getSize1Name() + e.getSize1();
			}

			if(e.getSize2()!=null && e.getSize2()!=0) {
				size  = size +  "x" + e.getSize2Name() + e.getSize2();
			}

			if(e.getSize3()!=null && e.getSize3()!=0) {
				size = size +  "x" + e.getSize3Name() + e.getSize3();
			}
			
			if(e.getSize4()!=null && e.getSize4()!=0) {
				size = size +  "x" + e.getSize3Name() + e.getSize4();
			}
			
			if(e.getSize5()!=null && e.getSize5()!=0) {
				size = size +  "x" + e.getSize5Name() + e.getSize5();
			}

			if(e.getSizeUnit()!=null && !e.getSizeUnit().equals("")) {
				size = size + e.getSizeUnit();
		    }
			String wrapSize = "";
			if(e.getWrapSize1()!=null && e.getWrapSize1()!=0) {
				wrapSize = e.getWrapSize1Name() + e.getWrapSize1();
			}
			
			if(e.getWrapSize2()!=null && e.getWrapSize2()!=0) {
				wrapSize = wrapSize+ "x"+ e.getWrapSize2Name() + e.getWrapSize2();
			}
			
			if(e.getWrapSize3()!=null && e.getWrapSize3()!=0) {
				wrapSize = wrapSize+ "x"+ e.getWrapSize3Name() + e.getWrapSize3();
			}
			
			if(e.getWrapSize4()!=null && e.getWrapSize4()!=0) {
				wrapSize = wrapSize+ "x"+ e.getWrapSize4Name() + e.getWrapSize4();
			}
			
			if(e.getWrapSize5()!=null && e.getWrapSize5()!=0) {
				wrapSize = wrapSize+ "x"+ e.getWrapSize5Name() + e.getWrapSize5();
			}
			
			if(e.getWrapSizeUnit()!=null && !e.getWrapSizeUnit().equals("")) {
				wrapSize = wrapSize + e.getWrapSizeUnit();
			}
			
		
			
			vo.setSize(size);
			vo.setWarrantyYears(e.getWarrantyYears() + e.getWarrantyUnit());
			vo.setWrapSize(wrapSize);
			
			volist.add(vo);
		}
		return volist;
	}

	@Override
	public List<ArrayList<GoodsImage>> getGoodsImages(long goodsId) {
		// TODO Auto-generated method stub
		List<GoodsImage> list = goodsDetailMapper.getGoodsImages(goodsId);
		// => list<list<goodsImage>>
		List<ArrayList<GoodsImage>> rsList = new ArrayList<ArrayList<GoodsImage>>();

		ArrayList<GoodsImage> tempList = new ArrayList<GoodsImage>();

		for (int i = 0; i < list.size(); i++) {


//			if( i == 0) {
//				tempList = new ArrayList<GoodsImage>();
//			}

			tempList.add(list.get(i));

			//0 ~7
			// 0 % 8 == 0 ?
			if((i+1)%8 == 0) {
				rsList.add(tempList);  //copy?
				//tempList.clear();
				tempList = new ArrayList<GoodsImage>();
			}

			// 判断是否满8，最后一行可能不满8
			if( i == (list.size()-1) && (i+1)%8 != 0) {
				rsList.add(tempList);  //copy?
				//tempList.clear();
			}

//			if((i+1)%8 == 0) {
//				tempList = new ArrayList<GoodsImage>();
//			}

		}
		return rsList;
	}


}
