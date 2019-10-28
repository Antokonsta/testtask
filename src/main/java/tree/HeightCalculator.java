package tree;


/**
 * A class for calculating the height of the tree
 */
public class HeightCalculator {

    /**
     * Calculate height of a tree when given its root node.
     * @param root node
     * @return max height from node to leaf
     */
    public int calculateHeight(Node root){
        if (root == null) {
            return 0;
        }

        if (root.getChildren() == null || root.getChildren().isEmpty()) {
            return root.getHeight();
        }

        int childMaxHeight = 0;
        for (Node child : root.getChildren()) {
            childMaxHeight = Math.max(childMaxHeight, calculateHeight(child));
        }

        return childMaxHeight + root.getHeight();
    }
}
