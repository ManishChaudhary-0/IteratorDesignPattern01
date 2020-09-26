package iteratordesignpattern;

/* Interface for checking ToDo
    Sets the boolean depending on the the position
    next calls for the next item in ToDo
 */
public interface Iterator<ToDo> {
    public boolean hasNext();
    public ToDo next();
}
