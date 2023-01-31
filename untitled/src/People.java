public class People {
    private String name = "People";
    private String gender = "Female";
    private int age = 0;

    public People(){

    }

    public People(String name, String gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public String getGender(){
        return gender;
    }

    public int getAge(){
        return age;
    }

    public void setName(){
        this.name = name;
    }

    public void setGender(){
        this.gender = gender;
    }

    public void setAge(){
        this.age = age;
    }

    public String toString(){
        return "Class name : people" + "\nName : " + name + "\nGender : " + gender + "\nAge : " + age ;
    }

}
