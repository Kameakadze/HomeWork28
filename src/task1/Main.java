package task1;

public class Main {

    public static void main(String[] args) {

        var cats = Cat.makeCats(10);
        Printer.print(cats);

        cats.sort((cat1, cat2) -> cat1.getBreed().compareTo(cat2.getBreed()));
        Printer.print(cats);
    }

}
