package citizen;

public class Town {

    private Citizen[] citizens;

    public Town(Citizen[] citizens) {
        this.citizens = citizens;
    }

    public int howManyCanVote(Citizen[] citizens){
        int counter = 0;
        for (Citizen citizen : citizens) {
            if(citizen.canVote()){
                counter++;
            }
        }
        return counter;
    }

    public void whoCanVote(Citizen[] citizens){
        for (Citizen citizen : citizens) {
            if(citizen.canVote()){
                System.out.println(citizen.name);
            }

        }
    }
}

