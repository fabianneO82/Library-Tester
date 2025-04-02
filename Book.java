public class Book { // Task 1

    // Our attributes
    private String title;
    private String author;
    private int publicationYear;
    private String ISBN;
    private boolean available;
    private double price;
    private static int totalAvailableBooks;

    //Our methods
    public Book(String t, String a, int pYear, String isb, boolean avaiL, double p){
        title = t;
        author = a;
        publicationYear = pYear;
        ISBN = isb;
        available = avaiL;
        price = p;
        totalAvailableBooks++;


    }// constructor

    // setters

    public void setTitle (String t){
        title = t;
    }

    public void setAuthor (String a){
        author =a;
    }

    public void setPublicationYear(int pyear){
        publicationYear = pyear;
    }

    public void setISBN(String isb){
        ISBN = isb;
    }

    public void setAvailable(boolean avaiL){
        available = avaiL;
    }

    public void setPrice (double p){
        price = p;
    }

    // getters

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getPubYear(){
        return publicationYear;
    }

    public String getISBN(){
        return ISBN;
    }

    public boolean getAvailability(){
        return available;
    }

    public double getPrice(){
        return price;
    }

    public int totalAvailableBooks(){
        return totalAvailableBooks;
    }

    public void displayInfo(){


        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("ISBN: "+ ISBN);
        System.out.println("Available ? : "+ available);
        System.out.println("Price: $" + price);
        System.out.println("---------------------------------");

    }

    public void borrowBook(){

        if (available){
            available = false;
            totalAvailableBooks--;
        } else{
            System.out.println(title + ":  This book is already borrowed.");
        }

    }

    public void returnBook(){
        if (available == false) {
            available = true;
            totalAvailableBooks++;
        } else {
            System.out.println(title + ":  This book is in the library.");
        }

    }

    public void calculateLateFee(int daysOverdue){

        double overDue;
        overDue = daysOverdue * 0.5;
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Your late fee for book " + title + " is $" + overDue + "!" );
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    }


}// end Book class
