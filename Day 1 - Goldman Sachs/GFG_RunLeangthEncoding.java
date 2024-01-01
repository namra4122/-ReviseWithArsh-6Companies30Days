public class GFG_RunLeangthEncoding {
    static String encode(String str) {
        // Initialize an empty string to store the encoded string
        String des = "";

        // Iterate through each character in the input string
        for (int i = 0; i < str.length(); i++) {
            // Append the character to the encoded string
            des += str.charAt(i);

            // Initialize a counter to keep track of consecutive occurrences of the
            // character
            int c = 1;

            // Loop through the remaining characters in the input string to check for
            // consecutive occurrences
            while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                // If the next character is the same as the current character, increment the
                // counter
                c++;
                i++;
            }

            // Append the count of consecutive occurrences to the encoded string
            des += c + "";
        }

        // Return the encoded string
        return des;
    }

    public static void main(String[] args) {
        String s = encode("wwwwaaadexxxxxx");
        System.out.println(s);
    }
}
