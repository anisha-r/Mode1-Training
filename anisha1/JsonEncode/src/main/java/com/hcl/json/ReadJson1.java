package com.hcl.json;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Date;
import java.util.ArrayList;
import java.util.stream.Stream;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import com.hcl.model.Employee;

public class ReadJson1 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {

		StringBuilder contentBuilder = new StringBuilder();
		try (Stream<String> stream = Files.lines(Paths.get("C:/Users/Coalesce/Downloads/document.json"),
				StandardCharsets.UTF_8)) {
			stream.forEach(s -> contentBuilder.append(s));
		} catch (IOException e) {
			e.printStackTrace();
		}
		String s = contentBuilder.toString();
		Object obj = JSONValue.parse(s);

		JSONObject jsonObject = (JSONObject) obj;
		JSONObject jsonobj = (JSONObject) jsonObject.get("employees");
		JSONArray array = (JSONArray) jsonobj.get("employee");
		ArrayList<Employee> list = new ArrayList<>();
		for (int i = 0; i < array.size(); i++) {
			Employee emp = new Employee();
			JSONObject object = (JSONObject) array.get(i);

			long no = (long) object.get("no");
			emp.setNo(no);
			String name = (String) object.get("name");
			emp.setName(name);
			long salary = (long) object.get("salary");
			emp.setSalary(salary);
			String band = (String) object.get("band");
			emp.setBand(band);
			String dateofjoin = (String) object.get("dateofjoin");
			emp.setDateofjoin(dateofjoin);
			System.out.println(no + " " + name + " " + salary + " " + band + " " + dateofjoin);
			list.add(emp);
		}
		list.forEach((var) -> System.out.println(var));
	}
}
