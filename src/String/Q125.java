package String;

public class Q125 {
    public static void main(String arg[]){
        String s="0P";
        String a = s.toLowerCase();
        String b = "";
        int n = a.length() - 1;
        for (int i = 0; i <= n; i++) {
            if ((a.charAt(i) >= 'a' && a.charAt(i) <= 'z') || (a.charAt(i) >= '0' && a.charAt(i) <= '9')) {
                b = b + a.charAt(i);
            }
        }
        System.out.println(Palindrome(b)) ;
    }

    public static boolean Palindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
