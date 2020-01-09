 public class HeapClass{
    private int Heap[];
    private int size;
    private int maxsize;
 	public int swapNum;
    private static final int FRONT = 1;
    public int minChild = 0;
 	public int parent = 0;
 	public int count = 0;
 	
    public HeapClass(){
        this.maxsize = 50;
        this.size = 0;
        Heap = new int[this.maxsize + 1];
        Heap[0] = Integer.MIN_VALUE;
    }
    
    public void getArray(){
    	for(int i = 1; i<=size;i++){
    		System.out.print(Heap[i]+ " ");
    	}
    		System.out.println();
    }
 	
 	public int getSize(){
 		return size;
 	}
    private int parent(int pos){
        return pos / 2;
    }
 

 

 
    private void swap(int fpos, int spos){
        int tmp;
        tmp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] = tmp;
    }


    
   
 	
    public int insert(int element){
        Heap[++size] = element;
        int current = size;
 		int s = 0;
        while (Heap[current] < Heap[parent(current)])
        {
        	s++;
            swap(current,parent(current));
            current = parent(current);
        }
        setSwapNum(s);
        return element;	
    }
    
     private void minHeapIt(int pos){
        int smallerChild=0;
        int top = Heap[pos];
        count = 0;
        while(pos<=size/2){
        	  
        	int left = 2*pos;
        	int right = left+1;
        	
        	if(left <= size && Heap[left]<Heap[right])
        		smallerChild=left;
        	else
        		smallerChild=right;
        	
        		
        		
        		if(top<=Heap[smallerChild])break; 
        		count++;	       		
        		if(count==1){
        			setMinChild(smallerChild);
        		}else{
        			setMinChild(smallerChild);
        			setParent(pos);}
        		Heap[pos] = Heap[smallerChild];
        		pos = smallerChild;
        		
        		
        		
        }
        Heap[pos]= top; 
        setCount(count);	  
    }
    
     	
 	public int[] clone(){
 			return Heap.clone();
 		}
	public void setCount(int s){
 		count = s;	
 	}
 	public int getCount(){
 		return count;
 	}
	public void setParent(int s){
 		parent = s;	
 	}
 	public int getParent(){
 		return parent;
 	}
 	
	public void setMinChild(int s){
 		minChild = s;	
 	}
 	public int getMinChild(){
 		return minChild;
 	}
 	
 	public void setSwapNum(int s){
 		swapNum = s;	
 	}
 	public int getSwapNum(){
 		return swapNum;
 	}
 

 

 
    public int remove(){
        int popped = Heap[FRONT];
        Heap[FRONT] = Heap[size--]; 
        minHeapIt(FRONT);
        return popped;
    }
    

    
    public void heapArray(){
    	System.out.println( "\nHeapArray " );
    	for(int i = 1; i<=size; i++){
    		System.out.print(Heap[i] + " " );
    	}
    }
    
    
    
		
    }