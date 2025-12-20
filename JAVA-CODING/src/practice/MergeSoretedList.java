package practice;

import java.util.LinkedList;

class ListNode {

    int val;
    ListNode next;
    ListNode(int val){
        this.val =val;
    }
    
    
}

public class MergeSoretedList{


    public ListNode mergeFunction(ListNode l1, ListNode l2){
    ListNode temp = new ListNode(0);
    ListNode curr = temp;


    while(l1!=null && l2!=null){
        if(l1.val<l2.val){
            curr.next = l1;
            l1= l2.next;
        }else{
            curr.next=l2;
            l2=l2.next;
        } 

        
    }
    curr.next = (l1!=null)? l1:l2;
    return temp.next;}

    public static void main(String[] args){

        LinkedList l1 = new LinkedList<>();
        LinkedList l2 = new LinkedList<>();
        l1.add(1);
        l2.add(2);
        l1.add(3);

        
        l2.add(4);
        l1.add(5);
        l2.add(6);
        l1.add(7);

         LinkedList newList = mergeFunction(l1,l2);
         System.out.println(newList);


    }
    

}
