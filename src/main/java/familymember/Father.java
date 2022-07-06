package familymember;

public class Father implements FamilyMember{

    private String imie;

    public Father(String imie) {
        this.imie = imie;
    }

    @Override
    public void przedstawSie() {
        System.out.println("i am father" + imie);
    }

    @Override
    public boolean jestDorosly() {
        return true;
    }
}
