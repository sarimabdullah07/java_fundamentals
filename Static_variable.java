class Student{
    static String school="oxford university";
    String name="alice";
    void display(){
        System.out.println(name+" studying in "+school);
    }
}
public class Static_variable{
    public static void main(String[] args) {
        Student s=new Student();
        s.display();
    }
}