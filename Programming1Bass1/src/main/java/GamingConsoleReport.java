/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */

public class GamingConsoleReport {
    public static void main(String[] args) {
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};

        int[][] sales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };

        int[] cityTotals = new int[cities.length];

        System.out.println("--------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-18s %-10s %-10s %-10s%n", "", "PS5", "XBOX", "SWITCH");

        for (int i = 0; i < sales.length; i++) {
            System.out.printf("%-18s ", cities[i]);
            int rowTotal = 0;
            for (int j = 0; j < sales[i].length; j++) {
                System.out.printf("%-10d ", sales[i][j]);
                rowTotal += sales[i][j];
            }
            cityTotals[i] = rowTotal;
            System.out.println();
        }

        System.out.println("-------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("----------------------------------");
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-18s %d%n", cities[i], cityTotals[i]);
        }

        int maxSales = cityTotals[0];
        String topCity = cities[0];
        for (int i = 1; i < cityTotals.length; i++) {
            if (cityTotals[i] > maxSales) {
                maxSales = cityTotals[i];
                topCity = cities[i];
            }
        }

        System.out.println("\nCITY WITH THE MOST SALES: " + topCity);
        System.out.println("--------------------------------------");
    }
}