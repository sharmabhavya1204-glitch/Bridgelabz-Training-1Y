import java.util.Scanner;

public class UpperCaseConvert {

    public static String convertUpper(String text) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }

            result += ch;
        }

        return result;
    }

    public static boolean compareStrings(String a, String b) {

        if (a.length() != b.length())
            return false;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String user = convertUpper(text);
        String builtin = text.toUpperCase();

        boolean result = compareStrings(user, builtin);

        System.out.println("User Uppercase: " + user);
        System.out.println("Built-in Uppercase: " + builtin);
        System.out.println("Are same? " + result);
    }
}