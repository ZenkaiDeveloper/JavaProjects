public class NumberToWords {
    public static void numberToWords(int number){
        if(number < 0){
            System.out.println("Invalid Value");
            return;
        }

        int num = reverse(number);
        int num1 = number;
        String result = "";
        boolean isZero = true;

        while(num > 0){
            int last = num%10;
            String converted = "";
            switch(last){
                case 0:
                    converted = "Zero";
                    break;
                case 1:
                    converted = "One";
                    break;
                case 2:
                    converted = "Two";
                    break;
                case 3:
                    converted = "Three";
                    break;
                case 4:
                    converted = "Four";
                    break;
                case 5:
                    converted = "Five";
                    break;
                case 6:
                    converted = "Six";
                    break;
                case 7:
                    converted = "Seven";
                    break;
                case 8:
                    converted = "Eight";
                    break;
                case 9:
                    converted = "Nine";
                    break;
            }
            if(num/10 > 0){
                result += converted + " ";
            }else{
                result += converted;
            }

            num /= 10;

        }
        while(num1 > 0){
            if( isZero && num1%10 == 0){
                result += " Zero";
            }else{
                isZero = false;
            }
            num1 /= 10;
        }
        System.out.println(result);
    }

    public static int reverse(int number){
        if(number < 0){
            int num = Math.abs(number);
            String result = "";
            while(num > 0){
                result += Integer.toString(num%10);
                num /= 10;
            }
            return Integer.parseInt(result)*-1;
        }else{
            int num = number;
            String result = "";
            while(num > 0){
                result += Integer.toString(num%10);
                num /= 10;
            }
            return Integer.parseInt(result);
        }
    }

    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }
        String str = Integer.toString(number);
        return str.length();
    }
}
