package ltd.newbee.mall.newbeemall.vo;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Date;

public class NewBeeMallIndexRescentCheckGoodsVO implements Serializable{
	
	private BigInteger user_id;

    private BigInteger goods_id;

    private Date check_date;
    
    public BigInteger getUser_id() {
        return user_id;
    }
    
    public void setUser_Id(BigInteger user_id) {
        this.user_id = user_id;
    }
    
    public BigInteger getGoods_id() {
        return goods_id;
    }
    
    public void setGoods_Id(BigInteger goods_id) {
        this.goods_id = goods_id;
    }
    
    public Date getCheck_date() {
        return check_date;
    }
    
    public void setCheck_date(Date check_date) {
        this.check_date = check_date;
    }


}
