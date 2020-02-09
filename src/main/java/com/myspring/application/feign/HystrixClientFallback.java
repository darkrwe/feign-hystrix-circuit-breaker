package com.myspring.application.feign;

import org.springframework.stereotype.Component;

/**
 * @author emininal
 * @since 9.02.2020
 */

@Component
public class HystrixClientFallback implements FeignClientHystrix {

    @Override
    public String getData() {
        return new String("we are in fallback now!!");
    }
}
