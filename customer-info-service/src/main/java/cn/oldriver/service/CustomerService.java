package cn.oldriver.service;

import cn.oldriver.entity.bo.CustomerBO;
import org.springframework.stereotype.Service;

/**
 * @Author kejx
 * @Date 2019/3/16 17:04
 */
@Service
public class CustomerService implements ICustomerService {

    @Override
    public CustomerBO getCustomerInfoByCustId(String custId) {

        CustomerBO customerBO = new CustomerBO();
        customerBO.setName("柯**");
        customerBO.setAddress("广西***");
        customerBO.setAge("18");
        customerBO.setCardNo("123456");
        customerBO.setCardType("身份证");
        customerBO.setSex("男");

        return customerBO;
    }

}
