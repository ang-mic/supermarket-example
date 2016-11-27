
package supermarket_SW;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Angelos
 */
public class Supplier {
    private String companyName,contactNumber;
    private Address companyAddress;

    //Constructor without parameters
    public Supplier(){
        companyName="";
        contactNumber="";
        companyAddress=new Address();
    }

    //Constructor with parameters
    public Supplier(String companyName,String contactNumber,String name, String buildingName, String street,
                    Integer buildingNo, String area,String city, String country, String postcode){

        setCompanyName(companyName);
        setContactNumber(contactNumber);
        setCompanyAddress(name,buildingName,street,buildingNo,area,city,country,postcode);
    }

    //*************************************************Setter methods***************************************************

     //Set company name
    public final void setCompanyName(String companyName){
        this.companyName=companyName;
    }

    //Set contact number
    public final void setContactNumber(String contactNumber){
            this.contactNumber=contactNumber;
    }

    //Set comapny address
    public final void setCompanyAddress(String name, String buildingName, String street, Integer buildingNo, String area,
                                     String city, String country, String postcode){

        this.companyAddress=new Address(name, buildingName, street, buildingNo, area, city, country, postcode);
    }

    //*************************************************Getter methods***************************************************

    //Get company name
    public String getCompanyName(){
        return companyName;
    }

    //Get contact number
    public String getContactNumber(){
        return contactNumber;
    }

    public Address getCompanyAddress(){
        return companyAddress;
    }

    //*************************************************Save method******************************************************
    public void save(String fileName){
        FileWriter addUserDetails = null;
        try{
            addUserDetails = new FileWriter(fileName,true);
            addUserDetails.append(getCompanyName());
            addUserDetails.append(System.getProperty("line.separator"));
            addUserDetails.append(getContactNumber());
            addUserDetails.append(System.getProperty("line.separator"));
            //************Saves the address in the file.****************
            companyAddress.save(addUserDetails);
            //**********************************************************
            addUserDetails.append("$$$");
            addUserDetails.append(System.getProperty("line.separator"));
            addUserDetails.close();
            addUserDetails = null;
        }//end try
        catch (IOException ioe){}//end catch
    }

    //*******************************************Save company name method***********************************************
    public void saveCompanyName(String fileName){
        FileWriter addCompany = null;
        try{
            addCompany = new FileWriter(fileName,true);
            addCompany.append(getCompanyName());
            addCompany.append(System.getProperty("line.separator"));
            addCompany.close();
            addCompany = null;

        }//end try
        catch (IOException ioe){}//end catch
    }

    //*************************************************Load method******************************************************
    public void load(String companyName){
       FileReader loadDetails;
       String record;
       try{
           loadDetails=new FileReader("suppliers.txt");
           BufferedReader bin=new BufferedReader(loadDetails);
           while (((record=bin.readLine()) != null)){
               if ((record).contentEquals(companyName)){
                   setCompanyName(record);
                   setContactNumber(bin.readLine());
                   companyAddress.load(bin);
               }//end if
           }//end while
       bin.close();
       }//end try
       catch (IOException ioe){}//end catch
    }

    //*************************************************Display method***************************************************
    public void display(javax.swing.JPasswordField companyNameTextField,
                        javax.swing.JTextField contactNumberTextField,
                        javax.swing.JTextField nameTextField,
                        javax.swing.JTextField buildingNameTextField,
                        javax.swing.JTextField streetTextField,
                        javax.swing.JTextField buildingNoTextField,
                        javax.swing.JTextField areaTextField,
                        javax.swing.JTextField cityTextField,
                        javax.swing.JTextField countryTextField,
                        javax.swing.JTextField postcodeTextField){

                   companyNameTextField.setText(getCompanyName());
                   contactNumberTextField.setText(getContactNumber());
                   companyAddress.display(nameTextField,buildingNameTextField,streetTextField,
                                       buildingNoTextField,areaTextField,cityTextField,
                                       countryTextField,postcodeTextField);
    }

    /******************************Edit method**********************************
     *
     * Allow to user to change the information of supplier's profile.
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
             loadDetails=new FileReader("suplliers.txt");
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
    public void edit(){
       int Pointer;
       FileWriter editDetails = null;
       ArrayList<String> lineKeeper = saveText();
      /* Search into the list to find the company name, if it founds it, changes the
       * old information with the new inforamtion.
       * Search*/
      if(lineKeeper.contains(getCompanyName())){
            Pointer=lineKeeper.indexOf(getCompanyName());

        //Write the new information
        lineKeeper.set(Pointer+1, getContactNumber());
        Pointer=Pointer+2;
        companyAddress.edit(lineKeeper,Pointer);
      }//end if

      try{
            editDetails= new FileWriter("suppliers.txt",false);
            for( int i=0;i<lineKeeper.size();i++){
                editDetails.append(lineKeeper.get(i));
                editDetails.append(System.getProperty("line.separator"));
            }//end for
            editDetails.close();
            editDetails = null;
        }//end try
        catch (IOException ioe) {}//end catch
     }


     public void delete(){
        Integer Pointer=0;
        FileWriter editDetails = null;
        ArrayList<String> lineKeeper = saveText();

        if(lineKeeper.contains(getCompanyName())){
            Pointer=lineKeeper.indexOf(getCompanyName());
            Pointer=Pointer-1;
            for(int i=1;i<=11;i++){
                lineKeeper.remove(Pointer+1);
            }//end for
            companyAddress.delete(lineKeeper);
        }
        try{
            editDetails= new FileWriter("suppliers.txt",false);
            for( int i=0;i<lineKeeper.size();i++){
                editDetails.append(lineKeeper.get(i));
                editDetails.append(System.getProperty("line.separator"));
            }//end for
            editDetails.close();
            editDetails = null;
        }//end try
        catch (IOException ioe) {}//end catch
    }

     /**********************************************Clone method********************************************************
    *
    * This method gets as parameter a Supplier object and clone all the attribute to the object that calls the method.
    *
    ******************************************************************************************************************/
    public void clone(Supplier theSupplier) {
        this.setCompanyName(theSupplier.getCompanyName());
        this.setContactNumber(theSupplier.getContactNumber());
        this.companyAddress.clone(theSupplier.getCompanyAddress());
    }

    /**********************************************isEqual method******************************************************/
    public boolean isEqual(Supplier theSupplier) {
        boolean equal;

        if (this.companyName.equals(theSupplier.companyName) && this.contactNumber.equals(theSupplier.companyName)
                && this.companyAddress.equals(theSupplier.companyAddress)){
            equal = true;
        }
        else {
            equal = false;
        }
        return equal;
    }


}
