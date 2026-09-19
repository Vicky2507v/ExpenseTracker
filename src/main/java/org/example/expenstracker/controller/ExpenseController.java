package org.example.expenstracker.controller;

import org.example.expenstracker.entity.Expense;
import org.example.expenstracker.entity.PaymentMode;
import org.example.expenstracker.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ExpenseController {

    @Autowired
    ExpenseService expenseService;

    @PostMapping("/addExepnse")
    public boolean addUserExpense(@RequestBody Expense expense) {

        boolean status = false;

        boolean val = expenseService.addExpense(expense);

        if(val) {
            System.out.println("Added Expense Successfully");
            status = true;
        } else {
            System.out.println("Expense Failed to added");
            status = false;
        }

        return status;

    }

    @GetMapping("/allExpense")
    public List<Expense> getAllUserExpense() {

        return expenseService.getAllExpense();

    }

    @GetMapping("/getExpense/{id}")
    public Optional<Expense> getUserExpenseById(@PathVariable  int id) {

        if(expenseService.getExpenseById(id).isPresent()) {
            return Optional.of(expenseService.getExpenseById(id).get());
        } else {
            return Optional.empty();
        }

    }

    @PutMapping("/updateExpense/{id}")
    public boolean updateUserExpense(@PathVariable int id, @RequestBody Expense expense) {

        boolean updateExpense = expenseService.updateExpense(id, expense.getExpenditureAmount());

        if(updateExpense) {
            System.out.println("Updated Expense Successfully");
            return true;
        } else {
            System.out.println("Expense Failed to updated");
            return false;
        }
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteUserExpense(@PathVariable int id) {

        if(expenseService.getExpenseById(id).isPresent()) {

            expenseService.deleteExpense(id);
            System.out.println("Deleted Expense Successfully");
            return true;

        }
        else {

            System.out.println("Expense Not Found");
            return false;

        }

    }

    @GetMapping("/displayPaymentMode/{paymentMode}")
    public List<Expense> displayUserByPaymentMode(@PathVariable String paymentMode) {

        PaymentMode mode = PaymentMode.fromString(paymentMode);

        return expenseService.getExpenseByPaymentMode(mode);

    }

    @GetMapping("/displayCategory/{category}")
    public List<Expense> displayUserByCategory(@PathVariable String category) {

        return expenseService.findByExpenditureCategory(category);

    }

    @GetMapping("/total")
    public Integer getTotalExpenditure() {
        return expenseService.getTotalExpenditure();
    }



}