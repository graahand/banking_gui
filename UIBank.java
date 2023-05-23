import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.util.ArrayList;
/**
 *
 * Bibek Poudel
 * 22067316
 * @version 1.1
 * May 10,2023
 */
public class UIBank implements ActionListener{
    JFrame jf;
    JFrame frameWithdraw;
    JFrame frameCredit;
    JFrame frameCreditLimit;
    JFrame frameCancelCredit;
    JFrame frameMainPage;
    JPanel panel , panelWithdraw, panelCredit,panelCreditLimit,panelCancleCredit,panelMainPage;
   
    JTextField fieldCardID,fieldClientName,fieldIssuerBank,fieldBankAccount,fieldBalanaceAmount,fieldPIN_Number,fieldWithdraw_1,fieldWithdraw_2,fieldWithdraw_3,fieldCredit_1,fieldCredit_2,fieldCredit_3,fieldCredit_4,fieldCredit_5,fieldCredit_6,fieldCredit_7,
    tfLimit1,tfLimit2,tfLimit3,tfCancel1;
   
    JButton buttonEnter,buttonDebitCard,buttonCreditCard,buttonWithdrawal,buttonCreditLimit,buttonCancelCredit,buttonDebitDisplay,buttonCreditDisplay,buttonRemove1,buttonBack1,buttonSubmit1,buttonRemove2,buttonSubmit2,buttonBack2,buttonRemove3,buttonSubmit3,buttonBack3,buttonRemove4,buttonSubmit4,buttonBack4;

    JLabel lbMain, labelCardID,labelClientName,labelIssuerBank,labelBankAccount,labelBalanaceAmount,labelPIN_Number,label$Main,labelWithdraw$1,labelWithdraw$2,labelWithdraw$3,labelWithdraw$4,labelWithdraw$5,labelCredit_1,labelCredit_2,labelCredit_3,labelCredit_4,labelCredit_5,labelCredit_6,labelCredit_7,labelCredit_8,labelCredit_9,
    label$Title,labellLimit_1,labellLimit_2,labellLimit_3,labelCancelTitle,labelCancel_1;
   
    JComboBox<String> comboCredit_1,comboCredit_2,comboCredit_3,comboWithdraw_4,comboWithdraw_5,comboWithdraw_6;
   
    private final Color CarnaryYELLOW = new  Color(255, 255, 143);
    ArrayList <BankCard> CardList;
   
    public UIBank()
    {
        CardList = new ArrayList<>();
        frameMainPage = new JFrame ("My Bank");
        frameMainPage.setSize(300,200);
        jf= new JFrame("BibekShil Bank");
        jf.setSize(600,500);
        frameWithdraw = new JFrame("BibekShil Bank");
        frameWithdraw.setSize(500,500);
        frameCredit = new JFrame("BibekShil Bank");
        frameCredit.setSize(500,550);
        frameCreditLimit = new JFrame("BibekShil Bank");
        frameCreditLimit.setSize(450,350);
        frameCancelCredit = new JFrame("BibekShil Bank");
        frameCancelCredit.setSize(400,300);
        panelMainPage = new JPanel();
        panelMainPage.setLayout(null);
        panelMainPage.setSize(200,200);
        panelMainPage.setBackground(CarnaryYELLOW);
        panelMainPage.setVisible(true);
        frameMainPage.add(panelMainPage);
        panel = new JPanel();
        panel.setLayout(null);
        panel.setSize(500,467);
        panel.setBackground(CarnaryYELLOW);
        panel.setVisible(true);
        jf.add(panel);
        panelWithdraw = new JPanel();
        panelWithdraw.setLayout(null);
        panelWithdraw.setSize(500,300);
        panelWithdraw.setVisible(true);
        panelWithdraw.setBackground(CarnaryYELLOW);
        frameWithdraw.add(panelWithdraw);
        panelCredit = new JPanel();
        panelCredit.setLayout(null);
        panelCredit.setSize(495,403);
        panelCredit.setVisible(true);
        panelCredit.setBackground(CarnaryYELLOW);
        frameCredit.add(panelCredit);
        panelCreditLimit = new JPanel();
        panelCreditLimit.setLayout(null);
        panelCreditLimit.setSize(400,200);
        panelCreditLimit.setVisible(true);
        panelCreditLimit.setBackground(CarnaryYELLOW);
        frameCreditLimit.add(panelCreditLimit);
        panelCancleCredit = new JPanel();
        panelCancleCredit.setLayout(null);
        panelCancleCredit.setSize(400,200);
        panelCancleCredit.setVisible(true);
        panelCancleCredit.setBackground(CarnaryYELLOW);
        frameCancelCredit.add(panelCancleCredit);
        lbMain = new JLabel("Welcome to BibekShil Bank");
        labelClientName = new JLabel("Client Name");
        labelIssuerBank = new JLabel("Issuer Bank");
        labelBankAccount = new JLabel("Bank Account");
        labelBalanaceAmount = new JLabel("Balance Amount");
        labelCardID = new JLabel("Card ID");
        labelPIN_Number = new JLabel("PIN number");
        label$Main = new JLabel("BibekShil Bank");
        labelWithdraw$1 = new JLabel("Card ID");
        labelWithdraw$2 = new JLabel("Withdrawal Amount");
        labelWithdraw$3 = new JLabel("PIN number");
        labelWithdraw$4 = new JLabel("Date of Withdrawal");
        labelWithdraw$5 = new JLabel("Withdrawal Debit");
        labelCredit_1 = new JLabel("Client Name");
        labelCredit_2 = new JLabel("Issuer BanK");
        labelCredit_3 = new JLabel("Bank Account");
        labelCredit_4 = new JLabel("Balance Amount");
        labelCredit_5 = new JLabel("Card ID");
        labelCredit_6 = new JLabel("CVC number");
        labelCredit_7 = new JLabel("Interest Rate");
        labelCredit_8 = new JLabel("Expiration Date");
        labelCredit_9 = new JLabel("Credit Card");
        label$Title = new JLabel("Credit Limit");
        labellLimit_1 = new JLabel("Card ID");
        labellLimit_2 = new JLabel("Credit Limit");
        labellLimit_3 = new JLabel("Grace Period");
        labelCancelTitle = new JLabel("Cancel Card");
        labelCancel_1 = new JLabel("Card ID");
       
        fieldCardID = new JTextField();
        fieldClientName = new JTextField();
        fieldIssuerBank = new JTextField();
        fieldBankAccount = new JTextField();
        fieldBalanaceAmount = new JTextField();
        fieldPIN_Number = new JTextField();
        fieldCredit_1 = new JTextField();
        fieldCredit_2 = new JTextField();
        fieldCredit_3 = new JTextField();
        fieldCredit_4 = new JTextField();
        fieldCredit_5 = new JTextField();
        fieldCredit_6 = new JTextField();
        fieldCredit_7 = new JTextField();
        fieldWithdraw_1 = new JTextField();
        fieldWithdraw_2 = new JTextField();
        fieldWithdraw_3 = new JTextField();
        tfLimit1 = new JTextField();
        tfLimit2 = new JTextField();
        tfLimit3 = new JTextField();
        tfCancel1 = new JTextField();
       
       
       
        String[] Years = {"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023"};
         comboCredit_1 = new JComboBox<>(Years);
        String[] Months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
         comboCredit_2 = new JComboBox<>(Months);
        String[] Days = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
         comboCredit_3 = new JComboBox<>(Days);
       
        String[] Year$ = {"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023"};
         comboWithdraw_4 = new JComboBox<>(Year$);
        String[] Month$ = {"January","February","March","April","May","June","July","August","September","October","November","December"};
         comboWithdraw_5 = new JComboBox<>(Month$);
        String[] Day$ = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
         comboWithdraw_6 = new JComboBox<>(Day$);
         
        buttonEnter = new JButton("Enter");
        buttonWithdrawal = new JButton("Withdraw Debit");
        buttonCreditCard = new JButton(" Credit");
        buttonDebitCard = new JButton(" ADD");
        buttonCreditLimit = new JButton("Credit Limit");
        buttonCancelCredit = new JButton("Cancel Credit");
        buttonDebitDisplay = new JButton("Debit Display");
        buttonCreditDisplay = new JButton("Credit Display");
        buttonSubmit1 = new JButton("Submit");
        buttonRemove1 = new JButton("Remove");
        buttonBack1 = new JButton("Back");
        buttonRemove2= new JButton("Remove");
        buttonSubmit2 = new JButton("Submit");
        buttonBack2 = new JButton("Back");
        buttonSubmit3 = new JButton("Submit");
        buttonRemove3 = new JButton("Remove");
        buttonBack3 = new JButton("Back");
        buttonSubmit4 = new JButton("Submit");
        buttonRemove4 = new JButton("Remove");
        buttonBack4 = new JButton("Back");
       
        lbMain.setBounds(30,30,500,70);
        labelCardID.setBounds(60,282,82,21);
        labelClientName.setBounds(60,154,82,21);
        labelIssuerBank.setBounds(300,154,82,21);
        labelBankAccount.setBounds(40,218,120,21);
        labelBalanaceAmount.setBounds(280,218,120,21);
        labelPIN_Number.setBounds(300,282,86,21);
        label$Main.setBounds(240,60,133,36);
        labelCredit_1.setBounds(30,154,82,21);
        labelCredit_2.setBounds(240,154,82,21);
        labelCredit_3.setBounds(20,218,95,21);
        labelCredit_4.setBounds(234,218,109,21);
        labelCredit_5.setBounds(30,282,82,21);
        labelCredit_6.setBounds(240,282,86,21);
        labelCredit_7.setBounds(30,334,87,21);
        labelCredit_8.setBounds(70,430,99,21);
        labelCredit_9.setBounds(200,80,133,36);
        labelWithdraw$1.setBounds(110,142,50,20);
        labelWithdraw$2.setBounds(85,200,130,25);
        labelWithdraw$3.setBounds(90,270,120,20);
        labelWithdraw$4.setBounds(50,330,120,20);
        labelWithdraw$5.setBounds(190,20,150,90);
        label$Title.setBounds(165,30,120,20);
        labellLimit_1.setBounds(100,103,50,20);
        labellLimit_2.setBounds(85,159,75,20);
        labellLimit_3.setBounds(85,215,90,17);
        labelCancelTitle.setBounds(150,40,120,20);
        labelCancel_1.setBounds(80,100,50,20);
       
        fieldCardID.setBounds(139,277,123,26);
        fieldClientName.setBounds(139,154,123,26);
        fieldIssuerBank.setBounds(390,154,123,26);
        fieldBankAccount.setBounds(139,218,123,26);
        fieldBalanaceAmount.setBounds(390,218,123,26);
        fieldPIN_Number.setBounds(390,277,123,26);
        fieldWithdraw_1.setBounds(220,138,143,28);
        fieldWithdraw_2.setBounds(220,200,143,28);
        fieldWithdraw_3.setBounds(220,262,143,28);
        fieldCredit_1.setBounds(110,154,123,26);
        fieldCredit_2.setBounds(330,154,123,26);
        fieldCredit_3.setBounds(110,218,123,26);
        fieldCredit_4.setBounds(339,218,123,28);
        fieldCredit_5.setBounds(110,277,123,26);
        fieldCredit_6.setBounds(330,277,123,26);
        fieldCredit_7.setBounds(110,334,123,26);
        tfLimit1.setBounds(180,103,143,28);
        tfLimit2.setBounds(180,155,143,28);
        tfLimit3.setBounds(180,212,143,28);
        tfCancel1.setBounds(130,100,143,28);
       
        comboCredit_1.setBounds(170,430,65,26);
        comboCredit_2.setBounds(240,430,74,26);
        comboCredit_3.setBounds(320,430,70,26);
        comboWithdraw_4.setBounds(180,330,65,26);
        comboWithdraw_5.setBounds(250,330,74,26);
        comboWithdraw_6.setBounds(330,330,75,26);
        buttonEnter.setBounds(50,90,120,32);
        buttonDebitCard.setBounds(280,336,87,28);
        buttonCreditCard.setBounds(180,336,87,28);
        buttonWithdrawal.setBounds(30,336,125,28);
        buttonCreditLimit.setBounds(380,397,120,28);
        buttonCancelCredit.setBounds(390,336,120,28);
        buttonDebitDisplay.setBounds(100,397,120,28);
        buttonCreditDisplay.setBounds(240,397,120,28);
       
        buttonSubmit1.setBounds(100,400,90,29);
        buttonRemove1.setBounds(240,400,90,29);
        buttonBack1.setBounds(330,20,80,29);
        buttonRemove2.setBounds(240,334,87,28);
        buttonSubmit2.setBounds(350,334,87,28);
        buttonBack2.setBounds(330,20,80,29);
        buttonSubmit3.setBounds(100,255,80,29);
        buttonRemove3.setBounds(200,255,80,29);
        buttonBack3.setBounds(270,20,80,29);
        buttonSubmit4.setBounds(100,160,80,29);
        buttonRemove4.setBounds(200,160,80,29);
        buttonBack4.setBounds(290,20,80,29);
       
        panelMainPage.add(lbMain);
        panelMainPage.add(buttonEnter);
        panel.add(labelCardID);
        panel.add(labelClientName);
        panel.add(labelIssuerBank);
        panel.add(labelBankAccount);
        panel.add(labelBalanaceAmount);
        panel.add(labelPIN_Number);
        panel.add(label$Main);
        panel.add(fieldCardID);
        panel.add(fieldClientName);
        panel.add(fieldIssuerBank);
        panel.add(fieldBankAccount);
        panel.add(fieldBalanaceAmount);
        panel.add(fieldPIN_Number);
        panel.add(buttonDebitCard);
        panel.add(buttonCreditCard);
        panel.add(buttonWithdrawal);
        panel.add(buttonCreditLimit);
        panel.add(buttonCancelCredit);
        panel.add(buttonDebitDisplay);
        panel.add(buttonCreditDisplay);
   
        panelWithdraw.add(labelWithdraw$1);
        panelWithdraw.add(labelWithdraw$2);
        panelWithdraw.add(labelWithdraw$3);
        panelWithdraw.add(labelWithdraw$4);
        panelWithdraw.add(labelWithdraw$5);
        panelWithdraw.add(fieldWithdraw_1);
        panelWithdraw.add(fieldWithdraw_2);
        panelWithdraw.add(fieldWithdraw_3);
        panelWithdraw.add(buttonRemove1);
        panelWithdraw.add(buttonSubmit1);
        panelWithdraw.add(buttonBack1);
        panelWithdraw.add(comboCredit_1);
        panelWithdraw.add(comboCredit_2);
        panelWithdraw.add(comboCredit_3);
        panelWithdraw.add(comboWithdraw_4);
        panelWithdraw.add(comboWithdraw_5);
        panelWithdraw.add(comboWithdraw_6);
        panelCredit.add(labelCredit_1);
        panelCredit.add(labelCredit_2);
        panelCredit.add(labelCredit_3);
        panelCredit.add(labelCredit_4);
        panelCredit.add(labelCredit_5);
        panelCredit.add(labelCredit_6);
        panelCredit.add(labelCredit_7);
        panelCredit.add(labelCredit_8);
        panelCredit.add(labelCredit_9);
        panelCredit.add(fieldCredit_1);
        panelCredit.add(fieldCredit_2);
        panelCredit.add(fieldCredit_3);
        panelCredit.add(fieldCredit_4);
        panelCredit.add(fieldCredit_5);
        panelCredit.add(fieldCredit_6);
        panelCredit.add(fieldCredit_7);
        panelCredit.add(comboCredit_1);
        panelCredit.add(comboCredit_2);
        panelCredit.add(comboCredit_3);
        panelCreditLimit.add(label$Title);
        panelCreditLimit.add(labellLimit_1);
        panelCreditLimit.add(labellLimit_2);
        panelCreditLimit.add(labellLimit_3);
        panelCreditLimit.add(tfLimit1);
        panelCreditLimit.add(tfLimit2);
        panelCreditLimit.add(tfLimit3);
        panelCredit.add(buttonRemove2);
        panelCredit.add(buttonSubmit2);
        panelCredit.add(buttonBack2);
        panelCreditLimit.add(buttonRemove3);
        panelCreditLimit.add(buttonSubmit3);
        panelCreditLimit.add(buttonBack3);
        panelCancleCredit.add(labelCancelTitle);
        panelCancleCredit.add(labelCancel_1);
        panelCancleCredit.add(tfCancel1);
        panelCancleCredit.add(buttonRemove4);
        panelCancleCredit.add(buttonSubmit4);
        panelCancleCredit.add(buttonBack4);
       
        buttonEnter.addActionListener(this);
        buttonDebitCard.addActionListener(this);
        buttonCreditCard.addActionListener(this);
        buttonWithdrawal.addActionListener(this);
        buttonCreditLimit.addActionListener(this);
        buttonCancelCredit.addActionListener(this);
        buttonDebitDisplay.addActionListener(this);
        buttonCreditDisplay.addActionListener(this);
        buttonRemove1.addActionListener(this);
        buttonSubmit1.addActionListener(this);
        buttonBack1.addActionListener(this);
        buttonRemove2.addActionListener(this);
        buttonSubmit2.addActionListener(this);
        buttonBack2.addActionListener(this);
        buttonRemove3.addActionListener(this);
        buttonSubmit3.addActionListener(this);
        buttonBack3.addActionListener(this);
        buttonRemove4.addActionListener(this);
        buttonSubmit4.addActionListener(this);
        buttonBack4.addActionListener(this);
       
        frameMainPage.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameWithdraw.setVisible(false);
        frameWithdraw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        buttonEnter.setBackground(Color.LIGHT_GRAY);
        buttonDebitCard.setBackground(Color.LIGHT_GRAY);
        buttonCreditCard.setBackground(Color.LIGHT_GRAY);
        buttonWithdrawal.setBackground(Color.LIGHT_GRAY);
        buttonCreditLimit.setBackground(Color.LIGHT_GRAY);
        buttonCancelCredit.setBackground(Color.LIGHT_GRAY);
        buttonDebitDisplay.setBackground(Color.LIGHT_GRAY);
        buttonCreditDisplay.setBackground(Color.LIGHT_GRAY);
        buttonRemove1.setBackground(Color.LIGHT_GRAY);
        buttonSubmit1.setBackground(Color.LIGHT_GRAY);
        buttonBack1.setBackground(Color.LIGHT_GRAY);
        buttonRemove2.setBackground(Color.LIGHT_GRAY);
        buttonSubmit2.setBackground(Color.LIGHT_GRAY);
        buttonBack2.setBackground(Color.LIGHT_GRAY);
        buttonRemove3.setBackground(Color.LIGHT_GRAY);
        buttonSubmit3.setBackground(Color.LIGHT_GRAY);
        buttonBack3.setBackground(Color.LIGHT_GRAY);
        buttonRemove4.setBackground(Color.LIGHT_GRAY);
        buttonSubmit4.setBackground(Color.LIGHT_GRAY);
        buttonBack4.setBackground(Color.LIGHT_GRAY);
       
        lbMain.setFont(new Font("Times New",Font.BOLD,16));
        labelCardID.setFont(new Font("Times New",Font.BOLD,13));
        labelClientName.setFont(new Font("Times New",Font.BOLD,13));
        labelIssuerBank.setFont(new Font("Times New",Font.BOLD,13));
        labelBankAccount.setFont(new Font("Times New",Font.BOLD,13));
        labelBalanaceAmount.setFont(new Font("Times New",Font.BOLD,13));
        labelPIN_Number.setFont(new Font("Times New",Font.BOLD,13));
        label$Main.setFont(new Font("Nyala",Font.BOLD,17));
       
        labelCredit_1.setFont(new Font("Times New",Font.BOLD,13));
        labelCredit_2.setFont(new Font("Times New",Font.BOLD,13));
        labelCredit_3.setFont(new Font("Times New",Font.BOLD,13));
        labelCredit_4.setFont(new Font("Times New",Font.BOLD,13));
        labelCredit_5.setFont(new Font("Times New",Font.BOLD,13));
        labelCredit_6.setFont(new Font("Times New",Font.BOLD,13));
        labelCredit_7.setFont(new Font("Times New",Font.BOLD,13));
        labelCredit_8.setFont(new Font("Times New",Font.BOLD,13));
        labelCredit_9.setFont(new Font("Nylen",Font.BOLD,17));
        labelWithdraw$1.setFont(new Font("Times New",Font.BOLD,13));
        labelWithdraw$2.setFont(new Font("Times New",Font.BOLD,13));
        labelWithdraw$3.setFont(new Font("Times New",Font.BOLD,13));
        labelWithdraw$4.setFont(new Font("Tines New",Font.BOLD,13));
        labelWithdraw$5.setFont(new Font("Nyala",Font.BOLD,17));
        label$Title.setFont(new Font("Times New",Font.BOLD,15));
        labellLimit_1.setFont(new Font("Times New",Font.BOLD,13));
        labellLimit_2.setFont(new Font("Times New",Font.BOLD,13));
        labellLimit_3.setFont(new Font("Times New",Font.BOLD,13));
        labelCancelTitle.setFont(new Font("Times New",Font.BOLD,13));
        labelCancel_1.setFont(new Font("Times New",Font.BOLD,13));
       
   }
   public void actionPerformed(ActionEvent e){
       if(e.getSource()==buttonDebitCard)
       {
           if(fieldCardID.getText().isEmpty() || fieldClientName.getText().isEmpty() || fieldIssuerBank.getText().isEmpty() || fieldBankAccount.getText().isEmpty() || fieldBalanaceAmount.getText().isEmpty() || fieldPIN_Number.getText().isEmpty()){
           
               JOptionPane.showMessageDialog(jf,"Textfields can't be empty!!","EmptyTextField",JOptionPane.INFORMATION_MESSAGE);
           
           }
           else{
               try{
              String clientName = fieldClientName.getText();
              String issuerBank = fieldIssuerBank.getText();
              String BankAccount = fieldBankAccount.getText();
              int Cardid = Integer.parseInt(fieldCardID.getText());
              int balanceamount = Integer.parseInt(fieldBalanaceAmount.getText());
              int PinNumber = Integer.parseInt(fieldPIN_Number.getText());
              BankCard debitcard = new DebitCard(balanceamount,Cardid,BankAccount,issuerBank,clientName,PinNumber);
              CardList.add(debitcard);
              JOptionPane.showMessageDialog(jf,"DebitCard added successfully","Complete",JOptionPane.INFORMATION_MESSAGE);
            }
              catch(NumberFormatException ex){
                  JOptionPane.showMessageDialog(jf,"Value don't fits, Try Again!!","EmptyTextField",JOptionPane.INFORMATION_MESSAGE);
              }
             
        }
    }
    if(e.getSource()==buttonEnter){
        frameMainPage.setVisible(false);
        panelMainPage.setVisible(false);
        jf.setVisible(true);
        panel.setVisible(true);
    }
       if(e.getSource()==buttonWithdrawal){
               
            jf.setVisible(false);
             frameWithdraw.setVisible(true);
             panel.setVisible(false);
             panelWithdraw.setVisible(true);    
           }
   
         if(e.getSource()==buttonCreditCard)
        {
             
              jf.setVisible(false);
              frameWithdraw.setVisible(false);
              frameCredit.setVisible(true);
              panel.setVisible(false);
              panelWithdraw.setVisible(false);
              panelCredit.setVisible(true);
        }
         if(e.getSource()==buttonCreditLimit)
        {
           
              jf.setVisible(false);
             frameWithdraw.setVisible(false);
             frameCredit.setVisible(false);
             frameCreditLimit.setVisible(true);
            panel.setVisible(false);
            panelWithdraw.setVisible(false);
            panelCredit.setVisible(false);
            panelCreditLimit.setVisible(true);
        }
        if(e.getSource()==buttonBack1)
        {
            jf.setVisible(true);
            frameWithdraw.setVisible(false);
            panel.setVisible(true);
            panelWithdraw.setVisible(false);
             
        }
        if(e.getSource()==buttonBack3)
        {
             
           jf.setVisible(true);
           frameWithdraw.setVisible(false);
            frameCredit.setVisible(false);
            frameCreditLimit.setVisible(false);
            panel.setVisible(true);
            panelWithdraw.setVisible(false);
            panelCredit.setVisible(false);
            panelCreditLimit.setVisible(false);
        }
        if(e.getSource()==buttonBack4)
        {
           
           jf.setVisible(true);
           frameWithdraw.setVisible(false);
           frameCredit.setVisible(false);
            panel.setVisible(true);
            panelWithdraw.setVisible(false);
            panelCredit.setVisible(false);
        }
        if(e.getSource()==buttonCancelCredit){
             jf.setVisible(false);
             frameWithdraw.setVisible(false);
             frameCredit.setVisible(false);
             frameCreditLimit.setVisible(false);
             frameCancelCredit.setVisible(true);
             panel.setVisible(false);
            panelWithdraw.setVisible(false);
            panelCredit.setVisible(false);
            panelCreditLimit.setVisible(false);
            panelCancleCredit.setVisible(true);
       
        }
        if(e.getSource()==buttonBack2)
        {
           jf.setVisible(true);
           frameWithdraw.setVisible(false);
           frameCredit.setVisible(false);
           frameCreditLimit.setVisible(false);
           frameCancelCredit.setVisible(false);
            panel.setVisible(true);
            panelWithdraw.setVisible(false);
            panelCredit.setVisible(false);
            panelCreditLimit.setVisible(false);
            panelCancleCredit.setVisible(false);
        }
         if(e.getSource()==buttonSubmit1)
        {
            if(fieldWithdraw_1.getText().isEmpty() || fieldWithdraw_3.getText().isEmpty() || fieldWithdraw_2.getText().isEmpty()){
             JOptionPane.showMessageDialog(jf,"Text fields should not be empty","EmptyTextField",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                for(BankCard li:CardList){
                     if(li instanceof DebitCard){
                         if(fieldCardID.getText().equals(fieldWithdraw_1.getText())){
                              try{
                              int Cardid = Integer.parseInt(fieldWithdraw_1.getText());
                              int pinNumber = Integer.parseInt(fieldWithdraw_3.getText());
                              int withdrawalAmount = Integer.parseInt(fieldWithdraw_2.getText());
                              String dateofwithdrawal = (String)comboWithdraw_4.getSelectedItem() + (String)comboWithdraw_5.getSelectedItem() + (String)comboWithdraw_6.getSelectedItem();
                              ((DebitCard)li).withdraw( withdrawalAmount, dateofwithdrawal,pinNumber);
                              JOptionPane.showMessageDialog(jf,"Withdrawal has been sucessfully done","Complete",JOptionPane.INFORMATION_MESSAGE);
                             }
                             catch(NumberFormatException ex){
                                 JOptionPane.showMessageDialog(frameWithdraw,"Seems that the input value is not adequate","EmptyTextField",JOptionPane.INFORMATION_MESSAGE);
                             }
                         }
                         else{
                            JOptionPane.showMessageDialog(frameWithdraw, "Invalid Input", "Invalid Input", JOptionPane.INFORMATION_MESSAGE);
                         }
                         
                     }
                }
            }
}
        if(e.getSource()==buttonSubmit2)
        {
            if(fieldCredit_1.getText().isEmpty() || fieldCredit_2.getText().isEmpty() || fieldCredit_3.getText().isEmpty() || fieldCredit_4.getText().isEmpty() || fieldCredit_5.getText().isEmpty() || fieldCredit_6.getText().isEmpty() || fieldCredit_7.getText().isEmpty()){
            JOptionPane.showMessageDialog(frameCredit,"Text fields can't be empty","EmptyTextField",JOptionPane.INFORMATION_MESSAGE);
           }
              else{  
                try{
                    String clientFullName = fieldCredit_1.getText();
                    String issuerBankName = fieldCredit_2.getText();
                    String bankAccountType = fieldCredit_3.getText();
                    int bankCardId = Integer.parseInt(fieldCredit_5.getText());
                    int balanceAmount = Integer.parseInt(fieldCredit_4.getText());
                    int CVC_number = Integer.parseInt(fieldCredit_6.getText());
                    int interestRate = Integer.parseInt(fieldCredit_7.getText());
                    String expirationDate = (String) comboWithdraw_4.getSelectedItem() + (String) comboWithdraw_5.getSelectedItem() + (String) comboWithdraw_6.getSelectedItem();
                    CreditCard objCard = new  CreditCard( bankCardId, clientFullName, issuerBankName,bankAccountType ,balanceAmount, CVC_number, interestRate,expirationDate);
                    CardList.add(objCard);
                    JOptionPane.showMessageDialog(frameCredit,"Credit added successfully!!","Sucessfull",JOptionPane.INFORMATION_MESSAGE);
                 }
                catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(frameCredit,"Value don't fits, Try Again!!","EmptyTextField",JOptionPane.INFORMATION_MESSAGE);
              }
            }
        }
   
        if(e.getSource()==buttonSubmit3)
        {
             if(tfLimit1.getText().isEmpty() || tfLimit2.getText().isEmpty() || tfLimit3.getText().isEmpty()){
             JOptionPane.showMessageDialog(jf,"Text fields should not be empty","EmptyTextField",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                for(BankCard li: CardList){
                    if(li instanceof CreditCard){
                        if(fieldCredit_5.getText().equals(tfLimit1.getText())){
                            try{
                              int Cardid = Integer.parseInt(tfLimit1.getText());
                              double  newCreditLimit = Double.parseDouble(tfLimit2.getText());
                              int newGracePeriod = Integer.parseInt(tfLimit3.getText());
                              ((CreditCard)li).setCreditLimit(newCreditLimit, newGracePeriod);
                              JOptionPane.showMessageDialog(jf,"CreditLimit has been sucessfully done","Sucessfull",JOptionPane.INFORMATION_MESSAGE);
                            }
                            catch(NumberFormatException ex){
                                JOptionPane.showMessageDialog(frameCreditLimit,"Seems that the input value is not adequate","EmptyTextField",JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(frameCreditLimit, "Invalid Input", "Invalid Input", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
    }
}
        if(e.getSource()==buttonSubmit4)
        {
             if(tfCancel1.getText().isEmpty()){
             JOptionPane.showMessageDialog(jf,"Text fields should not be empty","EmptyTextField",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                for(BankCard li: CardList){
                    if(li instanceof CreditCard){
                        if(fieldCredit_5.getText().equals(tfCancel1.getText())){
                            try{
                              int Cardid = Integer.parseInt(tfCancel1.getText());
                              ((CreditCard)li).cancelCreditCard();
                              JOptionPane.showMessageDialog(jf,"Credit has been sucessfully Cancel","Sucessfull",JOptionPane.INFORMATION_MESSAGE);
                            }
                            catch(NumberFormatException ex){
                                JOptionPane.showMessageDialog(jf,"Seems that the input value is not adequate","EmptyTextField",JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(jf, "Invalid Input", "Invalid Input", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
    }
}
        if(e.getSource()==buttonRemove1){
            fieldWithdraw_1.setText("");
            fieldWithdraw_2.setText("");
            fieldWithdraw_3.setText("");
        }
        if(e.getSource()==buttonRemove2){
            fieldCredit_2.setText("");
            fieldCredit_3.setText("");
            fieldCredit_4.setText("");
            fieldCredit_1.setText("");
            fieldCredit_5.setText("");
            fieldCredit_6.setText("");
            fieldCredit_7.setText("");
        }
        if(e.getSource()==buttonRemove3){
            tfLimit1.setText("");
            tfLimit2.setText("");
            tfLimit3.setText("");
        }
        if(e.getSource()==buttonRemove4){
            tfCancel1.setText("");
        }
        if(e.getSource()==buttonDebitDisplay){
             for(BankCard li:CardList){
                if(li instanceof DebitCard){
                DebitCard debitDis= ((DebitCard)li);              
                debitDis.display();
                break;
                }
            }
        }
        if(e.getSource()==buttonCreditDisplay){
            for(BankCard li:CardList){
                if(li instanceof CreditCard){
                    CreditCard creditDis = ((CreditCard)li);
                    creditDis.display();
                    break;
                }
            }
        }
    }
    public static void main(String[] args){
        UIBank bibekPoudel = new UIBank();
    }
}
