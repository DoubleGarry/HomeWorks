package Homework_12;

public class Main {
    public static void main(String[] args) {
        Author levTolstoy = new Author("Лев", "Толстой");
        Book warAndPeace = new Book("Война и Мир", levTolstoy, 1867);
        System.out.println("Автор - " + warAndPeace.getAuthor().getName() + " "
                + warAndPeace.getAuthor().getSurname());
        System.out.println("Книга - " + warAndPeace.getBookName());
        System.out.println("Год выпуска - " + warAndPeace.getPublishingYear());
        System.out.println();

        Author aleksandrDumas = new Author("Александр", "Дюма");
        Book countOfMonteCristy = new Book("Граф Монте-Кристо", aleksandrDumas, 1844);
        Book countOfMonteCristy1 = new Book("Граф Монте-Кристо", aleksandrDumas, 1844);


        System.out.println("Автор - " + countOfMonteCristy.getAuthor().getName() + " "
                + countOfMonteCristy.getAuthor().getSurname());
        System.out.println("Книга - " + countOfMonteCristy.getBookName());
        System.out.println("Год выпуска - " + countOfMonteCristy.getPublishingYear());

        //countOfMonteCristy.setPublishingYear(1845);
        //System.out.println("Год выпуска - " + countOfMonteCristy.getPublishingYear());

        System.out.println(levTolstoy + " " + aleksandrDumas);
        System.out.println();

        System.out.println(warAndPeace);
        System.out.println();

        System.out.println(countOfMonteCristy1.equals(countOfMonteCristy));
        System.out.println(countOfMonteCristy.hashCode());
        System.out.println(countOfMonteCristy1.hashCode());
        System.out.println(warAndPeace.hashCode());
        System.out.println();

        System.out.println(levTolstoy + "; " + aleksandrDumas);
    }
}
