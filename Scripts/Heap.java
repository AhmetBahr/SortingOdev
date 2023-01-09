
public class Heap {
    private int[] data;
    private int size;
    public int StepHS=0;
    public int StepHS2=0;
	public static String step ="";


    public Heap(int capacity) {
        data = new int[capacity];
        size = 0;
    }
    public boolean isEmpty() {
        return size == 0;
    }

    public void add(int value) {
        data[size] = value;
        size++;

        int currentIndex = size - 1;
        while (currentIndex > 0) {
            int parentIndex = (currentIndex - 1) / 2;
            if (data[currentIndex] < data[parentIndex]) {
                int temp = data[currentIndex];
                data[currentIndex] = data[parentIndex];
                data[parentIndex] = temp;
                currentIndex = parentIndex;
            } else {
                break;
            }
        }
    }

    public int poll() {
        int result = data[0];
        data[0] = data[size - 1];
        size--;

        int currentIndex = 0;
        while (currentIndex < size) {
            int leftChildIndex = 2 * currentIndex + 1;
            int rightChildIndex = 2 * currentIndex + 2;
            if (leftChildIndex >= size) {
                break;
            }
            int minIndex = leftChildIndex;
            if (rightChildIndex < size && data[rightChildIndex] < data[leftChildIndex]) {
                minIndex = rightChildIndex;
            }
            if (data[currentIndex] > data[minIndex]) {
            	int temp = data[currentIndex];
                data[currentIndex] = data[minIndex];
                data[minIndex] = temp;
                currentIndex = minIndex;
            } else {
                break;
            }
        }
        return result;
    }
   
    public int[] HeapSort(int[] arr){
        Heap h1=new Heap(arr.length);
        int arr3[] = new int [arr.length];
        
	   
	    for(int i=0;i<arr.length;i++) {
	    	arr3[i] = arr[i];
	    }
			   
        for (int i = 0; i < arr3.length; i++) {
            h1.add(arr3[i]);
        }
        int[]arr2=new int[arr3.length];
        for (int i = 0; i < arr3.length; i++) {
            arr2[i]=h1.poll();
            StepHS++;
            printArray(arr2);

        }
       
        for(int i=0;i<arr.length;i++) {
	    	arr[i] = arr2[i];
	    }
			
        	
        return arr; 
    }

    public int[] HeapSort2(int[] arr){
        Heap h1=new Heap(arr.length);
        for (int i = 0; i < arr.length; i++) {
            h1.add(arr[i]);
        }
        int[]arr2=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i]=h1.poll();
            StepHS2++;
        }
        return arr2; 
    }
    
    public static String printArray(int arr[]) {
		   
		   String satir = "";
	        int n = arr.length;
	        for (int i = 0; i < n; ++i) {
	            System.out.print(arr[i] + " ");
	        	satir += arr[i] + " ";
	        }
	        step += satir + "\n";
	        
	        return step;
	    }
}