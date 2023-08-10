package framework.parsers;

import org.json.JSONObject;

import java.nio.file.Files;
import java.nio.file.Paths;

public class TestingDataParser {
    private static final String PATH_FOR_TC_5 = "src/main/resources/testingDataForTC_5.json";
    private static final String AGE_KEY = "age";
    public static int getAge() throws Exception {

        return getJSONTestingDataObj().getInt(AGE_KEY);
    }

    public static JSONObject getJSONTestingDataObj() throws Exception {
        String config = convertFileIntoString(PATH_FOR_TC_5);

        return new JSONObject(config);
    }

    public static String convertFileIntoString(String file) throws Exception
    {
        return new String(Files.readAllBytes(Paths.get(file)));
    }
}
