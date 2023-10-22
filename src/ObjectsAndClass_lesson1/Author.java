package ObjectsAndClass_lesson1;

public class Author {
    private final String name;
    private final String surname;
    private final String patronimic;

    public Author(String name, String surname, String patronimic) {
        this.name = name;
        this.surname = surname;
        this.patronimic = patronimic;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronimic() {
        return patronimic;
    }


}
