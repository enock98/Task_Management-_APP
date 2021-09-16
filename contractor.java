public class contractor {
    //Attributes 
    String contractorName;
    long telephoneNumber2;
    String emailAddress2;
    String recipient;
    String domain ;
    String physicalAddress2;
    String surname;

    //constructor
    public contractor(String contractorName, long telephoneNumber2, String emailAddress2, String recipient, String domain,
                    String physicalAddress2, String surname){
        this.contractorName = contractorName;
        this.telephoneNumber2 = telephoneNumber2;
        this.emailAddress2 = emailAddress2;
        this.recipient = recipient;
        this.domain =domain;
        this.physicalAddress2 = physicalAddress2;
        this.surname = surname;
    }

     //We want the email address to be availaible on the interfaces but we dont want it to appear on the screen interface yet
    public interface EmailAddressRenderer {
        void validEmailAddress( String emailAddress );
        void invalidEmailAddress();
    }

    //We want our program to be able to send the message the email back to the program that will be put by the user 
    public interface EmailAddress {
        void renderTo( customer.EmailAddressRenderer renderer );
    }

     //We want our program to be able to access the email after it has been insected by the user
    public class ValidEmailAddress implements customer.EmailAddress {
        private String recipient ;
        private String domain ;

         //We want our program to be able to tell if the email is valid or not 
        public void renderTo( customer.EmailAddressRenderer renderer ){
            String emailAddress = recipient + "@" + domain;
            renderer.validEmailAddress( emailAddress );
        }
    }

     //We want our program to get the contractor name and make it availiable to the to the whole program so that we can use it when ever we want 
    public String getCustomerName(){
        return contractorName + " " + surname;
    }

    //We want our program to get the physical address and make it availiable to the to the whole program so that we can use it when ever we want 
    public String setPhysicalAddress2(){
        return physicalAddress2;
    }

     //We want our program to get the email address and make it availiable to the to the whole program so that we can use it when ever we want 
     public String getEmailAddress2(){
        return emailAddress2;
    }

     //we are going to define our methods to display the contents of each variable
    public String toString(){
        String output = "Name:" + contractorName;
        output += "\n Telephone Number:" + telephoneNumber2;
        output += "\n Email Adress:" + emailAddress2;
        output += "\n Physical Adress:" + physicalAddress2;
        return output;
    }
}