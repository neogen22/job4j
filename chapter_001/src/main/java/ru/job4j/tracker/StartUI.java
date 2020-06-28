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
                System.out.println("Request was successfully added!");
            } else if (select == 1) {
                for (int i = 0; i < tracker.findAll().length; i++) {
                    System.out.println(tracker.findAll()[i].getName());
                }
            } else if (select == 2) {
                System.out.print("Please, enter Id for replace:");
                Item newItem = new Item();
                int y = scanner.nextInt();
                newItem.setId(y);
                scanner.nextLine();
                System.out.print("Please, enter name for replace:");
                String yy = scanner.nextLine();
                tracker.findAll()[y].setName(yy);
                System.out.println(tracker.replace(y, newItem).getName());
                System.out.print("Replace was successfully!" + System.lineSeparator());
            } else if (select == 3) {
                System.out.print("Please, enter Id for delete");
                int x = scanner.nextInt();
                scanner.nextLine();
                for (int i = x; i < tracker.findAll().length - 1; i++) {
                    tracker.findAll()[i].setName(tracker.findAll()[i + 1].getName());
                }
                tracker.delete(x);
                System.out.print("Id was deleted successfully!" + System.lineSeparator());
            } else if (select == 4) {
                System.out.print("Please, enter Id for find item:");
                    int x = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(tracker.findById(x).getName());
            } else if (select == 5) {
                System.out.print("Please, enter name for find id's:");
                String key = scanner.nextLine();
                for (int i = 0; i < tracker.findByName(key).length; i++) {
                    System.out.println (key);
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
