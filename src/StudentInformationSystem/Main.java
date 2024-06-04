package StudentInformationSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManagementSystem studentManagementSystem = new StudentManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("1- Add Student");
            System.out.println("2- List Students");
            System.out.println("3- Update Student");
            System.out.println("4- Delete Student");
            System.out.println("5- Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            boolean isExit = false;

            switch(choice) {
                case 1:
                    System.out.print("Enter Student Name: ");
                    String name = scanner.next();
                    System.out.print("Enter Student Email: ");
                    String email = scanner.next();
                    studentManagementSystem.addStudent(name, email);
                    break;
                case 2:
                    studentManagementSystem.listStudents();
                    break;
                case 3:
                    System.out.print("Enter Student ID: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter New Student Name: ");
                    String newName = scanner.next();
                    System.out.print("Enter New Student Email: ");
                    String newEmail = scanner.next();
                    studentManagementSystem.updateStudent(updateId, newName, newEmail);
                    break;
                case 4:
                    System.out.print("Enter Student ID: ");
                    int deleteId = scanner.nextInt();
                    studentManagementSystem.deleteStudent(deleteId);
                    break;
                case 5:
                    System.out.println("Exit Program");
                    isExit = true;
                    break;
                default:
                    System.out.println("Invalid choice");
            }

            if (isExit){
                break;
            }
        }
    }
}
