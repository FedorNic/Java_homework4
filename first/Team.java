package first;

public class Team {
    String command_name;
    People[] players;

    public Team(String command_name, People[] players) {
        this.command_name = command_name;
        this.players = players;
    }

    static People[] players_1 = new People[] { People.people_1, People.people_2, People.people_3 };
    static People[] players_2 = new People[] { People.people_4, People.people_5, People.people_6 };

    static Team command_1 = new Team("Эльфы", players_1);
    static Team command_2 = new Team("Орки", players_2);

    static void skills(Team command) {
        System.out.println("\nКоманда: " + command.command_name);
        System.out.println("-----------------");
        for (int i = 0; i < command.players.length; i++) {
            System.out.println("\nИмя: " + command.players[i].name);
            System.out.println("\tНавыки плавания:" + command.players[i].swim);
            System.out.println("\tНавыки бега:\t" + command.players[i].run);
            System.out.println("\tНавыки прыжков:\t" + command.players[i].jump);
            System.out.println("\tНавыки силы:\t" + command.players[i].force);
        }
    }
}