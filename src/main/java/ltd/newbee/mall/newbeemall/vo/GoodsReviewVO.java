package ltd.newbee.mall.newbeemall.vo;

import java.io.Serializable;
import java.util.Date;

public class GoodsReviewVO implements Serializable{

	private String nickName;

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Long getReviewId() {
		return reviewId;
	}

	public void setReviewId(Long reviewId) {
		this.reviewId = reviewId;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public Date getReviewDate() {
		return reviewDate;
	}

	public void setReviewDate(Date reviewDate) {
		this.reviewDate = reviewDate;
	}

	public String getReviewContent() {
		return reviewContent;
	}

	public void setReviewContent(String reviewContent) {
		this.reviewContent = reviewContent;
	}

	public String getReviewTitle() {
		return reviewTitle;
	}

	public void setReviewTitle(String reviewTitle) {
		this.reviewTitle = reviewTitle;
	}

	public String getReviewPhoto1() {
		return reviewPhoto1;
	}

	public void setReviewPhoto1(String reviewPhoto1) {
		this.reviewPhoto1 = reviewPhoto1;
	}

	public String getReviewPhoto2() {
		return reviewPhoto2;
	}

	public void setReviewPhoto2(String reviewPhoto2) {
		this.reviewPhoto2 = reviewPhoto2;
	}

	public String getReviewPhoto3() {
		return reviewPhoto3;
	}

	public void setReviewPhoto3(String reviewPhoto3) {
		this.reviewPhoto3 = reviewPhoto3;
	}

	public String getReviewPhoto4() {
		return reviewPhoto4;
	}

	public void setReviewPhoto4(String reviewPhoto4) {
		this.reviewPhoto4 = reviewPhoto4;
	}

	public String getReviewPhoto5() {
		return reviewPhoto5;
	}

	public void setReviewPhoto5(String reviewPhoto5) {
		this.reviewPhoto5 = reviewPhoto5;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	private Long reviewId;

	private Integer rating; 
	
	private Date reviewDate;
	
	private String reviewContent;
	
	private String reviewTitle;
	
	private String reviewPhoto1;
	
	private String reviewPhoto2;
	
	private String reviewPhoto3;
	
	private String reviewPhoto4;
	
	private String reviewPhoto5;
	
    private String goodsName;
    
    private Integer count;


}
