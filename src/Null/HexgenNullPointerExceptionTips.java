package Null;

public class HexgenNullPointerExceptionTips {

	public static void main(String[] args) {
		try {
			// Example 1: NPE will be thrown if you are trying to access null
			// Object
			HexgenNPE1();
		} catch (NullPointerException npe1) {
			System.out.println("Exception in HexgenNPE1()");
			npe1.printStackTrace();
		}

		try {
			// Example 2: NPE will be thrown if you are trying to convert null
			// String
			HexgenNPE2();
		} catch (NullPointerException npe2) {
			System.out.println("\nException in HexgenNPE2()");
			npe2.printStackTrace();
		}

		try {
			// Example 3: NPE will be thrown if you are trying to access null
			// Object during Class Initialization
			HexgenNPETest npe = new HexgenNPETest();
			npe.getName();
		} catch (NullPointerException npe3) {
			System.out.println("\n Exception in HexgenNPETest()");
			npe3.printStackTrace();
		}

	}

	@SuppressWarnings("null")
	private static void HexgenNPE1() {
		Object HexgenObj = null;
		HexgenObj.hashCode();
	}

	@SuppressWarnings("null")
	private static void HexgenNPE2() {
		String HexgenString;
		HexgenString = "http://Hexgen.com";
		// The line 40 declares a variable named "HexgenString", but, it does
		// not contain a primitive value. Instead it contains a pointer (because
		// the type
		// is String
		// which is a reference type). Since you did not say as yet what to
		// point to Java sets it to null, meaning "I am pointing at nothing".
		// In line 41, the new keyword is used to instantiate (or create) an
		// object of type String and the pointer variable "HexgenString" is
		// assigned this
		// object. You can now reference the object using the dereferencing
		// operator . (a dot).

		System.out.println("\nvalue: " + HexgenString.toString() + ", lenght: " + HexgenString.length());
		System.out.println("No NPE exception on line 51");

		// Now Let's create NPE
		String HexgenString2 = null;
		System.out.println(HexgenString2.toString());

	}
}

class HexgenNPETest {
	private String HexgenName;

	public void setName(String name) {
		this.HexgenName = name;
	}

	public void getName() {
		printName(HexgenName);
	}

	private void printName(String s) {
		System.out.println(s + " (" + s.length() + ")");
	}
}