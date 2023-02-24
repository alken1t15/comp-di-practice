package comp;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Mouse implements IMouse {

    @Override
    public void move() {
        System.out.println("move");
    }
}
