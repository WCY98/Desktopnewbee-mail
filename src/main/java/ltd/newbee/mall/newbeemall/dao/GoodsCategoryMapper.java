package ltd.newbee.mall.newbeemall.dao;

import java.util.List;


import org.apache.ibatis.annotations.Param;

import ltd.newbee.mall.newbeemall.entity.GoodsCategory;

public interface GoodsCategoryMapper {

	List<GoodsCategory> findIndexConfigsByTypeAndNum(@Param("configType") int configType, @Param("number") int number);

	List<GoodsCategory> selectByLevelAndParentIdsAndNumbers(@Param("configType") int configType, @Param("number") int number);
} 