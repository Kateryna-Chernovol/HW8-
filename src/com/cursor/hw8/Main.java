package com.cursor.hw8;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        // write your code here
        LibraryActivity activity1 = new LibraryActivity(LocalDate.of(2021, 10, 10), "American Gods");
        LibraryActivity activity2 = new LibraryActivity(LocalDate.of(2021, 10, 1), "A Game of Thrones");
        LibraryActivity activity3 = new LibraryActivity("A Clash of Kings");
        System.out.println();

        System.out.println("General report about taken books: ");
        LibraryActivity.generalReportDateTitle();
        System.out.println("***  *  ***  *  ***" + "\n");

        System.out.println("Report on: 2021-10-08");
        LibraryActivity.reportOnDate(LocalDate.of(2021, 10, 8));
        System.out.println("***  *  ***  *  ***" + "\n");

        System.out.println("Report on: 2021-10-10");
        LibraryActivity.reportOnDate(LocalDate.of(2021, 10, 10));
        System.out.println("***  *  ***  *  ***" + "\n");
    }

}
