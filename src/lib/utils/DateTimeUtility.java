package lib.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeUtility {

    public static String getDateFrom(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        return formatter.format(date);
    }

    public static String getTimeFrom(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        return formatter.format(date);
    }

}
