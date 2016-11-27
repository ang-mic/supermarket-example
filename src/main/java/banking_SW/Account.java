/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package banking_SW;

import supermarket_SW.Customer;
import supermarket_SW.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
/*Instances of the Customer Class which belong to the supermarket_SW package can be used.
class which belong to the supermarket_SW package can be used.*/

/**
 *
 * @author Angelos
 */
public class Account {

    //Utility atrribute for date format
    private static final SimpleDateFormat DMY=new SimpleDateFormat("dd/MM/yyyy");//format

/************************************************Attributes declaration************************************************/
    private String sortCode;
    private String accountNo;
    private Double balance;
    private String nameOfBank;
    private Double rate;
    private Date lastReportedDate;
    private Customer accountHolder;

/********************************************************Constructors**************************************************/
    //Constructor without parameters
    public Account(){
        sortCode="";
        accountNo="";
        balance=0.0;
        nameOfBank="";
        rate=1.2;
        lastReportedDate=new Date();
        accountHolder=null;
    }

    //Constructor with Customer object type as parameter
    public Account(Customer accountHolder){
        this();
        this.accountHolder=accountHolder;
    }

    //Constructor with Customer object type as parameter
    public Account(String sortCode,String accountNo,Double balance,String nameOfBank,Double rate,Customer accountHolder){
                setSortCode(sortCode);
                setAccountNo(accountNo);
                setBalance(balance);
                setNameOfBank(nameOfBank);
                setRate(1.2);
                setLastReportedDate();
                setAccountHolder(accountHolder);

    }
/********************************************************Setters*******************************************************/
    public final void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }

    public final void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public final void setBalance(Double balance) {
        this.balance = balance;
    }

    public final void setNameOfBank(String nameOfBank) {
        this.nameOfBank = nameOfBank;
    }

    public final void setRate(Double rate) {
        this.rate = rate;
    }
    //Set Last Reported Date as the current date
    public final void setLastReportedDate() {
        this.lastReportedDate = new Date();
    }

     //Set Last Reported Date
    public  void setLastReportedDate(Date lastReportedDate ) {
        this.lastReportedDate = lastReportedDate;
    }

    public final void setAccountHolder(Customer accountHolder) {
        this.accountHolder = accountHolder;
    }
/********************************************************Getters*******************************************************/
    public String getSortCode() {
        return sortCode;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public Double getBalance() {
        return balance;
    }

    public String getNameOfBank() {
        return nameOfBank;
    }

    public Double getRate() {
        return rate;
    }

    public Date getLastReportedDate() {
        return lastReportedDate;
    }

    public Customer getAccountHolder() {
        return accountHolder;
    }

/**********************************************************Other Methods***********************************************/
    public void save(){
        FileWriter addCustomerDetails = null;
        String filePath="Accounts"+"/"+accountHolder.getUsername()+"Account.txt";
        try
        {
            addCustomerDetails = new FileWriter(filePath,true);
            addCustomerDetails.append(accountHolder.getUsername());
            addCustomerDetails.append(System.getProperty("line.separator"));
            addCustomerDetails.append(this.getSortCode());
            addCustomerDetails.append(System.getProperty("line.separator"));
            addCustomerDetails.append(this.getAccountNo());
            addCustomerDetails.append(System.getProperty("line.separator"));
            addCustomerDetails.append(String.valueOf(this.getBalance()));
            addCustomerDetails.append(System.getProperty("line.separator"));
            addCustomerDetails.append(this.getNameOfBank());
            addCustomerDetails.append(System.getProperty("line.separator"));
            addCustomerDetails.append(String.valueOf(this.getRate()));
            addCustomerDetails.append(System.getProperty("line.separator"));
            addCustomerDetails.append(DMY.format(this.getLastReportedDate()));
            addCustomerDetails.append(System.getProperty("line.separator"));
            addCustomerDetails.close();
            addCustomerDetails = null;
        }//end try
        catch (IOException ioe){}//end catch
    }

    public void load(){
        String filePath="Accounts"+"/"+accountHolder.getUsername()+"Account.txt";
       FileReader loadDetails;
       String record;

       try{
           loadDetails=new FileReader(filePath);
           BufferedReader bin=new BufferedReader(loadDetails);
           while (((record=bin.readLine()) != null)){
               if ((record).contentEquals(accountHolder.getUsername())){
                    setSortCode(bin.readLine());
                    setAccountNo(bin.readLine());
                    setBalance(Double.parseDouble(bin.readLine()));
                    setNameOfBank(bin.readLine());
                    setRate(Double.parseDouble(bin.readLine()));
                    setLastReportedDate((Date)DMY.parse(bin.readLine()));
               }
           }//end while
       bin.close();
       }//end try
       catch (IOException ioe){}//end catch
       catch (ParseException ex) {
                       Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
                   }
    }

    public void edit(){
        FileWriter addCustomerDetails = null;
        String filePath="Accounts"+"/"+accountHolder.getUsername()+"Account.txt";
        try
        {
            addCustomerDetails = new FileWriter(filePath,false);
            addCustomerDetails.append(accountHolder.getUsername());
            addCustomerDetails.append(System.getProperty("line.separator"));
            addCustomerDetails.append(this.getSortCode());
            addCustomerDetails.append(System.getProperty("line.separator"));
            addCustomerDetails.append(this.getAccountNo());
            addCustomerDetails.append(System.getProperty("line.separator"));
            addCustomerDetails.append(String.valueOf(this.getBalance()));
            addCustomerDetails.append(System.getProperty("line.separator"));
            addCustomerDetails.append(this.getNameOfBank());
            addCustomerDetails.append(System.getProperty("line.separator"));
            addCustomerDetails.append(String.valueOf(this.getRate()));
            addCustomerDetails.append(System.getProperty("line.separator"));
            addCustomerDetails.append(DMY.format(this.getLastReportedDate()));
            addCustomerDetails.append(System.getProperty("line.separator"));
            addCustomerDetails.close();
            addCustomerDetails = null;
        }//end try
        catch (IOException ioe){}//end catch
    }

    public void create(){
        this.setSortCode("1222211111");
        this.setAccountNo("2222222222");
        this.setBalance(balance);
        this.setNameOfBank("HSBC");
        this.setRate(1.2);
        this.setLastReportedDate();

        this.edit();
    }

    public void display(javax.swing.JTextField sortCodeTextField,javax.swing.JTextField accountNoTextField,
                        javax.swing.JTextField bankNameTextField,javax.swing.JTextField rateTextField,
                        javax.swing.JTextField accountHolderTextField,javax.swing.JTextField lastTransactionTextField,
                        javax.swing.JTextField balanceTextField){
        sortCodeTextField.setText(this.getSortCode());
        accountNoTextField.setText(this.getAccountNo());
        bankNameTextField.setText(this.getNameOfBank());
        rateTextField.setText(String.valueOf(this.getRate()));
        accountHolderTextField.setText(this.getAccountHolder().getLastname()+" "+this.getAccountHolder().getLastname());
        lastTransactionTextField.setText(DMY.format(this.getLastReportedDate()));
        balanceTextField.setText(String.valueOf(this.getBalance()));
    }

    public void withdraw(Double amount){
        double newBalance = this.getBalance() - amount;
        this.setBalance(newBalance);

        this.edit();
    }

    public void deposit(Double amount){
        double newBalance = this.getBalance() + amount;
        this.setBalance(newBalance);

        this.edit();
    }

}
