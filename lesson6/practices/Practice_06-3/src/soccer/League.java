package soccer;

public class League {
    public static void main(String[] args) {
        Team RealMadrid = new Team();
        RealMadrid.name = "Real Madrid";
        Player[] RMPlayers = {new Player(), new Player(), new Player(), new Player(), new Player(), new Player()};
        for(int i=1; i <= RMPlayers.length; i++){
            RMPlayers[i-1].name = "RM player "+i;
        }
        RealMadrid.players = RMPlayers;

        Team Barcelona = new Team();
        Barcelona.name = "Barcelona";
        Player[] BPlayers = {new Player(), new Player(), new Player(), new Player(), new Player(), new Player()};
        for(int i=1; i <= BPlayers.length; i++){
            BPlayers[i-1].name = "Barca player "+i;
        }
        Barcelona.players = BPlayers;

        Game Derby_RM_B = new Game();
        Goal[] goals = {new Goal(), new Goal(), new Goal()};
        goals[0].player = RMPlayers[2];
        goals[0].team = RealMadrid;
        goals[0].time = 15.0;
        goals[1].player = BPlayers[1];
        goals[1].team = Barcelona;
        goals[1].time = 35.0;
        goals[2].player = BPlayers[4];
        goals[2].team = Barcelona;
        goals[2].time = 53.0;
        Derby_RM_B.hostTeam = RealMadrid;
        Derby_RM_B.guestTeam = Barcelona;
        Derby_RM_B.goals = goals;

        System.out.println(Derby_RM_B.hostTeam.name + " (Host Team) :");
        for(Player P : Derby_RM_B.hostTeam.players)
            System.out.println(P.name) ;

        System.out.println(Derby_RM_B.guestTeam.name + " (Guest Team) :");
        for(Player P : Derby_RM_B.guestTeam.players)
            System.out.println(P.name) ;

        System.out.println("Goals : ");
        for(Goal G : Derby_RM_B.goals)
            System.out.println("Goal scored after "+ G.time + " mins by "+ G.player.name + " of the " + G.team.name) ;
    }
}
