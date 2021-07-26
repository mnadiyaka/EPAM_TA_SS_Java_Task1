import java.util.InputMismatchException;
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
        summ(m);
        fibonachi(m);
    }

    public static void interval(MAin m) {
        int i = 0;
        for (i = 1; i <= 3; i++) {
            System.out.println("Enter a, b: ");
            try {
                Scanner sc = new Scanner(System.in);
                m.setA(sc.nextInt());
                m.setB(sc.nextInt());
                break;
            } catch (InputMismatchException e) {
                System.out.println("Enter 2 numbers separately. You have " + (3 - i) + " try");
                continue;
            }
        }
        if (i == 3) {
            System.out.println("Stop toying around. Go away");
            System.exit(0);
        }
    }

    public static void summ(MAin m) {
        double s_even = 0, s_odd = 0;
        for (int i = m.getA(); i <= m.getB(); ) {
            s_even += (i % 2 == 0) ? i : ((i + 1 > m.getB()) ? 0 : i + 1);
            s_odd += (i % 2 == 0) ? ((i + 1 > m.getB()) ? 0 : i + 1) : i;
            i += 2;
        }
        System.out.println("Summ odd = " + s_odd + "; Summ even = " + s_even);
    }

    public static void fibonachi(MAin m) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        int a = 1;
        int b = 1;

        int kE = 1;
        int kO = 0;
        int i = 1;
        System.out.print("0 ");
        while (i < n) {
            if (a <= m.getA() && a % 2 == 0 && i < n) {
                kE++;
                i++;
                System.out.print(a + " ");
            } else if (a <= m.getB() && a % 2 != 0 && i < n) {
                kO++;
                i++;
                System.out.print(a + " ");
            }
            if (b <= m.getA() && b % 2 == 0 && i < n) {
                kE++;
                i++;
                System.out.print(b + " ");
            } else if (b <= m.getB() && b % 2 != 0 && i < n) {
                kO++;
                i++;
                System.out.print(b + " ");
            }
            a = a + b;
            b = a + b;
        }

        System.out.printf("\neven percentage = %.2f; odd percentage = %.2f", ((kE*1.0)/(kE+kO)), ((kO*1.0)/(kE+kO)));
        //System.out.print (" ");//, ((kO*1.0)/(kE+kO)));
    }
}
