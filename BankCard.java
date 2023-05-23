
/**
 * Programming CourseWork(1st semester)
 * Islington College
 * 
 * @author 22067316 Bibek Poudel(AI2)
 * @version:1.0
 */

public class BankCard
 {
    private int bankCardID;
    private String clientFullName;
    private String issuerBankName;
    private String bankAccountType;
    private int balanceAmount;
    

    public BankCard(int balanceAmount, int bankCardID, String bankAccountType, String issuerBankName) 
    {
        this.balanceAmount = balanceAmount;
        this.bankCardID = bankCardID;
        this.bankAccountType = bankAccountType;
        this.issuerBankName = issuerBankName;
        this.clientFullName = "";
    }

    

    // Accessor(getMethod) Method for Each Attributes.
    // allow user to accesss private bankCardID,clientFullName,issuerBankName,bankAccountType and balanceAmount.
    public int getbankCardId() 
    
    {  
        return this.bankCardID;
    }
    public String getClientFullName() 
    {
        return this.clientFullName;
    }

    public String getIssuerBankName() 
    {
        return  this.issuerBankName;
    }

    public String getBankAccountType() 
    {
        return this.bankAccountType;
    }

    public int getBalanceAmount() 
    {
        return this.balanceAmount;
    }
    
    // Mutators(setMethod) Method for required Attributes.
    // Set the value of a variable within an object.   
    public void setClientName(String clientName) 
    {
        this.clientFullName = clientName;
    }

    public void setBalanceAmount(int balanceAmount) 
    {
        this.balanceAmount = balanceAmount;
    }

    // This method display the message according to the input of ClientFullName attribute.
    public void display() 
    {
        if (this.clientFullName == "")
        {
            System.out.println("Client full name is invalid. ");
        }else
        {
            System.out.println("Login Successful. "+"This Card Belongs to, name: " + clientFullName + " , ID: " + bankCardID + ". Issued by: " + issuerBankName + 
            " and has a Balance of : " + balanceAmount );
        }
    }
    
}
