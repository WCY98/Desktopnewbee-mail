package ltd.newbee.mall.newbeemall.vo;

import java.io.Serializable;
import java.util.List;

public class GoodsQAFirstVO implements Serializable{
	private int totalCount;
	
	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public List<GoodsQASecondVO> getGoodsQAVOS() {
		return GoodsQAVOS;
	}

	public void setGoodsQAVOS(List<GoodsQASecondVO> goodsQAVOS) {
		GoodsQAVOS = goodsQAVOS;
	}

	private int currentPage;
	
	private int totalPage;
	
	private List<GoodsQASecondVO> GoodsQAVOS;
	

}
