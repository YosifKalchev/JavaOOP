public class Edition {

    private String name;
    private String author;
    private String dateOfPublish;
    private String yearOfPublish;
    private boolean isAvailable;

    public Edition(String name, String dateOfPublish) {
        this.name = name;
        this.dateOfPublish = dateOfPublish;
        this.isAvailable = true;
    }

    public Edition(String name, String yearOfPublish, String author) {
        this.name = name;
        this.yearOfPublish = yearOfPublish;
        this.author = author;
        this.isAvailable = true;
    }

    public String getName() {
        return name;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getAuthor() {
        return author;
    }

    public String getDateOfPublish() {
        return dateOfPublish;
    }

    public String getYearOfPublish() {
        return yearOfPublish;
    }
}
