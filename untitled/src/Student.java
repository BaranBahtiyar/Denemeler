public class Student extends People {
    private double grade = 2.0;

    public Student(){
    }

    public Student (String name , String gender, int age, double grade){
        this.grade = grade;
    }

    public double getGrade(){
        return grade;
    }

    public void setGrade(){
        this.grade = grade;
    }

    public String toString(){
        return "Class name : Student " + "\nGrade : " + grade;
    }

}

