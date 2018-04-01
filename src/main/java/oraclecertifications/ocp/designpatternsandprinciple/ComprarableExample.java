package oraclecertifications.ocp.designpatternsandprinciple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComprarableExample implements Comparable<ComprarableExample> {

	private String name;

	public ComprarableExample(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "ComprarableExample [name=" + name + "]";
	}

	@Override
	public int compareTo(ComprarableExample o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}

	public static void main(String[] args) {
		List<ComprarableExample> compExam = new ArrayList<>();
		compExam.add(new ComprarableExample("Tsetso"));
		compExam.add(new ComprarableExample("Ivan"));
		Collections.sort(compExam);
		System.out.println(compExam);

	}
}
