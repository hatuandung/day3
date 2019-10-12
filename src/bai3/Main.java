package bai3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        String formatModel = "dd-MM-yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(formatModel);
        System.out.println(dateFormat.format(date));
    }
}
