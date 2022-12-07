package estudo;

import java.util.Scanner;

public class functionsSUBS {
    public static Data d = new Data();
    public static int goBack = 0;

    public static void main(String[] args) {

    }

    // Student Main Menu
    public static void subjectMenu(){
        System.out.println("------------------------------");
        System.out.println("|       Subjects Menu        |");
        System.out.println("|----------------------------|");
        System.out.println("| [1] list subjects          |\n| [2] Search subjects        |\n| [3] Add subjects           |\n| [4] Remove subjects        |\n| [5] Edit subjects          |\n| [6] Exit                   |");
        System.out.println("------------------------------");
        System.out.println("Enter your choice: ");

    }

    // LIST SUBJECTS
    public static void listSUBS(){
        System.out.println("Year / Semester / Subject Name");
            for (Subject x : d.getSubs()) {
                System.out.println(" " + x.getCurricYear() + "        " + x.getSemester() + "       " + x.getSubjectName() + "\n");
            }
        leaveOrMenu();
    }

    // SEARCH MENU
    public static void searchMenu(){
        System.out.println("------------------------------");
        System.out.println("|       Search based on      |\n|----------------------------|\n| [1] Subject name           |\n| [2] Subject year           |\n| [3] Subject semester       |\n| [4] Exit                   |");
        System.out.println("------------------------------");
        System.out.print("Enter your choice: ");
        Scanner scanner3 = new Scanner(System.in);
        int sc3 = scanner3.nextInt();

            if (sc3 == 1) {
                searchBySubName();
            }

            else if (sc3 == 2) {
                searchBySubYear();
            }

            else if(sc3 == 3){
                searchBySubSem();
            }

            else if(sc3 == 4){
                leaveOrMenu();
            }
    }

    // SEARCH BY THE SUBJECT NAME
    public static void searchBySubName(){
        System.out.print("Enter the name: ");
        Scanner scanner3 = new Scanner(System.in);
        String sc3 = scanner3.nextLine();

        System.out.println();
        System.out.println("------------------------------");
        System.out.println("|         Subject info       |");
        System.out.println("|----------------------------|");
        System.out.println(" Year / Semester / Name     ");

            for (Subject x : d.getSubs()) {
                if (x.getSubjectName().equals(sc3)) {
                    System.out.println(x.getCurricYear() + " " + x.getSemester() + " " + x.getSubjectName());
                }
            }

        leaveOrMenu();
    }

    // SEARCH BY THE SUBJECT CURRICULAR YEAR
    public static void searchBySubYear(){
        System.out.print("Enter the year: ");
        Scanner scanner3 = new Scanner(System.in);
        int sc3 = scanner3.nextInt();

        System.out.println();
        System.out.println("------------------------------");
        System.out.println("|         Subject info       |");
        System.out.println("|----------------------------|");
        System.out.println(" Year / Semester / Name     ");

            for (Subject x : d.getSubs()) {
                if (x.getCurricYear() == sc3) {
                    System.out.println(x.getCurricYear() + " " + x.getSemester() + " " + x.getSubjectName());
                }
            }

        leaveOrMenu();

    }

    // SEARCH BY THE SUBJECT SEMESTER
    public static void searchBySubSem(){
        System.out.print("Enter the semester: ");
        Scanner scanner3 = new Scanner(System.in);
        int sc3 = scanner3.nextInt();

        System.out.println();
        System.out.println("------------------------------");
        System.out.println("|         Subject info       |");
        System.out.println("|----------------------------|");
        System.out.println(" Year / Semester / Name     ");

            for (Subject x : d.getSubs()) {
                if (x.getSemester() == sc3) {
                    System.out.println(x.getCurricYear() + " " + x.getSemester() + " " + x.getSubjectName());
                }
            }

        leaveOrMenu();
    }

    //ADD SUBJECT
    public static void addSubs(){
        goBack = 0;
        System.out.println();
        System.out.println("------------------------------");
        System.out.println("|         Add Subject        |");
        System.out.println("------------------------------");

        System.out.println("Choose a year between 1-3");
        System.out.println("Insert the subject year: ");
        Scanner newYearSubSC = new Scanner(System.in);
        int newYear = newYearSubSC.nextInt();

            while(newYear > 3 || newYear < 0){
                System.out.println("Invalid input");
                System.out.println("Choose a year between 1-3: ");
                newYearSubSC = new Scanner(System.in);
                newYear = newYearSubSC.nextInt();
            }

        System.out.println("choose either semester 1 or 2");
        System.out.println("Insert the subject semester: ");
        Scanner newSubSem = new Scanner(System.in);
        int newSemester = newSubSem.nextInt();

            while(newSemester > 2 || newSemester < 0){
                System.out.println("Invalid input");
                System.out.println("Choose a year between 1-3: ");
                newSubSem = new Scanner(System.in);
                newSemester = newSubSem.nextInt();
            }

        System.out.println("Insert the subject name: ");
        Scanner newSubNameSC = new Scanner(System.in);
        String newName = newSubNameSC.nextLine();

        Subject newsub = new Subject(newName,newSemester,newYear);
        d.addsub(newsub);

        System.out.println("Subject added successfully !");

        leaveOrMenu();
    }

    // DELETE SUBJECT
    public static void deleteSubject() {
        System.out.println();
        System.out.println("------------------------------");
        System.out.println("|       Remove Subject       |");
        System.out.println("------------------------------");
        System.out.println("Insert the information of the subject you want to remove\n");
        System.out.println("Insert the subject name: ");
        Scanner rmSubjectSc = new Scanner(System.in);
        String rmSubName = rmSubjectSc.nextLine();

            for (int i = 0;i < d.getSubs().size();i++) {
                if (d.getSubs().get(i).getSubjectName().equals(rmSubName)) {
                d.rmSub(i);
                }
            }

        System.out.println("Subject removed successfully !");

        leaveOrMenu();

    }

    // SUBJECT EDITION MENU
    public static void editSUB() {
        System.out.println();
        System.out.println("------------------------------");
        System.out.println("|        Edit Subject        |");
        System.out.println("------------------------------");
        System.out.print("Insert the name of the subject you want to edit: ");
        Scanner sc5 = new Scanner(System.in);
        String nameEdit = sc5.nextLine();
        int index = 0;

            for (int i = 0; i < d.getSubs().size(); i++) {
                if (d.getSubs().get(i).getSubjectName().equals(nameEdit)) {
                    index = i;
                break;
                }
            }
        System.out.print("Insert the subjects new name: ");
        Scanner nLNAMEsc = new Scanner(System.in);
        String nLNAME = nLNAMEsc.nextLine();

        d.setNsub(index, d.getSubs().get(index).getCurricYear(), d.getSubs().get(index).getSemester(), nLNAME);

        System.out.println("Subject edited successfully !");

        leaveOrMenu();
    }

    // Leave or go to the main menu
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
}
