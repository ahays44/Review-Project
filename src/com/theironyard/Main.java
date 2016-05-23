package com.theironyard;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void createItem(Scanner scanner, ArrayList<InvItem> items) {
        int i = 1;
        int q = 1;
        System.out.println("Enter your new item");
        String text = scanner.nextLine();
        InvItem newItem = new InvItem(text, q);
        items.add(newItem);
        System.out.println("[" + q + "] " + text);
    }

    public static void removeItem(Scanner scanner, ArrayList<InvItem> items) {
        System.out.println("Which item do you want to remove?");
        String remove = scanner.nextLine();
        int r = Integer.valueOf(remove);
        items.remove(r - 1);
    }

    public static void updateItem(Scanner scanner, ArrayList<InvItem> items) {
        System.out.println("Which item's quantity would you like to update?");
        String update = scanner.nextLine();
        int u = Integer.valueOf(update);
        System.out.println("What is the new quantity of " +  + " ?");
    }


    public static void main(String[] args) {
        ArrayList<InvItem> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Options");
            System.out.println("[1] Create new item");
            System.out.println("[2] Remove an item");
            System.out.println("[3] Update an item's quantity");

            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    createItem(scanner,items);
                    break;
                case "2":
                    removeItem(scanner, items);
                    break;
                case "3":
                    updateItem(scanner, items);
            }

        }


    }
}
