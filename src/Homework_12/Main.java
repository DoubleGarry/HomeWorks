package Homework_12;

public class Main {
    public static void main(String[] args) {
        Author levTolstoy = new Author("Лев", "Толстой");
        Book warAndPeace = new Book("Война и Мир", 1867, levTolstoy);
        System.out.print("Автор - " + warAndPeace.getAuthor().getName() + " "
                + warAndPeace.getAuthor().getSurname() +
                "; Книга - " + warAndPeace.getBookName() +
                "; Год выпуска - " + warAndPeace.getPublishingYear());
        System.out.println();

        Author aleksandrDumas = new Author("Александр", "Дюма");
        Book countOfMonteCristy = new Book("Граф Монте-Кристо", 1844, aleksandrDumas);
        Book countOfMonteCristy1 = new Book("Граф Монте-Кристо", 1844, aleksandrDumas);

        System.out.print("Автор - " + countOfMonteCristy.getAuthor().getName() + " "
                + countOfMonteCristy.getAuthor().getSurname() +
                "; Книга - " + countOfMonteCristy.getBookName() +
                "; Год выпуска - " + countOfMonteCristy.getPublishingYear());
        System.out.println();

        countOfMonteCristy.setPublishingYear(1845);
        System.out.println("Год выпуска - " + countOfMonteCristy.getPublishingYear());

        System.out.println(warAndPeace);
        System.out.println();

        System.out.println(countOfMonteCristy1.equals(countOfMonteCristy));
        System.out.println(countOfMonteCristy.hashCode());
        System.out.println(countOfMonteCristy1.hashCode());
        System.out.println(warAndPeace.hashCode());
        System.out.println();

        System.out.println(levTolstoy + "; " + aleksandrDumas);
        System.out.println(levTolstoy.equals(aleksandrDumas));
        System.out.println(aleksandrDumas.hashCode());
        System.out.println(levTolstoy.hashCode());

    }
}
