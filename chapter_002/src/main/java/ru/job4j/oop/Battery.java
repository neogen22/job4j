package ru.job4j.oop;

public class Battery {
    private int load;
    public Battery(int charge) {
        this.load = charge;
    }
    public void exchange(Battery another) {
        if (this.load + another.load <= 100) {
            another.load = this.load + another.load;
            this.load = 0;
        } else if (this.load + another.load > 100) {
            another.load = this.load + another.load;
            int x = 0;
            for (; another.load > 100;) {
                another.load--;
                x++;
            }this.load = x;
        }
    }
    public static void main(String[] args) {
        Battery firstAuto = new Battery(35);
        System.out.println("Заряд первой батареи перед передачей энергии составил " + firstAuto.load + " процентов");
        Battery twoAuto = new Battery (74);
        System.out.println("Заряд второй батареи перед передачей энергии составил " + twoAuto.load + " процентов");
        firstAuto.exchange(twoAuto);
        System.out.println("Заряд первой батареи после передачи энергии составил " + firstAuto.load + " процентов");
        System.out.println("Заряд второй батареи после передачи энергии составил " + twoAuto.load + " процентов");
    }
}
