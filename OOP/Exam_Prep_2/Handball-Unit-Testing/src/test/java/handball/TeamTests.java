package handball;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class TeamTests {
    private static final String NAME = "test_name";
    private static final int POSITION = 10;
    private Team team;
    private HandballPlayer handballPlayer;
    @Before
    public void SetUp(){
        this.team = new Team(NAME, POSITION);
        this.handballPlayer = new HandballPlayer("test_player");
    }

    @Test(expected = NullPointerException.class)
    public void test_SetName_Null_Name() {
        new Team(null, POSITION);
    }
    @Test(expected = NullPointerException.class)
    public void test_SetName_WithEmpty_Name() {
        new Team("   ", POSITION);
    }
    @Test(expected = IllegalArgumentException.class)
    public void test_CreatingTeam_WithNegative_Capacity() {
        new Team(NAME, -1);
    }
    @Test
    public void test_CreatingTeam_WithValidArguments_Capacity() {
        Team team = new Team(NAME, POSITION);
        assertEquals(NAME, team.getName());
        assertEquals(POSITION, team.getPosition());
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Add_HandballPlayer_WhenCapacity_Reached(){
        Team team = new Team(NAME, 0);
        team.add(handballPlayer);
    }
    @Test
    public void test_Add_HandballPlayer_Should_IncreaseCount(){
        team.add(handballPlayer);
        assertEquals(1, team.getCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Remove_HandballPlayer_ShouldFail_When_Missing(){
        team.remove(handballPlayer.getName());
    }
    @Test
    public void test_Remove_HandballPlayer_Should_DecreaseCount(){
        team.add(handballPlayer);
        team.remove(handballPlayer.getName());
        assertEquals(0, team.getCount());
    }
    @Test(expected = IllegalArgumentException.class)
    public void test_PlayerFor_AnotherTeam(){
        team.remove(handballPlayer.getName());
    }
    @Test
    public void test_PlayerFor_AnotherTeam_Should_NotApprove(){
        team.add(handballPlayer);
        team.playerForAnotherTeam(handballPlayer.getName());
        assertFalse(handballPlayer.isActive());
    }

}