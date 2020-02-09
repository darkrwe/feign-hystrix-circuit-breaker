package com.myspring.application.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author emininal
 * @since 8.02.2020
 */

@FeignClient(name = "hystrixFeignClient", url = "http://localhost:9090/api/v1/default-item/all", fallback = HystrixClientFallback.class)
public interface FeignClientHystrix {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    String getData();
}
