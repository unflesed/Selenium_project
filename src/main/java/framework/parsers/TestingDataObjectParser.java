package framework.parsers;

import com.google.gson.Gson;
import framework.parsers.objects.User;

import java.nio.file.Files;
import java.nio.file.Paths;

public class TestingDataObjectParser {
    private static final String PATH = "src/main/resources/testingData.json";
    public static User[] getUsers() throws Exception {
        String testingData = convertFileIntoString(PATH);

        Gson gson = new Gson();
        User[] users = gson.fromJson(testingData, User[].class);
        for (User user : users) {
            System.out.println(user);
        }
        return users;
    }

    public static String convertFileIntoString(String file) throws Exception
    {
        return new String(Files.readAllBytes(Paths.get(file)));
    }
}
