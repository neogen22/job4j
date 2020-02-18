package ru.job4j.oop;
import java.util.Scanner;
public class Jukebox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
            System.out.println("Пешеходы по лужам,");
            System.out.println("А вода по асфальту рекой.");
            System.out.println("И неясно прохожим");
            System.out.println("В этот день непогожий,");
            System.out.println("Почему я веселый такой?");
            System.out.println("А я играю на гармошке");
            System.out.println("У прохожих на виду.");
            System.out.println("К сожаленью, день рожденья");
            System.out.println("Только раз в году.");
            System.out.println("Прилетит вдруг волшебник");
            System.out.println("В голубом вертолете");
            System.out.println("И бесплатно покажет кино.");
            System.out.println("С днем рожденья поздравит");
            System.out.println("И, наверно, оставит");
            System.out.println("Мне в подарок пятьсот эскимо.");
            System.out.println("А я играю на гармошке");
            System.out.println("У прохожих на виду.");
            System.out.println("К сожаленью, день рожденья");
            System.out.println("Только раз в году.");
        } else if (position == 2) {
            System.out.println("Спят усталые игрушки, книжки спят.");
            System.out.println("Одеяла и подушки ждут ребят.");
            System.out.println("Даже сказка спать ложится,");
            System.out.println("Чтобы ночью нам присниться.");
            System.out.println("Ты ей пожелай:");
            System.out.println("Баю-бай.");
            System.out.println("Обязательно по дому в этот час");
            System.out.println("Тихо-тихо ходит дрёма возле нас.");
            System.out.println("За окошком всё темнее,");
            System.out.println("Утро ночи мудренее.");
            System.out.println("Глазки закрывай,");
            System.out.println("Баю-бай.");
            System.out.println("В сказке можно покататься на луне");
            System.out.println("И по радуге промчаться на коне,");
            System.out.println("Со слоненком подружиться");
            System.out.println("И поймать перо Жар-птицы.");
            System.out.println("Глазки закрывай,");
            System.out.println("Баю-бай.");
            System.out.println("Баю-бай, должны все люди ночью спать.");
            System.out.println("Баю-баю, завтра будет день опять.");
            System.out.println("За день мы устали очень,");
            System.out.println("Скажем всем: \"Спокойной ночи!\"");
            System.out.println("Глазки закрывай,");
            System.out.println("Баю-бай.");
        }
    }
    public static void main(String[] args) {
        Jukebox UlicaRap = new Jukebox();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Наберите цифрой номер песни, которую хотите услышать:");
        System.out.println("Номер 1 = \"Пусть бегут неуклюже\"");
        System.out.println("Номер 2 = \"Спокойной ночи\"");
        int number = scanner.nextInt();
        if (number == 1) {
            UlicaRap.music(1);
        } else if (number == 2) {
            UlicaRap.music(2);
        } else {
            System.out.println("Песня не найдена");
        }
    }
}
