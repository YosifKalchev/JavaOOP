package com.netit.custom_structures;

import java.util.Objects;

class Node {

    String value;
    Node nextNode;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node)) return false;
        Node node = (Node) o;
        return Objects.equals(value, node.value) &&
                Objects.equals(nextNode, node.nextNode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, nextNode);
    }
}