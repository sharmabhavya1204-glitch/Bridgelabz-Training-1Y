import java.util.Scanner;

public class VotingEligibility {

    public static String[][] checkVote(int[] age) {

        String[][] result = new String[age.length][2];

        for (int i = 0; i < age.length; i++) {

            result[i][0] = String.valueOf(age[i]);

            if (age[i] >= 18)
                result[i][1] = "Can Vote";
            else
                result[i][1] = "Cannot Vote";
        }

        return result;
    }

    public static void display(String[][] data) {

        System.out.println("Age\tStatus");

        for (int i = 0; i < data.length; i++)
            System.out.println(data[i][0] + "\t" + data[i][1]);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] age = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age: ");
            age[i] = sc.nextInt();
        }

        String[][] result = checkVote(age);

        display(result);
    }
}