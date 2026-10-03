class Calculator{
    
    add(int a,int b){
        int c=a+b;
        return c;
    }
    public static void main(String[] args){
        Calculator c=new Calculator();
        c.add(5,2);
        System.out.print(c);
    }
}