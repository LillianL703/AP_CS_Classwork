package Library_items;
import java.util.Date;

/*
 * This program is to implement a library system (mainly for books and CDs). 
 * (Version 2)
 * Editor: Lillian Luo from S3C7.
 * Instructor: Daniel Gunn
 */

/**
 *
 * @author Lillian
 */
public class CD extends Libraryitem{
        private String genre;
        public CD(){
            super();
            genre = "";
        }
        public CD(String libtitle, String libauthor_artist, int libitemID, boolean libonloan, Date libduedate, String CDgenre){
            super(libtitle, libauthor_artist, libitemID, libonloan, libduedate);
            genre = CDgenre;
        }
        public String getgenre(){
            return genre;
        }
        //Override
        public void printDetails(){
            System.out.println("Title: "+ title);
            System.out.println("Artist: "+ this.author_artist());
            System.out.println("ItemID: " + this.itemID);
            if(this.onloan){
                System.out.println("This CD is not on loan");
            }else{
                System.out.println("Sorry, this CD is on loan");
            }
            System.out.println("Due date: " + this.duedate);
            System.out.println("Music type: " + this.genre +"\n");
        }
    
    }
