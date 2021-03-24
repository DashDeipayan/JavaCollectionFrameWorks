import java.util.*;

public class CollectionsFrameworksDemo {
    //ArrayList Example Method
    public  void ArrayListExp() {
        //Initialising ArrayList
        //Integer is a wrapper class for int datatype 
        ArrayList<Integer> intArr = new ArrayList<Integer>();
        
        //Adding elements using add() method
        intArr.add(5);
        intArr.add(40);
        intArr.add(9);
        intArr.add(32);
        intArr.add(3);
        intArr.add(23);
        
        //print ArrayList
        System.out.println(intArr);
        //checking out the size of ArrayList
        System.out.println(intArr.size());

        
        //removing elements from ArrayList
        intArr.remove(1); //remove elements from index 1
        intArr.remove(3); //remove elements from index 3

        //print new ArrayList
        System.out.println(intArr);
        System.out.println(intArr.size());


        //checking if an element is present in ArrayList with method contains()
        if (intArr.contains(32))
            System.out.println("32 is present");
        else
            System.out.println("32 not present");

        //use get() method to get the element at an index
        int elemAtThree = intArr.get(3);
        System.out.println("At index 3, element is "+elemAtThree);
        
    }
    public static void VectorExp() {
        //instantiate Vector object
        Vector<Integer> intVec = new Vector<Integer>();
        System.out.println("initial Size of the Vector: "+intVec.size()+"\n");

        //Adding elements with add() method
        intVec.add(1);
        intVec.add(3);
        intVec.add(4);
        intVec.add(55);
        intVec.add(53);
        intVec.add(12);
        intVec.add(13);

        System.out.println("The Vector: "+intVec+"\n");
        System.out.println("Size of the Vector: "+intVec.size()+"\n");
        
        //remove elements with remove()
        intVec.remove(3);

        System.out.println("The Vector: "+intVec+"\n");
        System.out.println("Size of the Vector: "+intVec.size()+"\n");

        //Clear all elements
        intVec.clear();
        System.out.println("The Vector: "+intVec+"\n");
        System.out.println("Size of the Vector: "+intVec.size()+"\n");       
    }

    public void StackExp(){
        //instantiate Stack object
        Stack<String> strStack = new Stack<String>();

        //Adding elements using Push() method
        strStack.push("stack");
        strStack.push("of");
        strStack.push("implentation");
        strStack.push("is an");
        strStack.push("This");

        System.out.println("Stack: "+strStack+"\n"); 
        System.out.println("Size of the Stack: "+strStack.size()+"\n");

        //Search() Method used to find the position of an element
        int elemPosition = strStack.search("of");
        System.out.println("\'of' is present at: "+elemPosition+"\n"); 
        
        //Printing in an order using pop()
        String temp;
        int numSize = strStack.size();
        for(int i=1; i<=numSize; i++){
            temp = strStack.peek(); //used to get the top of the stack
            System.out.print(temp+" ");
            
            //pops the top of the stack
            strStack.pop();  
        }

    }

    public void LinkedListExp() {
        //instantiate LinkedList object
        LinkedList<String> strLinkedList = new LinkedList<String>();

        System.out.println("Size of the Linked List: "+strLinkedList.size()+"\n");

        //add() method as usual
        strLinkedList.add("this");
        strLinkedList.add("is an");
        strLinkedList.add("Implementation");
        strLinkedList.add("of");
        strLinkedList.add("Linked List");

        System.out.println("The Linked List: "+strLinkedList+"\n");
        System.out.println("Size of the Linked List: "+strLinkedList.size()+"\n");

        //get() to retrieve the LL
        int llSize = strLinkedList.size();
        for(int i=0;i<llSize;i++){
            System.out.print(strLinkedList.get(i)+" ");
        }

        //remove() as usual
        strLinkedList.remove(1);
        strLinkedList.remove(0);

        llSize = strLinkedList.size();
        System.out.println();
        for(int i=0;i<llSize;i++){
            System.out.print(strLinkedList.get(i)+" ");
        }
    }

    public static void main(String[] Args) throws Exception{
        PriorityQueue<Integer> intPriorityQueue = new PriorityQueue<Integer>();

        //add() as usual
        intPriorityQueue.add(17);
        intPriorityQueue.add(20);
        intPriorityQueue.add(1);
        intPriorityQueue.add(13);
        intPriorityQueue.add(87);

        System.out.println("Priority Queue: "+intPriorityQueue+"\n");

        //remove() here removes instance of the element, not from index(obvious!!)
        intPriorityQueue.remove(17);
        System.out.println("Priority Queue: "+intPriorityQueue+"\n");

        //poll() retrieves head, returns it and removes it
        int head = intPriorityQueue.poll();
        System.out.println("Priority Queue head: "+head+"\n");
        System.out.println("Priority Queue: "+intPriorityQueue+"\n");
        
    }

}
