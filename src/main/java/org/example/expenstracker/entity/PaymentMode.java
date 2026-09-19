package org.example.expenstracker.entity;

public enum PaymentMode {

    CASH,
    UPI,
    QRCODE;

    public static PaymentMode fromString(String value) {

        return PaymentMode.valueOf(value.trim().toUpperCase().replace("_", " ").replace(" ", ""));

    }

}