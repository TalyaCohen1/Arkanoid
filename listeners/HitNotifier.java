//Talya Cohen
package listeners;

/**
 * listeners.HitNotifier interface.
 */
public interface HitNotifier {
    /**
     * Add hl as a listener to hit events.
     * @param hl The listener to add.
     */
    void addHitListener(HitListener hl);
    /**
     * Remove hl from the list of listeners to hit events.
     * @param hl The listener to remove.
     */
    void removeHitListener(HitListener hl);
}
