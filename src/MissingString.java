

import java.util.ArrayList;

public class MissingString {
    public static ArrayList<String> findMissingStrings(String s1, String s2) {
        ArrayList<String> missingStrings = new ArrayList<>();

        String[] s1Array = s1.split(" ");
        String[] s2Array = s2.split(" ");

        for (String str : s1Array) {
            if (!containsString(s2Array, str)) {
                missingStrings.add(str);
            }
        }

        return missingStrings;
    }

    private static boolean containsString(String[] array, String str) {
        for (String element : array) {
            if (element.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "apple banana cherry date";
        String s2 = "banana date";

        ArrayList<String> missingStrings = findMissingStrings(s1, s2);

        System.out.println("Missing strings:");
        for (String str : missingStrings) {
            System.out.println(str);
        }
    }
}
