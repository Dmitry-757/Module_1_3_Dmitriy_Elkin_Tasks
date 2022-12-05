package com.Dmitry_Elkin.json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.parser.ParseException;




/**
 using com.googlecode.json-simple
 */
public class JSONAddDataToFile {
    public static void main(String[] args) {
        JSONParser jsonParser = new JSONParser();

        try {
            Object obj = jsonParser.parse(new FileReader("student2.json"));
            JSONArray jsonArray = (JSONArray)obj;

            System.out.println(jsonArray);

            JSONObject student1 = new JSONObject();
            student1.put("name", "BROCK");
            student1.put("age", 2);

            JSONObject student2 = new JSONObject();
            student2.put("name", "Joe");
            student2.put("age", 3);

            jsonArray.add(student1);
            jsonArray.add(student2);

            System.out.println(jsonArray);

            FileWriter file = new FileWriter("student2.json");
            file.write(jsonArray.toJSONString());
            file.flush();
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
