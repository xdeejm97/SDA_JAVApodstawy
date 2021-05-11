package com.sda.dataIczas;

import java.time.*;

public class Zad_Detroit {
    public static void main(String[] args) {
        LocalDate dateNow = LocalDate.now();
        LocalTime timeNow = LocalTime.now();
        LocalDateTime timeDate = LocalDateTime.now();
        Instant instant = Instant.now(); // UTC czas

        Clock clock = Clock.system(ZoneId.of("America/Chicago"));
        LocalDateTime localDateTimeOtherTz = LocalDateTime.now(clock);
        LocalDate localDateOtherTz = LocalDate.now(clock);
        LocalTime localTimeOtherTz = LocalTime.now(clock);
        Instant instantOtherTz = Instant.now(clock);

        System.out.println(localDateTimeOtherTz);

        System.out.println(dateNow);
        System.out.println(timeDate);
        System.out.println(timeNow.toString());
    }
}
