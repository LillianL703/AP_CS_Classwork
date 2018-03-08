import java.util.Date;
//import java.awt.print.Book;

/*
 * This program is to implement a library system (mainly for books and CDs). 
 * (Version 1)
 * Editor: Lillian Luo from S3C7.
 * Instructor: Daniel Gunn
 */

/**
 *
 * @author Lillian
 */
public class LibraryItem {
    private String title;
    private String author_artist;   
    private int itemID;
    private boolean onloan;
    private Date duedate;
    
    public static void main(String[] args) {
        Book b = new Book("12 Rules for Life", "Jordan Peterson", 123, false, new Date(), false );
        b.printDetails();
        
        CD cd = new CD("And Justice for all", "Metallica", 567, false, new Date(), "Metal");
        cd.printDetails();
    }    
    
    public LibraryItem(){
        
        title = "";
        author_artist = "";
        itemID = 0;
        onloan = false;
        duedate = new Date();
    }
    
    public LibraryItem(String libtitle, String libauthor_artist, int libitemID, boolean libonloan, Date libduedate){
        title = libtitle;
        author_artist = libauthor_artist;
        itemID = libitemID;
        onloan = libonloan;
        duedate = libduedate;
    }
    
    public String gettitle(){
        return title;
    }
    
    public String author_artist(){
        return author_artist;
    }
    
    public int itemID(){
        return itemID;
    }
    
    public boolean onloan(){
        return onloan;
    }
    
    public Date duedate(){
        return duedate;
    }
    
    public void printDetails(){
        System.out.println("Title: " + title);
        System.out.println("Author/artist: " + author_artist);
        System.out.println("Item ID: " + itemID);
        System.out.println("Onloan or not: " + onloan);
        System.out.println("Due date: " + duedate + "\n");
    }
}
    
    
    


