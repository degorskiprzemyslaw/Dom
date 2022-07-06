package familymember;

import java.util.ArrayList;
import java.util.List;

public class FamilyMemberDemo {
    public static void main(String[] args) {

        FamilyMember familyMember1 = new Daughter("Maria");
        familyMember1.przedstawSie();

        FamilyMember familyMember2 = new Father("Grzegorz");
        FamilyMember familyMember3 = new Mother("Aneta");
        FamilyMember familyMember4 = new Son("Jan");
        familyMember2.przedstawSie();

        List<FamilyMember> familyMemberList = new ArrayList<>();
        familyMemberList.add(familyMember1);
        familyMemberList.add(familyMember2);
        familyMemberList.add(familyMember3);
        familyMemberList.add(familyMember4);
        System.out.println(familyMemberList);

        for (FamilyMember familyMember : familyMemberList) {
            familyMember.przedstawSie();
            System.out.println(familyMember.jestDorosly());

        }

    }



}
