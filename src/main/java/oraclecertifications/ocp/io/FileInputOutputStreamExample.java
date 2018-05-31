package oraclecertifications.ocp.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInputOutputStreamExample {

	/**
	 * Copy file using FileInOutputStream
	 * @param source
	 * @param destination
	 * @throws IOException
	 */
	public static void copy(File source, File destination) throws IOException {
		try (InputStream in = new FileInputStream(source); OutputStream out = new FileOutputStream(destination)) {
			int b;
			while ((b = in.read()) != -1) {
				out.write(b);
			}
		}

	}

	/**
	 * Copy file using BufferInOutputStream
	 * @param source
	 * @param destination
	 * @throws IOException
	 */
	public static void copyBuffer(File source, File destination) throws IOException {
		try (InputStream in = new BufferedInputStream(new FileInputStream(source));
				OutputStream out = new BufferedOutputStream(new FileOutputStream(destination))) {
			byte[] buffer = new byte[1024];
			int lengthRead;
			while ((lengthRead = in.read(buffer)) > 0) {
				out.write(buffer, 0, lengthRead);
				out.flush();
			}
		}
	}

	public static void main(String[] args) throws IOException {
		File source = new File("src\\main\\java\\oraclecertifications\\ocp\\io\\TestClass.java");
		File destination = new File("src\\main\\java\\oraclecertifications\\ocp\\io\\TestFileResult.java");
//		copy(source, destination);
		copyBuffer(source, destination);
		
	}
}
