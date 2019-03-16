package cn.oldriver.service;

import cn.oldriver.common.exception.user.UserInfoException;
import cn.oldriver.dao.user.UserInfoDAO;
import cn.oldriver.entity.bo.UserInfoBO;
import cn.oldriver.entity.po.UserInfoPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author kejx
 * @Date 2019/3/15 1:30
 */
@Service
public class UserInfoService {

    @Autowired
    private UserInfoDAO userInfoDAO;

    public UserInfoBO getUserInfoByBillId(String billId) throws UserInfoException {
        int errorBillIdLength = 3;
        if (billId.length() < errorBillIdLength) {
            throw new UserInfoException("BillId格式错误", this.getClass());
        }

        UserInfoPO userInfoDO = userInfoDAO.getUserInfo(billId);

        if (userInfoDO != null) {
            UserInfoBO userBO = new UserInfoBO();
            userBO.setBillId(userInfoDO.getBillId());
            userBO.setLevel(userInfoDO.getLevel());
            userBO.setRegisterDate(userInfoDO.getRegisterDate());

            return userBO;
        } else {
            return null;
        }
    }

}
