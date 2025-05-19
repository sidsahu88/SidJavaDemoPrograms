package com.demo.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee2 {

	private int empId;
	private String empName;
	private Department2 dept;

	public Employee2(int empId, String empName, Department2 dept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dept = dept;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public Department2 getDept() {
		return dept;
	}

	@Override
	public String toString() {
		return "Employee2 [empId=" + empId + ", empName=" + empName + ", dept=" + dept + "]";
	}

}

class Department2 {

	private int deptId;
	private String deptName;

	public Department2(int deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}

	public int getDeptId() {
		return deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + "]";
	}

}

public class EmployeeListInDepartmentDemo {

	static HashMap<Employee2, Department2> empMap = new HashMap<Employee2, Department2>();

	static void insertEmp() {
		Department2 d1 = new Department2(123, "HR");
		Employee2 e1 = new Employee2(123, "Siddharth", d1);

		System.out.println("E1 hashcode: " + e1.hashCode());

		empMap.put(e1, d1);
	}

	static void getEmp() {
		Department2 d1 = new Department2(123, "HR");
		Employee2 e1 = new Employee2(123, "Siddharth", d1);

		System.out.println("E1 hashcode: " + e1.hashCode() + "\n" + empMap.get(e1));
	}

	public static void main(String[] args) {

		Department2 d1 = new Department2(123, "HR");
		Department2 d2 = new Department2(1234, "Tech");

		Employee2 e1 = new Employee2(123, "Siddharth", d2);
		Employee2 e2 = new Employee2(124, "Sangita", d2);
		Employee2 e3 = new Employee2(125, "Kanha", d1);

		List<Employee2> list = new ArrayList<>();

		list.add(e1);
		list.add(e2);
		list.add(e3);

		HashMap<String, List<Employee2>> hm = new HashMap<>();

		for (Employee2 e : list) {

			//hm.computeIfAbsent(e.getDept().getDeptName(), key -> new ArrayList<Employee2>()).add(e);

			List<Employee2> nl = new ArrayList<>();

			if (hm.containsKey(e.getDept().getDeptName()))
				nl = hm.get(e.getDept().getDeptName());

			nl.add(e);

			hm.put(e.getDept().getDeptName(), nl);
		}

		for (Map.Entry<String, List<Employee2>> entry : hm.entrySet()) {
			System.out.println("Department: " + entry.getKey() + "\nEmployees in the Dept: " + entry.getValue());
			System.out.println();
		}

		/*
		 * Testing if not overidden hashcode will be same for to object with same data.
		 */
		insertEmp();
		getEmp();

	}

}
