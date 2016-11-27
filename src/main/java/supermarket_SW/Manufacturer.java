
package supermarket_SW;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Angelos
 */
public class Manufacturer {

    private String companyName;

    //Constructor without parameters
    public Manufacturer(){
        companyName="";
    }
    //Constructor with parameters
    public Manufacturer(String companyName){
        setCompanyName(companyName);
    }

    //Set company name
    public final void setCompanyName(String companyName){
        this.companyName=companyName;
    }

    //Get company name
    public String getCompanyName(){
        return companyName;
    }
    //save method
    public void save(FileWriter save) throws IOException {
        save.append(getCompanyName());
        save.append(System.getProperty("line.separator"));
    }

    //load method
    public void load(BufferedReader load) throws IOException {
        setCompanyName(load.readLine());
    }

    //Display method
    public void display(javax.swing.JTextField manufacturerTextField) {
        manufacturerTextField.setText(getCompanyName());
    }

    //edit method
    public ArrayList<String> edit(ArrayList<String> lineKeeper) {
        Integer Pointer = 0;
        /*
         * Search into the list to find the name, if it founds it replace the
         * old address with new address
         */

        //Search
        if (lineKeeper.contains(getCompanyName())) {
            Pointer = lineKeeper.indexOf(getCompanyName());
            //Write the new information
            lineKeeper.set(Pointer , getCompanyName());
        }//end if
        return lineKeeper;
    }

    //Delete method
    public ArrayList<String> delete(ArrayList<String> lineKeeper) {
        Integer Pointer = 0;
        if (lineKeeper.contains(getCompanyName())) {
            lineKeeper.remove(getCompanyName());
        }
        return lineKeeper;
    }

    //Clone method
    public void clone(Manufacturer theManufacturer) {
        this.setCompanyName(theManufacturer.getCompanyName());
    }

    //Equal method
    public boolean isEqual(Manufacturer theManufacturer){
        boolean equal;
        if(this.getCompanyName().equals(theManufacturer.getCompanyName())){
            equal=true;
        }
        else{
            equal=false;
        }
        return equal;
    }

}
