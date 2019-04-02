public class Main {
    public static void main(String[] args) {

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaiCrose = new Team<>("Adelaide Cross");
        adelaiCrose.addPlayer(joe);
        adelaiCrose.addPlayer(pat);
        adelaiCrose.addPlayer(beckham);

        System.out.println("Players in Team " + adelaiCrose.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> soccerTeam = new Team<>("New Team");
        soccerTeam.addPlayer(beckham);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> gordon = new Team<>("Gordon");
        Team<FootballPlayer> freemanthe = new Team<>("Freemanthe");

        gordon.matchResult(freemanthe, 2, 1);
        gordon.matchResult(adelaiCrose, 0, 2);

        adelaiCrose.matchResult(melbourne, 2, 3);

    }
}
