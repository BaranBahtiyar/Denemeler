public class Employee {
   private String name;
   public double salary;
   private int workHours, hireYear;

   Employee(int workHours, int hireYear, double salary, String name) {
      this.name = name;
      this.hireYear = hireYear;
      this.workHours = workHours;
      this.salary = salary;
   }

   public double tax() {
      if (salary >= 1000) {
         return salary * 0.03;
      } else {
         return 0.0;
      }
   }

   public double bonus() {
      int extraHours = this.workHours - 40;
      if (extraHours > 0) {
         return 30 * extraHours;
      } else {
         return 0.0;
      }
   }

   public double increase() {
      int year = 2000 - this.hireYear;
      if (year < 10) {
         return salary * 0.5;
      } else if (year > 10 && year < 20) {
         return salary * 0.1;
      }else
         return salary * 0.15;

   }
}