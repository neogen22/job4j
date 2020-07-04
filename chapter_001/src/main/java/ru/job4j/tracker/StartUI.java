package ru.job4j.tracker;
import java.util.Scanner;
public class StartUI extends Tracker {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            boolean success = false;
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
                System.out.println("Request was successfully added!");
            } else if (select == 1) {
                Item[] items = tracker.findAll();
                for (int i = 0; i < items.length; i++) {
                    System.out.println(items[i].getName());
                }
            } else if (select == 2) {
                while (!success) {
                    System.out.print("Please, enter Id for replace:");
                    int y = scanner.nextInt();
                    scanner.nextLine();
                    Item[] items = tracker.findAll();
                    if (y > -1 && y < items.length) {
                        Item item = new Item();
                        System.out.print("Please, enter name for replace:");
                        String yy = scanner.nextLine();
                        item.setName(yy);
                        tracker.replace(y + 1, item);
                        success = true;
                    } else {
                        System.out.print("Please, enter correct id");
                    }
                }
            } else if (select == 3) {
                Item[] items = tracker.findAll();
                while (!success) {
                    System.out.print("Please, enter Id for delete");
                    int x = scanner.nextInt();

                    if (x > -1 && x < items.length) {
                        tracker.delete(x);
                        System.out.print("Id was deleted successfully!" + System.lineSeparator());
                        success = true;
                    } else {
                        System.out.print("Please, enter correct id");
                    }
                }
            } else if (select == 4) {
                System.out.print("Please, enter Id for find item:");
                    int x = scanner.nextInt();
                    scanner.nextLine();
                    Item item = tracker.findById(x);
                    if (item != null) {
                        System.out.println(item.getName());
                    } else {
                        System.out.println("Заявка по id не найдена");
                    }
            } else if (select == 5) {
                System.out.print("Please, enter name for find id's:");
                String key = scanner.nextLine();
                Item[] items = tracker.findByName(key);
                for (int i = 0; i < items.length; i++) {
                    System.out.println (items[i].getName());
                }
            }
            else if (select == 6) {
                run = false;
            } else if (select == 7) {
                while (!success) {
                    System.out.print("Please, enter Id for delete");
                    int x = scanner.nextInt();
                    Item[] items = tracker.findAll();
                    if (x > -1 && x < items.length) {
                        tracker.deleteTwo(x);
                        System.out.print("Id was deleted successfully!" + System.lineSeparator());
                        success = true;
                    } else {
                        System.out.print("Please, enter correct id");
                    }
                }
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
        System.out.println("7. Delete item sposob 2");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
