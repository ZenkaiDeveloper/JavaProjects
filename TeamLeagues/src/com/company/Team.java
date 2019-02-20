package com.company;

import java.util.ArrayList;

public class Team<T extends Player> {
    private String name;
    private ArrayList<T> players = new ArrayList<>();
    private int won;
    private int draw;
    private int loss;

    public int ranking(){
        return  (won*2) + draw;
    }

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<T> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<T> players) {
        this.players = players;
    }

    public int getWon() {
        return won;
    }

    public void setWon(int won) {
        this.won = won;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public int getLoss() {
        return loss;
    }

    public void setLoss(int loss) {
        this.loss = loss;
    }

    public boolean addPlayer(T player){
        if(players.contains(player)){
            System.out.println(player.getName() + " already is on the team, not added to" + this.name );
            return  false;
        }else{
            players.add(player);
            System.out.println("Added " + player.getName() + " to the team " + this.name);
            return true;
        }
    }

    public int numPlayers(){
        return players.size();
    }

    @Override
    public int compareTo(Team<T> team){
        if(this.ranking() > team.ranking()){
            return -1;
        }else if(this.ranking() < team.ranking()){
            return 1;
        }else{
            return 0;
        }
    }
}
