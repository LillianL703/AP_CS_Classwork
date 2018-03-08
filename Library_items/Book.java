
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
public class Book extends LibraryItem{
        private boolean IsRequested;
        public Book(){
            super();
            IsRequested = false;
        }
        public Book(String libtitle, String libauthor_artist, int libitemID, boolean libonloan, Date libduedate, boolean BookIsRequested){
            super(libtitle, libauthor_artist, libitemID, libonloan, libduedate);
            IsRequested = BookIsRequested;
        }
        public boolean getIsRequested(){
            return IsRequested;
        }
        public void printDetails(){
            super.printDetails();
            System.out.println("Is requested or not: " + IsRequested + "\n");
        }
    }
