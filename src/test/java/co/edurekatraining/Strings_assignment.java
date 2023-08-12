package co.edurekatraining;

public class Strings_assignment
{
        public static void main(String[] args)
        {
            String a = "abcdef";
            String b = "xyz1234";
            String c = "abcxy";

            // Verify the length of the ‘a’ variable should be greater than
            // the length of the c variable and should be less than the length of the b variable.
            if (a.length() > c.length() && a.length() < b.length()) {
                System.out.println("Length condition for 'a' is met.");
            }

            // ‘a’ variable should not be the same as the ‘b’ variable and ‘c’ variable.
            if (!a.equals(b) && !a.equals(c)) {
                System.out.println("Uniqueness condition for 'a' is met.");
            }

            // ‘c’ variable should be the same as a variable irrespective of the case.
            if (c.equalsIgnoreCase(a)) {
                System.out.println("Irrespective case match for 'c' and 'a' is met.");
            }

            // ‘a’ variable should contain cd and should not contain xy.
            if (a.contains("cd") && !a.contains("xy")) {
                System.out.println("'a' contains 'cd' and does not contain 'xy'.");
            }

            // Convert the ‘b’ variable into uppercase and verify
            // it should contain “Z” and should not contains “z”.
            String bUpper = b.toUpperCase();
            if (bUpper.contains("Z") && !bUpper.contains("z")) {
                System.out.println("'b' in uppercase meets the condition.");
            }

            // Validated if the length of the ‘a’ variable is greater than the length of‘b’
            // and less than the length of the ‘c’ variable.
            // This seems contradictory to earlier instructions, but implementing as given:
            if (a.length() > b.length() && a.length() < c.length()) {
                System.out.println("Alternate length condition for 'a' is met.");
            }

            // Perform concatenate on ‘a’ and ‘b’ variables and verify the
            // length is less than the ‘c’ variable’s length or greater than 5.
            String concatenated = a + b;
            if (concatenated.length() < c.length() || concatenated.length() > 5) {
                System.out.println("Concatenation condition is met.");
            }

            // Validate if the ‘a’ variable start with “ab”
            // and the ‘b’ variable should not ends with “yz”.
            if (a.startsWith("ab") && !b.endsWith("yz")) {
                System.out.println("'a' starts with 'ab' and 'b' does not end with 'yz'.");
            }

            // Validate if the ‘c’ variable contains space and should not contain 9.
            if (c.contains(" ") && !c.contains("9")) {
                System.out.println("'c' contains space and does not contain '9'.");
            }
        }
}
