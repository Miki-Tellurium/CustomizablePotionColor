package com.mikitellurium.customizablepotioncolor.api;

import net.minecraftforge.fml.loading.FMLPaths;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Version 1.2.0 for Forge
@SuppressWarnings("rawtypes")
public class ConfigManager {

    private static final String fileExtension = ".properties";

    // Config file builder
    public static class Builder {

        private final String file;
        private final String fileName; // I suggest using the mod id

        private final List<String> COMMENTS = new ArrayList<>();
        private final List<ConfigEntry> ENTRIES = new ArrayList<>();

        public Builder(String fileName) {
            this.fileName = fileName;
            this.file = FMLPaths.CONFIGDIR.get().resolve(this.fileName + fileExtension).toString();
        }

        public String getConfigFilePath() {
            return file;
        }

        public Builder comment(String comment) {
            COMMENTS.add(comment);
            return this;
        }

        // Boolean
        public ConfigEntry<Boolean> define(String key, boolean defaultValue) {
            ConfigEntry<Boolean> newConfig = new ConfigEntry<>(this, key, defaultValue);
            ENTRIES.add(newConfig);
            return newConfig;
        }

        // Integer
        public ConfigEntry<Integer> define(String key, int defaultValue) {
            ConfigEntry<Integer> newConfig = new ConfigEntry<>(this, key, defaultValue);
            ENTRIES.add(newConfig);
            return newConfig;
        }
        
        // Double
        public ConfigEntry<Double> define(String key, double defaultValue) {
            ConfigEntry<Double> newConfig = new ConfigEntry<>(this, key, defaultValue);
            ENTRIES.add(newConfig);
            return newConfig;
        }

        // Long
        public ConfigEntry<Long> define(String key, long defaultValue) {
            ConfigEntry<Long> newConfig = new ConfigEntry<>(this, key, defaultValue);
            ENTRIES.add(newConfig);
            return newConfig;
        }

        // String
        public ConfigEntry<String> define(String key, String defaultValue) {
            ConfigEntry<String> newConfig = new ConfigEntry<>(this, key, defaultValue);
            ENTRIES.add(newConfig);
            return newConfig;
        }

        public void build() throws IOException {
            File file = new File(this.file);
            if (file.exists()) {
                load();
            }
            save();
        }

        public void save() throws IOException{
            FileWriter writer = new FileWriter(file);
            final String newline = System.lineSeparator(); // Wrap text

            // Write comments
            if (COMMENTS.size() > 0) {
                for (String s : COMMENTS) {
                    writer.write("#" + s + newline);
                }
            }
            writer.write(newline);
            writer.write("[Settings]" + newline);
            writer.write(newline);

            // Write config entries
            if (ENTRIES.size() > 0) {
                for (ConfigEntry v : ENTRIES) {
                    String entrySeparator = "=";

                    writer.write("# " + v.getComment() + newline);
                    writer.write(v.getKey() + entrySeparator + v.getValue() + newline);
                    writer.write(newline);
                }
            }

            writer.flush();
            writer.close();
        }

        private void load() throws IOException {
            int index = 0;
            File file = new File(this.file);
            Scanner reader = new Scanner(file);
            for (int line = 1; reader.hasNextLine(); line++) {
                if (parseConfigEntry(reader.nextLine(), line, index)) {
                   index++;
                }
            }
        }

        @SuppressWarnings("unchecked")
        private boolean parseConfigEntry(String entry, int line, int index) {
            if (isValueLine(entry)) {
                String[] entryParts = entry.split("=", 2);

                if (entryParts.length == 2) {
                    if (TypeUtil.isBoolean(entryParts[1])) {
                        ENTRIES.get(index).setValue(Boolean.parseBoolean(entryParts[1]));
                    } else if (TypeUtil.isInteger(entryParts[1])) {
                        ENTRIES.get(index).setValue(Integer.parseInt(entryParts[1]));
                    } else if (TypeUtil.isDouble(entryParts[1])) {
                        ENTRIES.get(index).setValue(Double.parseDouble(entryParts[1]));
                    } else if (TypeUtil.isString(entryParts[1])) {
                        ENTRIES.get(index).setValue(String.valueOf(entryParts[1]));
                    } else {
                        throw new RuntimeException("Invalid value type in config file on line " + line + "!");
                    }

                    return true;
                } else {
                    throw new RuntimeException("Syntax error in config file on line " + line + "!");
                }
            }

            return false;
        }

        // Check if the current line we are reading is an entry or a comment
        private boolean isValueLine(String line) {
            if (line.isEmpty()) return false;
            else if (line.startsWith("#") || line.startsWith("[")) return false;
            return true;
        }

    }

    // Object that saves values
    @SuppressWarnings("FieldCanBeLocal")
    public static class ConfigEntry<T> {

        private final Builder builder;
        private String comment;
        private final String key;
        private final T defaultValue;
        private T value;

        protected ConfigEntry(Builder parent, String key, T defaultValue) {
            this.builder = parent;
            this.key = key;
            this.defaultValue = defaultValue;
        }

        public Builder getBuilder() {
            return builder;
        }

        public String getKey() {
            return key;
        }

        public T getDefaultValue() {
            return defaultValue;
        }

        public T getValue() {
            if (value == null) {
                return defaultValue;
            }

            return value;
        }

        protected void setValue(T value) {
            this.value = value;
        }

        // The comment get placed before the actual field
        public ConfigEntry<T> comment(String comment) {
            this.comment = comment;
            return this;
        }

        private String getComment() {
            if (comment == null) {
                return "";
            }
            return comment;
        }

    }

    public static class TypeUtil {

        public static boolean isInteger(String string) {
            Scanner scanner = new Scanner(string);
            return scanner.hasNextInt();
        }

        public static boolean isDouble(String string) {
            Scanner scanner = new Scanner(string);
            return scanner.hasNextDouble();
        }

        public static boolean isBoolean(String string) {
            Scanner scanner = new Scanner(string);
            return scanner.hasNextBoolean();
        }

        public static boolean isString(String string) {
            return true;
        }

    }

}
