class Employee {
    String name;
    int age;
    float salary;

    public Employee(String name, int age, float salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
        System.out.println("Salary : " + this.salary);
    }

    public void display(String dept) {
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
        System.out.println("Salary : " + this.salary);
        System.out.println("Department : " + dept);
    }
}

public class Bala {
    public static void main(String[] args) {
        Employee e = new Employee("Bala", 18);
        e.display();
        Employee e1 = new Employee("Sai", 20, 25000f);
        e1.display("Production");
        
    }
}
