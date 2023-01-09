import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class GUISorting {

	private JFrame frame;
	private JTextField textField;
	SortingAlgo so;
	Heap h1;
	Pacman2 pc;
	Grafik gf;
	
	public int arr2 [];
	public int arrInter [];
	public int arrSelect [];
	public int arrbuble [];
	public int arrshell [];
	public int arrquict [];
	public int arrcount [];
    public int arrMerge[];
    public int arrHeap[];
	public int dizi[] = {8,7,4,1,2,5,6,3};
	public int forGraf[];
		
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUISorting window = new GUISorting();
					window.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public GUISorting() {
		initialize();
		so = new SortingAlgo();
		h1=new Heap(100);
		pc = new Pacman2();
	}


	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 790, 593);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(24, 53, 170, 63);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		String alg[] = {"Insertion" ,"Selection" , "Buuble" , "Shell","Quick", "Count","Merge", "Heap"}; 
		final JComboBox comboBox = new JComboBox(alg);
		comboBox.setEditable(true);
		comboBox.setBounds(24, 143, 170, 22);
		frame.getContentPane().add(comboBox);
		comboBox.setSelectedItem("Algoritmalar");
		
		final JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(633, 255, 109, 28);
		frame.getContentPane().add(textArea_2);
		
		final JTextArea textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Monospaced", Font.PLAIN, 14));
		textArea_1.setBounds(24, 325, 193, 158);
		frame.getContentPane().add(textArea_1);
		
		final JTextArea textArea_3 = new JTextArea();
		textArea_3.setFont(new Font("Monospaced", Font.PLAIN, 15));
		textArea_3.setBounds(440, 171, 302, 51);
		frame.getContentPane().add(textArea_3);		
		
		final JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 15));
		textArea.setBounds(440, 109, 302, 51);
		frame.getContentPane().add(textArea);
		
		final JTextArea textArea_4 = new JTextArea();
		textArea_4.setFont(new Font("Monospaced", Font.PLAIN, 14));
		textArea_4.setBounds(423, 323, 319, 220);
		frame.getContentPane().add(textArea_4);
		
		
		JButton btnNewButton = new JButton("Dizi Yap");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    int elemansay=Integer.parseInt(textField.getText());
			    int arr1 [] = new int [elemansay];
	    
				arr1=so.random(elemansay);
			    String s ="";
			   
			    for (int i = 0; i < elemansay; i++) {
			          s+=Integer.toString(arr1[i]) + " ";			            
			       }
			    textArea.setText(s);
			    
			    
			    arrInter = new int [arr1.length];
			    for(int i=0;i<arr1.length;i++) {
			    	arrInter[i] = arr1[i];
			    }
			    	
			    arrSelect = new int [arr1.length];
			    for(int i=0;i<arr1.length;i++) {
			    	arrSelect[i] = arr1[i];
			    }
			    
			    arrbuble = new int [arr1.length];
			    for(int i=0;i<arr1.length;i++) {
			    	arrbuble[i] = arr1[i];
			    }
			    
			    arrshell = new int [arr1.length];
			    for(int i=0;i<arr1.length;i++) {
			    	arrshell[i] = arr1[i];
			    }
			    
			    arrquict = new int [arr1.length];
			    for(int i=0;i<arr1.length;i++) {
			    	arrquict[i] = arr1[i];
			    }
			    arrcount = new int [arr1.length];
			    for(int i=0;i<arr1.length;i++) {
			    	arrcount[i] = arr1[i];
			    }
			    arrMerge = new int [arr1.length];
			    for(int i=0;i<arr1.length;i++) {
			    	arrMerge[i] = arr1[i];
			    }			   
			    arrHeap = new int [arr1.length];
			    for(int i=0;i<arr1.length;i++) {
			    	arrHeap[i] = arr1[i];
			    }
			}
		});
		btnNewButton.setBounds(255, 35, 156, 63);
		frame.getContentPane().add(btnNewButton);
		
		final JButton btnSrala = new JButton("Sırala");
		btnSrala.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int elemanIndex = comboBox.getSelectedIndex();
			    int elemansay=Integer.parseInt(textField.getText());
			    so.sifirla();
			    h1.StepHS=0;
			    h1.StepHS2=0;
			    
				  switch(elemanIndex+1) {
				    case 1:
				    	so.Insertionsort(arrInter);
				    	 String StepIS = Integer.toString(so.StepIS); 
				    	 
				    	 String sInter ="";
					    String sInserStep= so.printArray(arrInter);

				    	arr2 = arrInter;
				    	for(int i=0;i<arrInter.length;i++) {
				    		sInter+=Integer.toString(arr2[i]) + " ";
				    	}
				    	textArea_3.setText(sInter);
				    	textArea_2.setText(StepIS);
				    	textArea_4.setText(sInserStep);

				    break;
				    case 2:
				    	so.selectionSort(arrSelect);
				    	String StepSS = Integer.toString(so.StepSS); 
				    	
				    	String sSeleck ="";
				    	String sSelectStep= so.printArray(arrSelect);
					    	arr2 = arrSelect;
					    	 
					    	for(int i=0;i<arrInter.length;i++) {
					    		sSeleck+=Integer.toString(arr2[i]) + " ";
					    	}
					    	textArea_3.setText(sSeleck);
					    	textArea_2.setText(StepSS);
					    	textArea_4.setText(sSelectStep);

				      break;
				    case 3:
				    	so.bubbleSort(arrbuble);
				    	String StepBS = Integer.toString(so.StepBS); 

				    	 String sBuuble ="";
				    	 String sBuubleStep= so.printArray(arrbuble);
					    	arr2 = arrbuble;
					    	 
					    	for(int i=0;i<arrInter.length;i++) {
					    		sBuuble+=Integer.toString(arr2[i]) + " ";
					    		
					    	}	
					    	textArea_3.setText(sBuuble);
					    	textArea_2.setText(StepBS);
					    	textArea_4.setText(sBuubleStep);

				      break;
				    case 4:
				    	so.shellSort(arrshell,arrshell.length);
				    	String StepSH = Integer.toString(so.StepSheS); 

				    	 String sShell ="";
				    	 String sShellStep= so.printArray(arrshell);

					    	arr2 = arrshell;
					    	 
					    	for(int i=0;i<arrInter.length;i++) {
					    		sShell+=Integer.toString(arr2[i]) + " ";
					    	}
					    	textArea_3.setText(sShell);
					    	textArea_2.setText(StepSH);
					    	textArea_4.setText(sShellStep);

				      break;
				    case 5:
				    	so.quickSort1(arrquict,0,arrquict.length-1);
				    	String StepQS = Integer.toString(so.StepQS1); 

				    	 String sQuick ="";
				    	 String sQuicStep= so.printArray(arrquict);

					    	arr2 = arrquict;
					    	 
					    	for(int i=0;i<arrInter.length;i++) {
					    		sQuick+=Integer.toString(arr2[i]) + " ";
					    	}
					    	textArea_3.setText(sQuick);
					    	textArea_2.setText(StepQS);
					    	textArea_4.setText(sQuicStep);

					    	
				      break;
				    case 6:
				    	so.countSort1(arrcount, arrcount.length);
				    	String StepCO = Integer.toString(so.StepCS1); 

				    	 String sCount ="";
				    	 String sCounttep= so.printArray(arrcount);

					    	arr2 = arrcount;
					    	 
					    	for(int i=0;i<arrInter.length;i++) {
					    		sCount+=Integer.toString(arr2[i]) + " ";
					    	}
					    	textArea_3.setText(sCount);
					    	textArea_2.setText(StepCO);
					    	textArea_4.setText(sCounttep);

				      break;
				    case 7:
				    	so.Mergesort(arrMerge, 0, arrMerge.length-1);
				    	String StepMerge = Integer.toString(so.StepMS); 

				    	 String sMerge ="";
				    	 String sMergeStep= so.printArray(arrMerge);

					    	arr2 = arrMerge;
					    	 
					    	for(int i=0;i<arrInter.length;i++) {
					    		sMerge+=Integer.toString(arr2[i]) + " ";
					    	}
					    	textArea_3.setText(sMerge);
					    	textArea_2.setText(StepMerge);
					    	textArea_4.setText(sMergeStep);

				      break;
				    case 8:
				    	h1.HeapSort(arrHeap);
				    	String StepHeap = Integer.toString(h1.StepHS); 

				    	 String sHeap ="";
				    	 String sHeapStep= h1.printArray(arrHeap);

					    	arr2 = arrHeap;
					    	 
					    	for(int i=0;i<arrInter.length;i++) {
					    		sHeap+=Integer.toString(arr2[i]) + " ";
					    	}
					    	textArea_3.setText(sHeap);
					    	textArea_2.setText(StepHeap);
					    	textArea_4.setText(sHeapStep);

				      break;
				      
				  }  
				    so.Insertionsort2(arrInter);
			    	so.selectionSort(arrSelect);
			    	so.bubbleSort(arrbuble);
			    	so.shellSort(arrshell,arrshell.length);
			    	so.quickSort2(arrquict, 0, arrquict.length-1);
			    	so.countSort2(arrcount, arrcount.length);
			    	so.Mergesort2(dizi, 0, arrMerge.length-1);
			    	h1.HeapSort2(arrHeap);

			    	   forGraf = new int [8];
					   forGraf[0] = so.StepIS2;
					   forGraf[1] = so.StepSS;
					   forGraf[2] = so.StepBS;
					   forGraf[3] = so.StepSheS;
					   forGraf[4] = so.StepQS2;
					   forGraf[5] = so.StepCS2;
					   forGraf[6] = so.StepMS2;
					   forGraf[7] = h1.StepHS2;
		    	
				    textArea_1.setText("Insertion Sort: "+(so.StepIS2 )+"\nSelection Sort: "+ so.StepSS + "\nBubble Sort: "+so.StepBS +"\nShell Sort: "+so.StepSheS+
			                "\nQuick Sort: "+so.StepQS2+"\nCount Sort: "+(so.StepCS2) +"\nMerge Sort: "+ so.StepMS2  +"\nHeap Sort: "+ h1.StepHS2 );
	  
			}
		});
		btnSrala.setBounds(423, 35, 156, 63);
		frame.getContentPane().add(btnSrala);
		
		JLabel lblNewLabel = new JLabel("Dizinin Son Hali");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(335, 169, 95, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Seçilen algoritmada işlem sayısı");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(441, 255, 182, 28);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Diğer Algoritmalar\r\nda işlem sayısı");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(20, 279, 197, 35);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Diğer Adımlar");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(313, 281, 95, 28);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblOluturulanDizi = new JLabel("Oluşturulan Dizi");
		lblOluturulanDizi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblOluturulanDizi.setBounds(335, 116, 95, 28);
		frame.getContentPane().add(lblOluturulanDizi);
		
		JButton btnNewButton_1 = new JButton("Çizdir");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gf.Start2(forGraf);
			}
		});
		btnNewButton_1.setBounds(589, 35, 137, 63);
		frame.getContentPane().add(btnNewButton_1);
		
		
		

	}
}
