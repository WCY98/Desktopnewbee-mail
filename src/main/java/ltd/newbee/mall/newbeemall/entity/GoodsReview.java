package ltd.newbee.mall.newbeemall.entity;

import java.util.Date;

public class GoodsReview {
	private Long reviewId;
	
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

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
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

	private Integer rating;
	
	private String nickName; 
	
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
    
    private Long orderId;
    
    public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Integer getProved() {
		return proved;
	}

	public void setProved(Integer proved) {
		this.proved = proved;
	}

	private Integer proved;
    
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Integer getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}

	public Long getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}

	private Long userId;
	
	private Integer orderNo;
	
	private Long goodsId;

}
