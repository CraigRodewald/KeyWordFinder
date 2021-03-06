package com.CraigRodewald;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputOutputPractice {

	public static BufferedReader readFiletoArrayList(String fileName) {
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(fileName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		return bufferedReader;
	}

	public static void writeArrayListToFile(StringBuilder sourceCode) {
		InputStream is = new ByteArrayInputStream(sourceCode.toString().getBytes());
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		
		try {

			String inputLine;
			// Save to this filename
			String fileName = "/users/Craig/Desktop/test.html";
			File file = new File(fileName);

			if (!file.exists()) {
				file.createNewFile();
			}

			// Use FileWriter to write file
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);

			while ((inputLine = br.readLine()) != null) {
				bw.write(inputLine);

			}
			System.out.println("Done");
			bw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
