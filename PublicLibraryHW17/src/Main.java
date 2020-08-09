public class Main {

    private static void main(String[] args) {

        Library library = new Library(6);

        library.addEdition(library.book1);
        library.addEdition(library.book2);
        library.addEdition(library.book3);
        library.addEdition(library.newspaper1);
        library.addEdition(library.newspaper2);
        library.addEdition(library.newspaper3);


       library.printEditions();


    }

}
