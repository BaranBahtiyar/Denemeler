public class EmpDriver {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1985,45,2000,"baran");
        System.out.println("Tax : " + emp1.tax());
        System.out.println("Bonus : " + emp1.bonus());
        System.out.println("Increase salary : " + emp1.increase());
        double totalSalary = emp1.salary - emp1.tax() + emp1.bonus();
        System.out.println("Total salary is : " + totalSalary);
    }
}
