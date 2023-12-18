package task1;

public class Main {

    public static void main(String[] args) {

        System.out.println("All cats: ");
        var cats = Cat.makeCats(10);
        Printer.print(cats);

        System.out.println("Sort the list by cat breed: ");
        Cat.sortByBreed(cats);
        Printer.print(cats);

        System.out.println("Sort list by name and age: ");
        Cat.sortByNameAndAge(cats);
        Printer.print(cats);

        System.out.println("All cats except gray: ");
        Cat.removeByColor(cats, Cat.Color.GRAY);
        Printer.print(cats);

        System.out.println("cats whose name length is not equal to 5: ");
        Cat.removeByNameLength(cats, 5);
        Printer.print(cats);
    }
}
