
import java.util.Scanner;

public class Activity1 {
     public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            String name;
            int science,history,math,soc,arts;
           
            String remarks = "Fail";
            String message = "Try Again";
           
            System.out.print("Enter Name:");
            name = sc.nextLine();
           
            System.out.print("Enter Marks In Science:");
            science = sc.nextInt();
           
            System.out.print("Enter Marks In History:");
            history = sc.nextInt();
           
            System.out.print("Enter Marks In Math:");
            math = sc.nextInt();
           
            System.out.print("Enter Marks In Soc:");
            soc = sc.nextInt();
           
            System.out.print("Enter Marks In Arts:");
            arts = sc.nextInt();
           
           
           
            int total = science + history + math + soc + arts;
            double percentage = (total/500.0) * 100;
         
            if (percentage < 70){
                remarks = "Fail";
                message = "Try Again";
            } else if (percentage >= 70 && percentage <= 75){
                remarks = "Poor";
                message = "Congrats" + name + " You Passed. ";
            } else if (percentage >= 75 && percentage <= 80){
                remarks = "Fair";
                message = "Congrats" + name + " You Passed. ";
            } else if (percentage >= 80 && percentage <= 85){
                remarks = "Good";
                message = "Congrats" + name + " You Passed. ";
            } else if (percentage >= 85 && percentage <= 90){
                remarks = "Good";
                message = "Congrats" + name + "You Passed.";
            } else if (percentage >= 90 && percentage <= 100){
                remarks = "Excellent";
                message = "Congrats" + name + " You Passed.";
            } else {
                remarks = "Invalid Percentage";
                message = "Please check entered marks.";
            }
           
           
            System.out.print("\nTotal Marks:" + total);
            System.out.printf("\nTotal Percentage:%.2f", percentage);
            System.out.print("\nRemarks:" + remarks);
            System.out.println("\n" + message);
           
            sc.close();
             
        }
    }
}
