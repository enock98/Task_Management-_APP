public class poised {
    //Attributes
    int projectNumber;
    String projectName;
    String typeOfBuilding;
    String physicalAddress;
    long ERFNumber;
    int feeForTheProject;
    int totalAmountPaid;
    String deadlineForTheProject;
    String surname;

    //we are going to use the constructor to initialize the attributes to the values that we specify for each object
    public poised(int projectNumber, String projectName, String typeOfBuilding, String physicalAddress, long ERFNumber, int feeForTheProject,
                  int totalAmountPaid, String deadlineForTheProject, String surname){
        this.projectNumber = projectNumber;
        this.projectName = projectName;
        this.typeOfBuilding = typeOfBuilding;
        this.physicalAddress = physicalAddress;
        this.ERFNumber = ERFNumber;
        this.feeForTheProject = feeForTheProject;
        this.totalAmountPaid = totalAmountPaid;
        this.deadlineForTheProject = deadlineForTheProject;
        this.surname = surname;
    }

    //We want our program to get the project name and make it availiable to the to the whole program so that we can use it when ever we want 
    public String getProjectName(){
        return projectName + " " + surname;
    }

     //We want our program to get the type of building and make it availiable to the to the whole program so that we can use it when ever we want 
    public String setTypeOfBuilding(){
        return typeOfBuilding;
    }

     //We want our program to get the physical address and make it availiable to the to the whole program so that we can use it when ever we want 
    public String setPhysicalAddress(){
        return physicalAddress;
    }

     //We want our program to get the deadline of the project and make it availiable to the to the whole program so that we can use it when ever we want 
    public String setDeadlineOfTheProject(){
        return deadlineForTheProject;
    }

     //we are going to define our methods to display the contents of each variable
    public String toString(){
        String output = "project Number:" + projectNumber;
        output += "\n project Name:" + projectName;
        output += "\n Type of building:" + typeOfBuilding;
        output += "\n ERF Number:" + ERFNumber;
        output += "\n fee of the project:" + feeForTheProject;
        output += "\n total amount paid:" + totalAmountPaid;
        output += "\n Deadline of the project:" + deadlineForTheProject;
        return output;
    }
}
