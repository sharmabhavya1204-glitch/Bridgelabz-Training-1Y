import java.util.Scanner;

public class CharacterFrequency {

    public static int[][] frequency(String str) {

        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        int count = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0)
                count++;
        }

        int[][] result = new int[count][2];
        int index = 0;

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = i;
                result[index][1] = freq[i];
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        int[][] data = frequency(text);

        System.out.println("Character Frequency:");

        for (int i = 0; i < data.length; i++) {
            System.out.println((char) data[i][0] + " : " + data[i][1]);
        }
    }
}