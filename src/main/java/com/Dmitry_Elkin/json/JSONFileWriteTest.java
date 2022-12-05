package com.Dmitry_Elkin.json;

import com.google.gson.*;
import com.google.gson.annotations.Expose;
import com.google.gson.stream.JsonWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JSONFileWriteTest {

    public static String nameRead;
    public static void main(String[] args) {
        try {
            JsonParser parser = new JsonParser();
            Object obj = parser.parse(new FileReader("employee.json"));
            JsonObject jsonObject = (JsonObject) obj;
            System.out.println("The values of employee.json file:" + jsonObject);
                    JsonArray msg = (JsonArray)jsonObject.get("emps");
            Iterator<JsonElement> iterator = msg.iterator();
            while(iterator.hasNext()) {
                nameRead = iterator.next().toString();
                System.out.println(nameRead);
            }
            Name name = new Name();
            name.setName("Empl_added");
            Gson gson = new Gson();
            String json = gson.toJson(name);

            FileWriter file = new FileWriter("employee1.json", false);
            JsonWriter jw = new JsonWriter(file);
            iterator = msg.iterator();
            Employees emps = new Employees();
            while(iterator.hasNext()) {
                emps.addEmployee(gson.fromJson(iterator.next().toString(), Name.class));
            }
            emps.addEmployee(name);
            gson.toJson(emps, Employees.class, jw);
            file.close();
            System.out.println("data added to an existing employee1.json file successfully");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
// Name class
class Name {
  @Expose
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
// Employees class
class Employees {
    @Expose
    List<Name> emps = new ArrayList<>();
    public List<Name> getEmployees() {
        return emps;
    }
    public void addEmployee(Name name) {
        this.emps.add(name);
    }
}