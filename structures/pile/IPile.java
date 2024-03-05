package structures.pile;

import exceptions.PileException;

/**
 * La classe Pile représente une pile d'objets dernier entré, premier sorti (LIFO).
 * La mise en œuvre est fait à l'aide d'objets "NoeudPile" permettant une
 * gestion dynamique en mémoire.
 * @author Robert Aubé
 */
public interface IPile {
    /**
     * Empile un élément sur le dessus de cette pile.
     * @param element, l'élément à empiler
     */
    public void push(Object element);

    /**
     * Supprime l'objet en haut de cette pile et renvoie cet objet comme valeur de cette fonction.
     * Lève une exception si la pile est vide.
     * @return Object, l'élément dépilé
     * @throws PileException si on dépile et que la pile est vide. <b>PileException</b> hérite de <b>RuntimeException</b>.
     */
    public Object pop();

    /**
     * Retourne l'objet sur le dessus de la pile sans le dépiler.
     * Lève une exception si la pile est vide.
     * @return Object, l'objet sur le dessus de la pile.
     * @throws PileException si la pile est vide. <b>PileException</b> hérite de <b>RuntimeException</b>.
     */
    public Object peek();

    /**
     * Retourne <b>true</b> si cette pile est vide.
     * @return boolean, vrai si elle est vide
     */
    public boolean empty();


    /**
     * Retourne le nombre d'éléments dans la pile
     * @return int, le nombre d'éléments dans la pile
     */
    public int size();
}
