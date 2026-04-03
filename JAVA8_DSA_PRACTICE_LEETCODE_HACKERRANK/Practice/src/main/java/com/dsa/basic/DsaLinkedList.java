package com.dsa.basic;


 // insert as tail of linked list
public class DsaLinkedList {

    // create a custom linked list
    private Node head = null;
    public static void main(String[] args) {
        DsaLinkedList list = new DsaLinkedList();
        list.insertIntoNodeAtTail(new  Node(1));
        list.insertIntoNodeAtTail(new  Node(2));
        list.insertIntoNodeAtTail(new  Node(3));
        list.printAllNodes();;
        System.out.println("head is "  +list.head.data);
        System.out.println("traversing opposite direction");
        list.traverseReverseLinkedList(list.head);








    }


    // singleton linked list





    void insertIntoNodeAtTail(Node newElement) {
        if(this.head == null ) {
            this.head = newElement;
            return ;
        }
        Node current = head;
        while (current.node != null) {
            current = current.node;
        }
        current.node = newElement;
        newElement.node = null;


    }

    void printAllNodes() {
        Node elements = this.head;
        while (elements != null) {
            System.out.println(" data are inserted " + elements.data);
            elements = elements.node;
        }
    }



    void traverseReverseLinkedList(Node node){
         if(node == null ) return ;
         traverseReverseLinkedList(node.node);
         System.out.println("data is " + node.data);

     }

    static class Node {
        Node(int data ){
            this.data = data ;
        }
        int data;
        Node node;

    }


}

