import java.time.LocalDate; 
import java.util.Scanner;
public class testing {
  public static void main(String[] args){
    //Getting the user input
    Scanner input = new Scanner(System.in);

    //Asking the user to put the details of the project
    System.out.println("Enter a project number:");
    long projectNumber = input.nextInt();
    input.nextLine();
    System.out.println("Enter a project name:");
    String projectName = input.next();
    input.nextLine();
    System.out.println("What type of building is it:");
    String typeOfBuilding = input.next();
    input.nextLine();
    System.out.println("Enter Physical Address:");
    String physicalAddress = input.next();
    input.nextLine();
    System.out.println("Enter ERF Number:");
    long ERFNumber = input.nextLong();
    input.nextLine();
    System.out.println("How much is the project:");
    int feeForTheProject = input.nextInt();
    input.nextLine();
    System.out.println("How much is paid:");
    int totalAmountPaid = input.nextInt();
    input.nextLine();
    System.out.println("Enter deadline of the project:");
    String deadlineForTheProject = input.nextLine();
    input.nextLine();

    //Asking the user to enter the contractors details
    System.out.println("Enter architect name:");
    String ArchitectName = input.next();
    input.nextLine();
    System.out.println("Enter telephone number:");
    long telephoneNumber = input.nextLong();
    input.nextLine();
    System.out.println("Enter Email Address:");
    String emailAddress = input.next();
    input.nextLine();
    System.out.println("Enter physical address:");
    String physicalAddress1 = input.next();
    input.nextLine();

    //Asking the user to enter the details of the contractor
    System.out.println("Enter contractor name:");
    String contractorName = input.next();
    input.nextLine();
    System.out.println("Enter telephone number:");
    long telephoneNumber2 = input.nextLong();
    input.nextLine();
    System.out.println("Enter Email Address:");
    String emailAddress2 = input.next();
    input.nextLine();
    System.out.println("Enter physical address:");
    String physicalAddress2 = input.next();
    input.nextLine();

    //Asking the user to enter the details of the customer
    System.out.println("Enter customer name:");
    String customerName = input.next();
    input.nextLine();
    System.out.println("Enter telephone number:");
    long telephoneNumber3 = input.nextLong();
    input.nextLine();
    System.out.println("Enter Email Adress:");
    String emailAddress3 = input.next();
    input.nextLine();
    System.out.println("Enter physical adress:"); 
    String physicalAddress3 = input.next();
    input.nextLine();

    //Display the output of the project details
    System.out.println(projectNumber);
    System.out.println(projectName);
    System.out.println(typeOfBuilding);
    System.out.println(physicalAddress);
    System.out.println(ERFNumber);
    System.out.println(feeForTheProject);
    System.out.println(totalAmountPaid);
    System.out.println(deadlineForTheProject);

    //Display the output of the architect details
    System.out.println(ArchitectName);
    System.out.println(telephoneNumber);
    System.out.println(emailAddress);
    System.out.println(physicalAddress1);

    //Display the output of the contractor details
    System.out.println(contractorName);
    System.out.println(telephoneNumber2);
    System.out.println(emailAddress2);
    System.out.println(physicalAddress2);

    //Display the output of the customer details
    System.out.println(customerName);
    System.out.println(telephoneNumber3);
    System.out.println(emailAddress3);
    System.out.println(physicalAddress3);

    //Display the date
    LocalDate myObj = LocalDate.now(); // Create a date object
System.out.println(myObj); // Display the current date
    input.close();
  }
}
