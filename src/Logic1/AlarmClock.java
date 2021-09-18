package Logic1;

public class AlarmClock {
    public static void main(String[] args) {

    }

    /*Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation,
    return a string of the form "7:00" indicating when the alarm clock should ring. Weekdays, the alarm should be "7:00"
    and on the weekend it should be "10:00". Unless we are on vacation -- then on weekdays it should be "10:00"
    and weekends it should be "off".


    alarmClock(1, false) → "7:00"
    alarmClock(5, false) → "7:00"
    alarmClock(0, false) → "10:00"*/

    public static String alarmClock(int day, boolean vacation) {

        boolean weekday = day<6 && day>0;
        boolean weekend = day==6 && day==0;

//      Ternary Solution :
//        return (vacation ? (day == 0 || day == 6 || day == 7 ? "off" : "10:00") :
//                (day >= 1 && day <= 5 ? "7:00" : "10:00"));

//        Solution with If statement :
        if (vacation) return day == 0 || day == 6 || day == 7 ? "off" : "10:00";
        return day >= 1 && day <= 5 ? "7:00" : "10:00";



//        if (vacation){
//            if ((day==0) || (day==6)){
//                return "off";
//            }else{
//                return "10:00";
//            }
//        }
//        if (!vacation){
//            if ((day==0) || (day==6)){
//                return "10:00";
//            }else{
//                return "7:00";
//            }
//        }
//        return "";


    }

}
