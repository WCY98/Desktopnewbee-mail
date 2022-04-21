package ltd.newbee.mall.newbeemall.dao;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import ltd.newbee.mall.newbeemall.entity.Carousel;

public interface CarouselMapper {
	/*
	 * 降序 取number位 
	 * 对象表 tb_newbee_mall_carousel
	 */
    List<Carousel> findCarouselsByNum(@Param("number") int number);
}
