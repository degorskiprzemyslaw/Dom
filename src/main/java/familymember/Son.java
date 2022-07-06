package familymember;

public class Son implements FamilyMember{

    private String imie;
    public Son(String imie) {
        this.imie = imie;
    }

    @Override
    public void przedstawSie() {
        System.out.println("who's asking" + imie);
    }

    @Override
    public boolean jestDorosly() {
        return false;
    }
}
