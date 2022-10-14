package Printing.POC;

import org.testng.annotations.Test;

public class CheckingConcept {

	
	@Test
	public void execute() {
		StringBuilder sb = new StringBuilder(4);
		sb.append("shashi kumar");

		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println("Git 2nd Push");
		System.out.println("execute");
		
	}
}
