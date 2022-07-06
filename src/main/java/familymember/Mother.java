package familymember;

public class Mother implements FamilyMember{

    private String imie;
    public Mother(String imie) {
        this.imie = imie;
    }

    @Override
    public void przedstawSie() {
        System.out.println("i am mother" + imie);
    }

    @Override
    public boolean jestDorosly() {
        return true;
    }
}
