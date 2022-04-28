package ltd.newbee.mall.newbeemall.entity;

import java.util.Date;

import javax.annotation.Generated;

public class GoodsQA {
	@Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T10:19:28.5959275+08:00", comments="Source field: questions.question_id")
    private Long questionId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T10:19:28.5969275+08:00", comments="Source field: questions.user_id")
    private Long userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T10:19:28.5969275+08:00", comments="Source field: questions.question_date")
    private Date questionDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T10:19:28.5969275+08:00", comments="Source field: questions.goods_id")
    private Long goodsId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T10:19:28.5969275+08:00", comments="Source field: questions.proved")
    private Integer proved;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T10:19:28.5969275+08:00", comments="Source field: questions.question_contents")
    private String questionContents;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T10:19:28.5959275+08:00", comments="Source field: questions.question_id")
    public Long getQuestionId() {
        return questionId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T10:19:28.5969275+08:00", comments="Source field: questions.question_id")
    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T10:19:28.5969275+08:00", comments="Source field: questions.user_id")
    public Long getUserId() {
        return userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T10:19:28.5969275+08:00", comments="Source field: questions.user_id")
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T10:19:28.5969275+08:00", comments="Source field: questions.question_date")
    public Date getQuestionDate() {
        return questionDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T10:19:28.5969275+08:00", comments="Source field: questions.question_date")
    public void setQuestionDate(Date questionDate) {
        this.questionDate = questionDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T10:19:28.5969275+08:00", comments="Source field: questions.goods_id")
    public Long getGoodsId() {
        return goodsId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T10:19:28.5969275+08:00", comments="Source field: questions.goods_id")
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T10:19:28.5969275+08:00", comments="Source field: questions.proved")
    public Integer getProved() {
        return proved;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T10:19:28.5969275+08:00", comments="Source field: questions.proved")
    public void setProved(Integer proved) {
        this.proved = proved;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T10:19:28.5969275+08:00", comments="Source field: questions.question_contents")
    public String getQuestionContents() {
        return questionContents;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T10:19:28.5969275+08:00", comments="Source field: questions.question_contents")
    public void setQuestionContents(String questionContents) {
        this.questionContents = questionContents == null ? null : questionContents.trim();
    }
    
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T10:22:57.4938757+08:00", comments="Source field: answer.answer_id")
    private Long answerId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T10:22:57.4938757+08:00", comments="Source field: answer.employee_id")
    private Long employeeId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T10:22:57.4938757+08:00", comments="Source field: answer.answer_date")
    private Date answerDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T10:22:57.4938757+08:00", comments="Source field: answer.answer_contents")
    private String answerContents;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T10:22:57.4938757+08:00", comments="Source field: answer.answer_id")
    public Long getAnswerId() {
        return answerId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T10:22:57.4938757+08:00", comments="Source field: answer.answer_id")
    public void setAnswerId(Long answerId) {
        this.answerId = answerId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T10:22:57.4938757+08:00", comments="Source field: answer.employee_id")
    public Long getEmployeeId() {
        return employeeId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T10:22:57.4938757+08:00", comments="Source field: answer.employee_id")
    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T10:22:57.4938757+08:00", comments="Source field: answer.answer_date")
    public Date getAnswerDate() {
        return answerDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T10:22:57.4938757+08:00", comments="Source field: answer.answer_date")
    public void setAnswerDate(Date answerDate) {
        this.answerDate = answerDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T10:22:57.4938757+08:00", comments="Source field: answer.answer_contents")
    public String getAnswerContents() {
        return answerContents;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T10:22:57.4938757+08:00", comments="Source field: answer.answer_contents")
    public void setAnswerContents(String answerContents) {
        this.answerContents = answerContents == null ? null : answerContents.trim();
    }
    

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T10:23:32.6818884+08:00", comments="Source field: qa_like.like_date")
    private Date likeDate;
 

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T10:23:32.6818884+08:00", comments="Source field: qa_like.like_date")
    public Date getLikeDate() {
        return likeDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-27T10:23:32.6818884+08:00", comments="Source field: qa_like.like_date")
    public void setLikeDate(Date likeDate) {
        this.likeDate = likeDate;
    }

	private Integer count;

	private String totalCount;

	private String setPageNumber;

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public String setPageNumber() {
		return setPageNumber;
	}

	public void setPageNumber(String currentPage) {
		this.setPageNumber = currentPage;
	}

} 


