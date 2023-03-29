package com.hspedu.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericDetail {
	@SuppressWarnings({ "all" })
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		// List<int> list2=new ArrayList<int>();

		Pig<A> aPig = new Pig<A>(new A());
		aPig.f();
		Pig<A> aPig2 = new Pig<A>(new B());
		aPig2.f();

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		ArrayList<Integer> list3 = new ArrayList<>();
		List<Integer> list4 = new ArrayList<>();

	}

}

class A {
}

class B extends A {
}

class Pig<E> {
	E e;

	public Pig(E e) {
		super();
		this.e = e;
	}

	public void f() {
		System.out.println(e.getClass());
	}
}