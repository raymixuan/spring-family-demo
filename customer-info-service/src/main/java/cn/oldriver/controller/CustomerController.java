package cn.oldriver.controller;

import cn.oldriver.entity.bo.CustomerBO;
import cn.oldriver.entity.vo.ResponseVO;
import cn.oldriver.service.CustomerService;
import cn.oldriver.service.ICustomerService;
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
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @Autowired
    private ICustomerService customerService;

    @RequestMapping(method = RequestMethod.GET,
    path = "/{id}/info")
    public ResponseVO<CustomerBO> queryCustomerInfo(@PathVariable("id") String id) {

        ResponseVO<CustomerBO> responseVO = new ResponseVO<>();
        responseVO.setCode("0");
        responseVO.setObj(customerService.getCustomerInfoByCustId(id));

        return responseVO;
    }

}
