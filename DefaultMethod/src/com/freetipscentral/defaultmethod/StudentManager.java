package com.freetipscentral.defaultmethod;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.freetipscentral.defaultmethod.domain.Student;

public class StudentManager {
	public static void main(String args[]) {
		List<Student> students = new ArrayList<Student>();
		
		//Create Students and add to list
		Student student1 = new Student("Karen",1);
		Student student2 = new Student("Rahul",2);
		students.add(student1);
		students.add(student2);
		
		//Iterate through the list and print the student objects
		students.forEach(new Consumer<Student>() {
			public void accept(Student s) {
				System.out.println(s);
			}
		});
	}
}
