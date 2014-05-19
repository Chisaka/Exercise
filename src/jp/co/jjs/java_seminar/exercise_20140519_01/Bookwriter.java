/*
package jp.co.jjs.java_seminar.exercise_20140519_01;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Bookwriter {
    public Bookwriter() {
    }
    public void write(){

        try (BufferedWriter writer = Files.newBufferedWriter(
                Paths.get(filePath), Charset.forName("UTF-8"),
                StandardOpenOption.APPEND)) {

            writer.write("あああ");
            writer.write(",");
            writer.newLine();

        } catch (IOException e) {
            e.printStackTrace();

        }
        return null;
    }

}
*/