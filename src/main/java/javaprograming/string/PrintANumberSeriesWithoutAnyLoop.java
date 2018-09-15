package javaprograming.string;

public class PrintANumberSeriesWithoutAnyLoop {
	static int i = 1;
	static int max = 10;

	public static void main(String args[]) {

		printno(i,max);

	}

	public static void printno(int n,int maxNo) {

		if (n <= maxNo) {
			System.out.println(n);
			printno(n + 1,maxNo);
		}
	}
}
