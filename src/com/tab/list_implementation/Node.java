package com.tab.list_implementation;

/**
 * Created by aleksandra on 06.03.2017.
 */
public class Node {

    private String value;
    private Node next;
    private Node prev;


    public Node(String value, Node next, Node prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }


    public String getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }


    }

