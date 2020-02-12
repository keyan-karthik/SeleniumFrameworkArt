import java.util.ArrayList;
import java.util.List;

public class ArrayprogramExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int numberArr[]= {8,3,5,2,1,4,6,7,8};
     int duplicateArr[]=numberArr.clone();
     
     int part1Arr[]=new int[3];
     int part2Arr[]=new int[3];
     int part3Arr[]=new int[3];
     List<Integer> list1=new ArrayList();
     List<Integer> list2=new ArrayList();
     List<Integer> list3=new ArrayList();
     int temp = 0;
     // output[]={5,3,8,4,1,2,8,7,6}  1,4,7  0,2,3,5,6,8
     for(int i=0;i<numberArr.length;i+=3)
     {
    	 /*temp=numberArr[0];
         numberArr[0]=numberArr[2];
         numberArr[2]=temp;*/ 
    	 temp=numberArr[i];
    	 numberArr[i]=numberArr[i+2];
    	 numberArr[i+2]=temp;
     }
     
     for(int j=0;j<numberArr.length;j++)
     {
    	 System.out.print(numberArr[j]+" ");
     }
     
		/*
		 * for(int i=0;i<3;i++) { //part1Arr[i]=numberArr[i]; list1.add(numberArr[i]); }
		 * for(int j=3;j<6;j++) { //part2Arr[j]=numberArr[j]; list2.add(numberArr[j]); }
		 * for(int k=6;k<9;k++) { //part3Arr[k]=numberArr[k]; list3.add(numberArr[k]); }
		 * 
		 * System.out.println(list1); System.out.println(list2);
		 * System.out.println(list3);
		 * 
		 * list1.add(3,temp); list1.set(3, list1.get(0)); list1.set(0, list1.get(2));
		 * list1.set(2, list1.get(index)) System.out.println(list1);
		 */		 
    
	}

}
