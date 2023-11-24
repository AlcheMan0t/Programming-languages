package ass1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main1 {
	public static void main(String[] args) {
		Class tst = Test.class;
		System.out.println("The name of the class is " + tst.getName());
		Constructor constructor;
		try {
			constructor = tst.getConstructor();
			System.out.println("The name of the constructor is " + constructor.getName());
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Method[] methods = tst.getMethods();
		for (Method m : methods) {
			System.out.println("Method name: " + m.getName());
		}
		System.out.println("Printing the result of method 1:");
		try {
			Method methodCall1 = tst.getDeclaredMethod("method1");
			try {
				methodCall1.invoke(tst);
			}catch (Exception e) {
				e.printStackTrace();
			}
			
			Method methodCall2 = tst.getDeclaredMethod("method2", int.class);
			
			try {
				methodCall2.invoke(tst, 15);
			}catch (Exception e) {
				e.printStackTrace();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			Field field = tst.getDeclaredField("s");
			System.out.println(field.get(tst));
			field.setAccessible(true);
			System.out.println(field.get(tst));
			System.out.println("Print the changed value of s");
			field.set(tst, "JAVA");
			Method methodCall1 = tst.getClass().getDeclaredMethod("method1");
			methodCall1.invoke(tst);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
