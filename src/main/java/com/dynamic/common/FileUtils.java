package com.dynamic.common;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Created by nuhma on 2017-08-06.
 */
public class FileUtils {

    public static void writeToFile(String path, String content) {
        Path dst = Paths.get(path);
        if (!Files.exists(dst)) {
            try {
                Files.createFile(dst);
            } catch (IOException e) {
                System.err.println(e);
            }
        }
        try (BufferedWriter writer = Files.newBufferedWriter(dst, Charset.defaultCharset(), StandardOpenOption.APPEND)) {
            System.out.println(content);
            writer.write(content);
            writer.write(System.lineSeparator());
            writer.close();
        } catch (IOException e) {
            System.err.println(e);

        }

    }
}
