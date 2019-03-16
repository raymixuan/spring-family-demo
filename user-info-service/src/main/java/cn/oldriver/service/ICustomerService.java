package cn.oldriver.service;

import cn.oldriver.entity.bo.CustomerBO;
import cn.oldriver.entity.vo.ResponseVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author kejx
 * @Date 2019/3/16 17:13
 */
@FeignClient("customer-info-api-service")
public interface ICustomerService {

    @RequestMapping(method = RequestMethod.GET, path = "/api/v1/customer/{id}/info")
    ResponseVO<CustomerBO> getCustomerInfoByCustId(@PathVariable("id") String id);

}
