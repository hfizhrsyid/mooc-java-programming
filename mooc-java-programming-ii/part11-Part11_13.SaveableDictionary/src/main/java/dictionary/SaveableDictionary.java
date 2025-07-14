package dictionary;

import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SaveableDictionary {
    private HashMap<String, String> dictionary;
    private File file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this.dictionary = new HashMap<>();
        this.file = new File(file);
    }

    public boolean load() {
        try {
            Scanner fileReader = new Scanner(Paths.get(this.file.getName()));
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                this.dictionary.putIfAbsent(parts[0], parts[1]);
            }
            return true;

        } catch (Exception e) {
            System.out.println("File load error: " + e.getMessage());
            return false;
        }
    }

    public boolean save() {
        try {
            PrintWriter pw = new PrintWriter(this.file.getName());
            for (String s : this.dictionary.keySet()) {
                String word = s;
                String translation = this.dictionary.get(s);
                pw.println(word + ":" + translation);
            }

            pw.close();
            return true;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }

    }

    public void add(String word, String translation) {
        this.dictionary.putIfAbsent(word, translation);
    }

    public void delete(String word) {
        if (this.dictionary.containsValue(word)) {
            for(String i : this.dictionary.keySet()) {
                if (this.dictionary.get(i).equals(word)) {
                    this.dictionary.remove(i);
                    return;
                }
            }
        }
        
        this.dictionary.remove(word);
    }

    public String translate(String word) {
        if (this.dictionary.containsValue(word)) {
            for(String i : this.dictionary.keySet()) {
                if (this.dictionary.get(i).equals(word)) {
                    return i;
                }
            }
        } else if (this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        }

        return null;
    }
}
