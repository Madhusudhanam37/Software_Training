package dateAndTime;

import java.time.LocalDate;

public class DateAndTime {

    public  String addDays(LocalDate date){
        String dates=String.valueOf(date.plusDays(4));
        return dates;
    }

    public static void main(String[] args) {
        DateAndTime dateAndTime=new DateAndTime();
    }
}
