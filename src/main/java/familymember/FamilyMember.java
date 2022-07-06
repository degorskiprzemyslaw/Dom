package familymember;

public interface FamilyMember {

    default void przedstawSie(){
        System.out.println("I am just a simple family member");
    }

    public abstract boolean jestDorosly();
}
