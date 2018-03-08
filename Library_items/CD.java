
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lillian
 */
public class CD extends LibraryItem{
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
        public void printDetails(){
            super.printDetails();
            System.out.println("Genre: " + genre + "\n");
        }
    }
