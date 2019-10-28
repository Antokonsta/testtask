package tree;

import static org.junit.Assert.*;

public class HeightCalculatorTest {

    HeightCalculator heightCalculator = new HeightCalculator();

    @org.junit.Test
    public void calculateHeightTest() {
        Node treeRoot = new Node(5);

        Node middlePart1 = new Node(3);
        Node middlePart2 = new Node(4);

        Node leaf1 = new Node(1);
        Node leaf2 = new Node(2);
        Node leaf3 = new Node(3);
        Node leaf4 = new Node(4);


        treeRoot.addChild(middlePart1);
        treeRoot.addChild(middlePart2);

        middlePart1.addChild(leaf1);
        middlePart1.addChild(leaf2);

        middlePart2.addChild(leaf3);
        middlePart2.addChild(leaf4);


        int rootHeight = heightCalculator.calculateHeight(treeRoot);
        assertEquals(13, rootHeight); //root(5) -> middlePart2(4) -> leaf4(4) = 5 + 4 + 4 = 13

        int middlePart1Height = heightCalculator.calculateHeight(middlePart1);
        assertEquals(5, middlePart1Height); //middlePart1(3) -> leaf2(2) = 3 + 2 = 5

        int middlePart2Height = heightCalculator.calculateHeight(middlePart2);
        assertEquals(8, middlePart2Height); //middlePart2(4) -> leaf4(4) = 4 + 4 = 8

        int leaf1Height = heightCalculator.calculateHeight(leaf1);
        assertEquals(1, leaf1Height); //leaf1(1) = 1

    }
}