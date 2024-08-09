/*
 * package strings;
 * 
 * public class SuffleNumberZero {
 * 
 * public static void main(String[] args) {
 * 
 * String input ="32400121200"; String formattedOutput =
 * String.format("%011d",Long.parseLong(input));
 * 
 * if (input.length() < 11) { formattedOutput = String.format("%011d",
 * Long.parseLong(input)); }else { formattedOutput = input; }
 * 
 * System.out.println("Formatted output: " + formattedOutput); } }
 */

package strings;

public class SuffleNumberZero {

    public static void main(String[] args) {

        String input = "32400121200";
        String formattedOutput = String.format("%011d", Long.parseLong(input));

        // If you want to handle large numbers or keep the input as a string
        if (input.length() < 11) {
            formattedOutput = String.format("%011d", Long.parseLong(input));
        } else {
            formattedOutput = input;
        }
        
        System.out.println("Formatted output: " + formattedOutput);
    }
}
