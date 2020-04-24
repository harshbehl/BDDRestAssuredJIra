package com.hb.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

import io.restassured.path.json.JsonPath;

public class Utilities extends Constants {

	public static PrintStream log = null;

	public static PrintStream getPrintStream() throws FileNotFoundException {

		if (log == null) {
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd_HH_mm_ss");
			LocalDateTime now = LocalDateTime.now();
			log = new PrintStream(new FileOutputStream(System.getProperty("user.dir")+"/logs/"+"logging_" + dtf.format(now) + ".txt"));
		}
		return log;
	}

	public static String getJsonPath(String Response, String key) {
		JsonPath path = new JsonPath(Response);
		return path.get(key).toString();

	}

	public static Object getPropValue(String key) {
		Object value = null;
		try {
			FileInputStream fis = new FileInputStream(Utilities.properties_file_path);
			Properties prop = new Properties();
			prop.load(fis);
			value = prop.get(key);
			fis.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}

		return value;

	}

}
