package framework.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FilesUtil {
    private static final String TEMPORARY_FILE_EXTENSION = "tmp";
    public static void waitUntilFileDownloaded(String path) throws Exception {
        int count1 = 0;
        int count2;
        List<Path> resultLst = Files.walk(Paths.get(path))
                .filter(Files::isRegularFile)
                .collect(Collectors.toList());
        for (Path item : resultLst) {
            if (item.toString().endsWith(TEMPORARY_FILE_EXTENSION)) {
                count1++;
            }
        }
        do{
            resultLst.clear();
            count2 = 0;
            resultLst = Files.walk(Paths.get(path))
                    .filter(Files::isRegularFile)
                    .collect(Collectors.toList());
            for (Path value : resultLst) {
                if (value.toString().endsWith(TEMPORARY_FILE_EXTENSION)) {
                    count2++;
                }
            }
        }while(count1 == count2 && count1 != 0);
    }
    public static void deleteFile(String pathToFile){
        try {
            Files.delete(Paths.get(pathToFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
