public class staffDetails {

    static int architectID;
    static String architectName;
    static int architectNum;
    static String architectEmail;
    static String architectAddress;
//----------------------------------------------------------------------------------------------------------------------
    static int customerID;
    static String customerName;
    static int customerNum;
    static String customerEmail;
    static String customerAddress;
//----------------------------------------------------------------------------------------------------------------------
    static int structuralEngineerID;
    static String structuralEngineerName;
    static int structuralEngineerNum;
    static String structuralEngineerEmail;
    static String structuralEngineerAddress;
//----------------------------------------------------------------------------------------------------------------------
    static int projectManagerID;
    static String projectManagerName;
    static int projectManagerNum;
    static String projectManagerEmail;
    static String projectManagerAddress;



    //Constructor - creating staff detail object(s)
    public staffDetails(
            int architectID,
            String architectName,
            int architectNum,
            String architectEmail,
            String architectAddress,
            int customerID,
            String customerName,
            int customerNum,
            String customerEmail,
            String customerAddress,
            int structuralEngineerID,
            String structuralEngineerName,
            int structuralEngineerNum,
            String structuralEngineerEmail,
            String structuralEngineerAddress,
            int projectManagerID,
            String projectManagerName,
            int projectManagerNum,
            String projectManagerEmail,
            String projectManagerAddress)

    {
        staffDetails.architectID = architectID;
        staffDetails.architectName = architectName;
        staffDetails.architectNum = architectNum;
        staffDetails.architectEmail = architectEmail;
        staffDetails.architectAddress = architectAddress;
        staffDetails.customerID = customerID;
        staffDetails.customerName = customerName;
        staffDetails.customerNum = customerNum;
        staffDetails.customerEmail = customerEmail;
        staffDetails.customerAddress = customerAddress;
        staffDetails.structuralEngineerID = structuralEngineerID;
        staffDetails.structuralEngineerName = structuralEngineerName;
        staffDetails.structuralEngineerNum = structuralEngineerNum;
        staffDetails.structuralEngineerEmail = structuralEngineerEmail;
        staffDetails.structuralEngineerAddress = structuralEngineerAddress;
        staffDetails.projectManagerID = projectManagerID;
        staffDetails.projectManagerName = projectManagerName;
        staffDetails.projectManagerNum = projectManagerNum;
        staffDetails.projectManagerEmail = projectManagerEmail;
        staffDetails.projectManagerAddress = projectManagerAddress;

    }


    //Create a toString method
    public String toString() {
        String output = "Architect: ";
        output += "Architect ID: " + architectID;
        output += "Name: " + architectName;
        output += "\nTelephone Number: " + architectNum;
        output += "\nEmail Address: " + architectEmail;
        output += "\nPhysical Address: " + architectAddress;
        output += "Customer: ";
        output += "Customer ID: " + customerID;
        output += "Name: " + customerName;
        output += "\nTelephone Number: " + customerNum;
        output += "\nEmail Address: " + customerEmail;
        output += "\nPhysical Address: " + customerAddress;
        output = "Structural Engineer: ";
        output += "Structural Engineer ID: " + structuralEngineerID;
        output += "Name: " + structuralEngineerName;
        output += "\nTelephone Number: " + structuralEngineerNum;
        output += "\nEmail Address: " + structuralEngineerEmail;
        output += "\nPhysical Address: " + structuralEngineerAddress;
        output = "Project Manager: ";
        output += "Project Manager ID: " + projectManagerID;
        output += "Name: " + projectManagerName;
        output += "\nTelephone Number: " + projectManagerNum;
        output += "\nEmail Address: " + projectManagerEmail;
        output += "\nPhysical Address: " + projectManagerAddress;

        return output;
    }
}