import java.util.Scanner;

public class MAin {
    private int a, b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public static void main (String args[]){
        MAin m = new MAin();
        interval(m);
        System.out.println(m.getA() + " " + m.getB());
    }

    public static void interval(MAin m){
        Scanner sc = new Scanner(System.in);
        m.setA(sc.nextInt());
        m.setB(sc.nextInt());
    }
}
