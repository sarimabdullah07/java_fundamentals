class DoWhile{
    public static void main(String[] args) {
        int i=1;
        do { 
            System.err.println(i);
            i++;
        } while (i>=3);  // false condition but "do" prints at least 1 time
        /*
        int i=1;
        do { 
            System.err.println(i);
            i++;
        } while (i<=3);   --> True condition   Output= 1 2 3
        */
    }
}