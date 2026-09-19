package org.example.expenstracker.service;

import org.example.expenstracker.entity.Expense;
import org.example.expenstracker.entity.PaymentMode;
import org.example.expenstracker.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class ExpenseServiceImpl implements ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    @Override
    public boolean addExpense(Expense expense) {

        boolean status = false;

        Expense e = expenseRepository.save(expense);

        try {

            if (e != null) {
                System.out.println("Data Added Successfully");
                status = true;
            } else {
                System.out.println("Data Not Added, try again");
                 status = false;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return status;
    }

    @Override
    public List<Expense> getAllExpense() {

        return expenseRepository.findAll();

    }

    @Override
    public Optional<Expense> getExpenseById(int id) {

        return expenseRepository.findById(id);

    }

    @Override
    public boolean updateExpense(@PathVariable int id, @RequestBody int expenditureAmount) {

        Expense expense = expenseRepository.findById(id).orElse(null);

        if(expense == null) {
            System.out.println("Data not updated");
            return false;
        } else {
            expense.setExpenditureAmount(expenditureAmount);
            expenseRepository.save(expense);
            System.out.println("Data Updated Successfully");
            return true;
        }

    }

    @Override
    public boolean deleteExpense(int id) {

        expenseRepository.deleteById(id);

        return false;
    }

    @Override
    public List<Expense> getExpenseByPaymentMode(PaymentMode paymentMode) {

        return expenseRepository.findByPaymentMode(paymentMode);

    }

    public List<Expense> findByExpenditureCategory(String category) {

        return expenseRepository.findByExpenditureCategory(category);

    }

    @Override
    public Integer getTotalExpenditure() {

        return expenseRepository.getTotalExpenditure();

    }


}
