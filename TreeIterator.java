/**
 * The TreeIterator class defines a method to traverse a tree in preorder, and a
 * method to return the height of a tree.
 *
 * @author Joshua Collins
 * @version 1.0
 * @since 2021-11-4
 */
public class TreeIterator {
    
    /**
     * The traverse method traverses the tree passed in using depth-first preorder,
     * printing the data of each node as it is iterated over.
     * 
     * @param current The root of the tree to be traversed.
     */
    public static void traverse(Node current) {
        System.out.println(current.getData());

        if (current.getlChild() != null) {
            traverse(current.getlChild());
        }

        if (current.getrChild() != null) {
            traverse(current.getrChild());
        }
    }

    /**
     * The getHeight method returns the height of a given tree.
     * 
     * @param current The root of the tree to be measured.
     * @return The height of the tree.
     */
    public static int getHeight(Node current) {
        if (current == null) {
            return 0;
        } else {
            return 1 + (Math.max(getHeight(current.getlChild()), getHeight(current.getrChild())));
        }
    }

}