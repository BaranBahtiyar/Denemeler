public class Test extends People{
    public static void main(String[] args) {

        People p = new People();
        Student s = new Student("Cemre", "female", 19, 2.8);
        Teacher t = new Teacher("Emre", "male", 25, 4500);

        System.out.println(p.toString());
        System.out.println(s.toString());
        System.out.println(t.toString());



    }
}
