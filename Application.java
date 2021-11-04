/**
 * The Application class contains a main method with the primary calls to the Tree and TreeIterator classes.
 * This application traverses a binary tree in preorder, printing the data of each node, and printing the depth
 * of the tree after traversal.
 *
 * @author Joshua Collins
 * @version 1.0
 * @since 2021-11-4
 */
public class Application {
    public static void main(String args[]) {
        Tree practiceTree = new Tree();
        Node parent = practiceTree.generatePracticeTree(3);
        TreeIterator.traverse(parent);
        System.out.println("Height: " + TreeIterator.getHeight(parent));
    }
}

