
package supermarket_SW;

import banking_SW.Account;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
/*Instances of the Account Class which belong to the supermarket_SW package can be used.
class which belong to the supermarket_SW package can be used.*/


/**
 *
 * @author Angelos
 */
public class Customer extends Person{

    /****************************Attributes declaration************************/
    private String   cardHolder;
    private Integer  cardNumber;
    private Integer  securityCode;
    private Basket   basket;
    private WishList wishList;
    private Account  ownedAccount;


    //Default constructor
    public Customer() {
        super();
        cardHolder="";
        cardNumber=0;
        securityCode=0;
        basket=new Basket();
        wishList=new WishList(this);
        ownedAccount=new Account(this);
    }

    //Comnstructor with parameters. It takes an ArrayList to set the WishList and all the parameters to set the ownedAaccount
    public Customer(String cardHolder, Integer cardNumber, Integer securityCode, ArrayList arrayWishList, String sortCode,
                    String accountNo, Double balance, String nameOfBank, Double rate, Customer accountHolder,
                    String username, String password, String firstname, String lastname, Date DoB, String contactNumber,
                    String email, String name, String buildingName, String street, Integer buildingNo, String area,
                    String city, String country, String postcode) {

        super(username, password, firstname, lastname,DoB, contactNumber, email, name, buildingName,
                street, buildingNo, area, city, country, postcode);

        setCardHolder(cardHolder);
        setCardNumber(cardNumber);
        setSecurityCode(securityCode);
        setWishList(arrayWishList);
        setAccount(sortCode, accountNo, balance, nameOfBank, rate);
        setBasket();
    }
    //Comnstructor with parameters. It takes a WhisList object to set the wishList and an Account object to set the ownedAccount
    public Customer(String cardHolder, Integer cardNumber, Integer securityCode, WishList wishList, Account ownedAccount,
                    String username, String password, String firstname, String lastname, Date DoB, String contactNumber,
                    String email, String name, String buildingName, String street, Integer buildingNo, String area,
                    String city, String country, String postcode) {

        super(username, password, firstname, lastname,DoB, contactNumber, email, name, buildingName,
                street, buildingNo, area, city, country, postcode);

        setCardHolder(cardHolder);
        setCardNumber(cardNumber);
        setSecurityCode(securityCode);
        setWishList(wishList);
        setAccount(ownedAccount);
        setBasket();
    }

    //Comnstructor with parameters. It Creats an empty WishList and Account
    public Customer(String cardHolder, Integer cardNumber, Integer securityCode,
                    String username, String password,String firstname, String lastname, Date DoB, String contactNumber,
                    String email,String name, String buildingName, String street, Integer buildingNo, String area,
                    String city,String country, String postcode) {

        super(username, password, firstname, lastname,DoB, contactNumber, email, name, buildingName,
                street, buildingNo, area, city, country, postcode);

        setCardHolder(cardHolder);
        setCardNumber(cardNumber);
        setSecurityCode(securityCode);
        setWishList();
        setAccount();
        setBasket();
    }
     /*****************************************************Setter methods***********************************************
     *
     * The following methods set the attributes of the class Customer.
     * The key word 'final' does not allow to subclasses to
     * override the setter methods because there is a rule: a constructor
     * should not call methods that can be overridden.
     *
     ******************************************************************************************************************/
    public final void setCardHolder(String cardHolder) {
        if(cardHolder.matches("[a-zA-Z]+")){
            this.cardHolder = cardHolder;
        }
        else{
            JOptionPane.showMessageDialog(null,"Incorrect Card holder");
        }
    }

    public final void setCardNumber(Integer cardNumber) {
           this.cardNumber = cardNumber;
    }

    public final void setSecurityCode(Integer securityCode) {
            this.securityCode = securityCode;
    }

    public final void setBasket(){
        basket=new Basket();
    }
    //Uses an ArrayList to set the WishList
    public final void setWishList(ArrayList<Product> wishList){
        this.wishList=new WishList(wishList, this);
    }
    //Uses a WhishList object to set the WishList
    public final void setWishList(WishList wishList){
        this.wishList=wishList;
    }
    //Set only the Customer in WishList
    public final void setWishList(){
        this.wishList=new WishList(this);
    }

    //Uses a Account object to set the ownedAccount
    public final void setAccount(Account ownedAccount){
        this.ownedAccount=ownedAccount;
    }

    //Set only the Customer in ownedAccount
    public final void setAccount(){
        this.ownedAccount=new Account(this);
    }
    //Set the ownedAccount and all its attributs.
    public final void setAccount(String sortCode,String accountNo,Double balance,String nameOfBank,Double rate){
        this.ownedAccount=new Account(sortCode, accountNo, balance, nameOfBank, rate, this);
    }
    /***************************************************************************
    *                              Getter methods
    ****************************************************************************/
    public String getCardHolder() {
        return cardHolder;
    }

    public Integer getCardNumber() {
        return cardNumber;
    }

    public Integer getSecurityCode() {
        return securityCode;
    }

    public Basket getBasket(){
        return basket;
    }
    public WishList getWishList(){
        return wishList;
    }

    public Account getOwnedAccount() {
        return ownedAccount;
    }

    /*****************************Other Methods********************************/

    /*************************Save Employee in file*****************************
     *
     *Saves the user's information to the destination file.
     *
     **************************************************************************/
    @Override
    public void save(String fileName){
        FileWriter addCustomerDetails = null;

        try{
            addCustomerDetails = new FileWriter(fileName,true);
            addCustomerDetails.append(getUsername());
            addCustomerDetails.append(System.getProperty("line.separator"));
            addCustomerDetails.append(getPassword());
            addCustomerDetails.append(System.getProperty("line.separator"));
            addCustomerDetails.append(getFirstname());
            addCustomerDetails.append(System.getProperty("line.separator"));
            addCustomerDetails.append(getLastname());
            addCustomerDetails.append(System.getProperty("line.separator"));
            addCustomerDetails.append(DMY.format(getDoB()));//format,convert,save
            addCustomerDetails.append(System.getProperty("line.separator"));
            addCustomerDetails.append(getContactNumber());
            addCustomerDetails.append(System.getProperty("line.separator"));
            addCustomerDetails.append(getEmail());
            addCustomerDetails.append(System.getProperty("line.separator"));
            addCustomerDetails.append(getCardHolder());
            addCustomerDetails.append(System.getProperty("line.separator"));
            addCustomerDetails.append(String.valueOf(getCardNumber()));
            addCustomerDetails.append(System.getProperty("line.separator"));
            addCustomerDetails.append(String.valueOf(getSecurityCode()));
            addCustomerDetails.append(System.getProperty("line.separator"));
            //************Saves the address in the file.****************
            homeAddress.save(addCustomerDetails);
            //**********************************************************
            addCustomerDetails.append("$$$");
            addCustomerDetails.append(System.getProperty("line.separator"));
            addCustomerDetails.close();
            addCustomerDetails = null;
            this.getWishList().save();//Saves the wish list
            this.getOwnedAccount().save();//Saves the account into a text file
        }//end try
        catch (IOException ioe){}//end catch
    }

     /****************************Load details***********************************
     *
     *Loads employee details from the text file
     *
     **************************************************************************/
    @Override
    public void load(String keyWord, String fileName){
       FileReader loadDetails;
       String record;
       try{
           loadDetails=new FileReader(fileName);
           BufferedReader bin=new BufferedReader(loadDetails);
           while (((record=bin.readLine()) != null)){
               if ((record).contentEquals(keyWord)){
                   setUsername(record);
                   setPassword(bin.readLine());
                   setFirstname(bin.readLine());
                   setLastname(bin.readLine());
                   setDoB((Date)DMY.parse(bin.readLine()));
                   setContactNumber(bin.readLine());
                   setEmail(bin.readLine());
                   setCardHolder(bin.readLine());
                   setCardNumber(Integer.valueOf(bin.readLine()));
                   setSecurityCode(Integer.valueOf(bin.readLine()));
                   getHomeAddress().load(bin);
                   getWishList().load(this.getUsername());
                   getOwnedAccount().load();

               }//end if
           }//end while
       bin.close();
       }//end try

       catch (IOException ioe){}//end catch
       catch (ParseException ex) {
                       Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
                   }

    }

    /****************************Display Customer********************************
     *
     *Displays Customer's information at JtextFileds.
     *
     **************************************************************************/
    public void display(JPasswordField userPassTextField,
                        JTextField userFirstnameTextField,
                        JTextField userLastnameTextField,
                        JTextField DoBTextField,
                        JTextField contactNumberTextField,
                        JTextField emailTextField,
                        JTextField cardHolderTextField,
                        JTextField cardNumbeTextField,
                        JTextField securityCodeTextField,
                        JTextField nameTextField,
                        JTextField buildingNameTextField,
                        JTextField streetTextField,
                        JTextField buildingNoTextField,
                        JTextField areaTextField,
                        JTextField cityTextField,
                        JTextField countryTextField,
                        JTextField postcodeTextField,
                        JTable wishListTable){



                   userPassTextField.setText(getPassword());
                   userFirstnameTextField.setText(getFirstname());
                   userLastnameTextField.setText(getLastname());
                   DoBTextField.setText(DMY.format(getDoB()));
                   contactNumberTextField.setText(getContactNumber());
                   emailTextField.setText(getEmail());
                   cardHolderTextField.setText(getCardHolder());
                   cardNumbeTextField.setText(String.valueOf(getCardNumber()));
                   securityCodeTextField.setText(String.valueOf(getSecurityCode()));
                   getHomeAddress().display(nameTextField,buildingNameTextField,streetTextField,
                                       buildingNoTextField,areaTextField,cityTextField,
                                       countryTextField,postcodeTextField);
                   getWishList().display(wishListTable);
    }

    /******************************Edit method**********************************
     *
     * Allow to user to change the information of employee's profile.
     *
     **************************************************************************/

    //This method put each line of a text fil into an ArrayList of stings
    private ArrayList<String> saveText(){
       FileReader loadDetails = null;
       String record;
        record = null;

       //Create an ArrayList to store the lines from text file
       ArrayList<String> lineKeeper = new ArrayList<String>();

      try{
             loadDetails=new FileReader("customers.txt");
             BufferedReader bin=new BufferedReader (loadDetails);
             record=new String();
             while (((record=bin.readLine()) != null)){//Read the file and store it into the ArrayList line by line*
                 lineKeeper.add(record);
             }//end while
             bin.close();
             bin=null;
      }//end try
      catch (IOException ioe) {}//end catc

      return lineKeeper;
    }

    //The following method take the ArrayList from the method above and finish the editing.
//    @Override
    @Override
    public void edit(){
       Integer Pointer=0;
       FileWriter editDetails = null;
       ArrayList<String> lineKeeper = this.saveText();

      /* Search into the list to find the Username, if it founds it, changes the
       * old information with the new information.
       * Search*/
      if(lineKeeper.contains(getUsername())){
            Pointer=lineKeeper.indexOf(getUsername());

        //Write the new information
        lineKeeper.set(Pointer+1, getPassword());
        lineKeeper.set(Pointer+2, getFirstname());
        lineKeeper.set(Pointer+3, getLastname());
        lineKeeper.set(Pointer+4, DMY.format(getDoB()));
        lineKeeper.set(Pointer+5, getContactNumber());
        lineKeeper.set(Pointer+6, getEmail());
        lineKeeper.set(Pointer+7, getCardHolder());
        lineKeeper.set(Pointer+8, String.valueOf(getCardNumber()));
        lineKeeper.set(Pointer+9, String.valueOf(getSecurityCode()));
        Pointer=Pointer+10;
        homeAddress.edit(lineKeeper,Pointer);
      }//end if

      try{
            editDetails= new FileWriter("customers.txt",false);
            for( int i=0;i<lineKeeper.size();i++){
                editDetails.append(lineKeeper.get(i));
                editDetails.append(System.getProperty("line.separator"));
            }//end for
            editDetails.close();
            editDetails = null;
        }//end try
        catch (IOException ioe) {}//end catch
    }

    /******************************Delete method**********************************
     *
     * Delete an existing employee
     *
     **************************************************************************/
    @Override
    public void delete(){
        Integer Pointer=0;
        FileWriter editDetails = null;
        ArrayList<String> lineKeeper = saveText();

        if(lineKeeper.contains(getUsername())){
            Pointer=lineKeeper.indexOf(getUsername());
            Pointer=Pointer-1;
            for(int i=1;i<=9;i++){
                lineKeeper.remove(Pointer+1);
            }//end for
            homeAddress.delete(lineKeeper);
        }
        try{
            editDetails= new FileWriter("customers.txt",false);
            for( int i=0;i<lineKeeper.size();i++){
                editDetails.append(lineKeeper.get(i));
                editDetails.append(System.getProperty("line.separator"));
            }//end for
            editDetails.close();
            editDetails = null;
        }//end try
        catch (IOException ioe) {}//end catch
    }

    /**********************************************Search method*********************************************************
    *
    * This method search customers by first name and last name
    *
    ******************************************************************************************************************/
    @Override
    public void search(String firstName,String lastName,String fileName){
        int Pointer;
        ArrayList<String> lineKeeper = saveText();
       /* Search into the list to find the firstname, if it founds
       * old information and then rewrite new inforamtion
       * Search and remove*/
      if(lineKeeper.contains(firstName)){
            Pointer=lineKeeper.indexOf(firstName);
            if(lineKeeper.get(Pointer+1).equals(lastName)){
                this.load(lineKeeper.get(Pointer-3),fileName);
            }
      }
    }

    /**********************************************Clone method*********************************************************
    *
    * This method gets as parameter an Customer object and clone all the attribute to the object that calls the methods
    *
    ******************************************************************************************************************/
    public void clone(Customer theCustomer) {

        this.setUsername(theCustomer.getUsername());
        this.setPassword(theCustomer.getPassword());
//        this.setID(theCustomer.getID());
        this.setFirstname(theCustomer.getFirstname());
        this.setLastname(theCustomer.getLastname());
       // this.setDoB(null);
        this.setContactNumber(theCustomer.getContactNumber());
        this.setEmail(theCustomer.getEmail());
        this.setCardHolder(theCustomer.getCardHolder());
        this.setCardNumber(theCustomer.getCardNumber());
        this.setSecurityCode(theCustomer.getSecurityCode());
        this.homeAddress.clone(theCustomer.getHomeAddress());
    }
     /******************************isEqual method**********************************
    *
    * The following method checks of two objects of class Employee have identical elements (Username, password etc).
    *
    *******************************************************************************/
    public boolean isEqual(Customer theCustomer) {
        boolean equal;

        if (this.username.equals(theCustomer.username) && this.password.equals(theCustomer.password)
            && this.firstname.equals(theCustomer.firstname)
            && this.lastname.equals(theCustomer.lastname) && this.DoB.equals(theCustomer.DoB)
            && this.contactNumber.equals(theCustomer.contactNumber) && this.email.equals(theCustomer.email)
            && (this.cardHolder.equals(theCustomer.cardHolder)) && (this.cardNumber==theCustomer.cardNumber)
            &&(this.securityCode==theCustomer.securityCode) && this.homeAddress.equals(theCustomer.homeAddress)){
            equal = true;
        } else {
            equal = false;
        }
        return equal;
    }
}
