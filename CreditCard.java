/**
 * Programming CourseWork(1st semester)
 * Islington College
 * 
 * @author 22067316 Bibek Poudel(AI2)
 * @version:1.0
 */

public class CreditCard extends BankCard
 {
    private int CVC_number;
    private double creditLimitAmount;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;

    public CreditCard(int bankCardId, String clientFullName, String issuerBankName, String bankAccountType, int balanceAmount, int CVC_number, double interestRate, String expirationDate) 
    {
        super(balanceAmount, bankCardId, bankAccountType, issuerBankName);
        setClientName(clientFullName);
        this.CVC_number = CVC_number;
        this.interestRate = interestRate;
        this.expirationDate = expirationDate;
        isGranted = false;
    }

    // Accessor method for required Attributes.
    // allow user to accesss private attributes.    
    public int getCVC_Number()
     {
        return this.CVC_number;
    }

    public double getCreditLimitAmount()
     {
        return this.creditLimitAmount;
    }

    public double getInterestRate()
     {
        return interestRate;
    }

    public String getExpirationDate() 
    {
        return this.expirationDate;
    }

    public int getGracePeriod() 
    {
        return this.gracePeriod;
    }

    public boolean getIsGranted() 
    {
        return this.isGranted;
    }
    
    // Mutator Method  for creditLimitAmount and gracePeriod.
    // Set the value of a variable within an object.    
    public void setCreditLimit(double creditLimitAmount, int gracePeriod) 
    {
        if (creditLimitAmount <= (super.getBalanceAmount() * 2.5)) 
        {
            this.creditLimitAmount = creditLimitAmount;
            this.gracePeriod = gracePeriod;
            isGranted = true;
        } else 
        {
            System.out.println("Failed to issue the Credit Card.");
            
        }
    }

    

    
    // remove the client's credit card.
    public void cancelCreditCard()
    {
        CVC_number = 0;
        creditLimitAmount = 0;
        gracePeriod = 0;
        isGranted = false;
    }

    public void display() 
    {
        super.display();
        if (isGranted) 
        {
            System.out.println("CVC: " + CVC_number);
            System.out.println("Credit Limit: " + creditLimitAmount);
            System.out.println("Interest Rate: " + interestRate);
            System.out.println("Expiration Date: " + expirationDate);
            System.out.println("Grace Period: " + gracePeriod);
        } else 
        {
            System.out.println("No credit card has been granted yet.");
        }
    }
}
