package cn.oldriver.entity.bo;

import java.util.Date;

/**
 * @Author kejx
 * @Date 2019/3/16 10:47
 */
public class UserInfoBO {

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
        return "UserBO{" +
                "billId='" + billId + '\'' +
                ", registerDate=" + registerDate +
                ", level=" + level +
                '}';
    }
}
