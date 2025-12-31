package InterviewPrep;

public class NextBigg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 5, 4, 6, 1, 4, 2 };

		for (int i = 0; i < a.length; i++) {
			int max = a[i];
			for (int j = i+1; j < a.length; j++) {
				if (a[j] > max ) {
					max = a[j];
				}

			}
			System.out.println(a[i] + " " + max);
			

		}

	}

}
