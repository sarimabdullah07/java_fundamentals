import java.io.PrintWriter;
class Main{
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Hello");
        pw.print("typewriter");
        pw.flush();
    }
}