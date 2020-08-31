package com.gmail.sllawwkoo;

import java.io.FileWriter;
import java.io.IOException;

@SaveTo(path = "Text.txt")
class TextContainer {
    String text = "Super Line";

    @Saver
    public void save(String path) throws IOException {
        FileWriter fw = new FileWriter(path);
        fw.write(text);
        fw.close();
        System.out.println("Done!");

    }
}