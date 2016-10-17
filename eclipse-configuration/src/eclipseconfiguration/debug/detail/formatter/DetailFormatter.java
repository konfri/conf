package eclipseconfiguration.debug.detail.formatter;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

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

        System.out.println("break point!");
    }
}
