import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaiCrose = new Team<>("Adelaide Cross");
        adelaiCrose.addPlayer(joe);
//        adelaiCrose.addPlayer(pat);
//        adelaiCrose.addPlayer(beckham);

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
        freemanthe.matchResult(adelaiCrose, 3, 3);

        System.out.println("Ranking");
        System.out.println(adelaiCrose.getName() + " " + adelaiCrose.ranking());
        System.out.println(melbourne.getName() + " " + melbourne.ranking());
        System.out.println(freemanthe.getName() + " " + freemanthe.ranking());
        System.out.println(gordon.getName() + " " + gordon.ranking());

        System.out.println(adelaiCrose.compareTo(melbourne));
        System.out.println(adelaiCrose.compareTo(gordon));

//        ArrayList<Team> team;
//        Collections.sort(team);

        League<Team<FootballPlayer>> footballLeague = new League<>("Foootball League");

        footballLeague.add(adelaiCrose);
        footballLeague.add(melbourne);
        footballLeague.add(freemanthe);
        footballLeague.add(gordon);

        League<Team<BaseballPlayer>> baseballLeague = new League<>("BaseBall League");

        Team rawTeam = new Team("Raw");
        rawTeam.addPlayer(beckham);  //uncheked warning
        rawTeam.addPlayer(pat);  //uncheked warning

        footballLeague.add(rawTeam);    //uncheked warning

        League<Team<FootballPlayer>> rawleague = new League<>("Raw");
        rawleague.add(adelaiCrose);     // no warning
        rawleague.add(baseballTeam);    // no warning
        rawleague.add(rawTeam);     // no warning


        League reallyRawLeague = new League<>("Raw");
        reallyRawLeague.add(adelaiCrose);   //uncheked warning
        reallyRawLeague.add(baseballTeam);  //uncheked warning
        reallyRawLeague.add(rawTeam);   //uncheked warning



        footballLeague.showLeagueTable();

    }
}
