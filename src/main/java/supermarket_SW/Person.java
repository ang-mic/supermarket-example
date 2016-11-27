package supermarket_SW;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Angelos
 */
public class Person implements Utilities {

    //Utility atrribute for date format
    protected static final SimpleDateFormat DMY = new SimpleDateFormat("dd/MM/yyyy");//format

    /****************************Attributes declaration************************/
    protected String username, password, firstname, lastname, email, contactNumber;
    protected Date    DoB;
    protected Address homeAddress;

    //**************Constructor without parameters******************
    public Person() {
        username = "";
        password = "";
        firstname = "";
        lastname = "";
        DoB = new Date();
        contactNumber = "";
        email = "";
        homeAddress = new Address();
    }

    /*********************Constructor with parameters***************************
     *
     *The constructor with parameters is used to create the object with filled
     *attributes, it uses the setters methods to put the information in the
     *attributes.
     *
     **************************************************************************/
    public Person(String username, String password, String firstname, String lastname, Date DoB, String contactNamber, String email, String name, String buildingName, String street, Integer buildingNo, String area, String city, String country, String postcode) {

        setUsername(username);
        setPassword(password);
        setFirstname(firstname);
        setLastname(lastname);
        setDoB(DoB);
        setContactNumber(contactNamber);
        setEmail(email);
        setHomeAddress(name, buildingName, street, buildingNo, area, city, country, postcode);
    }

    /****************************Setter methods**********************************
     *
     * The following methods set the attributes of the class Person.
     * The key word 'final' does not allow to subclasses to
     * override the setter methods because there is a rule: a constructor
     * should not call methods that can be overridden.
     *
     **************************************************************************/

    //Set username
    public final void setUsername(String username) {
        if (!username.equals("")) {
            this.username = username;
        }
        else {
            JOptionPane.showMessageDialog(null, "Incorrect Username");
        }
    }

    //Set password
    public final void setPassword(String password) {
        if (!password.equals("")) {
            this.password = password;
        }
        else {
            JOptionPane.showMessageDialog(null, "Incorrect Password");
        }
    }

    //Set firstname
    public final void setFirstname(String firstname) {
        if (firstname.matches("[a-zA-Z]+")) {
            this.firstname = firstname;
        }
        else {
            JOptionPane.showMessageDialog(null, "Incorrect Firstname");
        }
    }

    //Set lastname
    public final void setLastname(String lastname) {
        if (firstname.matches("[a-zA-Z]+")) {
            this.lastname = lastname;
        }
        else {
            JOptionPane.showMessageDialog(null, "Incorrect Lastname");
        }
    }

    //Set DoB
    public final void setDoB(Date DoB) {
        this.DoB = DoB;
    }

    //Set contactNumber
    public final void setContactNumber(String contactNumber) {
        if (contactNumber.matches("[0-9]+")) {
            this.contactNumber = contactNumber;
        }
        else {
            JOptionPane.showMessageDialog(null, "Incorrect Phone");
        }
    }

    //Set email
    public final void setEmail(String email) {
        if (!email.equals("")) {
            this.email = email;
        }
        else {
            this.email = "-";
        }
    }

    //Set full address
    public final void setHomeAddress(String name, String buildingName, String street, Integer buildingNo, String area, String city, String country, String postcode) {

        this.homeAddress = new Address(name, buildingName, street, buildingNo, area, city, country, postcode);
    }

    /***************************************************************************
     *                              Getter methods
     **************************************************************************/
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public Date getDoB() {
        return DoB;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    /*****************************Other Methods********************************/

    /*************************Save Person in file*****************************
     *
     *Saves the Person's information to the destination file.
     *
     **************************************************************************/
    @Override
    public void save(String fileName) {
        FileWriter addPersonDetails = null;

        try {
            addPersonDetails = new FileWriter(fileName, true);
            addPersonDetails.append(getUsername());
            addPersonDetails.append(System.getProperty("line.separator"));
            addPersonDetails.append(getPassword());
            addPersonDetails.append(System.getProperty("line.separator"));
            addPersonDetails.append(getFirstname());
            addPersonDetails.append(System.getProperty("line.separator"));
            addPersonDetails.append(getLastname());
            addPersonDetails.append(System.getProperty("line.separator"));
            addPersonDetails.append(DMY.format(getDoB()));
            addPersonDetails.append(System.getProperty("line.separator"));
            addPersonDetails.append(getContactNumber());
            addPersonDetails.append(System.getProperty("line.separator"));
            addPersonDetails.append(getEmail());
            addPersonDetails.append(System.getProperty("line.separator"));
            //************Saves the address in the file.****************
            getHomeAddress().save(addPersonDetails);
            //**********************************************************
            addPersonDetails.append("$$$");
            addPersonDetails.append(System.getProperty("line.separator"));
            addPersonDetails.close();
            addPersonDetails = null;

        }//end try
        catch (IOException ioe) {
        }//end catch
    }

    /*************************Save username in file*****************************
     *
     *Saves the user's username to another file which include only the usernames
     * of all users.
     *
     **************************************************************************/
    public void saveUsername(String fileName) {
        FileWriter addUsename = null;
        try {
            addUsename = new FileWriter(fileName, true);
            addUsename.append(getUsername());
            addUsename.append(System.getProperty("line.separator"));
            addUsename.close();
            addUsename = null;

        }//end try
        catch (IOException ioe) {
        }//end catch
    }

    /****************************Load details***********************************
     *
     *Loads person details from the text file
     *
     **************************************************************************/
    @Override
    public void load(String keyWord, String fileName) {
        FileReader loadDetails;
        String     record;
        try {
            loadDetails = new FileReader(fileName);
            BufferedReader bin = new BufferedReader(loadDetails);
            while (((record = bin.readLine()) != null)) {
                if ((record).contentEquals(keyWord)) {
                    setUsername(record);
                    setPassword(bin.readLine());
                    setFirstname(bin.readLine());
                    setLastname(bin.readLine());
                    setDoB((Date) DMY.parse(bin.readLine()));
                    setContactNumber(bin.readLine());
                    setEmail(bin.readLine());
                    homeAddress.load(bin);
                }//end if
            }//end while
            bin.close();
        }//end try
        catch (IOException ioe) {
        }//end catch
        catch (ParseException ex) {
            Logger.getLogger(Product.class.getName())
                  .log(Level.SEVERE, null, ex);
        }
    }

    /****************************Display Person********************************
     *
     *Displays Person's information at JtextFileds.
     *
     **************************************************************************/
    public void display(JPasswordField passFirstnameTextField, JTextField userFirstnameTextField, JTextField userLastnameTextField, JTextField DoBTextField, JTextField contactNumberTextField, JTextField emailTextField, JTextField salaryTextField, JTextField positionStatusTextField, JTextField nameTextField, JTextField buildingNameTextField, JTextField streetTextField, JTextField buildingNoTextField, JTextField areaTextField, JTextField cityTextField, JTextField countryTextField, JTextField postcodeTextField) {

        SimpleDateFormat DMY = new SimpleDateFormat("dd/MM/yyyy");//format

        passFirstnameTextField.setText(getPassword());
        userFirstnameTextField.setText(getFirstname());
        userLastnameTextField.setText(getLastname());
        DoBTextField.setText(DMY.format(getDoB()));
        contactNumberTextField.setText(getContactNumber());
        emailTextField.setText(getEmail());
        salaryTextField.setText("-");
        positionStatusTextField.setText("-");
        homeAddress.display(nameTextField, buildingNameTextField, streetTextField, buildingNoTextField, areaTextField,
                            cityTextField, countryTextField, postcodeTextField);
    }

    /******************************Edit method**********************************
     *
     * Allow to user to change the information of employee's profile.
     *
     **************************************************************************/

    //This method put each line of a text fil into an ArrayList of stings
    private ArrayList<String> saveText() {
        FileReader loadDetails = null;
        String     record;
        record = null;

        //Create an ArrayList to store the lines from text file
        ArrayList<String> lineKeeper = new ArrayList<String>();

        try {
            loadDetails = new FileReader("otherUsers.txt");
            BufferedReader bin = new BufferedReader(loadDetails);
            record = new String();
            while (((record = bin.readLine()) != null)) {//Read the file and store it into the ArrayList line by line*
                lineKeeper.add(record);
            }//end while
            bin.close();
            bin = null;
        }//end try
        catch (IOException ioe) {
        }//end catc

        return lineKeeper;

    }

    //The following method take the ArrayList from the method above and finish the editing.
    public void edit() {
        Integer           Pointer     = 0;
        FileWriter        editDetails = null;
        ArrayList<String> lineKeeper  = this.saveText();
      /* Search into the list to find the Username, if it founds it, changes the
       * old information with the new information.
       * Search*/
        if (lineKeeper.contains(getUsername())) {
            Pointer = lineKeeper.indexOf(getUsername());

            //Write the new information
            lineKeeper.set(Pointer + 1, getPassword());
            lineKeeper.set(Pointer + 2, getFirstname());
            lineKeeper.set(Pointer + 3, getLastname());
            lineKeeper.set(Pointer + 4, DMY.format(getDoB()));
            lineKeeper.set(Pointer + 5, getContactNumber());
            lineKeeper.set(Pointer + 6, getEmail());
            Pointer = Pointer + 7;
            homeAddress.edit(lineKeeper, Pointer);
        }//end if

        try {
            editDetails = new FileWriter("otherUsers.txt", false);
            for (int i = 0; i < lineKeeper.size(); i++) {
                editDetails.append(lineKeeper.get(i));
                editDetails.append(System.getProperty("line.separator"));
            }//end for
            editDetails.close();
            editDetails = null;
        }//end try
        catch (IOException ioe) {
        }//end catch
    }

    /******************************Delete method**********************************
     *
     * Delete an existing employee
     *
     **************************************************************************/
    public void delete() {
        Integer           Pointer     = 0;
        FileWriter        editDetails = null;
        ArrayList<String> lineKeeper  = saveText();

        if (lineKeeper.contains(getUsername())) {
            Pointer = lineKeeper.indexOf(getUsername());
            Pointer = Pointer - 1;
            for (int i = 1; i <= 6; i++) {
                lineKeeper.remove(Pointer + 1);
            }//end for
            homeAddress.delete(lineKeeper);
        }
        try {
            editDetails = new FileWriter("otherUsers.txt", false);
            for (int i = 0; i < lineKeeper.size(); i++) {
                editDetails.append(lineKeeper.get(i));
                editDetails.append(System.getProperty("line.separator"));
            }//end for
            editDetails.close();
            editDetails = null;
        }//end try
        catch (IOException ioe) {
        }//end catch
    }

    /**********************************************Search method*********************************************************
     *
     * This method search user by first name and last name
     *
     ******************************************************************************************************************/
    public void search(String firstName, String lastName, String fileName) {
        int               Pointer;
        ArrayList<String> lineKeeper = saveText();
       /* Search into the list to find the firstname, if it founds
       * old information and then rewrite new inforamtion
       * Search and remove*/
        if (lineKeeper.contains(firstName)) {
            Pointer = lineKeeper.indexOf(firstName);
            if (lineKeeper.get(Pointer + 1)
                          .equals(lastName)) {
                this.load(lineKeeper.get(Pointer - 3), fileName);
            }
        }
    }

    /**********************************************Clone method*********************************************************
     *
     * This method gets as parameter an Person object and clone all the attribute to the object that calls the methods
     *
     ******************************************************************************************************************/
    public void clone(Person thePerson) {

        this.setUsername(thePerson.getUsername());
        this.setPassword(thePerson.getPassword());
        this.setFirstname(thePerson.getFirstname());
        this.setLastname(thePerson.getLastname());
        this.setDoB(thePerson.getDoB());
        this.setContactNumber(thePerson.getContactNumber());
        this.setEmail(thePerson.getEmail());
        this.homeAddress.clone(thePerson.getHomeAddress());
    }

    /***************************************************isEqual method**************************************************
     *
     * The following method checks of two objects of class Employee have identical elements (Username, password etc).
     *
     *******************************************************************************************************************/
    public boolean isEqual(Person thePerson) {
        boolean equal;

        if (this.username.equals(thePerson.username) && this.password.equals(
                thePerson.password) && this.lastname.equals(thePerson.lastname) && this.DoB.equals(
                thePerson.DoB) && this.contactNumber.equals(thePerson.contactNumber) && this.email.equals(
                thePerson.email) && this.homeAddress.equals(thePerson.homeAddress)) {
            equal = true;
        }
        else {
            equal = false;
        }
        return equal;
    }

    /***************************************************isUser method**************************************************
     *
     * The following method checks if the person who try to have access to the system, is registered.
     *
     *******************************************************************************************************************/
    public boolean isUser(JTextField userUsernameTextField, JPasswordField userPasswordField, String fileName) {
        boolean    isFound = false;
        String     record  = null;
        FileReader check   = null;
        try {
            check = new FileReader(fileName);
            BufferedReader bin = new BufferedReader(check);
            record = new String();

            while ((record = bin.readLine()) != null) {
                if ((userUsernameTextField.getText()
                                          .contentEquals(record)) && (!userUsernameTextField.getText()
                                                                                            .equals(""))) {
                    record = bin.readLine();
                    if ((userPasswordField.getText()
                                          .contentEquals(record)) && (!userPasswordField.getText()
                                                                                        .equals(""))) {
                        isFound = true;
                    }//end if
                }//end outer if
            }//end while
            bin.close();
            bin = null;

        }//end try
        catch (IOException ioe) {
            userUsernameTextField.setText("IOProblem");
            userPasswordField.setText("IOProblem");
        }//end catch
        return isFound;
    }
}
