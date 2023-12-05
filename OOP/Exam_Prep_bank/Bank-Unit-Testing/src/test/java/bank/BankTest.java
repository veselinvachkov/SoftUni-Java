package bank;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class BankTest {
    private static final String NAME = "test_bank";
    private static final int CAPACITY = 10;
    private Bank bank;
    private Client client;

    @Before
    public void SetUp(){
        this.bank = new Bank(NAME, CAPACITY);
        this.client = new Client("test_client");
    }

    @Test(expected = NullPointerException.class)
    public void test_SetName_Null_Name() {
        new Bank(null, CAPACITY);
    }
    @Test(expected = NullPointerException.class)
    public void test_SetName_WithEmpty_Name() {
        new Bank("   ", CAPACITY);
    }
    @Test(expected = IllegalArgumentException.class)
    public void test_CreatingBank_WithNegative_Capacity() {
        new Bank(NAME, -1);
    }
    @Test
    public void test_CreatingBank_WithValidArguments_Capacity() {
        Bank bank = new Bank(NAME, CAPACITY);
        assertEquals(NAME, bank.getName());
        assertEquals(CAPACITY, bank.getCapacity());
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_AddClient_WhenCapacity_Reached(){
        Bank bank = new Bank(NAME, 0);
        bank.addClient(client);
    }
    @Test
    public void test_AddClient_Should_IncreaseCount(){
        bank.addClient(client);
        assertEquals(1, bank.getCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_RemoveClient_ShouldFail_When_Missing(){
        bank.removeClient(client.getName());
    }
    @Test
    public void test_RemoveClient_Should_DecreaseCount(){
        bank.addClient(client);
        bank.removeClient(client.getName());
        assertEquals(0, bank.getCount());
    }
    @Test(expected = IllegalArgumentException.class)
    public void test_LoanWithdrawal(){
        bank.removeClient(client.getName());
    }
    @Test
    public void test_LoanWithdrawal_Should_NotApprove(){
        bank.addClient(client);
        bank.loanWithdrawal(client.getName());
        assertFalse(client.isApprovedForLoan());
    }

}
