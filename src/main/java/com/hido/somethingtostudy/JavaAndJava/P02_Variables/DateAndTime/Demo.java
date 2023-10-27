package com.hido.somethingtostudy.JavaAndJava.P02_Variables.DateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Demo {
    public static void main(String[] args) throws Exception {

        LocalDateTime toDay = LocalDateTime.now();
        System.out.println("Khi chưa format: " + toDay);

        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy, HH:mm");
        String formatterDate = toDay.format(myFormatter);
        System.out.println("Sau khi format: " + formatterDate);


        LocalDateExample.methodInLocalDate();
        LocalTimeExample.methodInLocalTime();
        LocalDateTimeExample.methodInLocalDateTime();
    }

}
