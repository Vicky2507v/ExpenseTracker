package org.example.expenstracker.entity;

import jakarta.persistence.*;


@Table
@Entity
public class Expense {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private int expenditureAmount;

    @Column
    private String expenditureReason;

    @Column
    private String expenditureDate;

    @Column
    private String expenditureCategory;

    @Enumerated(EnumType.STRING)
    private PaymentMode paymentMode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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