package arrays;

public class SearchElement {
	public static void main(String[] args) {
		int a[] = { 3, 6, 9, 2, 6, 9, 2, 8 };
		int n = a.length, temp = 2;
		int index = -1;
		for (int i = 0; i < n; i++) {
			if (a[i] == temp) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("not exists");
		} else {
			System.out.println("exists" + "  " + index);
		}
	}

}
