class Student{
    int age;
    String name;

    Student() {
        age=18;
        name="Aabid";
    }

    public static void main(String[] args) {
        Student s1 =new Student();
        System.err.println(s1.age);
        System.err.println(s1.name);
    }
}