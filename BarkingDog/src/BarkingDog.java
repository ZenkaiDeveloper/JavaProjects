public class BarkingDog {
    public static boolean bark(boolean barking, int hour){
        return (barking && hour < 8 && hour >= 0 || hour > 22 && hour < 24);
    }
}
