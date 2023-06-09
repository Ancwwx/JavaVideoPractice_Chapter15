package com.hspedu.generic;

import java.util.ArrayList;
import java.util.Comparator;

public class GenericExercise02 {
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(new Employee("tom", 20000, new MyDate(2000, 11, 11)));
		employees.add(new Employee("jack", 12000, new MyDate(2001, 12, 12)));
		employees.add(new Employee("hsp", 50000, new MyDate(1980, 10, 10)));

		System.out.println("employees=" + employees);
		System.out.println("===============================雇员排序后================================");
		employees.sort(new Comparator<Employee>() {
			public int compare(Employee emp1, Employee emp2) {
				if (!(emp1 instanceof Employee && emp2 instanceof Employee)) {
					System.out.println("类型不匹配");
					return 0;
				}
				int i = emp1.getName().compareTo(emp2.getName());
				if (i != 0) {
					return i;
				}
				return emp1.getBirthday().compareTo(emp2.getBirthday());
			}
		});
		System.out.println(employees);
	}

}
