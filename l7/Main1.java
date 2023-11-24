public class Main1 {
	public static void main(String[] args) {
		Class tst = Test.class;
		System.out.println("The name of the class is "+ tst.getName());
		Constructor constructor;
		try {
			constructor = tst.getConstructor();
			System.out.println("The name of the constructor is "+constructor.getName());
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Method [] methods = tst.getMethods();
		for (Method m: methods) {
			System.out.println("Method name: "+m.getName());
		}

	}

}
