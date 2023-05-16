public class LibraryApp {
    public static void main(String[] args) {
        LibraryManager<LibraryItem> libraryManager = new LibraryManager<>();


        Book book1 = new Book("Atomic Habits", 2018, "James Clear", "292");
        Book book2 = new Book("Harry Potter and the Philosopher's Stone", 1997, "J.K. Rowling", "978");

        DVD dvd1 = new DVD("Super Mario Bros.", 1993, "Annabel Jankel, Rocky Morton", 104);
        DVD dvd2 = new DVD("Jurassic Park", 1993, "Steven Spielberg", 127);

        // Add items to the library
        libraryManager.addItem(book1);
        libraryManager.addItem(book2);
        libraryManager.addItem(dvd1);
        libraryManager.addItem(dvd2);
        System.out.println("Here are book both books and DVD's: ");
        libraryManager.displayItems();
        System.out.println(" ");
        System.out.println("Now I am going to remove the DVD Super Mario Bros.:");


        // Remove an item from the library
        libraryManager.removeItem(dvd1);

        // Display the list of items in the library
        libraryManager.displayItems();

    }

}
