## 📚 Comparativo: Java IO vs NIO vs NIO.2

### 📘 Java IO (java.io)
- Introduzido no Java 1.0
- Baseado em **streams** (`InputStream`, `OutputStream`, `Reader`, `Writer`)
- Operações **bloqueantes e síncronas**
- Ideal para tarefas simples de entrada/saída
- Baixa performance com grande número de conexões simultâneas

✅ Simples de usar  
❌ Baixa escalabilidade

---

### ⚙️ Java NIO (java.nio)
- Introduzido no Java 1.4
- Baseado em **buffers** (`ByteBuffer`, `CharBuffer`)
- **Não bloqueante (non-blocking)** — ideal para aplicações de rede
- Utiliza **Channels** e **Selectors**
- Permite **multiplexação** de canais com uma única thread

✅ Alta performance com rede e arquivos grandes  
❌ Mais complexo de implementar

---

### 📂 Java NIO.2 (java.nio.file)
- Introduzido no Java 7
- Nova API para manipulação de arquivos e diretórios
- Usa **Path**, **Files**, **FileVisitor**, etc.
- Suporte a:
  - **Atributos de arquivos**
  - **Links simbólicos**
  - **Travamento de arquivos**
  - **Operações assíncronas**
  - **FileSystem API** (acesso a sistemas de arquivos virtuais)

✅ Completo e moderno  
❌ Levemente mais verboso

---

### 🧩 Comparativo Geral

| Característica                  | Java IO              | Java NIO            | Java NIO.2                        |
|--------------------------------|----------------------|---------------------|----------------------------------|
| Paradigma                      | Stream               | Buffer              | Caminhos e arquivos (`Path`)     |
| Sincronismo                    | Bloqueante           | Não bloqueante      | Ambos                            |
| Concorrência                   | Baixa                | Alta                | Alta (com `AsynchronousFileChannel`) |
| Operações com arquivos         | Básicas              | Avançadas           | Muito avançadas                  |
| Manipulação de diretórios      | Limitada             | Limitada            | Recursiva, completa              |
| Suporte a atributos e links    | Limitado             | Limitado            | Completo                         |

---

## 📄 Exemplos de Leitura de Arquivo

### 1. Java IO (`java.io`)
```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOExample {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("exemplo.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```
### 2. Java NIO (java.nio)
```java
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class NIOExample {
    public static void main(String[] args) {
        Path path = Path.of("exemplo.txt");

        try (FileChannel channel = FileChannel.open(path, StandardOpenOption.READ)) {
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            while (channel.read(buffer) > 0) {
                buffer.flip();
                while (buffer.hasRemaining()) {
                    System.out.print((char) buffer.get());
                }
                buffer.clear();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```
### 3. Java NIO.2 (java.nio.file)
```java
import java.nio.file.Files;
import java.nio.file.Path;

public class NIO2StreamExample {
    public static void main(String[] args) {
        Path path = Path.of("exemplo.txt");

        try (var stream = Files.lines(path)) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

```

E para leituras assincronas:
```java
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.Future;

public class AsyncReadExample {
    public static void main(String[] args) {
        Path path = Path.of("exemplo.txt");

        try (AsynchronousFileChannel channel = AsynchronousFileChannel.open(path, StandardOpenOption.READ)) {
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            Future<Integer> result = channel.read(buffer, 0);

            buffer.flip();
            while (buffer.hasRemaining()) {
                System.out.print((char) buffer.get());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

