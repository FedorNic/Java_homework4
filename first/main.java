package first;

public class main {

    public static void main(String[] args) {

        Team.skills(Team.command_1);

        Team.skills(Team.command_2);

        System.out.println("\nИтого: Команда 'Эльфы' получила "
                + Сompetition.Race(Team.command_1, Barrier.pool, Barrier.road, Barrier.hole, Barrier.enemy) + " очков.\n");

        System.out.println("\nИтого: Команда 'Орки' получила "
                + Сompetition.Race(Team.command_2, Barrier.pool, Barrier.road, Barrier.hole, Barrier.enemy) + " очков.\n");
    }

}