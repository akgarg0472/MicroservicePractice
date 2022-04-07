package com.akgarg.clients.fraud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Author: Akhilesh Garg
 * Github: https://github.com/akgarg0472
 */
@FeignClient(value = "fraud", path = "api/v1/fraud-check")
public interface FraudClient {

    @RequestMapping(method = RequestMethod.GET, path = "{customerId}")
    FraudCheckResponse isFraudster(@PathVariable("customerId") Integer customerId);

}