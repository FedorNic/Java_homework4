package first;

public class Сompetition {

    public static int Race(Team command, Barrier pool, Barrier road, Barrier hole, Barrier enemy) {
        int count = 0;
        int temp = 0;
        System.out.println("-------------------------------------------");
        for (int i = 0; i < command.players.length; i++) {
            System.out.print("Результаты (" + command.players[i].name + ") : ");
            temp = Swim(command.players[i], pool);
            System.out.print("плавание - " + Results(temp));
            count += temp;
            temp = Run(command.players[i], road);
            System.out.print(", бег - " + Results(temp));
            count += temp;
            temp = Jump(command.players[i], hole);
            System.out.print(", прыжки - " + Results(temp));
            count += temp;
            temp = Fight(command.players[i], enemy);
            System.out.println(", борьба - " + Results(temp));
            count += temp;
        }
        System.out.println("-------------------------------------------");
        return count;
    }

    public static String Results(int a) {
        if (a == 0) {
            return "НЕ прошел";
        } else {
            return "прошел";
        }

    }

    public static int Swim(People man, Barrier dif) {
        if (dif.level < man.swim) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int Run(People man, Barrier dif) {
        if (dif.level < man.run) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int Jump(People man, Barrier dif) {
        if (dif.level < man.jump) {
            return 1;
        } else {
            return 0;
        }
    }
    public static int Fight(People man, Barrier dif) {
        if (dif.level < man.force) {
            return 1;
        } else {
            return 0;
        }
    }
}