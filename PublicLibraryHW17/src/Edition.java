public class Edition {

    private final String name;
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

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void changeIsAvailable() {
        if (!this.isAvailable) {
            this.isAvailable = true;
        } else this.isAvailable = false;
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
