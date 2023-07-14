public class IntegerToStringConverter {
    public static boolean canConvertToString(int first, int second) {
        return String.valueOf(first).equals(String.valueOf(second));
    }

        public static void main(String[] args) {
            int first1 = 5;
            int second1 = 10;

            int first2 = 3;
            int second2 = 6;

            boolean canConvert1 = IntegerToStringConverter.canConvertToString(first1, second1);
            boolean canConvert2 = IntegerToStringConverter.canConvertToString(first2, second2);

            System.out.println(canConvert1);  // Output: true
            System.out.println(canConvert2);  // Output: false
        }
    }


