public class Ex_1_1_24 {

    public static int gcd(int p, int q) {
        System.out.println(p + " " + q);
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }

    public static void main(String[] args) {
        int p = Integer.parseInt(args[0]);
        int q = Integer.parseInt(args[1]);
        
        System.out.println("the greatest common divisor is : " + gcd(p, q));
    }
}