package cn.oldriver.dao.user;

import cn.oldriver.entity.po.UserInfoPO;
import org.springframework.stereotype.Repository;

/**
 * @Author kejx
 * @Date 2019/3/15 1:32
 */
@Repository
public class UserInfoDAO {

    /**
     * 通过手机号查询用户信息
     * @param billId 手机号
     * @return 用户信息
     */
    public UserInfoPO getUserInfo(String billId) {

        UserInfoPO entity = new UserInfoPO();
        entity.setBillId(billId);
        entity.setLevel(1);

        return entity;
    }

}
