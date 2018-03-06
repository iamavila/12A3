 /*
 * Description: basically a list. Has some limitations and some cool
 * advantages.
 * Methods user should take note of:
 * traverse()   // get the data of all nodes
 * addNode()    // add a node default with no data. put some object in parentheses to prime its data
 * insertNode() // insert a node at any point. (Clean as hell) (nevermind, has to change)
 * delNode()    // delete a node at any point (also awesome(nevermind, I better be able to keep this))
 * search()     // look for a node with some key as data
 * isEmpty()    // check if the list is empty.
 */
package A3part2;

import java.util.ArrayList;

/**
 *
 * @author avila-good-m
 */
public class PLL {
    
    private Node head;
    private Node curr;
    private Node pre;
//******************** constructors ****************
    
    public PLL(){
        curr = new Node();
        pre = new Node();
        head = curr;
        pre.next = head;
        }//end default constructor
   
    
    
// ****************** accessors ************************
    public boolean isEmpty(){
        boolean emp = true;
        if(head.next!= null)
            emp = false;
        return emp;
    }// end check if empty
    
    public void traverse(){
        curr = head;
        
        int count = 0;// to make the list more legible
        if(isEmpty() == false){// if at least one node exists
            
            do{/* do while so we can get data before going on don't want to end 
    prematurely or get error for getting data of node that doesn't exist. 
    we know first must exist since isEmpty check at the beginning*/

                System.out.println("Node " + count+ " " + curr.getData());// get data
                count++;// add to count
                curr = curr.next;// get next current
            }while((curr != null));// until no more nodes after next.
        }// end if as long as the list exists
    }// end traverse
    
    public Object getData(int in){
        curr = head;
        int count = 0;
        for(int i = 0; i <in; i++){
            curr= curr.next;
            count++;
        }// end for traverse and get data
        System.out.println("node: " + count + " = " + curr.getData());// get data
        return curr.getData();
    }// end getData
    
    public Node search(Object key){
        curr = head;// reset current
        pre.next = curr;
        Node sea;
        int count = 0;// keepin this functionality
        try{// start try
            while(curr.getData() != key){// verify key
                curr = curr.next;// update node
                pre = pre.next;
                count++;
        }// end verify key
            sea = curr;
            System.out.println("Node is at spot " + count);//they just want to know where this node is right?
        }// end try
        catch(NullPointerException e){// catch for data doesn't exist
            
            System.out.println("No node with that data");// error message
            sea = null;
            }// end catch for that data doesn't exist.
        return sea;        
    }
        
// ************************* transformers *************************
    public void addNode(){
        Node addNew = new Node(); // create new node. It points to nowhere
        curr.next = addNew;// the previous node now points to new node
        curr = curr.next;// update the current to be new node.
    }// end addNode
    
    public void addNode(Object in){// add a node with some data
        Node addNew = new Node(in);
        curr.next = addNew;
        curr = curr.next;
    }
    
    public void insHead(Object data){
        curr = head;// reset curr just in case
        Node insNew = new Node(data);
        insNew.next = head;// 
        head = insNew;// set head to the new node 
        }// end insert to head position
    
    public void insFore(Node in, Object data){// insert before using a node's location in memory
        curr = head;// reset curr
        Node insNew = new Node(data);// create new node to be  inserted
        insNew.next = in;// attach node to everything after
        pre.next = insNew;// attach node to list before it
        
    }// end insFore
    
    
    public void insAft(Node in, Object data){// insert before using a node's location in memory
        curr = head;
        Node insNew = new Node(data);// create new node to be  inserted
        insNew.next = in.next;// attach node to everything after
        in.next = insNew;
        
    }// end insFore
    
 // enter the exact spot you want your node in. put some data to id at least
    public void indexIns(int in, Object data){
        Node insNew = new Node(data);
        curr = head;
        
//just like in del Node, set i to 1 so that you can put things after
// first node without passing, while still leaving the opportunity
// to do the switch with node. (could be achieved by using 0, but 
// you would still need another integer or option to account for the node 
// directly after the head node.


        for(int i = 1; i <in; i++){
            curr= curr.next;// traverse the list
        }//end for get to proper location
        
        if(in>= 1){
        insNew.next = curr.next;// reattach rest of list
        curr.next = insNew;// inserts after the chosen node
        }// end if
        else{
            insNew.next = curr;// 
            head = insNew;// set head to the new node
        }// end else choose to put in front
        
        // i think this should still work for putting at front of list ?
        // yes it does I'm a genius. So clean omg
        // never mind. rip indexing 
    }// end insert node at chose location
        
    public void delNode(int n){
        Node dele;// make node for deletion
        curr = head;// reset current node
        
        /*
        set at 1, so that the "if" section will still work for the first node 
        after head. The "else" is specific to trying to delete head
        */      
        for(int i = 1; i<n; i++){
            curr = curr.next;
            System.out.println(curr.getData());
        }// find node to be deleted

        
        if(n >=1){// if not first node
        System.out.println(curr.getData() + " curr");// gives me info on what I'm deleting
        
        dele = curr.next;// get node to be deleted
        curr.next = curr.next.next;
// switch the "next" value to the value of the node after. Can delete node 
// at end because next is default set to null
        dele = null;// delete all data within dele. No pointers so it will
// be garbage collected
        }// end if not the first node
        
        
        else{// else is first node
            dele = curr;// set node to be deleted to current node

            curr = curr.next;//set current to next node
            dele = null;// delete what was current node. 
            head = curr;// reset head to current. 
        }// else is 
        
  // it works!! deletes anything you want to delete in one method. The perfect
  // delete method. Except doesn't catch exceptions :/, w.e tho
    }//end delete node 
        
    
}
