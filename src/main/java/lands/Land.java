package lands;

import characters.Character;

import java.util.ArrayList;

public abstract class Land {

    private String name;
    private String scenery;
    private ArrayList<Character> players;

    public Land(String name, String scenery) {
        this.name = name;
        this.scenery = scenery;
        this.players = new ArrayList<Character>();
    }

    public String getName() {
        return name;
    }

    public String getScenery() {
        return scenery;
    }

    public ArrayList<Character> getPlayers() {
        return players;
    }

}
