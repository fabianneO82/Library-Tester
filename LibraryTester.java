public class LibraryTester {// Task 2

    public static void main(String[] args){

        int  bookCount;


        Book book1 = new Book("Jurassic Park", "Michael Crichton", 1990, "978-0-345-53898-7", true, 9.99);
        Book book2 = new Book("Anthem", "Ayn Rand",1938, "0-451-19113-7", true, 7.99 );
        Book book3 = new Book("The Picture Of Dorian Gray", "Oscar Wilde",1890, "978-0-141-43957-0", true, 9.00);

        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();

        book1.borrowBook();
        book2.borrowBook();
        book1.borrowBook();
        book2.borrowBook();

        bookCount = book2.totalAvailableBooks();
        System.out.println();
        System.out.println("There are a total of " + bookCount + " book(s) available.");
        System.out.println();

        book2.returnBook();
        book2.returnBook();

        bookCount= book1.totalAvailableBooks();
        System.out.println();
        System.out.println("There are a total of " + bookCount + " book(s) available.");
        System.out.println();

        book2.calculateLateFee(5);















    }// end main method


} // end Library Tester class
