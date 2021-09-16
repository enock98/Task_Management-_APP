public class customer{
    //Attributes
    String customerName;
    long telephoneNumber3;
    String emailAddress3;
    String recipient;
    String domain ;
    String physicalAddress3;
    String surname;

    //we are going to use the constructor to initialize the attributes to the values that we specify for each object
    public customer(String customerName, long telephoneNumber3, String emailAddress3, String recipient, String domain,
    String physicalAddress3, String surname){
        this.customerName = customerName;
        this.telephoneNumber3 = telephoneNumber3;
        this.emailAddress3 = emailAddress3;
        this.recipient = recipient;
        this.domain =domain;
        this.physicalAddress3 = physicalAddress3;
        this.surname = surname;
    }

     //We want the email address to be availaible on the interfaces but we dont want it to appear on the screen interface yet
    public interface EmailAddressRenderer {
        void validEmailAddress( String emailAddress );
        void invalidEmailAddress();
      }

       //We want our program to be able to send the message the email back to the program that will be put by the user 
      public interface EmailAddress {
        void renderTo( EmailAddressRenderer renderer );
      }

       //We want our program to be able to access the email after it has been insected by the user
      public class ValidEmailAddress implements EmailAddress {
        private String recipient ;
        private String domain ;

         //We want our program to be able to tell if the email is valid or not 
        public void renderTo( EmailAddressRenderer renderer ){
          String emailAddress = recipient + "@" + domain;
          renderer.validEmailAddress( emailAddress );
        }
      }

       //We want our program to get the customer name and make it availiable to the to the whole program so that we can use it when ever we want 
    public String getCustomerName(){
        return customerName + " " + surname;
    }

     //We want our program to get the physical address and make it availiable to the to the whole program so that we can use it when ever we want 
    public String setPhysicalAddress3(){
        return  physicalAddress3;
    }
    
     //We want our program to get the email address and make it availiable to the to the whole program so that we can use it when ever we want 
     public String getEmailAddress3(){
      return emailAddress3;
  }

   //we are going to define our methods to display the contents of each variable
    public String toString(){
        String output = "Name:" + customerName;
        output += "\n Telephone Number:" + telephoneNumber3;
        output += "\n Email Address:" + emailAddress3;
        output += "\n Physical Address:" + physicalAddress3;
        return output;
    }
}    
  


