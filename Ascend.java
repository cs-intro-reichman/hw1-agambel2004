// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int a = (int)(Math.random()*100);
		int b = (int)(Math.random()*100);
		int c = (int)(Math.random()*100);
		System.out.println(a + " " + b + " " + c);

//checking which number is the maximum and print it
		int max = Math.max(a,b);
		max = Math.max(max ,c);

//checking which number is the minimum 
		int min = Math.min(a,b);
		min = Math.min(min, c);

		int mid = (a+b+c)- max - min;

		System.out.println(min +" "+ mid +" " + max);
	}
}
