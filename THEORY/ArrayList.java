package THEORY;
//class which manually built arraylist:
public class ArrayList {
    private int arr[];
    private int capacity;//how many elements can fit
    private int size; //how many elements are present in array list


    ArrayList(){
        arr = new int[10];
        size = 0 ;
        capacity = 10;
    }
    void add(int n){  // *TC=0(1)
	    if(size == capacity){   //* IF TRUE THEN TC=0(N)
        int narr[] = new int[2*capacity];
	      for(int  i = 0 ; i < capacity; i++){
            narr[i] = arr[i];
        }
        this.arr=narr;
        capacity *=2;
	    }
       this.arr[size] = n ;
        size++;
    }

    void removeBack(){
        if(size > 0 ){
            this.arr[size-1] =0;
            size--;
        }
    }

    void set(int id , int newn){
        if(id>= 0 && id < size)
            this.arr[id] = newn;
    }

    int get(int id){
        if(id>= 0 && id < size){
            return this.arr[id];
        }
        else {
            return -1;
        }
    }
    
    int capacity(){
     return this.capacity;
     }
    public static void main(String[] args) {
        
    }

}

/*
sometimes 0(1) time is taken and sometimes 0(3N)===0(N) is taken /0(2N) for creation a array of  0(2n)  and copy  element of array 0(n)
 */
