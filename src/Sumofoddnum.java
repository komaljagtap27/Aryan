
public class Sumofoddnum {
public static void main(String args[])
{
	int sum_odd=0,sum_even=0;
for(int i=0;i<10;i++){
	if(i%2 ==1)// for odd number
	{
		System.out.println("odd num::"+i);
		sum_odd=sum_odd+i;
	}
	if(i%2 ==0)
	{
		System.out.println("odd num::"+i);
		sum_even=sum_even+i;
	}
	
}
System.out.println("sum of all odd num::"+sum_odd);
System.out.println("sum of all even num::"+sum_even);
}
}
