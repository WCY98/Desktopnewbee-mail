package ltd.newbee.mall.newbeemall.entity;

import java.util.Date;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonFormat;

public class GoodsQA {
	private Long goodsId;

	private String questionContents;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date questionDate;

	private String answerContents;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date answerDate;

	private Integer count;

	public Long getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}

	public String getQuestionContents() {
		return questionContents;
	}

	public void setQuestionContents(String questionContents) {
		this.questionContents = questionContents;
	}

	public Date getQuestionDate() {
		return questionDate;
	}

	public void setQuestionDate(Date questionDate) {
		this.questionDate = questionDate;
	}

	public String getAnswerContents() {
		return answerContents;
	}

	public void setAnswerContents(String answerContents) {
		this.answerContents = answerContents;
	}

	public Date getAnswerDate() {
		return answerDate;
	}

	public void setAnswerDate(Date answerDate) {
		this.answerDate = answerDate;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

}
