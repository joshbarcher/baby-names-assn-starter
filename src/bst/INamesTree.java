package bst;

import baby_names.BabyNames;

/**
 * Represents a tree of BabyNames objects. BabyNames can
 * be added and searched for in the tree.
 *
 * DO NOT EDIT THIS FILE!
 *
 * @author Josh Archer
 * @version 1.0
 */
public interface INamesTree extends Iterable<BabyNames>
{
    /**
     * Adds a new BabyNames object to the tree.
     * @param element a BabyNames object to add to the tree
     * @return true if name and year of the BabyNames object is unique to the tree, or false otherwise
     */
    boolean add(BabyNames element);

    /**
     * Adds several BabyNames object to the tree.
     * @param elements a group of BabyNames objects
     * @return true if all BabyNames are added to the tree, without encountering any duplicates, or false otherwise
     */
    boolean add(BabyNames... elements);

    /**
     * Returns true if the BabyNames object is found in the tree. Two BabyNames should be considered equal if
     * the name and year of the BabyNames objects are equal.
     *
     * @param element the element to search for
     * @return true if the input element is found, or false otherwise
     */
    boolean contains(BabyNames element);

    /**
     * Searches for the BabyNames object in the tree with the given name.
     *
     * @param name a name to search for
     * @return a BabyNames object that matches the search value, or null if no BabyNames object is found with a
     *         matching name
     */
    BabyNames get(String name);

    /**
     * Returns the number of elements in the tree.
     * @return the number of elements in the tree
     */
    int size();

    /**
     * Reports whether the tree is empty or not.
     * @return true if the tree is empty, or false otherwise
     */
    boolean isEmpty();

    /**
     * Removes all BabyNames objects from the tree.
     */
    void clear();

    /**
     * Reports the height of the root node in the tree.
     * @return the height of the root node in the tree, or -1 if the tree is empty
     */
    int treeHeight();

    /**
     * Reports the height of the Node that contains the input element.
     * @param element the element to search for
     * @return the height of the Node containing the input parameter, or -1 if not found
     */
    int nodeHeight(BabyNames element);

    /**
     * Reports the depth of the Node that contains the input element.
     * @param element the element to search for
     * @return the depth of the Node containing the input parameter, or -1 if not found
     */
    int nodeDepth(BabyNames element);
}