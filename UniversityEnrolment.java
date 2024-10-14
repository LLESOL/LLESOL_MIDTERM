import java.util.Scanner;  // Import Scanner class for user input

// This is the Base Class
class Person {
    // Fields for name and age
    protected String name;
    protected int age;
    
    // Constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Method to display person information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// This is the subclass Student
class Student extends Person {
    // Additional Fields exclusive to Students
    private String studentID;
    private String course;
    private int units;
    private final int feePerUnit = 1000; // This will set the feePerUnit to constant 1000
    
    // A constructor that initialize all fields including those from Base Class
    public Student(String name, int age, String studentID, String course, int units) {
        super(name, age); // Call the constructor of the Person class
        this.studentID = studentID;
        this.course = course;
        this.units = units;
    }
    
    // This is a Method to calculate total fees
    public double calculateFees() {
        return units * feePerUnit;
    }
    
    // Override displayInfo method to include student-specific information
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the base class method
        System.out.println("Student ID: " + studentID);
        System.out.println("Course: " + course);
        System.out.println("Units: " + units);
        System.out.println("Total Fee: " + calculateFees());
    }
}

// This is the subclass Instructor
class Instructor extends Person {
    // Additional fields exclusive to instructors
    private String employeeID;
    private String department;
    private double salary;
    
    // Constructor to initialize all fields including those from Base Class
    public Instructor(String name, int age, String employeeID, String department, double salary) {
        super(name, age); // Call the constructor of the Person class
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }
    
    // Override displayInfo method to include instructor-specific information
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the base class method
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

// This should serve as a Test Program
public class UniversityEnrolment {
    
    // Method to demonstrate polymorphism, accepts any Person type
    public static void printDetails(Person p) {
        p.displayInfo(); // Calls the overridden method based on the object type
        System.out.println(); // New line for formatting
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Scanner object to take user input
        
        // Get informations for first student from the user
        System.out.println("Enter Information for Student 1:");
        System.out.print("Name: ");
        String name1 = input.nextLine();
        System.out.print("Age: ");
        int age1 = input.nextInt();
        input.nextLine();  // Consume the newline
        System.out.print("Student ID: ");
        String studentID1 = input.nextLine();
        System.out.print("Course: ");
        String course1 = input.nextLine();
        System.out.print("Units: ");
        int units1 = input.nextInt();
        input.nextLine();  // Consume the newline
        
        // Create first student object
        Student student1 = new Student(name1, age1, studentID1, course1, units1);
        
        // Get informations for second student
        System.out.println("\nEnter informations for Student 2:");
        System.out.print("Name: ");
        String name2 = input.nextLine();
        System.out.print("Age: ");
        int age2 = input.nextInt();
        input.nextLine();  // Consume the newline
        System.out.print("Student ID: ");
        String studentID2 = input.nextLine();
        System.out.print("Course: ");
        String course2 = input.nextLine();
        System.out.print("Units: ");
        int units2 = input.nextInt();
        input.nextLine();  // Consume the newline
        
        // This will create second student object
        Student student2 = new Student(name2, age2, studentID2, course2, units2);
        
        // Get informations for first instructor
        System.out.println("\nEnter informations for Instructor 1:");
        System.out.print("Name: ");
        String name3 = input.nextLine();
        System.out.print("Age: ");
        int age3 = input.nextInt();
        input.nextLine();  // Consume the newline
        System.out.print("Employee ID: "); 
        String employeeID1 = input.nextLine();
        System.out.print("Department: ");
        String department1 = input.nextLine();
        System.out.print("Salary: ");
        double salary1 = input.nextDouble();
        input.nextLine();  // Consume the newline
        
        // Create first instructor object
        Instructor instructor1 = new Instructor(name3, age3, employeeID1, department1, salary1);
        
        // Get information for second instructor
        System.out.println("\nEnter details for Instructor 2:");
        System.out.print("Name: ");
        String name4 = input.nextLine();
        System.out.print("Age: ");
        int age4 = input.nextInt();
        input.nextLine();  // Consume the newline
        System.out.print("Employee ID: ");
        String employeeID2 = input.nextLine();
        System.out.print("Department: ");
        String department2 = input.nextLine();
        System.out.print("Salary: ");
        double salary2 = input.nextDouble();
        
        // Create second instructor object
        Instructor instructor2 = new Instructor(name4, age4, employeeID2, department2, salary2);
        
        // Uses the printDetails() method to print information for each person (student or instructor).
        System.out.println("\n***** Student 1 Information *****");
        printDetails(student1);
        
        System.out.println("***** Student 2 Information *****");
        printDetails(student2);
        
        System.out.println("***** Instructor 1 Information *****");
        printDetails(instructor1);
        
        System.out.println("***** Instructor 2 Information *****");
        printDetails(instructor2);
        
        // Close the scanner
        input.close();
    }
}
