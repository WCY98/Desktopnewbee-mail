package ltd.newbee.mall.newbeemall.dao;

import java.util.List;


import org.apache.ibatis.annotations.Param;

import ltd.newbee.mall.newbeemall.entity.IndexConfig;
import ltd.newbee.mall.newbeemall.entity.NewBeeMallGoods;

public interface IndexConfigMapper {

	List<IndexConfig> findIndexConfigsByTypeAndNum(@Param("configType") int configType, @Param("number") int number);

	List<NewBeeMallGoods> selectByPrimaryKeys(List<Long> goodsIds);
} 