/*
* Program by: Mr. Tarazi, ASK HS Technology Teacher
* Date: 05/13/2021
* Objective: 2021 FRQ Question 3 - A high school club maintains information about its members in a MemberInfo object
* A MemberInfo object stores a club member's name, year of graduation, and whether or not the club member is in
* good condition.
*
*  Question # 3
*
* */

public class Main {

    public static void main(String[] args) {

        // Defined Array of Names
        String[] names = {"Student 1", "Student 2", "Student 3", "Student 4"};

        ClubMembers cm = new ClubMembers();
        cm.addMembers(names, 2021);
        cm.removeMembers(2021);
    }
}
