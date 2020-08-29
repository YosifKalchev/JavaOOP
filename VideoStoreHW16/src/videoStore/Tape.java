package videoStore;

public class Tape {

    private String name;
    private String takenByUser;



    public Tape(String name, String takenByUser) {
        this.name = name;
        this.takenByUser = takenByUser;
    }

    public void setTakenByUser(String takenByUser) {
        this.takenByUser = takenByUser;
    }

    public Tape(String name) {
        this.name = name;
        takenByUser = "";
    }

    public String getName() {
        return name;
    }

    public String getTakenByUser() {
        return takenByUser;
    }


}
