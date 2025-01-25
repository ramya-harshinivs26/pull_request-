interface employee {
    double calculateSalary();
    void displayDetails();
}

class person {
    int age;
    String name;
    int id;

    public person(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + id);
    }
}

class staff extends person implements employee {
    double salary;
    String designation;
    int workinghrs;

    public staff(String name, int age, int id, String designation, double salary, int workinghrs) {
        super(name, age, id);
        this.designation = designation;
        this.salary = salary;
        this.workinghrs = workinghrs;
    }

    public double calculateSalary() {
        if (designation.equals("teacher")) { 
            return salary + (workinghrs * 50);
        } else {
            return salary + (workinghrs * 75);
        }
    }

    public void displayDetails() {
        System.out.println("---- Employee Details ----");
        displayPersonDetails();
        System.out.println("Designation: " + designation);
        System.out.println("Working Hours: " + workinghrs);
        System.out.println("Salary: " + calculateSalary());
    }
}


public class educationSystem {
    public static void main(String[] args) {
        System.out.println("------ Education System ------");
        staff t= new staff("Lakshmi", 25, 101, "Teacher", 30000, 8);
        t.displayDetails();
   
    }
}

