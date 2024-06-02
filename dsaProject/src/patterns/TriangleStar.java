package patterns;

//*
//**
//***
//****

public class TriangleStar {

	public static void main(String[] args) {
		int i = 1, n = 4;
		while (i <= n) {
			int j = 1;
			while (j <= i) {
				System.out.printf("*");
				j = j + 1;
			}
			System.out.println();
			i = i + 1;
		}

	}

}
