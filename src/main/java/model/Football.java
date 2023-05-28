package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Football played in a university
 */
public class Football {
    
    /**
     * Match date
     */
    private Date matchDate;

    /**
     * Number of team member
     */
    private int teamMembers;

    /**
     * Duration of the match in minutes
     */
    private int matchDuration;

    /**
     * Student available for the team
     */
    private List<Student> avail = new ArrayList<Student>();


   /**
     * Team allocated to the game
     */
    private List<Student> team = new ArrayList<Student>();


    public String getGame() {
        return name;
    }

    public void setGame(String name) {
        this.name = name;
    }

    public Date getMatchDate() {
        return matchDate;
    }

    public void setMatchDuration(int matchDuration) {
        this.matchDuration = matchDuration;
    }
    
    public int getMatchDuration() {
        return matchDuration;
    }

    public int getTeamMembers() {
        return teamMembers;
    }

    public void setTeamMembers(int teamMembers) {
        this.teamMembers = teamMembers;
    }


    public List<Student> getTeam() {
        return team;
    }

	public void addAvailStudent(Student snew) {
        avail.add(snew);
    }




}
