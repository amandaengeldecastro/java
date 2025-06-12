import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public interface FilePersistence {
    String write(final String data);

    boolean removeContent(final String sentence);

    String replace(final String oldContent, final String newContent);

    String findAll();

    String fingBy(final String sentence);

    private void clearFile() {
        try (OutputStream outputStream = new FileOutputStream(currentDir + storedDir + fileName)) {
            System.out.println("Inicializando recursos (%s) \n", currentDir + storedDir + fileName);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}