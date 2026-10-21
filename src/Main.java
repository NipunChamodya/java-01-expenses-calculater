import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Monthly Income");
        double income = input.nextDouble();
        System.out.println("Enter Your Transport Expenses");
        double transport = input.nextDouble();
        System.out.println("Enter Your Food Expenses");
        double food = input.nextDouble();
        System.out.println("Enter Your Bill Expenses");
        double bill = input.nextDouble();

        double totalExpenses = transport + food + bill;
        double balance = income - totalExpenses;

        System.out.println("\n Monthly Salary Expenses");
        System.out.println("Monthly Salary = " + income);
        System.out.println("Total Expense = " + totalExpenses);
        System.out.println(" Remaining Balance =" + balance);


    }
}