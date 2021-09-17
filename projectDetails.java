public class projectDetails {


    static int projectNumber;
    static String projectName;
    static String buildingType;
    static String physicalAddress;
    static int ERF;
    static double totalCost;
    static double totalAmountPaidCurrently;
    static String deadline;
    static String completedTask;
    static int SE_ID;
    static int PM_ID;
    static int A_ID;
    static int C_ID;

    // Constructor - creating project object(s)
    public projectDetails(int projectNumber,
                          String projectName,
                          String buildingType,
                          String physicalAddress,
                          int ERF,
                          double totalCost,
                          double totalAmountPaidCurrently,
                          String deadline,
                          String completedTask,
                          int SE_ID,
                          int PM_ID,
                          int A_ID,
                          int C_ID)
    {
        projectDetails.projectNumber = projectNumber;
        projectDetails.projectName = projectName;
        projectDetails.buildingType = buildingType;
        projectDetails.physicalAddress = physicalAddress;
        projectDetails.ERF = ERF;
        projectDetails.totalCost = totalCost;
        projectDetails.totalAmountPaidCurrently = totalAmountPaidCurrently;
        projectDetails.deadline = deadline;
        projectDetails.completedTask = completedTask;
        projectDetails.SE_ID = SE_ID;
        projectDetails.PM_ID = PM_ID;
        projectDetails.A_ID = A_ID;
        projectDetails.C_ID = C_ID;

    }



    //Create a toString method
    public String toString()
    {
        String output = "Project Number: " + projectNumber;
        output += "\nProject Name: " + projectName;
        output += "\nBuilding Type: " + buildingType;
        output += "\nBuilding Address: " + physicalAddress;
        output += "\nERF Number: " + ERF;
        output += "\nTotal Fee: R" + totalCost;
        output += "\nTotal amount Paid to Date: R" + totalAmountPaidCurrently;
        output += "\nDeadline: " + deadline;
        output += "\nCompleted: " + completedTask;
        output += "\nStructural Engineer ID: " + SE_ID;
        output += "\nProject Manager ID: " + PM_ID;
        output += "\nArchitect ID: " + A_ID;
        output += "\nCustomer ID: " + C_ID;

        return output;
    }
}

