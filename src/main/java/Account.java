public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if (name.length() < 3 || name.length() > 19) {
            return false;
        }
        if (name.trim().length() != name.length()) {
            return false;
        }
        if (name.split(" ").length != 2
        ) {
            return false;
        }
        return true;
    }

}