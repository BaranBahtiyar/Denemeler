public class Teacher extends People{
    private double salary = 3000.0;

    public Teacher(){
    }

    public Teacher (String name, String gender, int age, double salary){
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(){
        this.salary = salary;
    }

    public String toString(){
        return "Class name : Teacher " + "\nSalary : " + salary;
    }
}
