
package yares;

import java.util.Scanner;


public class Yares {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter employee name: ");
        String employeeName = scanner.nextLine();

        System.out.print("Enter hourly rate: ");
        double hourlyRate = scanner.nextDouble();

        System.out.print("Enter total hours worked this week: ");
        int hoursWorked = scanner.nextInt();


        double grossWeeklyWage = hourlyRate * hoursWorked;
        double sssContribution = grossWeeklyWage * 0.10;
        double netWeeklyWage = grossWeeklyWage - sssContribution;

        System.out.println("\n---- Wage Summary ----");
        System.out.println("Employee: " + employeeName);
        System.out.printf("Hourly Rate: ₱%.2f\n", hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.printf("Gross Weekly Wage: ₱%.2f\n", grossWeeklyWage);
        System.out.printf("SSS Contribution (10%%): ₱%.2f\n", sssContribution);
        System.out.println("--------------------------------");
        System.out.printf("Net Weekly Wage: ₱%.2f\n", netWeeklyWage);

        scanner.close();
    }
}
    
    

