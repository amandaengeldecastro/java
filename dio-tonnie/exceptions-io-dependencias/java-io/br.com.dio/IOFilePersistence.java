import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

public class IOFilePersistence implements FilePersistence {
    private final String currentDir = System.getProperty("user.dir");
    private final String storedDir = "/managedFiles/IO/";
    private final String fileName;

    public IOFilePersistence(String fileName) throws IOException {
        this.fileName = fileName;
        var file = new File(currentDir + storedDir);
        if (!file.exists() && !file.mkdirs())
            throw new IOException("Erro ao criar arquivo");

        clearFile();
    }

    private void clearFile() {
        try (OutputStream outputStream = new FileOutputStream(currentDir + storedDir + fileName)) {
            System.out.printf("Inicializando recursos (%s)%n", currentDir + storedDir + fileName);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public String write(final String data) {
        try (
                var fileWriter = new FileWriter(currentDir + storedDir + fileName, true);
                var bufferedWriter = new BufferedWriter(fileWriter);
                var printWriter = new PrintWriter(bufferedWriter)

        ) {
            printWriter.println(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    @Override
    public boolean removeContent(final String sentence) {
        return false;
    }

    @Override
    public String replace(final String oldContent, final String newContent) {
        return null;
    }

    @Override
    public String findAll() {
        return null;
    }

    @Override
    public String fingBy(final String sentence) {
        return null;
    }

}
