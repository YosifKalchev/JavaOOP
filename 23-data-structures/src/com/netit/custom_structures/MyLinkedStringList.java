package com.netit.custom_structures;

public class MyLinkedStringList {

    private Node head;

    public void add(String item) {
        if(head == null) {
            head = new Node();
            head.value = item;
            return;
        }

        Node currentNode = head;
        while (true) {
            if(currentNode.nextNode != null) {
                currentNode = currentNode.nextNode;
            } else {
                break;
            }
        }
        currentNode.nextNode = new Node();
        currentNode.nextNode.value = item;
    }

    public int size() {
        return getNodeCount(head, 0);
    }

    private int getNodeCount(Node node, int nodeCount) {
        if(node == null) {
            return nodeCount;
        } else {
            return getNodeCount(node.nextNode, nodeCount + 1);
        }
    }
}
