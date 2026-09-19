package org.example.expenstracker.service;

import org.example.expenstracker.entity.Expense;
import org.example.expenstracker.entity.PaymentMode;

import java.util.List;
import java.util.Optional;

public interface ExpenseService {

    // insert
    public boolean addExpense(Expense expense);

    // display
    public List<Expense> getAllExpense();

    // display by Id
    public Optional<Expense> getExpenseById(int id);

    // update
    public boolean updateExpense(int id, int expenditureAmount);

    // delete
    public boolean deleteExpense(int id);

    // display by paymentMode
    public List<Expense> getExpenseByPaymentMode(PaymentMode paymentMode);

    // display by category
    public List<Expense> findByExpenditureCategory(String category);

    // calculation of expense
    Integer getTotalExpenditure();

}
