public class SumFirstAndLastDigit {
    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }else if (number/10 == 0){
            return number*2;
        }else{
            int num = number;
            int max = number%10;
            int min = 0;
            while(num > 0){
                min = num;
                num = num/10;
            }
            return max+min;
        }

    }
}
