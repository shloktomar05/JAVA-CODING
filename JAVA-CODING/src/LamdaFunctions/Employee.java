package LamdaFunctions;


public class Employee {

    private int id;
    private String name;
    private int salary;
    private String designation;
    private String age;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

  
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    
    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


    public Employee() {

    }

    
    public Employee(int id, String name, int salary, String designation, String age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                ", designation='" + designation + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
    
}

