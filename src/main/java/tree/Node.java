package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * A class that represents a tree
 */
public class Node {
    private int height;

    private List<Node> children;

    public Node(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    public List<Node> getChildren() {
        return children;
    }

    public void addChild(Node child) {
        if (children == null) {
            children = new ArrayList<>();
            children.add(child);
        } else {
            children.add(child);
        }
    }


}
