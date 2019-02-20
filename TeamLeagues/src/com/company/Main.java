package com.company;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");

        Team<FootballPlayer> fortyNiners = new Team<>("Forty-Niners");
        fortyNiners.addPlayer(joe);


	    Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
	    baseballTeam.addPlayer(pat);

	    Team<FootballPlayer> colts = new Team<>("Indiana Colts");
	    Team<FootballPlayer> raiders = new Team<>("Oakland Raiders");
	    Team<FootballPlayer> giants = new  Team<>("New York Giants");

        League<Team<FootballPlayer>> footballLeague = new League<>("NFL");
        footballLeague.addTeam(fortyNiners);
        footballLeague.addTeam(colts);
        footballLeague.addTeam(raiders);
        footballLeague.addTeam(giants);
//        footballLeague.addTeam(baseballTeam);
    }
}
