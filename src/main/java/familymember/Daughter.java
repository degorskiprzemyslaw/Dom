package familymember;

public class Daughter implements FamilyMember {

    private String imie;

    public Daughter(String imie) {
        this.imie = imie;
    }

    @Override
    public void przedstawSie() {
        System.out.println("i am daughter :)" + imie);
    }

    @Override
    public boolean jestDorosly() {
        return false;
    }


}
