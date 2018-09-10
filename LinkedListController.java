public class LinkedListController {
    
    public static LinkedList List;
    
    public static void main(String[] args) {
        // Default constructor - let's put "0" into head element.
        List = new LinkedList();

        // add more elements to Controller
        // this loop simply adds odd numbers to the front of the list and even numbers to the back of the list
        for(int i=0;i<10;i++)
        {
            if((i+1)%2 == 0)
                List.add(i+1,0);
            else
                List.add(i+1);
        }

	/*
         * Please note that primitive values can not be added into Controller directly. They must be converted to their
         * corresponding wrapper class.
         */
        
        List.printBothWays();
        System.out.println(".get(6): \t\t" + List.get(6) + " (get element at index:6 - list starts from 0)");
        System.out.println(".remove(4): \t\t" + List.remove(4) + " (element removed)");
        System.out.println(".get(6): \t\t" + List.get(6) + " (get element at index:6 - list starts from 0)");
        List.printBothWays();
        System.out.println(".get(3): \t\t" + List.get(3) + " (get element at index:3 - list starts from 0)");
        System.out.println(".remove(2): \t\t" + List.remove(2) + " (element removed)");
        System.out.println(".get(3): \t\t" + List.get(3) + " (get element at index:3 - list starts from 0)");
        List.printBothWays();
    }
    
}