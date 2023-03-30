package com.hspedu.customgeneric;

public class Customgeneric_ {
	public static void main(String[] args) {

	}

}

class Tiger<T, R, M> {
	String name;
	R r;
	M m;
	T t;
	
	
	public Tiger(String name, R r, M m, T t) {
		super();
		this.name = name;
		this.r = r;
		this.m = m;
		this.t = t;
	}
	public void m1(M m) {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public R getR() {
		return r;
	}
	public void setR(R r) {
		this.r = r;
	}
	public M getM() {
		return m;
	}
	public void setM(M m) {
		this.m = m;
	}
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	
	
}
