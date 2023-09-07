package LabWork2;

public class Task1 {
    public static void main(String[] args) {
        TestAuthor testAuthor = new TestAuthor();

        testAuthor.test();
    }
}

class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}

class TestAuthor {
    public void test() {
        Author author = new Author("Artem", "artem@yandex.ru", '1');

        System.out.println(author.toString());

        author.setEmail("artem21@yandex.ru");

        System.out.println(author.toString());
    }
}