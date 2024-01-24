package java8features;

interface Sayable1 {
	String sayHello(String name);
}

public class LambdaSinglePara {
	public static void main(String[] args) {
		Sayable1 s1 = name -> {
			return "Hello " + name;
		};
		System.out.println(s1.sayHello("Jaggu"));
	}
}
