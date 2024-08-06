package strings;

public class stringfunctions {

	public static void main(String[] args) {
		
		//here we are checking if String a starts with M o not

		String a = "Manish";
		System.out.println(a.matches("M(.*)"));
		
		System.out.println(a.contains("Manish"));
		
		System.out.println(a.equals("Manish"));
		
		System.out.println(a.equalsIgnoreCase("manish"));
		
		System.out.println(a.endsWith("h"));
		
		System.out.println(a.length());
		
		System.out.println(a.isBlank());
		
		System.out.println(a.isBlank());
		
		System.out.println(a.toLowerCase());
		
		System.out.println(a.toUpperCase());
		
		System.out.println(a.getClass());
		
        // a.MOREOPTION TO DO	
		
	}

}
