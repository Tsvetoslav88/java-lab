package oraclecertifications.ocp.io;

import java.io.File;

public class ReadFileInformation {
	public static void main(String[] args) {
		File file = new File("src/main/resources/datastructures/softunit/AATreesandAVLTrees/07. Data-Structures-AVL-Trees-AA-Trees-Lab.docx");
		System.out.println("File exists: "+file.exists());
		if(file.exists()) {
			System.out.println("Absolute path: " + file.getAbsolutePath());
			System.out.println("Is directory: " + file.isDirectory());
			System.out.println("Parent path: " + file.getParent());
			if(file.isFile()) {
				System.out.println("\t"+"File size: " + file.length());
				System.out.println("\t"+"File last modified: " + file.lastModified());
			}
		}else {
			for(File subFile : file.listFiles()) {
				System.out.println("\t"+subFile.getName());
			}
		}
	}
}
