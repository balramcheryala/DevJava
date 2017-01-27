package CustomInterface;

import java.lang.reflect.Method;

public class Accessing {

	@CustomInterface(name = "tableNote")
	public void show() {
		System.out.println("Custom Interface");
	}

	public static void main(String[] args) throws Exception {

		Accessing acc = new Accessing();

		Method m = acc.getClass().getMethod("show");
		
		//CustomInterface ci = m.getAnnotation(Accessing.class);
	}
}
