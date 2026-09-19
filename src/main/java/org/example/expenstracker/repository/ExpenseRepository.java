package org.example.expenstracker.repository;

import org.example.expenstracker.entity.Expense;
import org.example.expenstracker.entity.PaymentMode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Integer> {

    List<Expense> findByPaymentMode(PaymentMode paymentMode);
    List<Expense> findByExpenditureCategory(String category);

    @Query("SELECT SUM(e.expenditureAmount) FROM Expense e")
    Integer getTotalExpenditure();

}
