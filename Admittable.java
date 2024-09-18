/**
 * Interface for admittance behavior in attractions.
 *
 * @author spenchikala3
 * @version 1
 */
public interface Admittable {
    /**
     * Admit a group of visitors.
     * @param visitorNames Array of visitor names to be admitted.
     */
    void admit(String[] visitorNames);
}