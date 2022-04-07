package com.akgarg.fraud;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * Author: Akhilesh Garg
 * Github: https://github.com/akgarg0472
 */
@SuppressWarnings("ClassCanBeRecord")
@Service
@AllArgsConstructor
@Slf4j
public class FraudCheckService {

    private final FraudCheckHistoryRepository fraudCheckHistoryRepository;

    public boolean isFraudulentCustomer(Integer customerId) {
        log.debug("Saving customer {} fraud info into db", customerId);

        fraudCheckHistoryRepository.save(
                FraudCheckHistory.builder()
                        .customerId(customerId)
                        .isFraudster(false)
                        .createdAt(LocalDateTime.now())
                        .build()
        );
        return false;
    }

}
