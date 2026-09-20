package org.example.expenstracker.dto;

import jakarta.validation.constraints.Positive;
import org.example.expenstracker.entity.PaymentMode;

public class ExpenseDto {

    @Positive(message = "Expenditure amount must be more than 0")
    private int expenditureAmount;
    @Positive(message = "Expenditure reason cannot be empty")
    private String expenditureReason;
    @Positive(message = "Expenditure date cannot be empty")
    private String expenditureDate;
    @Positive(message = "Expenditure category cannot be empty")
    private String expenditureCategory;
    @Positive(message = "Payment mode is required")
    private PaymentMode paymentMode;

    public int getExpenditureAmount() {
        return expenditureAmount;
    }

    public void setExpenditureAmount(int expenditureAmount) {
        this.expenditureAmount = expenditureAmount;
    }

    public String getExpenditureReason() {
        return expenditureReason;
    }

    public void setExpenditureReason(String expenditureReason) {
        this.expenditureReason = expenditureReason;
    }

    public String getExpenditureDate() {
        return expenditureDate;
    }

    public void setExpenditureDate(String expenditureDate) {
        this.expenditureDate = expenditureDate;
    }

    public String getExpenditureCategory() {
        return expenditureCategory;
    }

    public void setExpenditureCategory(String expenditureCategory) {
        this.expenditureCategory = expenditureCategory;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }
}
