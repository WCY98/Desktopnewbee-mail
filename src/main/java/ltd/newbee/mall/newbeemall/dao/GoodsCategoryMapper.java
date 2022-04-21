package ltd.newbee.mall.newbeemall.dao;

import java.util.List;


import org.apache.ibatis.annotations.Param;

import ltd.newbee.mall.newbeemall.entity.GoodsCategory;

public interface GoodsCategoryMapper {


	List<GoodsCategory> selectByLevelAndParentIdsAndNumbers(@Param("parentIds") List<Long> parentIds,
			@Param("categoryLevel") int categoryLevel, @Param("number") int number);
} 