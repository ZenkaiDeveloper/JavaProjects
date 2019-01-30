public class Main {

    public static void main(String[] args){
        byte myByte = 127;
        short myShort = 21234;
        int myInteger = 32;
        long myLong = (long) (50000L+(10L*(myByte+myShort+myInteger)));
        System.out.println(myLong);
    }
}
