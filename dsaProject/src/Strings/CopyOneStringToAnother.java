package Strings;

public class CopyOneStringToAnother {
	
	public static void main(String[] args) {
		String str = "madhu";
        StringBuilder copyString = new StringBuilder("");

        for(int i=0;i<str.length();i++){
            copyString.append(str.charAt(i));
        }
        System.out.println(copyString);
	}

}
