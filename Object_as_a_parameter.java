class Student{
    int age;
    Student(int a){
        age=a;
    }
    void display(Student s){
        System.out.println(s.age);
    }
    public static void main(String[] args) {
        Student s1 = new Student(89);
        s1.display(s1);
    }
}