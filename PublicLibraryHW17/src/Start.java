public class Start {

    public static void main(String[] args) {

        Library library = new Library(6);
        addAllEditionsToLibrary(library);
        printLibraryDetails(library);

        library.printAllEditionsAvailable();

        library.getDetails("BBC");
        library.bookEdition("BBC");
        library.getDetails("BBC");
        library.returnEdition("BBC");
        library.getDetails("BBC");

    }

    private static void addAllEditionsToLibrary(Library library) {
        library.addEdition(library.book1);
        library.addEdition(library.book2);
        library.addEdition(library.book3);
        library.addEdition(library.newspaper1);
        library.addEdition(library.newspaper2);
        library.addEdition(library.newspaper3);
    }

    private static void printLibraryDetails(Library library) {
        System.out.println("Library name: "+ library.getLibraryName() +
                "\nLibrary adress: " + library.getLibraryAddress() +
                "\nLibrary open hours: " + library.getLibraryWorkingTime());
    }
}

