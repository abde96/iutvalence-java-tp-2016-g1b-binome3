package fr.iutvalence.hassaineambry.rushhour;

/**
 * Enumeration of all kind of car color.
 *
 * @author HASSAINE Abderrahmane/AMBRY Maxime/TP1B
 * @version 1.0
 */
public enum Color {
    /** Red color. */
    RED("[R] "),
    /** Green color. */
    GREEN("[G] "),
    /** Blue color. */
    BLUE("[B] "),
    /** Light blue color. */
    LIGHT_BLUE("[L] "),
    /** Yellow color. */
    YELLOW("[Y] "),
    /** Pink color. */
    PINK("[P] "),
    /** Orange color. */
    ORANGE("[O] "),
    /** White color. */
    WHITE("[W] "),
    /** Type of color to initialized the grid. */
    ZERO("[ ] ");

    /** String initialized empty. */
    private final String color;

    /** Print the letter of the color. */
    private Color(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }
}

