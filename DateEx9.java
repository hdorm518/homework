package M220103;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat y,t;
        y = new SimpleDateFormat("yyyy-MM-dd");
        t = new SimpleDateFormat("HH:mm:ss");
        System.out.println(y.format(today) + " " + t.format(today));
    }
}
