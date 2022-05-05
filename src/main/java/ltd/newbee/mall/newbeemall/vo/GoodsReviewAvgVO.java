package ltd.newbee.mall.newbeemall.vo;

import java.io.Serializable;
import java.util.List;

public class GoodsReviewAvgVO implements Serializable{
	//reviewId的件数
    private Integer reviewCount;
	
	public Integer getReviewCount() {
		return reviewCount;
	}

	public void setReviewCount(Integer reviewCount) {
		this.reviewCount = reviewCount;
	}

	public Integer getTitleCount() {
		return titleCount;
	}

	public void setTitleCount(Integer titleCount) {
		this.titleCount = titleCount;
	}

	public Integer getRatingAvg() {
		return ratingAvg;
	}

	public void setRatingAvg(Integer ratingAvg) {
		this.ratingAvg = ratingAvg;
	}

	public List<GoodsReviewAvgSecondVO> getGoodsReviewAvgSecondVOS() {
		return GoodsReviewAvgSecondVOS;
	}

	public void setGoodsReviewAvgSecondVOS(List<GoodsReviewAvgSecondVO> goodsReviewAvgSecondVOS) {
		GoodsReviewAvgSecondVOS = goodsReviewAvgSecondVOS;
	}

	private Integer titleCount;
	
	private Integer ratingAvg;
	
	private List<GoodsReviewAvgSecondVO> GoodsReviewAvgSecondVOS;

}
