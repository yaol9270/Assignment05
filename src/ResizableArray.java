/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yaol9270
 */
public class ResizableArray {

    private int numItems = 0;
    int[] array = new int[10];
    
    public ResizableArray() {
       
        numItems = 0;
        
    }
    

    /**
     * Adds a number to the list
     * @param index the position where it is to be added
     * @param num the number which is to be added at the position
     */
    public void add(int index, int num) {
        //if the array is filled
        if(numItems == array.length){
            //make a temporary array 2 times the length of that array
            int[] temp = new int[array.length*2];
            //push all into the temporary array
            for(int i = 0; i < array.length; i++){
                temp[i] = array[i];
            }
            //incorporate all of the elements from the temporary array into the array
            array = temp;
        }
        //if there is nothing in the array and the index is 0
        if(numItems == 0&&index == 0){
          //set the first position in the array to the number
            array[0]=num;
        }
        //if the index is the end
        else if(index == numItems){
            //put that number at the end
            array[index] = num;
        }
        //if it is in the middle of the array
        else{
            //put the number in
         for(int i = numItems; i >= index ; i--){
            array[i+1] = array[i];
        }
         
        array[index] = num;
        
            //add
            
        }
        numItems++;
    }
    
    /**
     * remove a number
     * @param index the number at the position which is to be removed
     */
    public void remove(int index) {
        //if there is only one in the array
        if(numItems==1){
            //set the first position to be 0
            array[0] = 0;
        }
        else{
            //take the number out and shift all of the left to the right
            for(int i = index; i < numItems ; i++){
                array[i] = array[i+1];
            }
        }
        
        
        numItems--;
    }

    /**
     * the size of the array
     * @return the number of items in the array
     */
    public int size() {
        return numItems;
    }

    /**
     * if there is 0 items in the array
     * @return if the array is empty
     */
    public boolean isEmpty() {
        if(numItems == 0){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * get the number at the index in the array
     * @param index the position in the array
     * @return the number at that position in the array
     */
    public int get(int index) {
        return array[index];
    }
    
    /**
     * prints out the array
     */
    public void printList(){
        
        for(int i = 0; i < numItems; i++){
            System.out.println(array[i]);
        }
    }
}
