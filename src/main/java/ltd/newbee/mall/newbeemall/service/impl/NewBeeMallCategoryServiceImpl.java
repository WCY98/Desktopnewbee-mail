package ltd.newbee.mall.newbeemall.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.GoodsCategoryMapper;
import ltd.newbee.mall.newbeemall.dao.IndexConfigMapper;
import ltd.newbee.mall.newbeemall.entity.GoodsCategory;
import ltd.newbee.mall.newbeemall.service.NewBeeMallCategoryService;
import ltd.newbee.mall.newbeemall.service.NewBeeMallIndexConfigService;
import ltd.newbee.mall.newbeemall.vo.NewBeeMallIndexCategoryVO;
import ltd.newbee.mall.newbeemall.vo.SecondLevelCategoryVO;
import ltd.newbee.mall.newbeemall.vo.ThirdLevelCategoryVO;

@Service
public class NewBeeMallCategoryServiceImpl implements NewBeeMallCategoryService{
	
	@Resource 
	private GoodsCategoryMapper goodsCategoryMapper;
	
	@Override
	public List<NewBeeMallIndexCategoryVO> getCategoriesForIndex(){
		
		List<Long>level1ParentList = new ArrayList<Long>();
		
		level1ParentList.add(0l);
		
		List<GoodsCategory> level1CategoryList = new ArrayList<GoodsCategory>();
		level1CategoryList = goodsCategoryMapper.selectByLevelAndParentIdsAndNumbers(level1ParentList, 1, 100);
		
		List<Long> categoryList1 = new ArrayList<Long>();
		for (GoodsCategory gc: level1CategoryList) {
			categoryList1.add(gc.getCategoryId());
		}
		
		List<GoodsCategory> level2CategoryList = new ArrayList<GoodsCategory>();
		level2CategoryList = goodsCategoryMapper.selectByLevelAndParentIdsAndNumbers(categoryList1, 2, 100);
		
		List<Long> categoryList2 = new ArrayList<Long>();
		for (GoodsCategory gc: level2CategoryList) {
			categoryList2.add(gc.getCategoryId());
		}
		
		List<GoodsCategory> level3CategoryList = new ArrayList<GoodsCategory>();
		level3CategoryList = goodsCategoryMapper.selectByLevelAndParentIdsAndNumbers(categoryList2, 3, 100);
		
		//==> level1
		List<NewBeeMallIndexCategoryVO> level1volist = new ArrayList<NewBeeMallIndexCategoryVO>();
		
		for (GoodsCategory gc1: level1CategoryList) {
			NewBeeMallIndexCategoryVO level1vo = new NewBeeMallIndexCategoryVO();
			level1vo.setCategoryId(gc1.getCategoryId());
			level1vo.setCategoryLevel(gc1.getCategoryLevel());
			level1vo.setCategoryName(gc1.getCategoryName());
			
			
			//level2:category.parentID= gc.getCategoryID();
		List<SecondLevelCategoryVO> level2volist = new ArrayList<SecondLevelCategoryVO>();
		
		for (GoodsCategory gc2: level2CategoryList) {
			SecondLevelCategoryVO level2vo = new SecondLevelCategoryVO();
			if (gc2.getParentId() == gc1.getCategoryId()) {
			level2vo.setCategoryId(gc2.getCategoryId());
			level2vo.setCategoryLevel(gc2.getCategoryLevel());
			level2vo.setCategoryName(gc2.getCategoryName());
			level2vo.setParentId(gc2.getParentId());
			
			List<ThirdLevelCategoryVO> level3volist = new ArrayList<ThirdLevelCategoryVO>();
			
			for(GoodsCategory gc3: level3CategoryList) {
				ThirdLevelCategoryVO level3vo = new ThirdLevelCategoryVO();
				if(gc3.getParentId() == gc2.getCategoryId()) {
					level3vo.setCategoryId(gc3.getCategoryId());
					level3vo.setCategoryLevel(gc3.getCategoryLevel());
					level3vo.setCategoryName(gc3.getCategoryName());
					level3volist.add(level3vo);
					level2vo.setThirdLevelCategoryVOS(level3volist);
				}
			}
			level2volist.add(level2vo);
		}
	}
		level1vo.setSecondLevelCategoryVOS(level2volist);
		level1volist.add(level1vo);
		}
		return level1volist;

}
}