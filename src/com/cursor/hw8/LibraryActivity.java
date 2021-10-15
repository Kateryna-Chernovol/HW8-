package com.cursor.hw8;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

public class LibraryActivity {
    private final LocalDate takeBookTime;
    private final String bookTitle;

    public static Map<LocalDate, String> reportDateTitleMap = new TreeMap<>();

    //Every time when you take a book, it should be added to the library report as well
    public LibraryActivity(String bookTitle) {
        takeBookTime = LocalDate.now();
        this.bookTitle = bookTitle;
        System.out.println("Enjoy your reading: \"" + bookTitle + "\"");
        reportDateTitleMap.put(takeBookTime, this.bookTitle);
    }

    public LibraryActivity(LocalDate takeBookTime, String bookTitle) {
        this.takeBookTime = takeBookTime;
        this.bookTitle = bookTitle;
        reportDateTitleMap.put(takeBookTime, this.bookTitle);
    }

    //Every time when you take a book, it should be added to the library report as well
    // The report consists of a date ( when you took a book), the title of the book
    public static void generalReportDateTitle() {
        for (Map.Entry<LocalDate, String> kvp : reportDateTitleMap.entrySet()) {
            System.out.println("Date: " + kvp.getKey() + ", Book: " + kvp.getValue());
        }
    }

    //Functionality to search on the map by dates.
    public static void reportOnDate(LocalDate date) {
        if (reportDateTitleMap.containsKey(date)) {
            System.out.println(date + " " + reportDateTitleMap.get(date));
        } else {
            System.out.println(date + " - No books were taken on this date.");
        }
    }
}