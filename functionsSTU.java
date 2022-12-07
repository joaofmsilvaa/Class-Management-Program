package estudo;

import java.util.Objects;
import java.util.Scanner;

public class functionsSTU {
    public static Data d = new Data();
    public static int goBack = 0;

    public static void main(String[] args) {

    }

    // Student Main Menu
    public static void studentMenu(){
        System.out.println("------------------------------");
        System.out.println("|        Student Menu        |");
        System.out.println("|----------------------------|");
        System.out.println("| [1] list students          |\n| [2] Search student         |\n| [3] Add students           |\n| [4] Remove student         |\n| [5] Edit student           |\n| [6] Exit                   |");
        System.out.println("------------------------------");
        System.out.println("Enter your choice: ");
    }
    // LIST STUDENTS
    public static void listSTUS(){
        System.out.println("ID  /  Student Name \n");
        for (Student x : d.getStus()) {
            System.out.println(x.getnAluno() + "    " + x.getfName() + " " + x.getLname() + "\n");
        }
        leaveOrMenu();
    }
    // SEARCH MENU
    public static void searchMenu(){
        System.out.println("------------------------------");
        System.out.println("|       Search based on      |\n|----------------------------|\n| [1] Student ID             |\n| [2] Student name           |\n| [3] Exit                   |");
        System.out.println("------------------------------");
        System.out.print("Enter your choice: ");
        Scanner scanner3 = new Scanner(System.in);
        int sc3 = scanner3.nextInt();

        if (sc3 == 1) {
            searchByStuID();
        }

        else if (sc3 == 2) {
            searchName();
        }

        else if(sc3 == 3){
            leaveOrMenu();
        }
    }
    // SEARCH BY STUDENT ID
    public static void searchByStuID(){
        System.out.print("Enter a ID: ");
        Scanner scanner3 = new Scanner(System.in);
        int sc3 = scanner3.nextInt();

        System.out.println();
        System.out.println("------------------------------");
        System.out.println("|         Student info       |");
        System.out.println("------------------------------");
        System.out.println("ID  /  Student Name \n");

        for (Student j : d.getStus()) {
            if (j.getnAluno() == sc3) {
                System.out.println(j.getnAluno() + " " + j.getfName() + " " + j.getLname());
            }
        }

        leaveOrMenu();

    }

    // Search Student
    public static void searchName(){
        System.out.println();
        System.out.println("------------------------------");
        System.out.println("|       Search based on      |\n|----------------------------|\n| [1] First name             |\n| [2] Last name              |\n| [3] Full name              |\n| [4] Exit                   |");
        System.out.println("------------------------------");
        System.out.print("Enter your choice: ");
        Scanner scanner4 = new Scanner(System.in);
        int searchsc = scanner4.nextInt();

        if(searchsc == 1){
            searchByFirstName();
        }
        else if(searchsc == 2){
            searchByLastName();
        }
        else if(searchsc == 3){
            searchByFullName();
        }
        else if (searchsc == 4){
            leaveOrMenu();
        }
        else{
            System.out.println("Invalid input\nGoing back to main ");
        }
    }

    public static void searchByFirstName(){
        System.out.println("The first letter of the name must be in uppercases! ");
        System.out.print("Enter a first Name: ");
        Scanner firstNameSC = new Scanner(System.in);
        String firstName = firstNameSC.nextLine();

        System.out.println();
        System.out.println("------------------------------");
        System.out.println("|         Student info       |");
        System.out.println("------------------------------");
        System.out.println("ID  /  Student Name \n");
        for (Student j : d.getStus()) {
            if (Objects.equals(j.getfName(), firstName)) {
                System.out.println(j.getnAluno() + " " + j.getfName() + " " + j.getLname());
            }
        }

        leaveOrMenu();

    }

    public static void searchByLastName(){
        System.out.println("The first letter of the name must be in uppercases! ");
        System.out.print("Enter a last Name: ");
        Scanner LastNameSC = new Scanner(System.in);
        String lastName = LastNameSC.nextLine();

        System.out.println();
        System.out.println("------------------------------");
        System.out.println("|         Student info       |");
        System.out.println("------------------------------");
        System.out.println("ID  /  Student Name \n");
        for (Student j : d.getStus()) {
            if (Objects.equals(j.getLname(), lastName)) {
                System.out.println(j.getnAluno() + " " + j.getfName() + " " + j.getLname());
            }
        }

        leaveOrMenu();
    }

    public static void searchByFullName(){
        System.out.println("The first letter of the name must be in uppercases! ");
        System.out.print("Enter a first Name: ");
        Scanner fNamesc = new Scanner(System.in);
        String firstnamesc = fNamesc.nextLine();

        System.out.print("Enter a last Name: ");
        Scanner lnameSC = new Scanner(System.in);
        String lastName = lnameSC.nextLine();

        System.out.println();
        System.out.println("------------------------------");
        System.out.println("|         Student info       |");
        System.out.println("------------------------------");
        System.out.println("ID  /  Student Name \n");

        for (Student j : d.getStus()) {
            if (Objects.equals(j.getfName(), firstnamesc) && Objects.equals(j.getLname(), lastName)) {
                System.out.println(j.getnAluno() + " " + j.getfName() + " " + j.getLname());
            }
        }

        leaveOrMenu();
    }

    public static void addStus(){
        goBack = 0;
        System.out.println("Insert a student ID: ");
        Scanner newIDsc = new Scanner(System.in);
        int id = newIDsc.nextInt();
        System.out.println("Insert a student first name: ");
        Scanner newfnSC = new Scanner(System.in);
        String firstnm = newfnSC.nextLine();
        System.out.println("Insert a student last name: ");
        Scanner newLnSC = new Scanner(System.in);
        String lastnm = newLnSC.nextLine();

        //Data test = new Data();

        Student newstu = new Student(id, firstnm, lastnm);
        d.addstu(newstu);

        leaveOrMenu();
    }

    // Delete Students
    public static void deleteStudent() {

        System.out.println();
        System.out.println("-------------------------------");
        System.out.println("|          Delete Menu         |");
        System.out.println("-------------------------------");

        deleteByID();

    }

    // STUDENT EDITION MENU
    public static void editSTU() {
        System.out.println();
        System.out.println("------------------------------");
        System.out.println("|      Student edit Menu     |");
        System.out.println("------------------------------");
        System.out.println("| [1] Edit the first name    |\n| [2] Edit the last name     |\n| [3] Edit the id            |\n| [4] Exit                   |");
        System.out.println("------------------------------");
        System.out.print("Enter your choice: ");
        Scanner stuEDITsc = new Scanner(System.in);
        int stuEDIT = stuEDITsc.nextInt();

        if (stuEDIT == 1) {
            editSTU_fName();


        } else if (stuEDIT == 2) {
            editSTU_lName();


        } else if (stuEDIT == 3) {
            editStuNum();

        }
        else if(stuEDIT == 4){
            leaveOrMenu();
        }
    }

    // EDIT THE STUDENTS FIRST NAME
    public static void editSTU_fName(){
        System.out.print("Insert the ID of the student you want  to edit: ");
        Scanner sc5 = new Scanner(System.in);
        int idedit = sc5.nextInt();

        int index = 0;
        for (int i = 0; i < d.getStus().size(); i++) {
            if (d.getStus().get(i).getnAluno() == idedit) {
                index = i;
                break;
            }
        }
        System.out.print("Insert the new first name: ");
        Scanner nfNAMEsc = new Scanner(System.in);
        String nfNAME = nfNAMEsc.nextLine();

        d.setNstud(index, idedit, nfNAME, d.getStus().get(index).getLname());

    }
    // EDIT THE STUDENTS LAST NAME
    public static void editSTU_lName(){
        System.out.print("Insert the ID of the student you want to edit: ");
        Scanner sc5 = new Scanner(System.in);
        int idedit = sc5.nextInt();
        int index = 0;

        for (int i = 0; i < d.getStus().size(); i++) {
            if (d.getStus().get(i).getnAluno() == idedit) {
                index = i;
                break;
            }
        }
        System.out.println("Insert the new last name: ");
        Scanner nLNAMEsc = new Scanner(System.in);
        String nLNAME = nLNAMEsc.nextLine();

        d.setNstud(index, idedit, d.getStus().get(index).getfName(), nLNAME);
    }

    // Edit student number
    public static void editStuNum(){
        System.out.print("Insert the ID of the student you want to edit: ");
        Scanner sc5 = new Scanner(System.in);
        int idedit = sc5.nextInt();
        int index = 0;
        int utNUM = idedit;

        for (int i = 0; i < d.getStus().size(); i++) {
            if (d.getStus().get(i).getnAluno() == utNUM) {
                index = i;
                break;
            }
        }
        System.out.println("Insert the new ID: ");
        Scanner nIDsc = new Scanner(System.in);
        int nID = nIDsc.nextInt();

        d.setNstud(index, nID, d.getStus().get(index).getfName(), d.getStus().get(index).getLname());
    }

    public static void deleteByID(){
        System.out.println("Insert the information of the student you want to remove:");
        System.out.print("Insert the ID of the student you want to remove: ");
        Scanner newIDsc = new Scanner(System.in);
        int idrm = newIDsc.nextInt();

        for (int i = 0; i < d.getStus().size(); i++) {
            if (d.getStus().get(i).getnAluno() == idrm) {
                d.rmstu(i);
            }
        }
        System.out.println("Student removed successfully !");

        leaveOrMenu();
    }

    //Leave the program//
    public static void leaveOrMenu(){
        int leaveChecker = 1;
        while (leaveChecker == 1) {
            System.out.println();
            System.out.println("Do you wish to: \n(1) Go to the main menu\n(2) Exit");
            Scanner exitOrBackSC = new Scanner(System.in);
            int exitOrback = exitOrBackSC.nextInt();

                if (exitOrback == 1) {
                    break;
                }
                    else if (exitOrback == 2) {
                    goBack = 3;
                    System.out.println("Leaving...");
                    break;
                    }
                    else {
                    System.out.print("Invalid input, re-enter your choice: ");
                    exitOrBackSC = new Scanner(System.in);
                }
        }
    }

    public static void leaveProgram(){
        int leaveChecker = 1;
                goBack = 3;
                System.out.println("Leaving...");
    }
}

