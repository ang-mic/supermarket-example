/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket_SW;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Angelos
 */
public class Address {

    /**
     * **************************Attributes declaration***********************
     */
    private String name, buildingName, street, area, city, country, postcode;
    private Integer buildingNo;

    /**
     * ******************Constructor without parameters***********************
     */
    public Address() {
        name = "";
        buildingName = "";
        street = "";
        buildingNo = 0;
        area = "";
        city = "";
        country = "";
        postcode = "";

    }

    /***************************************Constructor with parameters*************************************************
     *
     * The constructor with parameters is used to create the object with filled attributes, it uses the setters methods
     * to put the information in the attributes.
     *
     ******************************************************************************************************************/
    public Address(String name, String buildingName, String street, Integer buildingNo, String area,
            String city, String country, String postcode) {

        setName(name);
        setBuildingName(buildingName);
        setStreet(street);
        setBuildingNo(buildingNo);
        setArea(area);
        setCity(city);
        setCountry(country);
        setPostcode(postcode);
    }

    /**************************************************Setter methods***************************************************
     *
     * The following methods set the attributes of the class Address. The key word 'final' does not allow to subclasses
     * (if they are exist) to override the setter methods because there is a rule: a constructor should not call methods
     * that can be overridden.
     *
     ******************************************************************************************************************/

    //Set name
    public final void setName(String name) {
        if (!name.equals("")) {
            this.name = name;
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect house name");
        }
    }

    //Set house name
    public final void setBuildingName(String buildingName) {
        if (!buildingName.equals("")) {
            this.buildingName = buildingName;
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect house name");
        }

    }

    //Set street
    public final void setStreet(String street) {
        if (!street.equals("")) {
            this.street = street;
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect street");
        }
    }

    //Set house no.
    public final void setBuildingNo(Integer buildingNo) {
        if (buildingNo >= 1) {
            this.buildingNo = buildingNo;
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect house no.");
        }

    }

    //Set area
    public final void setArea(String area) {
        if (!area.equals("")) {
            this.area = area;
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect area");
        }
    }

    //Set city
    public final void setCity(String city) {
        if (!city.equals("")) {
            this.city = city;
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect City");
        }
    }

    //Set country
    public final void setCountry(String country) {
        if (!country.equals("")) {
            this.country = country;
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect Country");
        }
    }

    //Set postcode
    public final void setPostcode(String postcode) {
        if (!postcode.equals("")) {
            this.postcode = postcode;
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect Postcode");
        }
    }

    /*******************************************************************************************************************
    *                                                    Getter methods
    *******************************************************************************************************************/
    //Get name
    public String getName() {
        return name;
    }
    //Get house name

    public String getBuildingName() {
        return buildingName;
    }

    //Get street
    public String getStreet() {
        return street;
    }

    //Get house number
    public Integer getBuildingNo() {
        return buildingNo;
    }
    //Get area

    public String getArea() {
        return area;
    }

    //Get city
    public String getCity() {
        return city;
    }

    //Get country
    public String getCountry() {
        return country;
    }

    //Get postcode
    public String getPostcode() {
        return postcode;
    }

    /*****************************************************Other Methods************************************************/

    /***********************************************Save address in file************************************************
     *
     * Saves the City,Country, Postcode etc to the destination file. It is used inside of an other method, which method
     * it is belonged to another class, for example 'Employee' class. The second method is used to store all the
     * information of user into the destination file.
     *
     ******************************************************************************************************************/
    public void save(FileWriter save) throws IOException {
        save.append(this.getName());
        save.append(System.getProperty("line.separator"));
        save.append(this.getBuildingName());
        save.append(System.getProperty("line.separator"));
        save.append(this.getStreet());
        save.append(System.getProperty("line.separator"));
        save.append(String.valueOf(this.getBuildingNo()));
        save.append(System.getProperty("line.separator"));
        save.append(this.getArea());
        save.append(System.getProperty("line.separator"));
        save.append(this.getCity());
        save.append(System.getProperty("line.separator"));
        save.append(this.getCountry());
        save.append(System.getProperty("line.separator"));
        save.append(this.getPostcode());
        save.append(System.getProperty("line.separator"));
    }

    /**************************************************Load address*****************************************************
     *
     * Loads the City,Country, Postcode etc from the destination file. It is used inside of an other method, which
     * method it is belonged to another class, for example 'Employee' class. The second method is used to load all the
     * information of user from the destination file.
     *
     ******************************************************************************************************************/
    public void load(BufferedReader load) throws IOException {
        setName(load.readLine());
        setBuildingName(load.readLine());
        setStreet(load.readLine());
        setBuildingNo(Integer.valueOf(load.readLine()));
        setArea(load.readLine());
        setCity(load.readLine());
        setCountry(load.readLine());
        setPostcode(load.readLine());
    }

    /**************************************************Display address**************************************************
     *
     * Displays the City,Country, Postcode etc at JtextFileds.
     *
     ******************************************************************************************************************/
    public void display(JTextField nameTextField,
            JTextField houseNameTextField,
            JTextField streetTextField,
            JTextField buildingNoTextField,
            JTextField areaTextField,
            JTextField cityTextField,
            JTextField countryTextField,
            JTextField postcodeTextField) {

        nameTextField.setText(getName());
        houseNameTextField.setText(getBuildingName());
        streetTextField.setText(getStreet());
        buildingNoTextField.setText(String.valueOf(getBuildingNo()));
        areaTextField.setText(getArea());
        cityTextField.setText(getCity());
        countryTextField.setText(getCountry());
        postcodeTextField.setText(getPostcode());
    }

    /************************************************Edit method********************************************************
     *
     * Responsible to change an existing address if is needed This method is called inside the 'edit()' method of
     * associated class, for example Employee class.
     *
     ******************************************************************************************************************/
    public ArrayList<String> edit(ArrayList<String> lineKeeper, Integer Pointer) {
        //Integer Pointer = 0;
        /*
         * Search into the list to find the name, if it founds it replace the
         * old address with new address
         */

        //Search
        //if (lineKeeper.contains(getName())) {
            //Pointer = lineKeeper.indexOf(getName());

            //Write the new information
            lineKeeper.set(Pointer, getName());
            lineKeeper.set(Pointer + 1, getBuildingName());
            lineKeeper.set(Pointer + 2, getStreet());
            lineKeeper.set(Pointer + 3, String.valueOf(getBuildingNo()));
            lineKeeper.set(Pointer + 4, getArea());
            lineKeeper.set(Pointer + 5, getCity());
            lineKeeper.set(Pointer + 6, getCountry());
            lineKeeper.set(Pointer + 7, getPostcode());

        //}//end if
        return lineKeeper;
    }

    /**************************************************Delete method****************************************************
     *
     * Responsible to delete an existing address if is needed This method is called inside the 'delete()' method of
     * associated class, for example User class.
     *
     ******************************************************************************************************************/
    public ArrayList<String> delete(ArrayList<String> lineKeeper) {
        Integer Pointer = 0;
        if (lineKeeper.contains(getName())) {
            Pointer = lineKeeper.indexOf(getName());
            for (int i = 1; i <= 7; i++) {
                lineKeeper.remove(Pointer + 1);
            }//end for
        }
        return lineKeeper;
    }

    /**********************************************Clone method*********************************************************
     *
     * This method gets as parameter an Address object and clone all the attribute to the object that invoked the method.
     *
     ******************************************************************************************************************/
    public void clone(Address theAddress) {

        this.setName(theAddress.getName());
        this.setBuildingName(theAddress.getBuildingName());
        this.setStreet(theAddress.getStreet());
        this.setBuildingNo(theAddress.getBuildingNo());
        this.setArea(theAddress.getArea());
        this.setCity(theAddress.getCity());
        this.setCountry(theAddress.getCountry());
        this.setPostcode(theAddress.getPostcode());

    }

    /***************************************************equal method****************************************************
     *
     * The following method checks of two objects of class Address have identical elements (name, buildingNo etc).
     *
     ******************************************************************************************************************/
    public boolean isEqual(Address theAddress) {
        boolean equal;

        if (this.name.equals(theAddress.name) && this.buildingName.equals(theAddress.buildingName)
                && this.street.equals(theAddress.street) && this.buildingNo.equals(theAddress.buildingNo)
                && this.area.equals(theAddress.area) && this.city.equals(theAddress.city)
                && this.country.equals(theAddress.country) && this.postcode.equals(theAddress.postcode)) {
            equal = true;
        } else {
            equal = false;
        }

        return equal;
    }
}
