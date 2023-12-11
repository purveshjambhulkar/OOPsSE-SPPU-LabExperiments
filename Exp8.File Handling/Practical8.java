import java.util.*;

public class Practical8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Database database = new Database();

        while (true) {
            System.out.println("Student Database Management System");
            System.out.println("1. Create Database");
            System.out.println("2. Display Database");
            System.out.println("3. Delete Record");
            System.out.println("4. Update Record");
            System.out.println("5. Search Record");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    database.createStudent(scanner);
                    break;
                case 2:
                    database.displayDatabase();
                    break;
                case 3:
                    database.deleteRecord(scanner);
                    break;
                case 4:
                    database.updateRecord(scanner);
                    break;
                case 5:
                    database.searchRecord(scanner);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        }
    }
}

class Student {
    private int studentId;
    private String name;
    private int rollNo;
    private String className;
    private int marks;
    private String address;

    public Student(int studentId, String name, int rollNo, String className, int marks, String address) {
        this.studentId = studentId;
        this.name = name;
        this.rollNo = rollNo;
        this.className = className;
        this.marks = marks;
        this.address = address;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Getters and Setters...
    
}

class Database {
    private List<Student> students;

    public Database() {
        students = new ArrayList<>();
    }

    public void createStudent(Scanner scanner) {
        System.out.print("Enter Student ID: ");
        int studentId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Roll No: ");
        int rollNo = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Class: ");
        String className = scanner.nextLine();

        System.out.print("Enter Marks: ");
        int marks = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        Student student = new Student(studentId, name, rollNo, className, marks, address);
        students.add(student);
        System.out.println("Student record added successfully!");
    }

    public void displayDatabase() {
        for (Student student : students) {
            displayStudentInfo(student);
        }
    }

    private void displayStudentInfo(Student student) {
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Name: " + student.getName());
        System.out.println("Roll No: " + student.getRollNo());
        System.out.println("Class: " + student.getClassName());
        System.out.println("Marks: " + student.getMarks());
        System.out.println("Address: " + student.getAddress());
        System.out.println("-----------------------");
    }

    public void deleteRecord(Scanner scanner) {
        System.out.print("Enter Student ID to delete record: ");
        int deleteId = scanner.nextInt();

        for (Iterator<Student> iterator = students.iterator(); iterator.hasNext(); ) {
            Student student = iterator.next();
            if (student.getStudentId() == deleteId) {
                iterator.remove();
                System.out.println("Student record deleted successfully!");
                return;
            }
        }
        System.out.println("Student record not found!");
    }

    public void updateRecord(Scanner scanner) {
        System.out.print("Enter Student ID to update record: ");
        int updateId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (Student student : students) {
            if (student.getStudentId() == updateId) {
                System.out.print("Enter New Name: ");
                String newName = scanner.nextLine();

                System.out.print("Enter New Roll No: ");
                int newRollNo = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                System.out.print("Enter New Class: ");
                String newClassName = scanner.nextLine();

                System.out.print("Enter New Marks: ");
                int newMarks = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                System.out.print("Enter New Address: ");
                String newAddress = scanner.nextLine();

                student.setName(newName);
                student.setRollNo(newRollNo);
                student.setClassName(newClassName);
                student.setMarks(newMarks);
                student.setAddress(newAddress);
                System.out.println("Student record updated successfully!");
                return;
            }
        }
        System.out.println("Student record not found!");
    }

    public void searchRecord(Scanner scanner) {
        System.out.print("Enter Student ID to search record: ");
        int searchId = scanner.nextInt();

        for (Student student : students) {
            if (student.getStudentId() == searchId) {
                displayStudentInfo(student);
                return;
            }
        }
        System.out.println("Student record not found!");
    }
}
