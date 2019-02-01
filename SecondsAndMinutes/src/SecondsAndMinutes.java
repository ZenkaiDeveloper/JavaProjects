public class SecondsAndMinutes {
    public static String getDurationString(long mins, long secs) {
        if(secs < 0 || secs > 59 || mins < 0){
            return "Invalid Value";
        }else{
            int hours = (int) Math.floor(mins/60);
            return hours+"h "+mins%60+"m " +secs+"s";
        }
    }

    public static String getDurationString(int secs) {
        if(secs < 0){
            return "Invalid Value";
        }else{
            long minutes = secs/60;
            long remainingSeconds = secs%60;
            return getDurationString(minutes, remainingSeconds);
        }
    }

}
