package com.bdb.challenges;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TransposeFile {
    private String filename;
    private List<String> lineItems = new ArrayList<>();

    public TransposeFile(String filename) {
        this.filename = filename;
    }

    public void process() {
        readFile();
        String[] firstLine = lineItems.get(0).split(" ");
        List[] output = new ArrayList[firstLine.length];
        int counter = 0;

        for (String item : firstLine) {
            List<String> line = new ArrayList<>();
            line.add(item);
            output[counter] = line;
            counter++;
        }

        for (int idx = 1; idx < lineItems.size(); idx++) {
            String[] line = lineItems.get(idx).split("  ");
            counter = 0;

            for (String item : line) {
                output[counter].add(item);
                counter++;
            }
        }

        for (List<String> line : output) {
            System.out.println("line = " + line);
        }
    }

    private void readFile() {
        try (Stream<String> streams = Files.lines(Paths.get(filename))) {
            lineItems = streams.collect(Collectors.toList());
        } catch (IOException e) {
            System.out.println("Error while reading file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
