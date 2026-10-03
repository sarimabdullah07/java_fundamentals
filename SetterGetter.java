class Student{
    private String name;
    public String getter(){
        return name;
    }
    public void setter(String name){
        this.name=name;
    }
    public static void main(String[] args) {
        Student s =new Student();
        s.setter("Ali");
        System.out.println(s.getter());
    }
}