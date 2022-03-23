package blog.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public static String dateToString(Date date) {
        return simpleDateFormat.format(date);
    }

    public static Date stringToDate(String date) throws ParseException {
        return simpleDateFormat.parse(date);
    }

    public static String dateToString(Date date, String format) {
        return new SimpleDateFormat(format).format(date);
    }
}