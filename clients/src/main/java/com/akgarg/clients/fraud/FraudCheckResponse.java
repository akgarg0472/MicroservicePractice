package com.akgarg.clients.fraud;

/**
 * Author: Akhilesh Garg
 * Github: https://github.com/akgarg0472
 */
public class FraudCheckResponse {

    private Boolean isFraudster;

    public FraudCheckResponse() {
    }

    public FraudCheckResponse(final Boolean isFraudster) {
        this.isFraudster = isFraudster;
    }

    public Boolean getFraudster() {
        return isFraudster;
    }

    public void setFraudster(final Boolean fraudster) {
        isFraudster = fraudster;
    }

    @Override
    public String toString() {
        return "FraudCheckResponse{" +
                "isFraudster=" + isFraudster +
                '}';
    }
}
