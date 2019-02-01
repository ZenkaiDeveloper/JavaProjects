public class DecimalComparator{
    public static boolean areEqualByThreeDecimalPlaces(double a, double b){
        String str1 = Double.toString(a);
        String str2 = Double.toString(b);
        int length = Math.min(str1.length(), str2.length());
        int least = Math.min(5, length);
        String newStr1 = str1.substring(0, least);
        String newStr2 = str2.substring(0, least);
        double dbl1 = Double.parseDouble(newStr1);
        double dbl2 = Double.parseDouble(newStr2);
        return dbl1 == dbl2;
    }
}