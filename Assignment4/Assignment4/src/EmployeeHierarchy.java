// Employee Hierarchy Example

class Employee {
    String name;
    String address;
    double salary;
    String jobTitle;

    Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    double calculateBonus() {
        return salary * 0.05; // base bonus 5%
    }

    void generatePerformanceReport() {
        System.out.println("Performance Report for: " + name);
        System.out.println("Address: " + address);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + calculateBonus());
    }

    void manageProjects() {
        System.out.println(name + " is handling general company tasks.");
    }
}

class Manager extends Employee {
    Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }

    @Override
    double calculateBonus() {
        return salary * 0.15; // managers get 15% bonus
    }

    @Override
    void manageProjects() {
        System.out.println(name + " is managing multiple company projects.");
    }
}

class Developer extends Employee {
    Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }

    @Override
    double calculateBonus() {
        return salary * 0.10; // developers get 10% bonus
    }

    @Override
    void manageProjects() {
        System.out.println(name + " is developing new software features.");
    }
}

class Programmer extends Employee {
    Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }

    @Override
    double calculateBonus() {
        return salary * 0.08; // programmers get 8% bonus
    }

    @Override
    void manageProjects() {
        System.out.println(name + " is writing and debugging code.");
    }
}

public class EmployeeHierarchy {
    public static void main(String[] args) {
        Manager m = new Manager("Alice", "New York", 90000);
        Developer d = new Developer("Bob", "Los Angeles", 80000);
        Programmer p = new Programmer("Charlie", "Chicago", 70000);

        m.generatePerformanceReport();
        m.manageProjects();
        System.out.println();

        d.generatePerformanceReport();
        d.manageProjects();
        System.out.println();

        p.generatePerformanceReport();
        p.manageProjects();
    }
}