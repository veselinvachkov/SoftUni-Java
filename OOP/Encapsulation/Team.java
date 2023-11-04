package PastProjects.OOP.Encapsulation;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private String name;
    private List<Player> players;
    public Team(String name) {
        setName(name);
        this.players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public void addPlayer(Player player){
        players.add(player);
    }

    public void removePlayer(String name){
        boolean isRemoved = players.removeIf(p -> p.getName().equals(name));
        if (!isRemoved){
            throw new IllegalArgumentException("Player " + name + " is not in " + this.name + " team.");
        }
    }

    public double getRating(){
        return players.stream()
                .mapToDouble(Player::overallSkillLevel)
                .average()
                .orElse(0.00);
    }


}
