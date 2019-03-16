package cn.oldriver.entity.po;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author kejx
 * @Date 2019/3/15 1:33
 */
public class UserInfoPO implements Serializable {

    /**
     * 客户编号
     */
    private String customerId;

    /**
     * 用户手机号
     */
    private String billId;

    /**
     * 用户入网时间
     */
    private Date registerDate;

    /**
     * 用户星级
     */
    private Integer level;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "UserInfoPO{" +
                "customerId='" + customerId + '\'' +
                ", billId='" + billId + '\'' +
                ", registerDate=" + registerDate +
                ", level=" + level +
                '}';
    }
}
