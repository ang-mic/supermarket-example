
package supermarket_SW;

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


/**
 *
 * @author Angelos
 */
public class Employee extends Person{

    /****************************Attributes declaration************************/
    private String positionStatus;
    private float salary;

    //**************Constructor without parameters******************
    public Employee(){
        super();
        salary=0;
        positionStatus="";
    }

    /*********************Constructor with parameters***************************
     *
     *The constructor with parameters is used to create the object with filled
     *attributes, it uses the setters methods to put the information in the
     *attributes.
     *
     **************************************************************************/
    public Employee(String username,String password,String firstname,String lastname,Date DoB,
                    String contactNamber,String email,float salary,String positionStatus,String name,
                    String buildingName, String street, Integer buildingNo, String area,
                    String city, String country, String postcode){

        super(username, password,firstname, lastname,DoB, contactNamber, email,
              name, buildingName, street, buildingNo, area, city, country, postcode);
        setSalary(salary);
        setPositionStatus(positionStatus);
    }
   /****************************Setter methods**********************************
     *
     * The following methods set the attributes of the class Employee.
     * The key word 'final' does not allow to subclasses (if they are exist) to
     * override the setter methods because there is a rule: a constructor
     * should not call methods that can be overridden.
     *
     **************************************************************************/
    //Set salary
    public final void setSalary(float salary){
        if(salary>=0){
            this.salary=salary;
        }
        else{
            JOptionPane.showMessageDialog(null,"Incorrect amount of salary ");
        }
    }

    //Set position satus
    public final void setPositionStatus(String positionStatus){
        this.positionStatus=positionStatus;
    }

    /***************************************************************************
    *                              Getter methods
    ****************************************************************************/
    public float getSalary(){
        return salary;
    }

    public String getPositionStatus(){
        return positionStatus;
    }

    /*****************************Other Methods********************************/

    /*************************Save Employee in file*****************************
     *
     *Saves the user's information to the destination file.
     *
     **************************************************************************/
    @Override
    public void save(String fileName){
        FileWriter addEmployeeDetails = null;

        try{
            addEmployeeDetails = new FileWriter(fileName,true);
            addEmployeeDetails.append(getUsername());
            addEmployeeDetails.append(System.getProperty("line.separator"));
            addEmployeeDetails.append(getPassword());
            addEmployeeDetails.append(System.getProperty("line.separator"));
            addEmployeeDetails.append(getFirstname());
            addEmployeeDetails.append(System.getProperty("line.separator"));
            addEmployeeDetails.append(getLastname());
            addEmployeeDetails.append(System.getProperty("line.separator"));
            addEmployeeDetails.append(DMY.format(getDoB()));//format,convert,save
            addEmployeeDetails.append(System.getProperty("line.separator"));
            addEmployeeDetails.append(getContactNumber());
            addEmployeeDetails.append(System.getProperty("line.separator"));
            addEmployeeDetails.append(getEmail());
            addEmployeeDetails.append(System.getProperty("line.separator"));
            addEmployeeDetails.append(String.valueOf(getSalary()));
            addEmployeeDetails.append(System.getProperty("line.separator"));
            addEmployeeDetails.append(getPositionStatus());
            addEmployeeDetails.append(System.getProperty("line.separator"));
            //************Saves the address in the file.****************
            homeAddress.save(addEmployeeDetails);
            //**********************************************************
            addEmployeeDetails.append("$$$");
            addEmployeeDetails.append(System.getProperty("line.separator"));
            addEmployeeDetails.close();
            addEmployeeDetails = null;

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
                   setSalary(Float.valueOf(bin.readLine()));
                   setPositionStatus(bin.readLine());
                   homeAddress.load(bin);
               }//end if
           }//end while
       bin.close();
       }//end try
       catch (IOException ioe){}//end catch
       catch (ParseException ex) {
                       Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
                   }
    }

    /****************************Display Employee********************************
     *
     *Displays Employee's information at JtextFileds.
     *
     **************************************************************************/
    @Override
    public void display(JPasswordField passFirstnameTextField,
                        JTextField userFirstnameTextField,
                        JTextField userLastnameTextField,
                        JTextField DoBTextField,
                        JTextField contactNumberTextField,
                        JTextField emailTextField,
                        JTextField salaryTextField,
                        JTextField positionStatusTextField,
                        JTextField nameTextField,
                        JTextField buildingNameTextField,
                        JTextField streetTextField,
                        JTextField buildingNoTextField,
                        JTextField areaTextField,
                        JTextField cityTextField,
                        JTextField countryTextField,
                        JTextField postcodeTextField){



                   passFirstnameTextField.setText(getPassword());
                   userFirstnameTextField.setText(getFirstname());
                   userLastnameTextField.setText(getLastname());
                   DoBTextField.setText(DMY.format(getDoB()));
                   contactNumberTextField.setText(getContactNumber());
                   emailTextField.setText(getEmail());
                   salaryTextField.setText(String.valueOf(getSalary()));
                   positionStatusTextField.setText(getPositionStatus());
                   homeAddress.display(nameTextField,buildingNameTextField,streetTextField,
                                       buildingNoTextField,areaTextField,cityTextField,
                                       countryTextField,postcodeTextField);
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
             loadDetails=new FileReader("employees.txt");
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
    @Override
    public void edit(){
       Integer Pointer=0;
       FileWriter editDetails = null;
       ArrayList<String> lineKeeper = saveText();

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
        lineKeeper.set(Pointer+7, String.valueOf(getSalary()));
        lineKeeper.set(Pointer+8, getPositionStatus());
        Pointer=Pointer+9;
        homeAddress.edit(lineKeeper,Pointer);
      }//end if

      try{
            editDetails= new FileWriter("employees.txt",false);
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
            for(int i=1;i<=8;i++){
                lineKeeper.remove(Pointer+1);
            }//end for
            homeAddress.delete(lineKeeper);
        }
        try{
            editDetails= new FileWriter("employees.txt",false);
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
    * This method search employees by first name and last name
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
    * This method gets as parameter an Employee object and clone all the attribute to the object that calls the methods
    *
    ******************************************************************************************************************/
    public void clone(Employee theEmployee) {

        this.setUsername(theEmployee.getUsername());
        this.setPassword(theEmployee.getPassword());
        this.setFirstname(theEmployee.getFirstname());
        this.setLastname(theEmployee.getLastname());
        this.setDoB(theEmployee.getDoB());
        this.setContactNumber(theEmployee.getContactNumber());
        this.setEmail(theEmployee.getEmail());
        this.setSalary(theEmployee.getSalary());
        this.setPositionStatus(theEmployee.getPositionStatus());
        this.homeAddress.clone(theEmployee.getHomeAddress());
    }

    /******************************isEqual method**********************************
    *
    * The following method checks of two objects of class Employee have identical elements (Username, password etc).
    *
    *******************************************************************************/
    public boolean isEqual(Employee theEmployee) {
        boolean equal;

        if (this.username.equals(theEmployee.username) && this.password.equals(theEmployee.password)
            && this.firstname.equals(theEmployee.firstname)
            && this.lastname.equals(theEmployee.lastname) && this.DoB.equals(theEmployee.DoB)
            && this.contactNumber.equals(theEmployee.contactNumber) && this.email.equals(theEmployee.email)
            && (this.salary==theEmployee.salary) && this.positionStatus.equals(theEmployee.positionStatus)
            && this.homeAddress.equals(theEmployee.homeAddress)){
            equal = true;
        } else {
            equal = false;
        }
        return equal;
    }

}
