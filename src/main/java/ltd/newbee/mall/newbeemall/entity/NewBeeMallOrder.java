package ltd.newbee.mall.newbeemall.entity;

public class NewBeeMallOrder {
	private long orderId;

	private String orderNo;
	
	private long userId;

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}
	
	@Override
	public String toString() {
		return "NewBeeMallOrder [orderId=" + orderId + ", orderNo=" + orderNo + ", userId=" + userId + "]";
	}
}
