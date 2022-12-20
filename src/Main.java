public class Main {
    public static void main(String[] args) {

        Author hSchildt = new Author("Герберт", "Шилдт");
        Author bEckel = new Author("Брюс", "Эккель");


        Book javaNoob = new Book("Java. Руководство для начинающих", hSchildt, 2019);
        Book javaPhil = new Book("Философия JAVA", bEckel, 2015);

        javaPhil.setPublishingYear(2022);

        System.out.println(javaNoob.getTitle() + " " + javaNoob.getAuthor().getFirstName() + " " + javaNoob.getAuthor().getLastName() + " " + javaNoob.getPublishingYear());

        System.out.println("javaNoob = " + javaNoob);
        System.out.println("javaPhil = " + javaPhil);
        System.out.println("javaNoob.equals(javaPhil) = " + javaNoob.equals(javaPhil));
        System.out.println("hSchildt.equals(bEckel) = " + hSchildt.equals(bEckel));
    }


}
