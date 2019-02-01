public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int num = Math.abs(number);
        int reversed = 0;
        while(num > 0){
            if(num < 10){
                reversed = reversed*10 + num;
            }else{
                reversed = (reversed*10) + num%10;
            }
            num /= 10;
        }
        return reversed == Math.abs(number);
    }
}
