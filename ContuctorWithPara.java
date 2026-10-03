class Student{
    int age;
    String name;

    Student(int age, String name){
        this.age=age;
        this.name=name;
    }

    public static void main(String[] args) {
        Student s=new Student(21,"Abraham");
        System.out.println(s.age);
        System.out.println(s.name);
    }
}