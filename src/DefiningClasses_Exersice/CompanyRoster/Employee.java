package DefiningClasses_Exersice.poll;

public class Employee {
    private  String name;
    private double salary;
    private  String position;
    private  Departments department;
    private  String email;
    private  int age;

    public Employee(String name, double salary, String position, Departments department){
        this(name,salary,position,department,"n/a",-1);
    }

    public Employee(String name, double salary, String position, Departments department, String email){
        this(name,salary,position,department,email,-1);
    }
    public Employee(String name, double salary, String position, Departments department, int age){
        this(name,salary,position,department,"n/a",age);
    }
    public Employee(String name, double salary, String position, Departments department, String email, int age){
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = email;
        this.age = age;

    }
}
