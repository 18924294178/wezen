import java.util.Scanner;
public class maopaopaixu {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入数组长度：");
		int size = input.nextInt();
		int[] array = new int[size];
		System.out.println("请输入数组元素：");
		for(int i=0;i<size;i++){
			array[i]=input.nextInt();
		}
		System.out.println("排序前数组为：");
		outputlist(array);
		System.out.println();
		BubbleSort(array);
		System.out.println("排序后数组为：");
		outputlist(array);
	}
	
	public static void outputlist(int[] array ){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		
	}
	 
	public static void BubbleSort(int[] array) {
		for(int i=1;i<array.length;i++) {
			for(int j=0;j<array.length-i;j++) {
				int temp;
				if(array[j]>array[j+1]) {
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
	}

}
