package citizen;

public abstract class Citizen {

    String name;

    public Citizen(String name) {
        this.name = name;
    }

    public abstract boolean canVote();

}

