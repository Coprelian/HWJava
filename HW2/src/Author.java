public class Author {

    private String name;

    private String email;

    private boolean isMale;

    Author(String name, String email, boolean isMale) {
        this.name = name;
        this.email = email;
        this.isMale = isMale;
    }

    String getName() {
        return name;
    }

    String getEmail() {
        return email;
    }


    void setEmail(String email) {
        this.email = email;
    }

    boolean getisMale() {
        return isMale;
    }

    public String toString() {
        char sex;
        if (isMale) sex = 'М';
        else sex = 'Ж';
        return String.format("%s %c %s", this.name, sex, this.email);
    }
}