package org.example.expenstracker.menu;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Scanner;

@Component
public class ExpenseTrackerMenu {

    public void showMenu() {

        System.out.println("======Expense Menu=====");
        System.out.println("1. Enter Expenditure Amount");
        System.out.println("2. Enter Expenditure Reason");
        System.out.println("3. Enter Reason");
        System.out.println("4. Enter Date");
        System.out.println("5. Display All Transactions");
        System.out.println("6. Display Transactions By Id: ");
        System.out.println("7. Exit: ");

    }

    public void enterIncome() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Income Amount: ");
        int incomeAmount = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Reason: ");
        String reason = sc.next();

        System.out.println("Enter Date (YYYY-MM-DD): ");
        String dateInput = sc.nextLine();

        LocalDate date = LocalDate.parse(dateInput);

    }



}