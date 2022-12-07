package estudo;



import java.util.Scanner;


public class Main {
    public static int goBack = 0;

    public static void main(String[] args) {

        while (goBack != 3) {

            // MAain menu
            System.out.println("------------------------------");
            System.out.println("|       Management Menu      |");
            System.out.println("|----------------------------|");
            System.out.println("| [1] Student Menu           |\n| [2] Subject Menu           |\n| [3] Credits                |\n| [4] Exit                   |");
            System.out.println("------------------------------");
            System.out.println("Enter your choice: ");


            // Option selector (Main Menu)
            Scanner scanner1 = new Scanner(System.in);
            int sc1 = scanner1.nextInt();

            if (sc1 == 1) {
                stuMANAGEMENT();
            }

            else if(sc1 == 2){
                subsMANAGEMENT();
            }
            else if(sc1 == 3){
                credits();
            }
            else if(sc1 == 4){
                System.out.println("Leaving...");
                break;
            }
        }
    }

    public static void stuMANAGEMENT(){
        // STUDENT MENU
        functionsSTU.studentMenu();

        // OPTION SELECTOR (STUDENT MENU)
        Scanner scanner2 = new Scanner(System.in);
        int stuSCAN = scanner2.nextInt();

        if (stuSCAN == 1) {
            //LIST STUDENTS
            functionsSTU.listSTUS();

        } else if (stuSCAN == 2) {
            // SEARCH STUDENT
            functionsSTU.searchMenu();

        } else if (stuSCAN == 3) {
            // ADD STUDENT
            functionsSTU.addStus();

        } else if (stuSCAN == 4) {
            // DELETE STUDENTS
            functionsSTU.deleteStudent();

        } else if (stuSCAN == 5) {
            // EDIT STUDENT
            functionsSTU.editSTU();

        } else if (stuSCAN == 6) {
            // LEAVE OR GO TO MENU
            functionsSTU.leaveOrMenu();

        }
    }
    public static void subsMANAGEMENT(){
        // SUBJECTS MENU
        functionsSUBS.subjectMenu();

        // OPTION SELECTOR (SUBJECT MENU)
        Scanner scanner2 = new Scanner(System.in);
        int subsSCAN = scanner2.nextInt();

        if (subsSCAN == 1) {
            //LIST SUBJECT
            functionsSUBS.listSUBS();

        } else if (subsSCAN == 2) {
            // SEARCH SUBJECT
            functionsSUBS.searchMenu();

        } else if (subsSCAN == 3) {
            // ADD SUBJECT
            functionsSUBS.addSubs();

        } else if (subsSCAN == 4) {
            // DELETE SUBJECT
            functionsSUBS.deleteSubject();

        } else if (subsSCAN == 5) {
            // EDIT SUBJECT
            functionsSUBS.editSUB();

        } else if (subsSCAN == 6) {
            // LEAVE OR GO TO MENU
            functionsSTU.leaveOrMenu();

        }
    }
    public static void credits(){
        System.out.println("------------------------------");
        System.out.println("|       Management Menu      |");
        System.out.println("------------------------------");
        System.out.println("Created by: Joao Silva, IEFP Beja");
        System.out.println();
        System.out.println("Course: Tecnico Especialista em Gestao de Redes e Sistemas Informaticos");
        System.out.println("Data: 07/2022");

        functionsSTU.leaveOrMenu();
    }
}