public class Main {
    public static void main(String[] args) {

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team adelaiCrose = new Team("Adelaide Cross");
        adelaiCrose.addPlayer(joe);
        adelaiCrose.addPlayer(pat);
        adelaiCrose.addPlayer(beckham);

        System.out.println("Players in Team " + adelaiCrose.numPlayers());

    }
}
