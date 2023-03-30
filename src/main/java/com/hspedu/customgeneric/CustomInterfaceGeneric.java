package com.hspedu.customgeneric;

public class CustomInterfaceGeneric {
	public static void main(String[] args) {

	}

}

interface IUsb<U, R> {
	R get(U u);

	void hi(R r);

	void run(R r1, R r2, U u1, U u2);

	default R method(U u) {
		return null;
	}
}
interface IA extends IUsb<String,Double>{
	
}
class AA implements IA{

	@Override
	public Double get(String u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void hi(Double r) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run(Double r1, Double r2, String u1, String u2) {
		// TODO Auto-generated method stub
		
	}
	
}
class BB implements IUsb<Integer,Float>{

	@Override
	public Float get(Integer u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void hi(Float r) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run(Float r1, Float r2, Integer u1, Integer u2) {
		// TODO Auto-generated method stub
		
	}
	
}
class CC implements IUsb{

	@Override
	public Object get(Object u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void hi(Object r) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run(Object r1, Object r2, Object u1, Object u2) {
		// TODO Auto-generated method stub
		
	}
	
}