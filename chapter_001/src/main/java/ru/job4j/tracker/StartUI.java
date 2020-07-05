package ru.job4j.tracker;
import java.util.Scanner;
public class StartUI extends Tracker {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            String select = scanner.nextLine();
            if (Integer.parseInt(select) == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item();
                item.setName(name);
                tracker.add(item);
                System.out.println("Request was successfully added!");
            } else if (Integer.parseInt(select) == 1) {
                Item[] items = tracker.findAll();
                for (int i = 0; i < items.length; i++) {
                    System.out.println(items[i].getId());
                }
            } else if (Integer.parseInt(select) == 2) {
                System.out.print("Please, enter Id for replace:");
                String y = scanner.nextLine();
                Item item = new Item();
                System.out.print("Please, enter name for replace:");
                String yy = scanner.nextLine();
                item.setName(yy);
                if (tracker.replace(Integer.parseInt(y), item)) {
                    System.out.println("Edit item is done.");
                } else {
                    System.out.println("Item not found.");
                }
            } else if (Integer.parseInt(select) == 3) {
                System.out.print("Please, enter Id for delete");
                String x = scanner.nextLine();
                if (tracker.delete(Integer.parseInt(x))) {
                    System.out.print("Id was deleted successfully!");
                } else {
                    System.out.println("Item not found.");
                }
            } else if (Integer.parseInt(select) == 4) {
                System.out.print("Please, enter Id for find item:");
                    String x = scanner.nextLine();
                    scanner.nextLine();
                    Item item = tracker.findById(Integer.parseInt(x));
                    if (item != null) {
                        System.out.println(item.getName());
                    } else {
                        System.out.println("Заявка по id не найдена");
                    }
            } else if (Integer.parseInt(select) == 5) {
                System.out.print("Please, enter name for find id's:");
                String key = scanner.nextLine();
                Item[] items = tracker.findByName(key);
                for (int i = 0; i < items.length; i++) {
                    System.out.println (items[i].getName());
                }
            }
            else if (Integer.parseInt(select) == 6) {
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
