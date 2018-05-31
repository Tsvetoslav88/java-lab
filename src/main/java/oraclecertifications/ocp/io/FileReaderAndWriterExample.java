package oraclecertifications.ocp.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReaderAndWriterExample {

	public static List<String> readFile(File source) throws IOException {
		List<String> data = new ArrayList<String>();
		try (BufferedReader reader = new BufferedReader(new FileReader(source))) {
			String s;
			while ((s = reader.readLine()) != null) {
				data.add(s);
			}
		}
		return data;
	}

	public static void writeFile(List<String> data, File destincation) throws IOException {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(destincation))) {
			for (String s : data) {
				writer.write(s);
				writer.newLine();
			}
		}
	}

	public static void main(String[] args) throws IOException {
		File source = new File("src\\main\\resources\\oraclecertifications\\ocp\\io\\SampleCSVFile_2kb.csv");
		File destination = new File("src\\main\\resources\\oraclecertifications\\ocp\\io\\SampleCSVFile_2kbCopy.csv");
		List<String> data = readFile(source);
		for (String record : data) {
			System.out.println(record);
		}
		writeFile(data, destination);
	}
}
