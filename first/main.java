package first;

public class main {

    public static void main(String[] args) {

        Team.skills(Team.command_1);

        Team.skills(Team.command_2);

        System.out.println("\nИтого: Команда 'Эльфы' получила "
                + Сompetition.Race(Team.command_1, Barrier.challenge) + " очков.\n");

        System.out.println("\nИтого: Команда 'Орки' получила "
                + Сompetition.Race(Team.command_2, Barrier.challenge) + " очков.\n");
    }

}