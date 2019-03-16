package cn.oldriver.entity.bo;

/**
 * @Author kejx
 * @Date 2019/3/16 17:20
 */
public class FullUserInfo {

    private UserInfoBO userInfo;

    private CustomerBO customer;

    public UserInfoBO getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfoBO userInfo) {
        this.userInfo = userInfo;
    }

    public CustomerBO getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerBO customer) {
        this.customer = customer;
    }
}
