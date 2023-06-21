/** Required package class namespace */
package testing.classes;


/**
 * SlapFighting.java - enforcing "the rules" of slap fighting (and sports)
 *
 * @author Wen Pei (Michael) Yan
 * @since May 2023
 */
public interface SlapFighting extends Sports
{
    
    /**
     * A player slaps another player
     * 
     * @param slapper the person doing the slapping
     * @param slapie the person who got slapped
     */
    void slap(String slapper, String slapie);
    
    /**
     * Checks if the game is over
     * 
     * @return they are knocked out (true) or not (false)
     */
    boolean isKnockedOut();

}