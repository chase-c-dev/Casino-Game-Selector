package game;

public class game {

    private int score;

    private String name;

    public game(int score, String name) { // constructor
        this.score = score; //initializes score
        this.name = name; //initializes name
    }

    public int getScore() { //getter for score
        return score;
    }

    public void setScore(int score) { //setter for score
        this.score = score;
    }

    public String getName() { //getter for name
        return name;
    }

    public void setName(String name) { //setter for name
        this.name = name;
    }


}
