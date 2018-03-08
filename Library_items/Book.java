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
public class Book extends Libraryitem{
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
        
        //Override
        public void printDetails(){
            System.out.println("Title: "+ title);
            System.out.println("Author: "+ this.author_artist());
            System.out.println("ItemID: " + this.itemID);
            if(this.onloan){
                System.out.println("Sorry, this book is on loan");
            }else{
                System.out.println("This book is not on loan");
            }
            System.out.println("Due date: " + this.duedate);
            if(this.IsRequested){
                System.out.println("This book is requested by another borrower\n");
            }else{
                System.out.println("This book is not requested by another borrower\n");
            }
        }
}
   
