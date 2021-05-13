/*
* Class Member Info is the class to hold the information of the club members.
* */

public class MemberInfo {

    private String name;
    private int gradYear;
    private boolean hasGoodStanding;

    // Constructor for creating objects
    public MemberInfo(String name, int gradYear, boolean hasGoodStanding) {
        this.name = name;
        this.gradYear = gradYear;
        this.hasGoodStanding = hasGoodStanding;
    }

    // Getter method for instance variables
    public String getName() {
        return name;
    }

    // Getter method for instance variables
    public int getGradYear() {
        return gradYear;
    }

    // Status of the Member
    public boolean inGoodStanding() {
        return hasGoodStanding;
    }
}
