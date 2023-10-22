package ObjectsAndClass_lesson1;

public class Main {
    public static void main(String[] args) {
        Author stepenKing = new Author("Stepen", "King", null);
        Author stepenKing2 = new Author("Stepen", "King", null);
        System.out.println(stepenKing2.equals(stepenKing));

        Author joaneRolling = new Author("Joane", "Rolling", "K.");

        Book firstBook = new Book("Desperation", stepenKing, 1997);
        Book secondBook = new Book("Harry Potter and Gobliet fire", joaneRolling, 2013);
        System.out.println(firstBook.getBookName() + " " + firstBook.getPublishYear() + " " + firstBook.getAuthor().getName() + " " + firstBook.getAuthor().getSurname());
        System.out.println(secondBook.getBookName() + " " + secondBook.getPublishYear() + " " + secondBook.getAuthor().getName() + " " + secondBook.getAuthor().getPatronimic() + " " + secondBook.getAuthor().getSurname());

        secondBook.setPublishYear(2015);
        System.out.println(secondBook.getBookName() + " New publication: " + secondBook.getPublishYear() + " " + secondBook.getAuthor().getName() + " " + secondBook.getAuthor().getPatronimic() + " " + secondBook.getAuthor().getSurname());

    }
}
