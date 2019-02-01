public class TeenNumberChecker {
    public static boolean hasTeen(int age1, int age2, int age3){
        return age1 >= 13 && age1 <= 19 || age2 >= 13 && age2 <= 19 || age3 >= 13 && age3 <= 19;
    }
}