package com.hb.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import io.restassured.path.json.JsonPath;

public class Utilities extends Constants {

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
