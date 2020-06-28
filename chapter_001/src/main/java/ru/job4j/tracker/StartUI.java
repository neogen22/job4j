package ru.job4j.tracker;
import java.util.Scanner;
public class StartUI extends Tracker {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = scanner.nextInt();
            scanner.nextLine();
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item();
                item.setName(name);
                tracker.add(item);
                System.out.println(tracker.findById(1).getName());
            } else if (select == 1) {
                for (int i = 0; i < tracker.findAll().length; i++) {
                    System.out.println(tracker.findAll()[i].getName());
                }
            } else if (select == 2) {
                int success = 0;
                System.out.print("Please, enter ID for replace:");
                Item item = new Item();
                while (success != 9876) {
                    int x = scanner.nextInt();
                    if (x < tracker.findAll().length) {
                        item.setId(x);
                        System.out.print("Please, enter name for replace:" + System.lineSeparator());
                        scanner.nextLine();
                        item.setName(scanner.nextLine());
                        tracker.add(item);
                        System.out.print("Replace was successfully:" + System.lineSeparator());
                        success = 9876;
                    } else {
                        System.out.print("Error, please, enter existing id:" + System.lineSeparator());
                    }
                }
            } else if (select == 3) {
                int success = 0;
                System.out.print("Please, enter Id for delete");
                while (success != 9876) {
                    int x = scanner.nextInt();
                    scanner.nextLine();
                    if (x < tracker.findAll().length) {
                        for (int i = x; i < tracker.findAll().length - 1; i++) {
                            tracker.findAll()[i].setName(tracker.findAll()[i + 1].getName());
                        }
                        Item item = new Item();
                        tracker.del(item);
                        System.out.print("Id was deleted successfully:" + System.lineSeparator());
                        success = 9876;
                    } else {
                        System.out.print("Error, please, enter existing id:" + System.lineSeparator());
                    }
                }
            } else if (select == 4) {
                System.out.print("Please, enter Id for find item:");
                    int x = scanner.nextInt();
                    scanner.nextLine();
                    if (x < tracker.findAll().length) {
                        findById(x);
                        System.out.println(tracker.findById(x).getName());
                    } else {
                        System.out.print("Error, this ID is not exist" + System.lineSeparator());
                    }
            } else if (select == 5) {
                int success = 0;
                System.out.print("Please, enter name for find items:" + System.lineSeparator());
                while (success != 9876) {
                    String key = scanner.nextLine();
                    for (int i = 0; i < tracker.findAll().length; i++) {
                        if (tracker.findAll()[i].getName().equals(key)) {
                            System.out.println(key);
                            success = 9876;
                        }
                    }
                    if (success != 9876) {
                        System.out.print("Error, this name is not exist" + System.lineSeparator());
                        break;
                    }
                }
            }
            else if (select == 6) {
                run = false;
            }
        }
    }
    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
