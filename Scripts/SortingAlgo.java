public class SortingAlgo {
	    
    public int StepIS=0; // Insertionsort adım sayısı
    public int StepIS2=0; // Insertionsort adım sayısı
    public int StepSS=0; // Selection Sort adım sayısı
    public int StepBS=0; // Buuble sort adım sayısı
    public int StepSheS=0; // Sheel sort adım sayısı
    public int StepQS1=0; //Quick Sort adım sayısı
    public int StepQS2=0; //Quick Sort adım sayısı
    public int StepCS1=0; //Count sort adım sayısı    
    public int StepCS2=0; //Count sort adım sayısı    
    public int StepMS=0;  //Merge Sort adım sayısı
    public int StepMS2=0;  //Merge Sort adım sayısı
	public static String step ="";	//Adımları ekrana yazdırabilmek için adımlar
	
	   public int [] Insertionsort(int arr[]) {
	        int n = arr.length;
	        
	        
	        for (int i = 1; i < n; ++i) {
	            int key = arr[i];
	            int j = i - 1;
	            while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j];
	                j = j - 1;

	            }
	            arr[j + 1] = key;
	            printArray(arr);
	            StepIS++;
	         //   System.out.println("Inter: " +StepIS);
	        }
			return arr;
	    }
	   
	   public int [] Insertionsort2(int arr[]) {
	        int n = arr.length;
	        
	        
	        for (int i = 1; i < n; ++i) {
	            int key = arr[i];
	            int j = i - 1;
	            while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j];
	                j = j - 1;

	            }
	            arr[j + 1] = key;
	      
	            StepIS2++;
	         //   System.out.println("Inter: " +StepIS);
	        }
			return arr;
	    }
	
	   public  int [] selectionSort(int arr[]) {
	        int n = arr.length;
	        for(int i = 0; i < n -1; i ++) {
	            int index_min = i;
	            for (int j = i; j < n; j++) {
	                if(arr[j] < arr[index_min]) {
	                index_min = j;
	                }
	            }
	            if(index_min != i) {
	                int temp = arr[i];
	                arr[i] = arr[index_min];
	                arr[index_min] = temp;
	                printArray(arr);
	                StepSS++;
	            }
	        }
			return arr;
	    }
	  
	   public  int[] bubbleSort(int arr[]) {
	        int length = arr.length;
	        int temp;

	        for (int i = 0; i < length - 1; i++)
	            for (int j = 0; j < length - i - 1; j++) {
	                if(arr[j] > arr[j + 1]) {
	                    temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                    StepBS++;
	                    printArray(arr);
	                }
	            }
        //    System.out.println("Buuble: " + StepBS);
	        return arr;
	    }
	  
	   
	   public int[] shellSort(int array[], int n) {
		   
		   	for (int interval = n / 2; interval > 0; interval /= 2) {
		     for (int i = interval; i < n; i += 1) {
		    	 int temp = array[i];
		    	 int j;
		    	 	for (j = i; j >= interval && array[j - interval] > temp; j -= interval) {
		    	 		array[j] = array[j - interval];
		    	 		 StepSheS++;
		                 printArray(array);

		    	 		 
		    	 }
		    	 array[j] = temp;
		     }
		   }	   
		   return array;
		}


	   public  int [] quickSort1(int[] arr, int low, int high) {

		 
	        if (low < high) {
	            int pi = partition1(arr, low, high);
	            quickSort1(arr, low, pi - 1);
	            quickSort1(arr, pi + 1, high);
	            StepQS1++;
	        }
	       
			return arr;
	    }
	
	   
	   public  int [] quickSort2(int[] arr, int low, int high) {

	        if (low < high) {
	            int pi = partition2(arr, low, high);
	            quickSort2(arr, low, pi - 1);
	            quickSort2(arr, pi + 1, high);
	            StepQS2++;

	        }
	       
			return arr;
	    }
	   
	   public  int [] countSort1(int arr[], int n) { 
	        int[] output = new int[n];


	        int max = arr[0];
	        for (int i = 1; i < n; i++) {
	            if (arr[i] > max)
	                max = arr[i];
	        }
	        int[] count = new int[max + 1];

	        for (int i = 0; i < max; ++i) {	
	            count[i] = 0;
	        }

	        for (int i = 0; i < n; i++) {
	            count[arr[i]]++;
	            printArray(arr);
	            StepCS1++;

	        }

	        for (int i = 1; i <= max; i++) {
	            count[i] += count[i - 1];
	        }

	        for (int i = n - 1; i >= 0; i--) {
	            output[count[arr[i]] - 1] = arr[i];
	            count[arr[i]]--;
	        }

	        for (int i = 0; i < n; i++) {
	            arr[i] = output[i];
	        }

			return output;
	    }    
	   
	   public  int [] countSort2(int arr[], int n) { 
	        int[] output = new int[n];


	        int max = arr[0];
	        for (int i = 1; i < n; i++) {
	            if (arr[i] > max)
	                max = arr[i];
	        }
	        int[] count = new int[max + 1];

	        for (int i = 0; i < max; ++i) {	
	            count[i] = 0;
	        }

	        for (int i = 0; i < n; i++) {
	            count[arr[i]]++;
	            printArray(arr);
	            StepCS2++;
	        }

	        for (int i = 1; i <= max; i++) {
	            count[i] += count[i - 1];
	        }

	        for (int i = n - 1; i >= 0; i--) {
	            output[count[arr[i]] - 1] = arr[i];
	            count[arr[i]]--;
	        }

	        for (int i = 0; i < n; i++) {
	            arr[i] = output[i];
	        }

			return output;
	    }    
	   	   
	    public int[] Mergesort(int arr[], int l, int r) {

	        if (l < r) {
	            int m =l+ (r-l)/2;

	            Mergesort(arr, l, m);
	            Mergesort(arr, m + 1, r);
	            

	            merge(arr, l, m, r);
	            printArray(arr);
	            StepMS++;
	        }
	        return arr;
	    }
	    
	    public int[] Mergesort2(int arr[], int l, int r) {

	        if (l < r) {
	            int m =l+ (r-l)/2;

	            Mergesort2(arr, l, m);
	            Mergesort2(arr, m + 1, r);
	            

	            merge(arr, l, m, r);
	            StepMS2++;
	        }
	        return arr;
	    }
	   
	   public void sifirla() {
		    StepIS=0; 
		    StepIS2=0; 
		    StepSS=0;
		    StepBS=0;
		    StepSheS=0; 
		    StepQS1=0; 
		    StepQS2=0; 
		    StepCS1=0; 
		    StepCS2=0; 
		    StepMS=0;
		    StepMS2=0;

		    step = "";
	   }
	   
	   void merge(int arr[], int l, int m, int r) {

	        int n1 = m - l + 1;
	        int n2 = r - m;

	        int L[] = new int[n1];
	        int R[] = new int[n2];

	        for (int i = 0; i < n1; ++i)
	            L[i] = arr[l + i];
	        for (int j = 0; j < n2; ++j)
	            R[j] = arr[m + 1 + j];


	        int i = 0, j = 0;

	        int k = l;
	        while (i < n1 && j < n2) {
	            if (L[i] <= R[j]) {
	                arr[k] = L[i];
	                i++;
	            }
	            else {
	                arr[k] = R[j];
	                j++;
	            }
	            k++;
	        }

	        while (i < n1) {
	            arr[k] = L[i];
	            i++;
	            k++;
	        }

	        while (j < n2) {
	            arr[k] = R[j];
	            j++;
	            k++;
	        }
	    }
	   
	   public static String printArray(int arr[]) {
		   
		   String satir = "";
	        int n = arr.length;
	        for (int i = 0; i < n; ++i) {
	        	satir += arr[i] + " ";
	        }
	        step += satir + "\n";	        
	        return step;
	    }
	   
	  
	   public int [] forGrafic(int dizi []) {
		   int sonDizi[] = new int [dizi.length];
		   
		   
			   dizi[0] = StepIS;
			   dizi[1] = StepSS;
			   dizi[2] = StepBS;
			   dizi[3] = StepSheS;
			   dizi[4] = StepQS1;
			   dizi[5] = StepCS1;
			   dizi[6] = StepMS;
			   	   
		   return dizi;
	   }
	       
	   public static void swap1(int[] arr, int i, int j) {
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }
	
	   public static void swap2(int[] arr, int i, int j) {
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }
	  
	   public static int partition1(int[] arr, int low, int high) {
	        int pivot = arr[high];
	        int i = (low - 1);
	        
	        for(int j = low; j <= high - 1; j++) {
	            if (arr[j] < pivot) {
	                i++;
	                swap1(arr, i, j);
	            }
	            
	        }
	        swap1(arr, i + 1, high);
	        printArray(arr);
	        return (i + 1);
	    }    
	   
	   public static int partition2(int[] arr, int low, int high) {
	        int pivot = arr[high];
	        int i = (low - 1);
	        
	        for(int j = low; j <= high - 1; j++) {
	            if (arr[j] < pivot) {
	                i++;
	                swap2(arr, i, j);
	            }
	            
	        }
	        swap2(arr, i + 1, high);
	        printArray(arr);
	        return (i + 1);
	    }    

	   public static int [] random(int dizieleman) {
	    	int randomArry[] = new int [dizieleman];

	        for(int i =0; i< randomArry.length;i++ ) {
	        	randomArry[i] = (int)(Math.random()*1000);
	        }
	    	
	    	return randomArry;
	    }
}
