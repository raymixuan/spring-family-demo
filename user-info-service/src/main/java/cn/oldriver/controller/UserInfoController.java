package cn.oldriver.controller;

import cn.oldriver.common.exception.BaseException;
import cn.oldriver.common.exception.user.UserInfoException;
import cn.oldriver.common.statuscode.user.UserStatusCode;
import cn.oldriver.entity.bo.UserInfoBO;
import cn.oldriver.entity.vo.ResponseVO;
import cn.oldriver.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author kejx
 * @Date 2019/3/13 0:35
 */
@RestController
@RequestMapping("/api/v1/user")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping(method = RequestMethod.GET,
    path = "/{billId}/info")
    public ResponseVO<UserInfoBO> queryUserInfo(@PathVariable("billId") String billId) {
        ResponseVO<UserInfoBO> respVO = new ResponseVO<>();

        UserInfoBO userInfoBO = null;
        try {
            userInfoBO = userInfoService.getUserInfoByBillId(billId);
        } catch (UserInfoException e) {
            respVO.setCode(UserStatusCode.BILLID_ERROR);
            respVO.setMsg(e.getMessage());
            return respVO;
        }

        if (userInfoBO != null) {
            respVO.setCode("0");
            respVO.setObj(userInfoBO);
        } else {
            respVO.setCode(UserStatusCode.USER_NOT_FOUND);
        }

        return respVO;
    }

}
