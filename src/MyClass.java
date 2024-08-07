package src;

public class MyClass {
    public static void main(String[] args) {
//        String s = "Jai .@20@dfds3";
//        int count = MyClass.getNoOfSpecialChar(s);
//        long count = MyClass.getNoOfSpecialChar(s);
//        System.out.println(count+" : "+count);

        String a = "abc";
        String b = "abc";
        String c = new String("abc");
        System.out.println(a == b);
        System.out.println(b == c);
        System.out.println(b.equals(c));
    }

    private static long getNoOfSpecialChar(String str){
        long count = str.chars().filter(ch -> !(Character.isLetterOrDigit(ch) || Character.isWhitespace(ch))).count();
        return count;
    }
//    private static int getNoOfSpecialChar(String str){
//        int count = 0;
//        int length = str.length();
//        for(int i=0;i<length;i++){
//            char c = str.charAt(i);
//            boolean b = !(Character.isLetterOrDigit(c) || Character.isWhitespace(c));
//            if(b){
//                count++;
//            }
//        }
//        return count;
//    }
}
