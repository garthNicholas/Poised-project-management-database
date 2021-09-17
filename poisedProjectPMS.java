// import relevant java classes


import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


class poisedProjectPMS {

    public static void main(String[] args) throws SQLException {

// Create While loop for the program to loop back to the main menu
        while (true) {

// Print Welcome message and MAIN MENU with user options
            System.out.println("Welcome to the Poised Project Management System");

            System.out.println("\nPlease select from the menu below: ");

            // Scanner created for user input
            Scanner scan = new Scanner(System.in);

            System.out.println("\n	Poised Project Menu"
                    + "\n-----------------------------------"
                    + "\n 1 - Create New Project"
                    + "\n 2 - View all projects"
                    + "\n 3 - Edit Details of Current Project"
                    + "\n 4 - Finalize Project"
                    + "\n 5 - Exit"
                    + "\n-----------------------------------");

            int menuSelection = scan.nextInt();

// If user selects - 1 - from the Main Menu, User will be prompted with questions and a new project will be created with createProject() method
            if (menuSelection == 1) {

                createProject();
            }

// If user selects - 2 - from the Main Menu, User will be prompted with a new menu to view projects with viewProject() method
            else if (menuSelection == 2) {

                viewProject();
            }

// If user selects - 3 - from the Main Menu, User will be prompted with a new menu to edit projects with editProject() method
            else if (menuSelection == 3) {

                editProject();
            }

// If user selects - 4 - from the Main Menu - Finalize the project.
            else if (menuSelection == 4) {

                FinalizeProject();
            }
// If user selects - 5 - from the Main Menu - Print Goodbye message and close program
            else if (menuSelection == 5) {
                System.out.println("Goodbye");
                break;
            }
        }
    }

    // CREATE PROJECT METHOD
    public static void createProject() throws SQLException {

        int ArchitectID;
        int CustomerID;
        int ProjectManagerID;
        int StructuralEngineerID;


        try {

            // Connect to the library_db database, via the jdbc:mysql: channel on localhost (this PC)
            // Use username "otheruser", password "swordfish".
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/poisedpms?useSSL=false",
                    "otheruser",
                    "swordfish"
            );

            // Create a direct line to the database for running our queries
            Statement statement = connection.createStatement();
            int rowsAffected;

            Scanner scan1 = new Scanner(System.in);

            System.out.println("\nYou are now creating a new project on this system,");
            System.out.println("\nPlease enter all of the Project related information below:");


// ARCHITECT INFO requested
            System.out.println("\nThe Architect Details:");

            while (true) {

                try {

                    System.out.println("Please enter the Architects ID: ");
                    scan1 = new Scanner(System.in);
                    ArchitectID = scan1.nextInt();
                    break;

                } catch (Exception e) {
                    System.out.println("An error occurred. You entered letters instead of digits");
                }
            }

            System.out.println("Please enter the Architects full name: ");
            scan1 = new Scanner(System.in);
            staffDetails.architectName = scan1.nextLine();

            /*----- TRY/CATCH block to handle exceptions including errors like entering letters instead of digits for the phone number-----*/
            while (true) {

                try {

                    System.out.println("Please enter the Architects phone number");
                    scan1 = new Scanner(System.in);                          //Clears the scanner so we don't skip lines
                    staffDetails.architectNum = scan1.nextInt();
                    break;

                } catch (Exception e) {
                    System.out.println("An error occurred. You entered letters instead of digits");
                }
            }

            System.out.println("\nPlease enter the Architects email: ");
            scan1 = new Scanner(System.in);
            staffDetails.architectEmail = scan1.nextLine();

            System.out.println("\nPlease enter the Architects address: ");
            scan1 = new Scanner(System.in);
            staffDetails.architectAddress = scan1.nextLine();
            System.out.println("\nArchitects details have been updated successfully! ");


// CUSTOMER INFO requested

            System.out.println("\nThe Customer Details:");

           while (true) {

                try {

                    System.out.println("Please enter the Customers ID: ");
                    scan1 = new Scanner(System.in);
                    CustomerID = scan1.nextInt();
                    break;

                } catch (Exception e) {
                    System.out.println("An error occurred. You entered letters instead of digits");
                }
            }

            System.out.println("Please enter the customers full name: ");
            scan1 = new Scanner(System.in);
            staffDetails.customerName = scan1.nextLine();

            /*----- TRY/CATCH block to handle exceptions, including errors like entering letters instead of digits for the phone number-----*/
            while (true) {

                try {

                    System.out.println("Please enter the Customer phone number");
                    scan1 = new Scanner(System.in);
                    staffDetails.customerNum = scan1.nextInt();
                    break;

                } catch (Exception e) {
                    System.out.println("An error occurred. You entered letters instead of digits");
                }
            }

            System.out.println("\nPlease enter the customer email: ");
            scan1 = new Scanner(System.in);
            staffDetails.customerEmail = scan1.nextLine();

            System.out.println("\nPlease enter the customer address: ");
            scan1 = new Scanner(System.in);
            staffDetails.customerAddress = scan1.nextLine();
            System.out.println("\nCustomers details have been updated successfully! ");

// Structural Engineer INFO requested

            System.out.println("\nThe Structural Engineers(SE) Details:");

            while (true) {

                try {

                    System.out.println("Please enter the SE ID: ");
                    scan1 = new Scanner(System.in);
                    StructuralEngineerID = scan1.nextInt();
                    break;

                } catch (Exception e) {
                    System.out.println("An error occurred. You entered letters instead of digits");
                }
            }

            System.out.println("Please enter the SE full name: ");
            scan1 = new Scanner(System.in);
            staffDetails.structuralEngineerName = scan1.nextLine();

            /*----- TRY/CATCH block to handle exceptions, including errors like entering letters instead of digits for the phone number-----*/
            while (true) {

                try {

                    System.out.println("Please enter the Structural Engineers(SE) phone number");
                    scan1 = new Scanner(System.in);
                    staffDetails.structuralEngineerNum = scan1.nextInt();
                    break;

                } catch (Exception e) {
                    System.out.println("An error occurred. You entered letters instead of digits");
                }
            }
            System.out.println("\nPlease enter the Structural Engineers(SE) email: ");
            scan1 = new Scanner(System.in);
            staffDetails.structuralEngineerEmail = scan1.nextLine();

            System.out.println("\nPlease enter the Structural Engineers(SE) address: ");
            scan1 = new Scanner(System.in);
            staffDetails.structuralEngineerAddress = scan1.nextLine();
            System.out.println("\nContractors details have been updated successfully! ");

// Project Manager INFO requested

            System.out.println("\nThe Project Manager(PM) Details:");

           while (true) {

                try {

                    System.out.println("Please enter the PM ID: ");
                    scan1 = new Scanner(System.in);
                    ProjectManagerID = scan1.nextInt();
                    break;

                } catch (Exception e) {
                    System.out.println("An error occurred. You entered letters instead of digits");
                }
            }

            System.out.println("Please enter the Project Manager(PM) full name: ");
            scan1 = new Scanner(System.in);
            staffDetails.projectManagerName = scan1.nextLine();

            /*----- TRY/CATCH block to handle exceptions, including errors like entering letters instead of digits for the phone number-----*/
            while (true) {

                try {

                    System.out.println("Please enter the Project Manager(PM) phone number");
                    scan1 = new Scanner(System.in);
                    staffDetails.projectManagerNum = scan1.nextInt();
                    break;

                } catch (Exception e) {
                    System.out.println("An error occurred. You entered letters instead of digits");
                }
            }
            System.out.println("\nPlease enter the Project Manager(PM) email: ");
            scan1 = new Scanner(System.in);
            staffDetails.projectManagerEmail = scan1.nextLine();

            System.out.println("\nPlease enter the Project Manager(PM) address: ");
            scan1 = new Scanner(System.in);
            staffDetails.projectManagerAddress = scan1.nextLine();
            System.out.println("\nContractors details have been updated successfully! ");


//==================| Creating project |===================\\

            // Get input from user for the project details

            System.out.println("\nThank you for entering all the relevant information on the people involved in this project!");
            System.out.println("\nFinally,");
            System.out.println("\nPlease fill in the Project details below:");

            System.out.println("\nProject Number: ");
            scan1 = new Scanner(System.in);
            projectDetails.projectNumber = scan1.nextInt();


            System.out.println("\nType of Building: ");
            scan1 = new Scanner(System.in);
            projectDetails.buildingType = scan1.nextLine();

            System.out.println("\nPlease enter the project name (leave blank for auto generate):");
            scan1 = new Scanner(System.in);
            projectDetails.projectName = scan1.nextLine();

            // IF - User selects to leave the project name blank = auto generation of a project name

            if (projectDetails.projectName.equals("")) {
                projectDetails.projectName = projectDetails.buildingType + " " + staffDetails.customerName;
            }

            System.out.println("\nBuilding's Physical Address: ");
            scan1 = new Scanner(System.in);
            projectDetails.physicalAddress = scan1.nextLine();

            System.out.println("\nERF Number: ");
            scan1 = new Scanner(System.in);
            projectDetails.ERF = scan1.nextInt();

            System.out.println("\nTotal Fee being charged for the project: ");
            scan1 = new Scanner(System.in);
            projectDetails.totalCost = scan1.nextDouble();

            System.out.println("\nTotal Amount Paid to Date: ");
            scan1 = new Scanner(System.in);
            projectDetails.totalAmountPaidCurrently = scan1.nextDouble();

            System.out.println("\nDeadline for the project:  Format - dd/MM/yyyy ");
            scan1 = new Scanner(System.in);
            projectDetails.deadline = scan1.nextLine();

            System.out.println("\nCompleted ? ");
            scan1 = new Scanner(System.in);
            projectDetails.completedTask = scan1.nextLine();

            System.out.println("Project has been created Successfully\n");


// WRITE INPUT ON NEW PROJECT TO RELEVANT TABLES IN POISEDPMS DATABASE

            rowsAffected = statement.executeUpdate("INSERT INTO architect (A_name, A_number, A_physicalAddress, A_email) VALUES (" + "'" + staffDetails.architectName + "'" + ","
                    + "'" + staffDetails.architectNum + "'" + ","
                    + "'" + staffDetails.architectAddress + "'" + ","
                    + "'" + staffDetails.architectEmail + "'" + ")");
            System.out.println("Query complete, " + rowsAffected + " Architect details added.");


            rowsAffected = statement.executeUpdate("INSERT INTO customer (C_name, C_number, C_physicalAddress, C_email)  VALUES (" + "'" + staffDetails.customerName + "'" + ","
                    + "'" + staffDetails.customerNum + "'" + ","
                    + "'" + staffDetails.customerAddress + "'" + ","
                    + "'" + staffDetails.customerEmail + "'" + ")");
            System.out.println("Query complete, " + rowsAffected + " Customer details added.");


            rowsAffected = statement.executeUpdate("INSERT INTO structural_engineer (SE_name, SE_number, SE_physicalAddress, SE_email)  VALUES (" + "'" + staffDetails.structuralEngineerName + "'" + ","
                    + "'" + staffDetails.structuralEngineerNum + "'" + ","
                    + "'" + staffDetails.structuralEngineerAddress + "'" + ","
                    + "'" + staffDetails.structuralEngineerEmail + "'" + ")");
            System.out.println("Query complete, " + rowsAffected + " Structural Engineer details added.");


            rowsAffected = statement.executeUpdate("INSERT INTO project_manager (PM_name, PM_number, PM_physicalAddress, PM_email)  VALUES (" + "'" + staffDetails.projectManagerName + "'" + ","
                    + "'" + staffDetails.projectManagerNum + "'" + ","
                    + "'" + staffDetails.projectManagerAddress + "'" + ","
                    + "'" + staffDetails.projectManagerEmail + "'" + ")");
            System.out.println("Query complete, " + rowsAffected + " Project Manager details added.");

            rowsAffected = statement.executeUpdate("INSERT INTO projects (proj_name, " +
                    "proj_num, " +
                    "building_type, " +
                    "building_Address, " +
                    "ERF, " +
                    "Total_cost, " +
                    "Total_paid_to_date, " +
                    "Deadline, " +
                    "Task_completion_status," +
                    "SE_ID," +
                    "PM_ID," +
                    "A_ID," +
                    "C_ID) VALUES (" + "'" + projectDetails.projectName + "'" + ","
                    + projectDetails.projectNumber + ","
                    + "'" + projectDetails.buildingType + "'" + ","
                    + "'" + projectDetails.physicalAddress + "'" + ","
                    + projectDetails.ERF + ","
                    + projectDetails.totalCost + ","
                    + projectDetails.totalAmountPaidCurrently +  ","
                    + "'" + projectDetails.deadline + "'" + ","
                    + "'" + projectDetails.completedTask + "'" + ","
                    + StructuralEngineerID + ","
                    + ProjectManagerID + ","
                    + ArchitectID + ","
                    + CustomerID + ")");

            System.out.println("Query complete, " + rowsAffected + " Project details added.");

        } catch (SQLException e) {
            System.out.println(e);
        }
    }



    // VIEW PROJECT METHOD
    public static void viewProject() {

        try {

            // Connect to the library_db database, via the jdbc:mysql: channel on localhost (this PC)
            // Use username "otheruser", password "swordfish".
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/poisedpms?useSSL=false",
                    "otheruser",
                    "swordfish"
            );

            // Create a direct line to the database for running our queries
            Statement statement = connection.createStatement();
            ResultSet results;

            // Menu printed out that allows user to select the project they would like to view, via name or number
            // Menu printed out that also allows user to view incomplete projects and projects past the deadline

            System.out.println("Please make your selection from the menu: "
                    + "\n -------------------------------"
                    + "\n1 - Search via project number"
                    + "\n2 - Search via project name"
                    + "\n"
                    + "\n3 - View all incomplete projects"
                    + "\n4 - View all projects past deadline"
                    + "\n -------------------------------\n");

            Scanner projScanner = new Scanner(System.in);

            int projectDetails = projScanner.nextInt();

            if (projectDetails == 1) {

                System.out.println("Please confirm the number of the project you would like to view?");

                int choice = projScanner.nextInt();

                // SQL statement to read table with conditional statement
                results = statement.executeQuery("SELECT * FROM projects WHERE proj_num=" + "'" + choice + "'");

                while (results.next()) {

                    int Proj_ID = results.getInt("Proj_ID");
                    String proj_name = results.getString("Proj_Name");
                    int proj_num = results.getInt("Proj_Num");
                    String building_type = results.getString("Building_type");
                    String building_address = results.getString("Building_address");
                    int ERF = results.getInt("ERF");
                    int Total_cost = results.getInt("Total_cost");
                    int Total_paid_to_date = results.getInt("Total_paid_to_date");
                    String Deadline = results.getString("Deadline");
                    String Task_completion_status = results.getString("Task_completion_status");
                    int SE_ID = results.getInt("SE_ID");
                    int PM_ID = results.getInt("PM_ID");
                    int A_ID = results.getInt("A_ID");
                    int C_ID = results.getInt("C_ID");


                    // Print project details
                    System.out.println("\nProject ID: " + Proj_ID);
                    System.out.println("Project Name: " + proj_name );
                    System.out.println("Project Number: " + proj_num );
                    System.out.println("Building Type: " + building_type );
                    System.out.println("Building Address: " + building_address );
                    System.out.println("ERF number: " + ERF );
                    System.out.println("Total Cost of Project: " + Total_cost );
                    System.out.println("Total paid to date: " + Total_paid_to_date );
                    System.out.println("Deadline: " + Deadline );
                    System.out.println("Task completion status: " + Task_completion_status );
                    System.out.println("Structural Engineer ID: " + SE_ID );
                    System.out.println("Project Manager ID: " + PM_ID );
                    System.out.println("Architect ID: " + A_ID );
                    System.out.println("Customer ID: " + C_ID + "\n");
                }
            }

            if (projectDetails == 2) {

                System.out.println("Please confirm the name of the project you would like to view?");

                projScanner = new Scanner(System.in);
                String ProjectChoice = projScanner.nextLine();


                // SQL statement to read table with conditional statement
                results = statement.executeQuery("SELECT * FROM projects WHERE proj_name=" + "'" + ProjectChoice + "'");

                while (results.next()) {

                    int Proj_ID = results.getInt("Proj_ID");
                    String proj_name = results.getString("Proj_Name");
                    int proj_num = results.getInt("Proj_Num");
                    String building_type = results.getString("Building_type");
                    String building_address = results.getString("Building_address");
                    int ERF = results.getInt("ERF");
                    int Total_cost = results.getInt("Total_cost");
                    int Total_paid_to_date = results.getInt("Total_paid_to_date");
                    String Deadline = results.getString("Deadline");
                    String Task_completion_status = results.getString("Task_completion_status");
                    int SE_ID = results.getInt("SE_ID");
                    int PM_ID = results.getInt("PM_ID");
                    int A_ID = results.getInt("A_ID");
                    int C_ID = results.getInt("C_ID");


                    // Print project details
                    System.out.println("\nProject ID: " + Proj_ID);
                    System.out.println("Project Name: " + proj_name );
                    System.out.println("Project Number: " + proj_num );
                    System.out.println("Building Type: " + building_type );
                    System.out.println("Building Address: " + building_address );
                    System.out.println("ERF number: " + ERF );
                    System.out.println("Total Cost of Project: " + Total_cost );
                    System.out.println("Total paid to date: " + Total_paid_to_date );
                    System.out.println("Deadline: " + Deadline );
                    System.out.println("Task completion status: " + Task_completion_status );
                    System.out.println("Structural Engineer ID: " + SE_ID );
                    System.out.println("Project Manager ID: " + PM_ID );
                    System.out.println("Architect ID: " + A_ID );
                    System.out.println("Customer ID: " + C_ID );
                }
            }

            if (projectDetails == 3) {


                // SQL statement to read table with conditional statement
                results = statement.executeQuery("SELECT * FROM projects WHERE Task_completion_status='no'");

                while (results.next()) {

                    int Proj_ID = results.getInt("Proj_ID");
                    String proj_name = results.getString("Proj_Name");
                    int proj_num = results.getInt("Proj_Num");
                    String building_type = results.getString("Building_type");
                    String building_address = results.getString("Building_address");
                    int ERF = results.getInt("ERF");
                    int Total_cost = results.getInt("Total_cost");
                    int Total_paid_to_date = results.getInt("Total_paid_to_date");
                    String Deadline = results.getString("Deadline");
                    String Task_completion_status = results.getString("Task_completion_status");
                    int SE_ID = results.getInt("SE_ID");
                    int PM_ID = results.getInt("PM_ID");
                    int A_ID = results.getInt("A_ID");
                    int C_ID = results.getInt("C_ID");


                    // Print project details
                    System.out.println("\nProject ID: " + Proj_ID);
                    System.out.println("Project Name: " + proj_name );
                    System.out.println("Project Number: " + proj_num );
                    System.out.println("Building Type: " + building_type );
                    System.out.println("Building Address: " + building_address );
                    System.out.println("ERF number: " + ERF );
                    System.out.println("Total Cost of Project: " + Total_cost );
                    System.out.println("Total paid to date: " + Total_paid_to_date );
                    System.out.println("Deadline: " + Deadline );
                    System.out.println("Task completion status: " + Task_completion_status );
                    System.out.println("Structural Engineer ID: " + SE_ID );
                    System.out.println("Project Manager ID: " + PM_ID );
                    System.out.println("Architect ID: " + A_ID );
                    System.out.println("Customer ID: " + C_ID );
                }
            }

            if (projectDetails == 4) {


                // SQL statement to read table with conditional statement
                results = statement.executeQuery("SELECT * FROM projects WHERE Task_completion_status='no'");

                while (results.next()) {

                    int Proj_ID = results.getInt("Proj_ID");
                    String Deadline = results.getString("Deadline");
                    String proj_name = results.getString("Proj_Name");


                    SimpleDateFormat projectDeadlineChecker = new SimpleDateFormat("dd/MM/yyyy");  // Format for the date
                    Date OverdueProject = projectDeadlineChecker.parse(Deadline);            // convert string to a date


                    // Used to get the current date
                    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                    Date today = new Date();
                    Date currentDate = formatter.parse(formatter.format(today));
                    System.out.println("The current date: " + currentDate);


                    System.out.println("Project Deadline:" + OverdueProject);

                    // IF statement to determine if project is past deadline or not and Print this out
                    if(OverdueProject.compareTo(currentDate) < 0){
                        System.out.println("Project ID: " + Proj_ID);
                        System.out.println("Project Name: " + proj_name);
                        System.out.println("Project is past the deadline" + "\n");
                    }

                    if(OverdueProject.compareTo(currentDate) > 0){
                        System.out.println("Project ID: " + Proj_ID);
                        System.out.println("Project Name: " + proj_name);
                        System.out.println("Project is not past deadline" + "\n");
                    }

                }
            }
            } catch(Exception e){
                e.printStackTrace();
            }
        }



        // Edit project method
        public static void editProject () {

            try {

                // Connect to the library_db database, via the jdbc:mysql: channel on localhost (this PC)
                // Use username "otheruser", password "swordfish".
                Connection connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/poisedpms?useSSL=false",
                        "otheruser",
                        "swordfish"
                );

                // Create a direct line to the database for running our queries
                Statement statement = connection.createStatement();
                int newDeadline;
                int newTotalPaid;
                int rowsAffected;


                // Menu printed out that allows user to select the project they would like to edit, via name or number
                System.out.println("Edit menu: "
                        + "\n -------------------------------"
                        + "\n1 - Select the number of the project you wish to edit: "
                        + "\n -------------------------------\n");

                Scanner projectEditSelection = new Scanner(System.in);
                //int choice = projectEditSelection.nextInt();


                while (true) {

                    Scanner scan2 = new Scanner(System.in);

                    System.out.println("\nEdit Project details: "
                            + "\n -------------------------------"
                            + "\n1 - Project Deadline"
                            + "\n2 - Total Amount Paid to Date "
                            + "\n3 - Customer Details"
                            + "\n4 - Architect Details"
                            + "\n5 - Structural Engineer Details"
                            + "\n6 - Project Manager Details"
                            + "\n7 - Exit to Main Menu"
                            + "\n -------------------------------");

                    System.out.println("Please select the number you would like to edit: ");
                    int editDetails = scan2.nextInt();

                    // If user selects - 1 - from this menu, Update Deadline
                    if (editDetails == 1) {

                        System.out.println("Please select the project number of the deadline you would like to edit: ");
                        Scanner projScan = new Scanner(System.in);
                        int ProjectID = projScan.nextInt();

                        System.out.println("Please enter updated deadline for the project: ");
                        Scanner deadScan = new Scanner(System.in);
                        String UpdatedDeadline = deadScan.next();


                        // SQL statement to update values in table
                        newDeadline = statement.executeUpdate("UPDATE projects SET Deadline= " + "'" + UpdatedDeadline + "'" +  "WHERE Proj_num=" +  "'" + ProjectID + "'");

                        System.out.println("Query complete, " + newDeadline + " Deadline updated.");

                    }

                    // If user selects - 2 - from this menu, Update the amount paid to date
                    else if (editDetails == 2) {

                        System.out.println("Please select the project number - To update Total paid: ");
                        Scanner projScan = new Scanner(System.in);
                        int totalPaidCurrentlyID = projScan.nextInt();

                        System.out.println("Please enter the updated Amount Paid to Date: ");
                        Scanner totalPaidScan = new Scanner(System.in);
                        int updatedTotalpaid = totalPaidScan.nextInt();


                        // SQL statement to update values in table
                        newTotalPaid = statement.executeUpdate("UPDATE projects SET Total_paid_to_date= " + "'" + updatedTotalpaid + "'" + " WHERE proj_num= " + "'" + totalPaidCurrentlyID + "'");

                        System.out.println("Query complete, " + newTotalPaid + " Deadline updated.");

                    }

                    // If user selects - 3 - from this menu, change Customer details
                    else if (editDetails == 3) {
                        Scanner scan3 = new Scanner(System.in);

                        System.out.println("Edit Customer Details Menu: "
                                + "\n -------------------------------"
                                + "\n1 - Customer Name"
                                + "\n2 - Customer Email Address"
                                + "\n3 - Customer Telephone number"
                                + "\n4 - Customer Physical Address"
                                + "\n5 - Exit to Main Menu"
                                + "\n -------------------------------\n");

                        System.out.println("Please select which of the customers information would you need to edit: ");
                        int contMenu = scan3.nextInt();

                        // Use IF/ELSE statements to edit the customers details
                        if (contMenu == 1) {

                            System.out.println("Please enter the customers ID: ");
                            Scanner cusID = new Scanner(System.in);
                            int CustomerID = cusID.nextInt();

                            System.out.println("Please enter the customers full name: ");
                            Scanner cusName = new Scanner(System.in);
                            String newCustomerName = cusName.nextLine();


                            // SQL statement to update values in table
                            rowsAffected = statement.executeUpdate("UPDATE customer SET C_name= " + "'" + newCustomerName + "'" + "WHERE C_ID= " + "'" + CustomerID + "'");
                            System.out.println("Query complete, " + rowsAffected  +  " Customer name updated");


                        } else if (contMenu == 2) {

                            System.out.println("Please enter the customers ID: ");
                            Scanner cusID = new Scanner(System.in);
                            int CustomerID = cusID.nextInt();

                            System.out.println("Please enter the updated customer email address: ");
                            Scanner cusEmail = new Scanner(System.in);
                            String newCustomerEmail = cusEmail.nextLine();


                            // SQL statement to update values in table
                            rowsAffected = statement.executeUpdate("UPDATE customer SET C_email= " + "'" + newCustomerEmail + "'" + "WHERE C_ID= " + "'" + CustomerID + "'");
                            System.out.println("Query complete, " + rowsAffected  +  " Customer email updated");

                        } else if (contMenu == 3) {


                            /*----- TRY/CATCH block to handle exceptions, including errors like entering letters instead of digits for the phone number-----*/
                            while (true) {

                                try {

                                    System.out.println("Please enter the customers ID: ");
                                    Scanner cusID = new Scanner(System.in);
                                    int CustomerID = cusID.nextInt();

                                    System.out.println("Please enter the updated customer telephone number: ");
                                    Scanner cusTel = new Scanner(System.in);
                                    int newCustomerPhoneNum = cusTel.nextInt();


                                    // SQL statement to update values in table
                                    rowsAffected = statement.executeUpdate("UPDATE customer SET C_number= " + "'" + newCustomerPhoneNum + "'" + "WHERE C_ID= " + "'" + CustomerID + "'");
                                    System.out.println("Query complete, " + rowsAffected  +  " Customer phone number updated");

                                    break;
                                } catch (Exception e) {
                                    System.out.println("An error occurred. You entered letters instead of digits");
                                }
                            }

                        } else if (contMenu == 4) {

                            System.out.println("Please enter the customers ID: ");
                            Scanner cusID = new Scanner(System.in);
                            int CustomerID = cusID.nextInt();

                            System.out.println("Please enter updated customer physical address: ");
                            Scanner cusAddr = new Scanner(System.in);
                            String newCustomerAddress = cusAddr.nextLine();


                            // SQL statement to update values in table
                            rowsAffected = statement.executeUpdate("UPDATE customer SET C_physicalAddress= " + "'" + newCustomerAddress + "'" + "WHERE C_ID= " + "'" + CustomerID + "'");
                            System.out.println("Query complete, " + rowsAffected  +  " Customer details updated");

                        } else if (contMenu == 5){
                            break;
                        }
                    }

                    // If user selects - 4 - from this menu, change Architect details
                    else if (editDetails == 4) {
                        Scanner scan6 = new Scanner(System.in);

                        System.out.println("Edit Architect Details Menu: "
                                + "\n -------------------------------"
                                + "\n1 - Architect Name"
                                + "\n2 - Architect Email Address"
                                + "\n3 - Architect Telephone number"
                                + "\n4 - Architect Physical Address"
                                + "\n5 - Exit to Main Menu"
                                + "\n -------------------------------\n");

                        System.out.println("Please select which of the architects information would you like to edit: ");
                        int contMenu = scan6.nextInt();

                        // Use IF/ELSE statements to edit the Architects details
                        if (contMenu == 1) {

                            System.out.println("Please enter the architects ID: ");
                            Scanner ArchID = new Scanner(System.in);
                            int ArchitectID = ArchID.nextInt();

                            System.out.println("Please enter Architects full name: ");
                            Scanner aName = new Scanner(System.in);
                            String newArchitectName = aName.nextLine();


                            // SQL statement to update values in table
                            rowsAffected = statement.executeUpdate("UPDATE architect SET A_name= " + "'" + newArchitectName + "'" + "WHERE A_ID= " + "'" + ArchitectID + "'");
                            System.out.println("Query complete, " + rowsAffected  +  " Architect name on record updated");

                        } else if (contMenu == 2) {

                            System.out.println("Please enter the architects ID: ");
                            Scanner ArchID = new Scanner(System.in);
                            int ArchitectID = ArchID.nextInt();

                            Scanner aEmail = new Scanner(System.in);
                            System.out.println("Please enter updated Architect email address: ");
                            String newArchitectEmail = aEmail.nextLine();


                            // SQL statement to update values in table
                            rowsAffected = statement.executeUpdate("UPDATE architect SET A_email= " + "'" + newArchitectEmail + "'" + "WHERE A_ID= " + "'" + ArchitectID + "'");
                            System.out.println("Query complete, " + rowsAffected  +  " Architect email on record updated");

                        } else if (contMenu == 3) {

                            /*----- TRY/CATCH block to handle exceptions, including errors like entering letters instead of digits for the phone number-----*/
                            while (true) {

                                try {

                                    System.out.println("Please enter the architects ID: ");
                                    Scanner ArchID = new Scanner(System.in);
                                    int ArchitectID = ArchID.nextInt();

                                    System.out.println("Please enter updated Architects new phone number");
                                    Scanner aNum = new Scanner(System.in); //Clears the scanner so we don't skip lines
                                    int newArchitectPhoneNum = aNum.nextInt();


                                    // SQL statement to update values in table
                                    rowsAffected = statement.executeUpdate("UPDATE architect SET A_number= " + "'" + newArchitectPhoneNum + "'" + "WHERE A_ID= " + "'" + ArchitectID + "'");
                                    System.out.println("Query complete, " + rowsAffected  +  " Architect cell number on record updated");
                                    break;

                                } catch (Exception e) {
                                    System.out.println("An error occurred. You entered letters instead of digits");
                                }
                            }
                        } else if (contMenu ==4){

                            System.out.println("Please enter the architects ID: ");
                            Scanner ArchID = new Scanner(System.in);
                            int ArchitectID = ArchID.nextInt();

                            Scanner aAddr = new Scanner(System.in);
                            System.out.println("Please enter updated Architect physical address: ");
                            String newArchitectAddress = aAddr.nextLine();


                            // SQL statement to update values in table
                            rowsAffected = statement.executeUpdate("UPDATE architect SET A_physicalAddress= " + "'" + newArchitectAddress + "'" + "WHERE A_ID= " + "'" + ArchitectID + "'");
                            System.out.println("Query complete, " + rowsAffected  +  " Architect physical address on record updated");

                        } else if (contMenu == 5){
                            break;
                        }
                    }

                    // If user selects - 5 - from this menu, change Structural Engineer details
                    else if (editDetails == 5) {
                        Scanner scan7 = new Scanner(System.in);

                        System.out.println("Edit Structural Engineer Details Menu: "
                                + "\n -------------------------------"
                                + "\n1 - Structural Engineer Name"
                                + "\n2 - Structural Engineer Email Address"
                                + "\n3 - Structural Engineer Telephone number"
                                + "\n4 - Structural Engineer Physical Address"
                                + "\n5 - Exit to Main Menu"
                                + "\n -------------------------------\n");

                        System.out.println("Please select which of the contractors information would you like to edit: ");
                        int contMenu = scan7.nextInt();

                        // Use IF/ELSE statements to edit the contractors details
                        if (contMenu == 1) {

                            System.out.println("Please enter the Structural Engineers ID: ");
                            Scanner SE_ID = new Scanner(System.in);
                            int StructuralEngineerID = SE_ID.nextInt();

                            Scanner conName = new Scanner(System.in);
                            System.out.println("Please enter the Structural Engineer full name: ");
                            String newStructuralEngineerName = conName.nextLine();


                            // SQL statement to update values in table
                            rowsAffected = statement.executeUpdate("UPDATE structural_engineer SET SE_name= " + "'" + newStructuralEngineerName + "'" + "WHERE SE_ID= " + "'" + StructuralEngineerID + "'");
                            System.out.println("Query complete, " + rowsAffected  +  " Structural Engineer physical address on record updated");

                        } else if (contMenu == 2) {

                            System.out.println("Please enter the Structural Engineers ID: ");
                            Scanner SE_ID = new Scanner(System.in);
                            int StructuralEngineerID = SE_ID.nextInt();

                            Scanner conEmail = new Scanner(System.in);
                            System.out.println("Please enter the updated Structural Engineer email address: ");
                            String newStructuralEngineerEmail = conEmail.nextLine();


                            // SQL statement to update values in table
                            rowsAffected = statement.executeUpdate("UPDATE structural_engineer SET SE_email= " + "'" + newStructuralEngineerEmail + "'" + "WHERE SE_ID= " + "'" + StructuralEngineerID + "'");
                            System.out.println("Query complete, " + rowsAffected  +  " Structural Engineer physical address on record updated");

                        } else if (contMenu == 3) {

                            /*----- TRY/CATCH block to handle exceptions, including errors like entering letters instead of digits for the phone number-----*/
                            while (true) {

                                try {

                                    System.out.println("Please enter the Structural Engineers ID: ");
                                    Scanner SE_ID = new Scanner(System.in);
                                    int StructuralEngineerID = SE_ID.nextInt();

                                    System.out.println("Please enter the updated Structural Engineer telephone number: ");
                                    Scanner conTel = new Scanner(System.in);
                                    int newStructuralEngineerPhoneNum = conTel.nextInt();


                                    // SQL statement to update values in table
                                    rowsAffected = statement.executeUpdate("UPDATE structural_engineer SET SE_number= " + "'" + newStructuralEngineerPhoneNum + "'" + "WHERE SE_ID= " + "'" + StructuralEngineerID + "'");
                                    System.out.println("Query complete, " + rowsAffected  +  " Structural Engineer physical address on record updated");

                                    break;
                                } catch (Exception e) {
                                    System.out.println("An error occurred. You entered letters instead of digits");
                                }
                            }
                        } else if (contMenu == 4){

                            System.out.println("Please enter the Structural Engineers ID: ");
                            Scanner SE_ID = new Scanner(System.in);
                            int StructuralEngineerID = SE_ID.nextInt();

                            Scanner conAddr = new Scanner(System.in);
                            System.out.println("Please enter the updated Contractor physical address: ");
                            String newStructuralEngineerAddress = conAddr.nextLine();


                            // SQL statement to update values in table
                            rowsAffected = statement.executeUpdate("UPDATE structural_engineer SET SE_physicalAddress= " + "'" + newStructuralEngineerAddress + "'" + "WHERE SE_ID= " + "'" + StructuralEngineerID + "'");
                            System.out.println("Query complete, " + rowsAffected  +  " Structural Engineer physical address on record updated");

                        } else if (contMenu == 5){
                            break;
                        }
                    }

                    // If user selects - 6 - from this menu, change Project Manager details
                    else if (editDetails == 6){

                        Scanner scan7 = new Scanner(System.in);

                        System.out.println("Edit Project Manager Details Menu: "
                                + "\n -------------------------------"
                                + "\n1 - Project Manager Name"
                                + "\n2 - Project Manager Email Address"
                                + "\n3 - Project Manager Telephone number"
                                + "\n4 - Project Manager Physical Address"
                                + "\n5 - Exit to Main Menu"
                                + "\n -------------------------------\n");

                        System.out.println("Please select which of the Project Manager information would you like to edit: ");
                        int contMenu = scan7.nextInt();

                        // Use IF/ELSE statements to edit the contractors details
                        if (contMenu == 1) {

                            System.out.println("Please enter the Project Managers ID: ");
                            Scanner PM_ID = new Scanner(System.in);
                            int projectManagerID = PM_ID.nextInt();

                            Scanner conName = new Scanner(System.in);
                            System.out.println("Please enter the Project Managers full name: ");
                            String newProjectManagerName = conName.nextLine();


                            // SQL statement to update values in table
                            rowsAffected = statement.executeUpdate("UPDATE project_manager SET PM_name= " + "'" + newProjectManagerName + "'" + "WHERE PM_ID= " + "'" + projectManagerID + "'");
                            System.out.println("Query complete, " + rowsAffected  +  " Project Managers physical address on record updated");


                        } else if (contMenu == 2) {

                            System.out.println("Please enter the Project Managers ID: ");
                            Scanner PM_ID = new Scanner(System.in);
                            int projectManagerID = PM_ID.nextInt();

                            Scanner conEmail = new Scanner(System.in);
                            System.out.println("Please enter the updated Contractor email address: ");
                            String newProjectManagerEmail = conEmail.nextLine();


                            // SQL statement to update values in table
                            rowsAffected = statement.executeUpdate("UPDATE project_manager SET PM_email= " + "'" + newProjectManagerEmail + "'" + "WHERE PM_ID= " + "'" + projectManagerID + "'");
                            System.out.println("Query complete, " + rowsAffected  +  " Project Managers Email on record updated");


                        } else if (contMenu == 3) {

                            /*----- TRY/CATCH block to handle exceptions, including errors like entering letters instead of digits for the phone number-----*/
                            while (true) {

                                try {

                                    System.out.println("Please enter the Project Managers ID: ");
                                    Scanner PM_ID = new Scanner(System.in);
                                    int projectManagerID = PM_ID.nextInt();

                                    System.out.println("Please enter the updated Contractor telephone number: ");
                                    Scanner conTel = new Scanner(System.in);
                                    int newProjectManagerPhoneNum = conTel.nextInt();


                                    // SQL statement to update values in table
                                    rowsAffected = statement.executeUpdate("UPDATE project_manager SET PM_number= " + "'" + newProjectManagerPhoneNum + "'" + "WHERE PM_ID= " + "'" + projectManagerID + "'");
                                    System.out.println("Query complete, " + rowsAffected  +  " Project Managers Email on record updated");


                                    break;
                                } catch (Exception e) {
                                    System.out.println("An error occurred. You entered letters instead of digits");
                                }
                            }
                        } else if (contMenu ==4 ){

                            System.out.println("Please enter the Project Managers ID: ");
                            Scanner PM_ID = new Scanner(System.in);
                            int projectManagerID = PM_ID.nextInt();


                            Scanner conAddr = new Scanner(System.in);
                            System.out.println("Please enter the updated Contractor physical address: ");
                            String newProjectManagerAddress = conAddr.nextLine();


                            // SQL statement to update values in table
                            rowsAffected = statement.executeUpdate("UPDATE project_manager SET PM_address= " + "'" + newProjectManagerAddress + "'" + "WHERE PM_ID= " + "'" + projectManagerID + "'");
                            System.out.println("Query complete, " + rowsAffected  +  " Project Managers Email on record updated");

                        } else if(contMenu == 5){
                            break;
                        }
                    }
                    else if(editDetails == 7){
                        break;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }



    // Finalise project method
    public static void FinalizeProject(){

        try {

            // Connect to the library_db database, via the jdbc:mysql: channel on localhost (this PC)
            // Use username "otheruser", password "swordfish".
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/poisedpms?useSSL=false",
                    "otheruser",
                    "swordfish");

            // Create a direct line to the database for running our queries
            Statement statement = connection.createStatement();
            ResultSet results;
            int rowsAffected;

            System.out.println("Please confirm the number of the project?");    // REQ user input for project number
            Scanner UserProjSelect = new Scanner(System.in);                    // Scanner to collect user input
            int choice = UserProjSelect.nextInt();

            // executeQuery: runs a SELECT statement and returns the results
            results = statement.executeQuery("SELECT projects.Proj_name, " +
                    "projects.Proj_num, " +
                    "projects.Building_type, " +
                    "projects.Building_address, " +
                    "projects.ERF, " +
                    "projects.Total_cost, " +
                    "projects.Total_paid_to_date, " +
                    "projects.Deadline, " +
                    "projects.Task_completion_status, " +
                    "customer.C_name, " +
                    "customer.C_number, " +
                    "C_physicalAddress, " +
                    "C_email \n" +
                    "FROM projects \n" +
                    "INNER JOIN customer \n" +
                    "ON customer.C_ID = customer.C_ID WHERE proj_num=" + "'" + choice + "'");


            // Print project details
            while (results.next()) {

                String proj_name = results.getString("Proj_Name");
                int proj_num = results.getInt("Proj_Num");
                String building_type = results.getString("Building_type");
                String building_address = results.getString("Building_address");
                int ERF = results.getInt("ERF");
                int Total_cost = results.getInt("Total_cost");
                int Total_paid_to_date = results.getInt("Total_paid_to_date");
                String Deadline = results.getString("Deadline");
                String Task_completion_status = results.getString("Task_completion_status");

                String customerName = results.getString("C_name");
                String customerNumber = results.getString("C_number");
                String customerEmail = results.getString("C_email");
                String customerAddress = results.getString("C_physicalAddress");


                System.out.println("\tProject Details");
                System.out.println("Project Name: " + proj_name );
                System.out.println("Project Number: " + proj_num );
                System.out.println("Building Type: " + building_type );
                System.out.println("Building Address: " + building_address );
                System.out.println("ERF number: " + ERF );
                System.out.println("Total Cost of Project: " + Total_cost );
                System.out.println("Total paid to date: " + Total_paid_to_date );
                System.out.println("Deadline: " + Deadline );
                System.out.println("Task completion status: " + Task_completion_status );
                System.out.println("\n\tCustomer Details");
                System.out.println("Customer Name: " + customerName);
                System.out.println("Customer Number: " + customerNumber);
                System.out.println("Customer Email: " + customerEmail);
                System.out.println("Customer Address: " + customerAddress);
                System.out.println("\n");


                if (choice == proj_num) {

                    System.out.println("Project name: " + proj_name);
                    System.out.println("Project number: " + proj_num);

                    // Create an invoice with the Customer name, contact Details + the amount still owed.
                    // If the full fee has been paid, no invoice must be created.
                    // Amount still owed is calculated for the invoice.

                    double totalProjectCost = Double.parseDouble(String.valueOf(Total_cost));
                    double totalPaidCurrently = Double.parseDouble(String.valueOf(Total_paid_to_date));

                    // Calculation to determine amount outstanding
                    double outstandingAmount = totalProjectCost - totalPaidCurrently;

                    System.out.println("Total cost: " + Total_cost);
                    System.out.println("Total amount paid currently: " + Total_paid_to_date);


                    // Create a calendar instance and get the date from that instance; it defaults to time program is run.
                    // This date will be printed on the invoice

                    long millis=System.currentTimeMillis();
                    java.sql.Date today =new java.sql.Date(millis);

                    System.out.println("The amount still outstanding  = " + outstandingAmount);

                    // If there is an outstanding amount, generate the invoice and print it out on the screen
                    if (outstandingAmount > 0) {

                        System.out.println("\nInvoice: "
                                + "\n---------------------------------------------------"
                                + "\nCustomer: " + customerName
                                + "\nTelephone Number: " + customerNumber
                                + "\nEmail Address: " + customerEmail
                                + "\nTotal Outstanding Amount: R" + outstandingAmount
                                + "\nProject Status: Finalized"
                                + "\nCompletion Date: " + today
                                + "\n---------------------------------------------------\n");


                        // SQL statement to add values to table
                        rowsAffected = statement.executeUpdate("INSERT INTO finalizedprojects VALUES (" + "'" + "Finalized" + "'" + ","
                                + "'" + today + "'" + ","
                                + "'" + proj_num + "'" + ","
                                + "'" + proj_name + "'" + ","
                                + "'" + building_type + "'" + ","
                                + "'" + building_address + "'" + ","
                                + "'" + ERF + "'" + ","
                                + "'" + Total_cost + "'" + ","
                                + "'" + Total_paid_to_date + "'" + ","
                                + "'" + Deadline + "'" + ","
                                + "'" + customerName + "'" + ","
                                + "'" + customerNumber + "'" + ","
                                + "'" + customerEmail + "'" + ","
                                + "'" + customerAddress + "'" + ")");

                        System.out.println("Query complete, " + rowsAffected + " rows added.");

                        System.out.println("Your Invoice has been generated, and project has been marked as finalized\n");
                        break;

                    }

                    else {

                        // If there is no money outstanding - PRINT a confirmation message :

                        System.out.println(staffDetails.customerName + " has paid in full"
                                + "\nYour project has been finalized\n");

                        // Add the project details to a file called Completed Project and mark as finalized
                        String printToDoc = ("Project Details: "
                                + "\nProject Status: Finalized"
                                + "\nCompletion date: " + today);

                        // SQL statement to add values to table
                        rowsAffected = statement.executeUpdate("INSERT INTO finalizedprojects VALUES (" + "'" + "Finalized" + "'" + ","
                                + "'" + today + "'" + ","
                                + "'" + proj_num + "'" + ","
                                + "'" + proj_name + "'" + ","
                                + "'" + building_type + "'" + ","
                                + "'" + building_address + "'" + ","
                                + "'" + ERF + "'" + ","
                                + "'" + Total_cost + "'" + ","
                                + "'" + Total_paid_to_date+ "'" + ","
                                + "'" + Deadline+ "'" + ","
                                + "'" + customerName + "'" + ","
                                + "'" + customerNumber+ "'" + ","
                                + "'" + customerEmail + "'" + ","
                                + "'" + customerAddress + "'" + ")");

                        System.out.println("Query complete, " + rowsAffected + " rows added.");

                        System.out.println("Project has been marked as finalized\n");

                        break;
                    }
                }
            }
        } catch (SQLException e) {

            System.out.println(e);
        }
    }
}











