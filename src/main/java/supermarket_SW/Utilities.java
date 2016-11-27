/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket_SW;

/**
 *
 * @author Angelos
 */
public interface Utilities {
    //This method is used to save the objects in text files.
    public void save(String filePath);
    
    //This method is used to retrieve the objects from the text files.
    public void load(String keyWord, String filePath);
}
