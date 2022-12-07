package Variable;

public class Arrays {

	public static void main(String[] args) {
   /*
	int a=10;	
	a=20;
	system.out.println(a); 	

*/		
	//data Type array name[] =new data type [size]-syntax	
		int array1[]=new int[4];//declaration/creating and array
	
		array1[0]=10;
		array1[1]=20;
		array1[2]=30;
		array1[3]=40;
		int array1Length=array1.length; //finding the length of an array
		System.out.println(array1Length);
    /*
		System.out.println("The 0index value of Array1"+array1[0];
		System.out.println("The 1index value of Array1"+array1[1];
		System.out.println("The 2index value of Array1"+array1[2];
		System.out.println("The 3index value of Array1"+array1[3];
		*/
		
		//for(int i=0;i<=3;i++)
		for(int i=0;i<array1Length;i++)
		{
		System.out.println("the value of array1 index is: "+array1[i]);
		if (20==array1[1]);
		{
			System.out.println("testing");
		}
		}
	}	
}
