package Homework_12;

public class Main {
    public static void main(String[] args) {
        Author levTolstoy = new Author("Лев", "Толстой");
        Book warAndPeace = new Book("Война и Мир", levTolstoy, 1867);
        System.out.println("Автор - " + levTolstoy.authorName + " " + levTolstoy.authorSurname);
        System.out.println("Книга - " + warAndPeace.getBookName());
        System.out.println("Год выпуска - " + warAndPeace.getPublishingYear());
        System.out.println();

        Author aleksandrDumas = new Author("Александр", "Дюма");
        Book countOfMonteCristo = new Book("Граф Монте-Кристо", aleksandrDumas, 1844);
        System.out.println("Автор - " + aleksandrDumas.authorName + " " + aleksandrDumas.authorSurname);
        System.out.println("Книга - " + countOfMonteCristo.getBookName());
        System.out.println("Год выпуска - " + countOfMonteCristo.getPublishingYear());
        countOfMonteCristo.setPublishingYear(1845);
        System.out.println("Год выпуска - " + countOfMonteCristo.getPublishingYear());
    }
}
