package cn.oldriver.common.exception.user;

import cn.oldriver.common.exception.BaseException;

/**
 * @Author kejx
 * @Date 2019/3/16 15:50
 */
public class UserInfoException extends BaseException {

    public UserInfoException(String desc, Class tar) {
        super(desc, tar);
    }

}
