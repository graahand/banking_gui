/**
 * Programming CourseWork(1st semester)
 * Islington College
 * 
 * @author 22067316 Bibek Poudel(AI2)
 * @version:1.0
 */

public class DebitCard extends BankCard 
{
    private int PIN_number;
    private int withdrawalAmount;
    private String dateOfWithdrawal;
    private boolean transactionMade;

    public DebitCard(int balanceAmount, int bankCardID, String bankAccountType, String issuerBankName, String clientFullName, int PIN_number)
     {  
        // Call made to the superclass constructor.
        super(balanceAmount, bankCardID, bankAccountType, issuerBankName);

        setClientName(clientFullName);
        this.PIN_number = PIN_number;
        transactionMade = false;
    }
    
    //
       
    // Accessor method for corresponding attributes.
    // allow user to accesss private attributes.
    public int getPIN()
     {
        return this.PIN_number;
    }

    public int getWithdrawalAmount()
     {
        return this.withdrawalAmount;
    }

    public String getDateOfWithdrawal() {
        return this.dateOfWithdrawal;
    }

    public boolean getTransactionMade() 
    {
        return this.transactionMade;
    }
    
    // Mutator method for withdrawalAmount
    // Set the value of a variable within an object.    
    public void setWithdrawalAmount(int withdrawalAmount)
     {
        this.withdrawalAmount = withdrawalAmount;
    }


    // Method for deducting money from client account.
    public void withdraw(int withdrawalAmount, String dateOfWithdrawal, int PIN_number) {
        if (this.PIN_number != PIN_number) {
            System.out.println("Incorrect PIN.Please,Try Again.");
        } else if (super.getBalanceAmount() < withdrawalAmount) {
            System.out.println("Insufficient balance. Withdrawal failed.");
        } else {
            this.withdrawalAmount = withdrawalAmount;
            super.setBalanceAmount(super.getBalanceAmount() - withdrawalAmount);
            transactionMade = true;
            this.dateOfWithdrawal = dateOfWithdrawal;
            System.out.println("Withdrawal successful! Your New balance is : " + super.getBalanceAmount());
        }
    }
    

    // Method with same signature as display method of BankCard class.
    public void display()
     {
        super.display();
        if (transactionMade) 
        {
            System.out.println("Your PIN Number is: " + PIN_number);
            System.out.println("Withdrawal Amount From Your Account is: " + withdrawalAmount);
            System.out.println("Date of the  Withdrawal: " + dateOfWithdrawal);
        } else 
        {
            System.out.println("Not Any Transaction to Show.");
        }
    }
}
