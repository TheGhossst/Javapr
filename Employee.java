class Employee {
    String name, address;
    int age;
    long phone;
    float salary;

    Employee(String name, String address, int age, long phone, float salary) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.phone = phone;
        this.salary = salary;
    }

    void print() {
        System.out.println("Name = " + name);
        System.out.println("Address = " + address);
        System.out.println("Age = " + age);
        System.out.println("Phone = " + phone);
    }

    void printSalary() {
        System.out.println("Salary = " + salary);
    }
}

class Officer extends Employee {
    String specialization;

    Officer(String name, String address, int age, long phone, float salary, String specialization) {
        super(name, address, age, phone, salary);
        this.specialization = specialization;
    }

    void print() {
        super.print();
        System.out.println("Specialization = " + specialization);
        printSalary();
        System.out.println();
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, String address, int age, long phone, float salary, String department) {
        super(name, address, age, phone, salary);
        this.department = department;
    }

    void print() {
        super.print();
        System.out.println("Department = " + department);
        printSalary();
        System.out.println();
    }
}

class EmployeeMain {
    public static void main(String[] args) {
        Officer o = new Officer("Virat Kohli",
                "Delhi 45",
                33,
                9048716844L,
                125000f,
                "Cricket");
        Manager m = new Manager("MS Dhoni",
                "Ranchi 32",
                42,
                8606140658L,
                750000f,
                "Cricket");

        o.print();
        m.print();
    }
}