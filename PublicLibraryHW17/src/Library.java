public class Library {


    private final String libraryName = "The best library";
    private final String libraryAddress = "Sofia city";
    private final String libraryWorkingTime = "From 08:00 to 19:00";

    Edition book1 = new Edition("Robinson Crusoe", "1719", "Daniel Defoe");
    Edition book2 = new Edition("Ana Karenina", "1877", "Lev Tolstoy");
    Edition book3 = new Edition("Under the yoke", "1893", "Ivan Vazov");
    Edition newspaper1 = new Edition("USA Today", "20.07.2020");
    Edition newspaper2 = new Edition("Politico", "21.07.2020");
    Edition newspaper3 = new Edition("BBC", "17.06.2020");

    private final Edition[] libraryList;
    public Library(int editionCount) {
        this.libraryList = new Edition[editionCount];
    }

    public void addEdition(Edition edition) {
        for (int editionIndex = 0; editionIndex <libraryList.length; editionIndex++) {
            if(libraryList[editionIndex] == null) {
                libraryList[editionIndex] = edition;
                break;
            }
        }
    }

    public void getDetails(String name) {
        for (int i = 0; i < libraryList.length; i++) {
            if(libraryList[i] != null && libraryList[i].getName().equals(name)) {
                if (libraryList[i].getAuthor() != null) {
                    System.out.println("Book: " + libraryList[i].getName() + "; Author: "
                            + libraryList[i].getAuthor() + "; Year of publish: "
                            + libraryList[i].getYearOfPublish() +
                            "; is Available: " + libraryList[i].getIsAvailable()) ;
                }
                if (libraryList[i].getDateOfPublish() != null) {
                    System.out.println("Newspaper: " + libraryList[i].getName() +
                            "; Date of publish: " + libraryList[i].getDateOfPublish() +
                            "; is Available: " + libraryList[i].getIsAvailable() );
                }
            }
        }
    }

    public void printAllEditionsAvailable() {
        System.out.println("\nThis is the list of all editions available: ");
        for (int i = 0; i < libraryList.length; i++) {
            if (libraryList[i] != null && libraryList[i].getIsAvailable() == true) {
                System.out.print(libraryList[i].getName() + ", ");
            }
            System.out.println("");
        }
    }
    
    public void bookEdition(String name) {
        for (int i = 0; i < libraryList.length; i++) {
            if (libraryList[i] != null && libraryList[i].getName().equals(name)) {
                libraryList[i].changeIsAvailable();
            }
        }
    }

    public void returnEdition(String name) {
        bookEdition(name);
    }

    public String getLibraryName() {
        return libraryName;
    }


    public String getLibraryAddress() {
        return libraryAddress;
    }

    public String getLibraryWorkingTime() {
        return libraryWorkingTime;
    }


}
