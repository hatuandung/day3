package bai4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        String formatModel1 = "dd-MM-yyyy";
        String formatModel2 = "yyyy-MM-dd";
        String formatModel3 = "yyyy-MM-dd hh:mm:ss";
        String formatModel4 = "hh:mm.ss.SS";
        String formatModel5 = "yyyy:mm:dd hh:mm:ss.SS";
        String formatModel6 = "yyyy:mm:dd hh:mm:ss.SS Z";

        SimpleDateFormat dateFormat1 = new SimpleDateFormat(formatModel1);
        SimpleDateFormat dateFormat2 = new SimpleDateFormat(formatModel2);
        SimpleDateFormat dateFormat3 = new SimpleDateFormat(formatModel3);
        SimpleDateFormat dateFormat4 = new SimpleDateFormat(formatModel4);
        SimpleDateFormat dateFormat5 =  new SimpleDateFormat(formatModel5);
        SimpleDateFormat dateFormat6 = new SimpleDateFormat(formatModel6);

        System.out.println(dateFormat1.format(date));
        System.out.println(dateFormat2.format(date));
        System.out.println(dateFormat3.format(date));
        System.out.println(dateFormat4.format(date));
        System.out.println(dateFormat5.format(date));
        System.out.println(dateFormat6.format(date));
    }
}
