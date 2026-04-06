public class Recusivity {
    public int numSum(String s, int sum) {
            if (s.length() == 0) {
                return sum;
            }
            if (Character.isDigit(s.charAt(0))) {
                sum += Character.getNumericValue(s.charAt(0));
            }
            return numSum(s.substring(1), sum);
    }
}
