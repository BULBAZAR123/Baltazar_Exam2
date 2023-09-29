/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baltazar_exam2;

import java.util.Scanner;


class Node {
    String name;
    Node next;

    public Node(String name) {
        this.name = name;
    }
}

class CircularLinkedList {
    Node head;

    public void insert(String name, int position) {
        Node newNode = new Node(name);
        
        if (head == null) {
            head = newNode;
            newNode.next = newNode;
            return;
        }

        Node current = head;
        for (int i = 0; i < position - 1; i++) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;

        if (current == head) {
            head = newNode;
        }
    }

    public void display() {
        if (head == null) {
            return;
        }

        Node current = head;
        do {
            System.out.print(current.name + " ");
            current = current.next;
        } while (current != head);

        System.out.println();
    }
}



    public class Baltazar_Exam2 {
    public static void main(String[] args) {
        System.out.println("Calyle, James, Hayohooo, Oppa, American, Hoops, Lakers, Zom, Eyow");
        num1();
    }
    public static void num1(){
         CircularLinkedList list = new CircularLinkedList();
       Scanner scn = new Scanner(System.in);

       list.insert("Calyle,", 0); 
        list.insert("James,", 1);
        list.insert("Hayohooo,", 2);
        list.insert("Oppa,", 3);
        list.insert("American,", 4);
        list.insert("Hoops,", 5);
        list.insert("Lakers,", 6);
        list.insert("Zom,", 7);
        list.insert("Eyow,", 8);
     
        System.out.print("Enter an element to add: ");
                    String elementToAdd = scn.nextLine();
                    System.out.println("postion");
                    int posi = scn.nextInt();
                    list.insert(elementToAdd + ",", posi);
                    list.display();
    }
    
    public static void num2A(){
        class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SingleLinkedList {
    Node head;

    SingleLinkedList() {
        head = null;
    }

    
    public void myList(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    
    boolean search(int target) {
        Node current = head;
        while (current != null) {
            if (current.data == target) {
                return true; 
            }
            current = current.next;
        }
        return false; 
    }
}
        Scanner scn = new Scanner(System.in);
        System.out.println("1. Fita");
        System.out.println("2. Pride Powder");
        System.out.println("3. Canola oil");
        System.out.println("4. Nescafe Black Coffee");
        System.out.println("5. Ariel Powder");
        System.out.println("6. Rebisco");
        System.out.println("7. Steelwool");
        System.out.println("8. Head and Shoulder");
        System.out.println("9. Nova");
        System.out.println("10. Tanduay");
        System.out.println("Enter the number you want to find from 1 to 10");
        int a = scn.nextInt();
        
        SingleLinkedList list = new SingleLinkedList();
    
        list.myList(1);
        list.myList(2);
        list.myList(3);
        list.myList(4);
        list.myList(5);
        list.myList(6);
        list.myList(7);
        list.myList(8);
        list.myList(9);
        list.myList(10);

        int target = a;

        if (list.search(target)) {
            System.out.println(target + " is found in the linked list.");
        } else {
            System.out.println(target + " is not found in the linked list.");
        }

    }
  
    }

