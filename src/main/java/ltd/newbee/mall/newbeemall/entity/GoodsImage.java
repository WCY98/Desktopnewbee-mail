package ltd.newbee.mall.newbeemall.entity;

import javax.annotation.Generated;

public class GoodsImage {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-26T09:50:36.873401+08:00", comments="Source field: goods_image.goods_id")
    private Long goodsId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-26T09:50:36.873401+08:00", comments="Source field: goods_image.image")
    private String image;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-26T09:50:36.873401+08:00", comments="Source field: goods_image.goods_rank")
    private Integer goodsRank;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-26T09:50:36.873401+08:00", comments="Source field: goods_image.goods_id")
    public Long getGoodsId() {
        return goodsId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-26T09:50:36.873401+08:00", comments="Source field: goods_image.goods_id")
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-26T09:50:36.873401+08:00", comments="Source field: goods_image.image")
    public String getImage() {
        return image;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-26T09:50:36.873401+08:00", comments="Source field: goods_image.image")
    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-26T09:50:36.873401+08:00", comments="Source field: goods_image.goods_rank")
    public Integer getGoodsRank() {
        return goodsRank;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-26T09:50:36.8744011+08:00", comments="Source field: goods_image.goods_rank")
    public void setGoodsRank(Integer goodsRank) {
        this.goodsRank = goodsRank;
    }
}