package com.hello;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.List;


public class Test {

	public static void main(String[] args) throws Exception {
		List<String> ls = Files.readAllLines(Paths.get("C:/Users/HP/Desktop/1.txt"));
		byte[] bytes = Base64.getDecoder().decode(ls.get(0));
		try {
			Files.write(Paths.get("C:/Users/HP/Desktop/1.dxf"), bytes);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}