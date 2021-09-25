import java.io.File;

public class FileUtils {
    public static boolean deleteFiles(File contentsToDelete) {
        File[] allContents = contentsToDelete.listFiles();
        if (allContents != null) {
            for (File file : allContents) {
                deleteFiles(file); // delete temp1, temp2, temp 3...temp9
            }
        }
        return contentsToDelete.delete();
    }
}