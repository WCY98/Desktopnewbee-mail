package ltd.newbee.mall.newbeemall.vo;

import java.io.Serializable;

public class GoodsReviewAvgSecondVO implements Serializable{
	
	private Integer rating;

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public Integer getRatingCount() {
		return ratingCount;
	}

	public void setRatingCount(Integer ratingCount) {
		this.ratingCount = ratingCount;
	}

	private Integer ratingCount;

}
