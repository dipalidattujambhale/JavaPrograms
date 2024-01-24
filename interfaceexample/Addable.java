package interfaceexample;

public interface Addable {

	float PI = 3.14f;// public static final float PI=3.14;

	void print();// public abstract void main

	static void add(int a, int b) {
		System.out.println("Add:" + (a + b));
	}

	default void mul(int a, int b) {
		System.out.println("Mul:" + (a * b));
	}

	default void show() {

		System.out.println("Inside show addable");
	}
}
