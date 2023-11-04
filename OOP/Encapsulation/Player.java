package PastProjects.OOP.Encapsulation;

public class Player {
    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(String name, int endurance, int sprint, int dribble, int passing, int shooting) {
        setName(name);
        setEndurance(endurance);
        setSprint(sprint);
        setDribble(dribble);
        setPassing(passing);
        setShooting(shooting);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        NameCheck(name);
        this.name = name;
    }

    private void setEndurance(int endurance) {
        ArgumentCheck(endurance, "Endurance");
        this.endurance = endurance;
    }

    private void setSprint(int sprint) {
        ArgumentCheck(sprint, "Sprint");
        this.sprint = sprint;
    }

    private void setDribble(int dribble) {
        ArgumentCheck(dribble, "Dribble");
        this.dribble = dribble;
    }

    private void setPassing(int passing) {
        ArgumentCheck(passing, "Passing");
        this.passing = passing;
    }

    private void setShooting(int shooting) {
        ArgumentCheck(shooting, "Shooting");
        this.shooting = shooting;
    }

    private void ArgumentCheck(int stat, String statName) {
        if (stat < 0 || stat > 100){
            throw new IllegalArgumentException(
                    String.format("%s should be between 0 and 100.", statName));
        }
    }
    private void NameCheck(String name) {
        if (name == null || name.isBlank()){
            throw new IllegalArgumentException(
                    "A name should not be empty.");
        }
    }

    public double overallSkillLevel(){
        return (this.sprint + this.dribble + this.endurance + this.passing + this.shooting) / 5.0;
    }

}
