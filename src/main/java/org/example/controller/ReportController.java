package org.example.controller;

import org.example.service.ReportService;

public class ReportController {
    ReportService service = new ReportService();

    public void showReport() {

        System.out.println("Most Popular Event: " + service.mostPopularEvent());
        System.out.println("Total Tickets Sold: " + service.totalTicketsSold());

    }
}
