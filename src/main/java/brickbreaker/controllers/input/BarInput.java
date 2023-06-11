package brickbreaker.controllers.input;

import brickbreaker.model.world.gameObjects.Bar;
/**
 * Class to elaborate the player input and update the position of the respective object.
 */
public class BarInput implements InputComponent {

    private final Double move = 150.0;

    /**
     * {@inheritDoc}
     */
    @Override
    public void update(final Bar bar, final Double rb, final InputController c, final Double elapsed) {

        Long value = Math.round(move * (elapsed / 5000.0));

        if (c.isMoveLeft()) {
            if (bar.getBBox().getULCorner().getX() >= value) {
                bar.move(-value);
            }
            c.noMoveLeft();
        } else if (c.isMoveRight()) {
            if (bar.getBBox().getBRCorner().getX() <= (rb - value)) {
                bar.move(value);
            }
            c.noMoveRight();
        }
    }

}
