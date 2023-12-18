package task2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        var cats = new ArrayList<ActiveCat>();
        cats.add(new ActiveCat(() -> ActiveCat.jump()));
        cats.add(new ActiveCat(() -> ActiveCat.sleep()));
        cats.add(new ActiveCat(() -> ActiveCat.eat()));

        // добавьте ещё два-три кота, с совершенно другими действиями
        cats.add(new ActiveCat(() -> ActiveCat.play()));
        cats.add(new ActiveCat(() -> ActiveCat.run()));
        cats.add(new ActiveCat(() -> ActiveCat.relax()));

        cats.forEach(ActiveCat::doAction);
    }
}