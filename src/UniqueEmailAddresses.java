import java.util.HashSet;
import java.util.Set;

//Unique Email Addresses
public class UniqueEmailAddresses {
    public static int numUniqueEmails(String[] emails) {
        Set<String> emailSet = new HashSet<String>();

        for (String email : emails) {
            String emailAddr = standardizedEmail(email);
            emailSet.add(emailAddr);
        }

        return emailSet.size();
    }

    public static String standardizedEmail(String email) {
        StringBuilder builder = new StringBuilder();
        int index = email.indexOf("@");

        //build local name
        for (int i = 0; i < index; i++) {
            char ch = email.charAt(i);
            if (ch == '+') break;
            if (ch == '.') continue;

            builder.append(ch);
        }

        //build domain name
        for (int i = index; i < email.length(); i++) {
            builder.append(email.charAt(i));
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        String[] emails = {"a@leetcode.com","b@leetcode.com","c@leetcode.com"};

        int ret = numUniqueEmails(emails);

        System.out.println(ret);
    }
}
