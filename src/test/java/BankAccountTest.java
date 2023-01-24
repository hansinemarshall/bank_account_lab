import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    BankAccount bankAccount;

    @BeforeEach
    void setUp(){
        bankAccount = new BankAccount(
                "Hansine",
                "Marshall",
                "19th April 1999",
                12345);
    }

    @Test
    void getFirstName(){
        assertThat(bankAccount.getFirstName()).isEqualTo("Hansine");
    }

    @Test
    void getLastName(){
        assertThat(bankAccount.getLastName()).isEqualTo("Marshall");
    }

    @Test
    void getDateOfBirth(){
        assertThat(bankAccount.getDateOfBirth()).isEqualTo("19th April 1999");
    }

    @Test
    void getAccountNumber(){
        assertThat(bankAccount.getAccountNumber()).isEqualTo(12345);
    }

    @Test
    void canAddDeposit(){
        Long[] balance = {0L, 5L, 15L};
        assertThat(bankAccount.addDeposit(balance)).isEqualTo(20L);
    }

    @Test
    void canSubtractWithdrawal(){
        Long[] balance = {0L, 7L, 1L};
        assertThat(bankAccount.subtractWithdrawal(balance)).isEqualTo(-8L);
    }

}
