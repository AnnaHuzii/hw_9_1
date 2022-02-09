package TaskTwo;

import java.io.*;
import java.util.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

class JSONNamesYear {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\AnnaHuzii\\обучение java\\DZ\\hw_9\\src\\main\\java\\TaskTwo\\file.txt");
        File user = new File("C:\\AnnaHuzii\\обучение java\\DZ\\hw_9\\src\\main\\java\\TaskTwo\\user.json");

        Scanner fin = new Scanner(new FileReader(file));
        FileWriter writer = new FileWriter(user);

        List<String> persons = new ArrayList<>();
        int i = 0;
        while (fin.hasNextLine()) {
            String[] arrayPerson = fin.nextLine().split(" ");
            if (i >= 1) {
                String name = arrayPerson[0];
                String ageString = arrayPerson[1];
                int age = Integer.parseInt(ageString.trim());
                Person person = new Person(name, age);
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                String json = gson.toJson(person);
                persons.add(json);
            }
            i++;
        }
        writer.write(String.valueOf(persons));
        writer.flush();
    }
}
