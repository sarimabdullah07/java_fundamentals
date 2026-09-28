class Continue{
    public static void main(String args[])
    {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue; // skips printing 5, but loop continues
            }
            System.out.println(i);
        }
    }
}