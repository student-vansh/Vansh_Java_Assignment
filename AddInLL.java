package LinkedList;

import java.util.*;

public class AddInLL {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // ------------------------------ This is the Insertion operation is performed
    // the last ,first , middle --------------
    public void addFirst(int data) {

        // step 1 to create a node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2 new node next to point the head

        newNode.next = head;

        // step3 head newnode

        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;

        tail = newNode;
    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newnNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        newnNode.next = temp.next;
        temp.next = newnNode;
    }

    // ---------------------------------------- This is the traverse function
    // --------------------------------------------------

    public void traverse() {
        if (head == null) {
            System.out.println("Linked list is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // ---------------------------------- This is the Deletion Opertion in ll
    // -------------------------------------------------

    public int Removefirst() {
        if (size == 0) {
            System.out.println("Linked List Is Empty");
            return Integer.MAX_VALUE;
        } else if (size == 1) {
            int Val = head.data;
            head = tail = null;
            size = 0;
            return Val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removelast() {
        if (size == 0) {
            System.out.println("Linked List Is Empty");
            return Integer.MAX_VALUE;
        } else if (size == 1) {
            int Val = head.data;
            head = tail = null;
            size = 0;
            return Val;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = tail.data;
        prev.next = null;
        prev = tail;
        size--;
        return val;
    }

    public int SearchItem(int target) {
     Node temp = head;
      for(int i = 0;i<size;i++){
        if(temp.data == target){
            return i;
        }
        temp = temp.next;
      }
      return -1;
   
    }

    // Using Recusion We Find Out the Element

    public int helepr(Node head , int key){
         if (head == null) {
            return -1;
         }
         if (head.data == key) {
            return 0;
         }
         int indx = helepr(head.next, key);
         if(indx == -1){
            return -1;
         }
         return indx+1;
    }
    public int SearchItemRecusion(int target) {
        return helepr(head,target);
    }

    // To Reverse the Linked List 

    public void Reverselinked(){
        Node prev = null;
        Node curr = tail = head;
        Node next;  

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }


    // ***********************8 This Is the Important question *********************************888

    public void deleteNthNode(int n){
        int sz=0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        if (n == sz) {
            head = head.next;
            return;
        }
        Node prev = head;
        for(int i=1;i<sz-n;i++){
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return;
    }




    /* this is the slow fast approach */
     public Node findMiddle(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
          slow = slow.next;
          fast = fast.next.next;
         }
         return slow;
     }

     public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }

        Node midNode = findMiddle(head);
        Node prev = null;
         Node curr = midNode;
         Node next;

         while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
         }

         Node right = prev; // Right half ka head
         Node left = head;

        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
     }



     // Write a program in linked list cycle exist or not

     public static boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
     }

    public static void main(String[] args) {
        AddInLL ll = new AddInLL();
        // ll.traverse();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(3);
        // ll.addLast(4);
        // ll.traverse();
        // ll.add(2, 5);
        // ll.traverse();
        // System.out.println(ll.size);
        // ll.Removefirst();
        // ll.traverse();
        // System.out.println(ll.size);
        // ll.addFirst(1);
        // ll.traverse();
        //  System.out.println(ll.size);
        // System.out.println(ll.SearchItem(5));
        //  System.out.println(ll.SearchItemRecusion(5));
        //  ll.Reverselinked();
        //  ll.Reverselinked();
        //  ll.traverse();
        //  ll.deleteNthNode(3);
        // ll.traverse();

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;
         System.out.println(isCycle());
    }
}
