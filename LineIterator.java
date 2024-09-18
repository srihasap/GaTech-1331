import java.util.NoSuchElementException;
import java.util.Iterator;

/**
 * Implementation of the Line Iterator.
 *
 * @author spenchikala3
 * @version 1.0
 * @param <T> the type of parcel this Person carries
 */
public class LineIterator<T> implements Iterator<T> {
    private Person<T> nextPerson;

    /**
     * Creates a Line Iterator object.
     *
     * @param line the line that this iterator will iterate through
     */
    public LineIterator(Line<T> line) throws IllegalArgumentException {
        if (line != null) {
            this.nextPerson = line.getFirstPerson();
        } else {
            throw new IllegalArgumentException("Illegal Argument");
        }
    }

    @Override
    public boolean hasNext() {
        return (this.nextPerson != null);
    }

    @Override
    public T next() throws NoSuchElementException {
        if (nextPerson == null) {
            throw new NoSuchElementException("No more elements to iterate over");
        }
        T parcel = nextPerson.getParcel();
        if (this.hasNext()) {
            nextPerson = nextPerson.getNextPerson();
        }
        return parcel;
    }
}
