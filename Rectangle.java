// Rectangle Class
class Rectangle {
    double length;
    double width;

    // Parameterized constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area
    double calculateArea() {
        return length * width;
    }

    // Method to calculate perimeter
    double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Method to display details
    void display() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}

// Employee Class
class Employee {
    String name;
    double salary;

    // Constructor with only name
    Employee(String name) {
        this.name = name;
        this.salary = 0; // Default salary
    }

    // Constructor with name and salary
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        // Testing Rectangle
        Rectangle rect = new Rectangle(5.0, 3.0);
        rect.display();

        System.out.println();

        // Testing Employee with only name
        Employee emp1 = new Employee("Alice");
        emp1.display();

        System.out.println();

        // Testing Employee with name and salary
        Employee emp2 = new Employee("Bob", 50000);
        emp2.display();
    }
}
