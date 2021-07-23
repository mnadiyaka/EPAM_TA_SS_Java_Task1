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

    public static void main(String args[]) {
        MAin m = new MAin();
        interval(m);
        System.out.println(m.getA() + " " + m.getB());
        summ(m);
    }

    public static void interval(MAin m) {
        Scanner sc = new Scanner(System.in);
        m.setA(sc.nextInt());
        m.setB(sc.nextInt());
    }

    public static void summ(MAin m) {
        double s_even = 0, s_odd = 0;

        for (int i = m.getA(); i <= m.getB(); ) {
            System.out.println(i);
            s_even += (i % 2 == 0) ? i : ((i + 1 > m.getB()) ? 0 : i + 1);
            s_odd += (i % 2 == 0) ? ((i + 1 > m.getB()) ? 0 : i + 1) : i;
            i += 2;
        }

        System.out.println("Summ odd = " + s_odd + "; Summ even = " + s_even);
    }
}
