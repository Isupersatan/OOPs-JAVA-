public class Employee {
    // Instance variables
    private String name;
    private int id;
    private double salary;
    private String department;
    
    // 1. Default Constructor
    public Employee() {
        // Using 'this' to call another constructor (constructor chaining)
        this("Unknown", 0, 0.0, "Undefined");
        System.out.println("Default constructor called");
    }
    
    // 2. Parameterized Constructor
    public Employee(String name, int id, double salary, String department) {
        // Using 'this' to refer to instance variables
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.department = department;
        System.out.println("Parameterized constructor called");
    }
    
    // 3. Copy Constructor
    public Employee(Employee other) {
        // Using 'this' to refer to instance variables
        this.name = other.name;
        this.id = other.id;
        this.salary = other.salary;
        this.department = other.department;
        System.out.println("Copy constructor called");
    }
    
    // Method to display employee details
    public void display() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + this.name); // Using 'this' to refer to instance variable
        System.out.println("ID: " + this.id);
        System.out.println("Salary: " + this.salary);
        System.out.println("Department: " + this.department);
    }
    
    // Method using 'this' to return current class instance
    public Employee getEmployee() {
        return this; // Returning current object
    }
    
    // Method using 'this' as method parameter
    public boolean isSameDepartment(Employee other) {
        // Passing 'this' as argument to compareDepartments method
        return compareDepartments(this, other);
    }
    
    private boolean compareDepartments(Employee e1, Employee e2) {
        return e1.department.equalsIgnoreCase(e2.department);
    }
    
    // Method to demonstrate constructor chaining
    public Employee(String name) {
        this(name, 0, 0.0, "Undefined"); // Calls parameterized constructor
        System.out.println("Single parameter constructor called");
    }
    
    // Main method to demonstrate all features
    public static void main(String[] args) {
        // Using default constructor
        Employee emp1 = new Employee();
        emp1.display();
        
        System.out.println("----------------------");
        
        // Using parameterized constructor
        Employee emp2 = new Employee("John Doe", 1001, 75000.0, "Engineering");
        emp2.display();
        
        System.out.println("----------------------");
        
        // Using copy constructor
        Employee emp3 = new Employee(emp2);
        emp3.display();
        
        System.out.println("----------------------");
        
        // Using constructor with single parameter
        Employee emp4 = new Employee("Jane Smith");
        emp4.display();
        
        System.out.println("----------------------");
        
        // Using 'this' to return current object
        Employee emp5 = emp2.getEmployee();
        System.out.println("Are emp2 and emp5 the same? " + (emp2 == emp5));
        
        System.out.println("----------------------");
        
        // Using 'this' in method parameter
        System.out.println("Do emp1 and emp2 have same department? " + 
                          emp1.isSameDepartment(emp2));
        System.out.println("Do emp2 and emp3 have same department? " + 
                          emp2.isSameDepartment(emp3));
    }
}
/*Output Explanation:
First Employee (emp1):

Default constructor called (which chains to parameterized constructor)

All values set to defaults ("Unknown", 0, 0.0, "Undefined")

Second Employee (emp2):

Parameterized constructor called

Values set to ("John Doe", 1001, 75000.0, "Engineering")

Third Employee (emp3):

Copy constructor called (copies emp2's values)

Has identical values to emp2

Fourth Employee (emp4):

Single-parameter constructor called (which chains to parameterized constructor)

Only name is set ("Jane Smith"), rest are defaults

Object Comparison:

emp5 is a reference to emp2 (same object) → true

emp1 and emp2 have different departments → false

emp2 and emp3 have same departments → true

This output demonstrates all the constructor calls and this keyword functionality shown in the code.
Explanation of All Features:

1. Constructor Types:
Default Constructor: Employee() - Initializes with default values

Parameterized Constructor: Employee(String, int, double, String) - Takes parameters to initialize

Copy Constructor: Employee(Employee) - Creates new object from existing one

2. Uses of this Keyword:
Refer to instance variables: this.name = name;

Constructor chaining: this("Unknown", 0, 0.0, "Undefined"); in default constructor

Return current object: return this; in getEmployee()

Pass as method parameter: compareDepartments(this, other) in isSameDepartment()

3. Additional Features:
Constructor overloading (multiple constructors with different parameters)

Private helper method (compareDepartments)

Demonstration of object comparison using this

When you run this program, it will:

Create employees using all constructor types

Demonstrate all uses of the this keyword

Show how objects can be compared and copied

Display information about each employee

This example provides a complete demonstration of constructor types and this keyword usage in a single, cohesive class. */