/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */

    

import java.util.Scanner;

public class RunApplications {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select the console type");
        System.out.println("1) PS5");
        System.out.println("2) XBOX");
        System.out.println("3) SWITCH");
        System.out.println();

        int choice = 0;
        while (choice < 1 || choice > 3) {
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice < 1 || choice > 3) {
                    System.out.println("Invalid choice. Please enter 1, 2 or 3:");
                }
            } else {
                scanner.next();
                System.out.println("Invalid choice. Please enter 1, 2 or 3:");
            }
        }
        scanner.nextLine();

        String selectedConsole;
        switch (choice) {
            case 1:
                selectedConsole = "PS5";
                break;
            case 2:
                selectedConsole = "XBOX";
                break;
            default:
                selectedConsole = "SWITCH";
        }

        System.out.print("Enter the store: ");
        String storeName = scanner.nextLine();

        System.out.print("Enter the total sales of " + selectedConsole + " consoles for " + storeName + ": ");
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.print("Please enter a whole number: ");
        }
        int totalSales = scanner.nextInt();

        ConsoleSales sale = new ConsoleSales(selectedConsole, storeName, totalSales);
        sale.printReport();

        scanner.close();
    }
}