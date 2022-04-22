package ltd.newbee.mall.newbeemall.entity;

import java.sql.Date;

public class RescentCheckGoods {
	
	    private Long userId;

	    private Long goodsId;

	    private Date checkDate;
	    
	    public Long getUserId() {
	        return userId;
	    }
	    
	    public void setUserId(Long userId) {
	        this.userId = userId;
	    }
	    
	    public Long getGoodsId() {
	        return goodsId;
	    }
	    
	    public void setGoodsId(Long goodsId) {
	        this.goodsId = goodsId;
	    }
	    
	    public Date getCheckDate() {
	        return checkDate;
	    }
	    
	    public void setCheckDate(Date checkDate) {
	        this.checkDate = checkDate;
	    }

	    @Override
	    public String toString() {
	        StringBuilder sb = new StringBuilder();
	        sb.append(getClass().getSimpleName());
	        sb.append(" [");
	        sb.append("Hash = ").append(hashCode());
	        sb.append(", userId").append(userId);
	        sb.append(", goodsId=").append(goodsId);
	        sb.append(", checkDate=").append(checkDate);
	        sb.append("]");
	        return sb.toString();
	    }
	       
}
