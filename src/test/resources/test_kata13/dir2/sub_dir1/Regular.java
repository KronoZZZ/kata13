import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(final String[] args) throws IOException {
        new Main().run();
    }

    private void run() throws IOException {
        final Path path = Paths.get(readInput());
        processPath(path);
    }

    private String readInput() {
        System.out.print("Enter file\\dir path: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        while (!Files.exists(Paths.get(input))) {
            System.out.print("Path not valid, try another one: ");
            input = scanner.nextLine().trim();
        }
        return input;
    }

//    private int countCodeLines(final List<String> lines) {
//        int commentedCounter = 0;
//        int commentedBlockCounter = 0;
//        for (final String line : lines) {
//            final String trimmed = line.trim();
//            if (trimmed.endsWith("*/")) {
//                commentedCounter += commentedBlockCounter + 1;
//                commentedBlockCounter = 0;
//                continue;
//            }
//            if (commentedBlockCounter > 0) {
//                commentedBlockCounter++;
//                continue;
//            }
//            if (trimmed.startsWith("/*")) {
//                commentedBlockCounter++;
//                continue;
//            }
//            if (line.isEmpty() || trimmed.startsWith("//")) {
//                commentedCounter++;
//            }
//        }
//        return lines.size() - commentedCounter;
//    }
}
