public class stringplus {
	public static String merge(String a, String b) {
		return a + b; // simple concatenation
	}

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";

		// Merge without space
		String merged = merge(s1, s2);
		System.out.println("Merged (no space): " + merged); // HelloWorld

		// Merge with space (optional)
		String mergedWithSpace = merge(s1, " ") + s2;
		System.out.println("Merged (with space): " + mergedWithSpace); // Hello World
	}
}

