//import java.time.LocalDate;
//import java.util.ArrayList;
//
public class BankAccount {
//    // DEFINING PROPERTIES AS PER THE INSTRUCTIONS
//
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private Integer accountNumber;
    private Long balance;

    // CONSTRUCTOR
    // This defines the class BankAccount which receives the client's details and sets balance to 0
    public BankAccount(
            String inputFirstName,
            String inputLastName,
            String inputDateOfBirth,
            Integer inputAccountNumber
   ){
        this.firstName = inputFirstName;
        this.lastName = inputLastName;
        this.dateOfBirth = inputDateOfBirth;
        this.accountNumber = inputAccountNumber;
        this.balance = 0L;
//
    }




    // METHOD
    Long addDeposit(Long[] deposits){
        Long balance = 0L;
        for(var deposit : deposits){
            balance += deposit;
        }
        return balance;
    }

    Long subtractWithdrawal(Long[] withdrawals){
        Long balance = 0L;
        for(var withdrawal : withdrawals){
            balance -= withdrawal;
        }
        return balance;
    }





    // GETTERS AND SETTERS
    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
//
    public String getLastName(){
        return this.lastName;
    }
//
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth(){
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getAccountNumber(){
        return this.accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }
}
