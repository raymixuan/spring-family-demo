package cn.oldriver.service;

import cn.oldriver.entity.bo.CustomerBO;

/**
 * @Author kejx
 * @Date 2019/3/16 17:13
 */
public interface ICustomerService  {

    CustomerBO getCustomerInfoByCustId(String custId);
}
