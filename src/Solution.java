package src;

public class Solution {
    public static void main(String[] args) {
        int x =5;
        x *= (3+7);
        System.out.println(x);

        String a = "abc";
        String b = "abc";
        String c = new String("abc");
        System.out.println(a == b);
        System.out.println(b == c);
        System.out.println(b.equals(c));
    }
}
