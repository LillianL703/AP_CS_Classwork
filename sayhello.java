/*
 * This program is to run the program for the class Person_Lillian.
 * (Version 1)
 * Editor: Lillian L. from S3C7
 * Instructor: Daniel Gunn
 */
package person;

/**
 *
 * @author Lillian
 */
public class sayhello {
    String gender;
    public sayhello(String n){
        gender = n;
    }

    public String greeting(){
        if(gender.compareTo("Male") == 0){
            return "Hey, brother.";
        }else if(gender.compareTo("Female") == 0){
            return "Hey, sister.";
        }else{
            return "Hey, ...";
        }
    }
    
    
}