package ru.job4j.oop.tracker;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean Code", 272);
        Book goodCode = new Book("Good Code", 375);
        Book zekCode = new Book("Zek Code", 444);
        Book blackCode = new Book("Black Code", 1488);

        Book[] array = new Book[4];
        array[0] = goodCode;
        array[1] = cleanCode;
        array[2] = zekCode;
        array[3] = blackCode;
        for (int index = 0; index < array.length; index++) {
            Book z = array[index];
            System.out.println("Book name: \"" + z.getName() + "\", pages in the book: " + z.getPages());
        }
        System.out.println(System.lineSeparator() + "Replace book with indexes zero and three" + System.lineSeparator());
        Book lolCode = new Book("Lol Code", 666);
        Book lostCode = new Book("Lost Code", 777);
        array[0] = lolCode;
        array[3] = lostCode;
        for (int index = 0; index < array.length; index++) {
            Book z = array[index];
            System.out.println("Book name: \"" + z.getName() + "\", pages in the book: " + z.getPages());
        }
        System.out.println(System.lineSeparator() + "Only books with name \"Clean Code\"" + System.lineSeparator());
        for (int index = 0; index < array.length; index++) {
            Book z = array[index];
            if (z.getName().equals("Clean Code")) {
                System.out.println("Book name: \"" + z.getName() + "\", pages in the book: " + z.getPages());
            }
        }
    }
}
