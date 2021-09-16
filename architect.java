
public class architect {
    //Attributes 
    String ArchitectName;
    int telephoneNumber;
    int numAddress;
    String s = String.valueOf(numAddress);
    String emailAddress;
    String recipient;
    String domain ;
    String physicalAddress2;

     //We going to use the constructor to initialize the aributes to the value that we specify for each object 
    public architect (String ArchitectName, int telephoneNumber, String emailAddress, String recipient, String domain,int numAddress,
                     String physicalAddress2) {
        this.ArchitectName = ArchitectName;
        this.telephoneNumber = telephoneNumber;
        this.emailAddress = emailAddress;
        this.recipient = recipient;
        this.domain =domain;
        this.numAddress = numAddress;
        this.physicalAddress2 = physicalAddress2;
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
    
    //We want our program to get the architect name and make it availiable to the to the whole program so that we can use it when ever we want 
    public String getArchitectName(){
        return ArchitectName;
    }
    
    //We want our program to get the physical address and make it availiable to the to the whole program so that we can use it when ever we want 
    public String setPhysicalAddress2(){
        return  physicalAddress2;
    }
    
    //We want our program to get the email address and make it availiable to the to the whole program so that we can use it when ever we want 
    public String getEmailAddress(){
        return emailAddress;
    }
    
    //we are going to define our methods to display the contents of each variable
    public String toString() {
        String output = "Name:" + ArchitectName;
        output += "\n Telephone Number:" + telephoneNumber;
        output += "\n Email Address:" + emailAddress;
        output += "\n Physical Address:" + physicalAddress2;
        return output;
        }
    }

  

 

