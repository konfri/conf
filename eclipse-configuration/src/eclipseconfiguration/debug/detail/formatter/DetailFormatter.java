package eclipseconfiguration.debug.detail.formatter;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;

import java.sql.Timestamp;

public class DetailFormatter {
    public static void main(String[] args) {
        Boolean b = true;
        AtomicInteger ai = new AtomicInteger(1);
        Character c = new Character('c');
        AtomicLong al = new AtomicLong(1);
        BigDecimal bd = new BigDecimal(20.123456789);
        BigInteger bi = new BigInteger("20");
        Float f = new Float(2f);
        Double d = new Double(3d);
        Integer i = new Integer(1);
        Long l = new Long(3);
        Date date = new Date();
        java.sql.Date sqldate = new java.sql.Date(date.getTime());
        Timestamp timestamp = new Timestamp(date.getTime());

        GregorianCalendar gg = new GregorianCalendar();

        //TODO from here:
        List<String> list = new ArrayList<String>(); //TODO print "EMTPY!"

        //TODO print array
        String[] stringArrays = Arrays.asList("1", "2","3").toArray(new String[] {}); // TODO string array (separate by new line - show vertial, not horizontal)

        // TODO joda time
        LocalDate ld = new org.joda.time.LocalDate();
        LocalTime lt = new org.joda.time.LocalTime();
        Interval interval = new Interval(date.getTime(),date.getTime());

        System.out.println("break point!");
    }
}
