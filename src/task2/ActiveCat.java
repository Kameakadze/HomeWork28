package task2;
import java.util.List;
import java.util.Random;

public final class ActiveCat {
    private static final Random r = new Random();
    private static final List<String> names = List.of("Peach", "Ginger", "Toby", "Seth", "Tibbles", "Tabby", "Poppy",
            "Millie", "Daisy", "Jasper", "Misty", "Minka");
    private final String name;

    private final CatAction action;

    public ActiveCat(CatAction action) {
        name = names.get(r.nextInt(names.size()));
        this.action = action;
    }

    public String getName() {
        return name;
    }

    public void doAction() {
        System.out.printf("Я %s. %s%n", name, action.perform());
    }

    // Действия доступные для котов

    public static String jump() {
        return "Я прыгаю!";
    }

    public static String sleep() {
        return "Я сплю!";
    }

    public static String eat() {
        return "Я кушаю!";
    }

    public static String play() {
        return "Я играю!";
    }

    public static String relax() {
        return "Я отдыхаю!";
    }

    public static String run() {
        return "Я бегаю!";
    }

}
