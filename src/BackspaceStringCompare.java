//844. Backspace String Compare
public class BackspaceStringCompare {

    public static  boolean backspaceCompare(String s, String t) {
        return buildString(s).equals(buildString(t));
    }

    public static String buildString(String str) {
        int len = str.length(), cntBackSpace = 0;
        String ret = "";

        for (int i = len - 1; i >= 0 ; i--) {
            char ch = str.charAt(i);

            if (ch == '#') {
               cntBackSpace++;
            } else {
                if (cntBackSpace>0) {
                    cntBackSpace--;
                } else {
                    ret += ch;
                }
            }
        }

        return ret;
    }

    public static void main(String[] args) {
        String s = "ab##", t = "c#d#";

        boolean ret = backspaceCompare(s, t);

        System.out.println(ret);
    }
}