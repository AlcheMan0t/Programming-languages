package asdasdasd;

import java.io.*;

public class asdasd {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            while (true) {
                System.out.print("Enter text (type 'END' to finish): ");
                String text = reader.readLine();
                if (text.equals("END")) {
                    break;
                }
                int length = text.length();
                int weight = calculateWeight(text);
                System.out.println("Length: " + length);
                System.out.println("Weight: " + weight);
            }
        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private static int calculateWeight(String text) {
        int weight = 0;
        for (char c : text.toCharArray()) {
            if (isVowel(c)) {
                weight++;
            }
        }
        return weight;
    }
    private static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}
