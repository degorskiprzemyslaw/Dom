package citizen;

public class Main {
    public static void main(String[] args) {

        Citizen[] citizens = new Citizen[4];
        citizens[0] = new King("Henryk");
        citizens[1] = new Townsman("Rudolf");
        citizens[2] = new Soldier("Herkules");
        citizens[3] = new Peasant("Grzesiu");

        Town town = new Town(citizens);
        int canVote = town.howManyCanVote(citizens);
        System.out.println(canVote);
        town.whoCanVote(citizens);
    }
}
