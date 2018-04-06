package demo.java7;

import java.io.IOException;
import java.io.InputStream;

public class Java7TryWithResources {
	public static void main(String[] args) {

		InputStream stream = null;

		// Closing stream before Java 7
		try {
			stream = Thread.currentThread().getContextClassLoader().getResourceAsStream("demo.txt");
		} finally {
			try {
				stream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// Closing stream from Java 7 - try with resources
		try (InputStream stream2 = Thread.currentThread().getContextClassLoader().getResourceAsStream("demo.txt")) {

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
