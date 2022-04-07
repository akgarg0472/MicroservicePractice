package com.akgarg.fraud;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Author: Akhilesh Garg
 * Github: https://github.com/akgarg0472
 */
public interface FraudCheckHistoryRepository extends JpaRepository<FraudCheckHistory, Integer> {

}
