public class Library {


    private String libraryName;
    private String libraryAddress;
    private String libraryWorkingTime;


    Edition book1 = new Edition("1984", "1949", "Georges Orwell");
    Edition book2 = new Edition("Ana Karenina", "1878", "Lev Tolstoy");
    Edition book3 = new Edition("Under the yoke", "1894", "Ivan Vazov");
    Edition newspaper1 = new Edition("USA Today", "20.07.2020");
    Edition newspaper2 = new Edition("Politico", "21.07.2020");
    Edition newspaper3 = new Edition("BBC", "17.06.2020");

    private Edition[] libraryList;
    public Library(int editionCount) {
        this.libraryList = new Edition[editionCount];
    }

    public Library () {
        libraryName = "The best library";
        libraryAddress = "Sofia city";
        libraryWorkingTime = "From 08:00 to 19:00";
    }



    public void addEdition(Edition edition) {
        for (int editionIndex = 0; editionIndex <libraryList.length; editionIndex++) {
            if(libraryList[editionIndex] == null) {
                libraryList[editionIndex] = edition;
                break;
            }
        }
    }

    public void printEditions() {
        for (int i = 0; i < libraryList.length; i++) {
            if(libraryList[i] != null) {
                System.out.println("Book: " + libraryList[i].getName() + ", Author: "
                        + libraryList[i].getAuthor() + ", Year of publish: "
                                + libraryList[i].getYearOfPublish() );
            }
        }
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
