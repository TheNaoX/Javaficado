public class Operadores {
  public static void main(String []args) {
    float a = 10, b = 20, c = 0;

    c = a + b;
    System.out.println(c); // 30

    c += a;
    System.out.println(c); // 40

    c -= a;
    System.out.println(c); // 30

    c *= a;
    System.out.println(c); // 300

    c /= a;
    System.out.println(c); // 30

    c %= a;
    System.out.println(c); // 0
  }
}

