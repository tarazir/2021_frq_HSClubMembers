import java.util.ArrayList;

public class ClubMembers {

    private ArrayList<MemberInfo> memberList = new ArrayList<>();


    // AddMembers takes two paramters. The first paramter is an Array String containing the name of club members.
    // Second paramter is the graduation year of all the new club members
    public void addMembers(String[] names, int gradYear) {
       for (String name : names)
            memberList.add(new MemberInfo(name, gradYear, true));
    }

    // Remove Members method does the 2 actions as per the document.
    public ArrayList<MemberInfo> removeMembers(int year) {
        ArrayList<MemberInfo> memberList = new ArrayList<>();
        for (int i= memberList.size()-1; i>=0; i--) {
            if (memberList.get(i).getGradYear() <= year){
                MemberInfo temp = memberList.remove(i);
                if (temp.inGoodStanding())
                    memberList.add(temp);
            }
        }
        return memberList;
    }


    public void printArrayList() {
        for (int i=0; i<memberList.size(); i++) {
            System.out.println(memberList.get(i).getName());
        }
    }

}
