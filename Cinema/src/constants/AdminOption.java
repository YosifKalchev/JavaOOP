package constants;

public enum AdminOption {

    LOGOUT (1),
    SHOW_ALL_MOVIE_ROOMS (2),
    CREATE_MOVIE_ROOM(3),
    SHOW_ALL_ACTIVE_MOVIES(4),
    CREATE_MOVIE(5);


    private final int value;
    AdminOption(int value) {
        this.value = value;
    }


    public int value() {
        return value;
    }

    public static AdminOption convertToAdminOption(int option) {
        for (AdminOption adminOption : values()) {
            if(option == adminOption.value) return adminOption;
        }
        return null;
    }
}

