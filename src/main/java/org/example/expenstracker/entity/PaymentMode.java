package org.example.expenstracker.entity;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum PaymentMode {

    CASH,
    UPI,
    QRCODE,
    BITCOIN;

    @JsonCreator
    public static PaymentMode fromString(String value) {

        return PaymentMode.valueOf(value.trim().toUpperCase().replace("_", " ").replace(" ", ""));

    }

}