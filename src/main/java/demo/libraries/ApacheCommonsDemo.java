package demo.libraries;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

public class ApacheCommonsDemo {
	public static void main(String[] args) throws IOException {
		String content = FileUtils.readFileToString(new File("src/main/resources/demo.txt"));
		System.out.println(content);
		System.out.println(StringUtils.abbreviate(content, 10));
		System.out.println(RandomStringUtils.randomAlphanumeric(30));
	}
}
