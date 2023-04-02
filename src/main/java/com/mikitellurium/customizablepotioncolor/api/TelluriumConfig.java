package com.mikitellurium.customizablepotioncolor.api;

import net.fabricmc.loader.api.FabricLoader;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Tellurium Config
 * Fabric Version 1.2.0
 *
 * You can use and modify this freely if you want, just respect the License
 * and credit me.
 *
 * MIT License
 *
 * Copyright (c) 2023 Miki_Tellurium
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

@SuppressWarnings("rawtypes")
public class TelluriumConfig {

    private static final String fileExtension = ".properties";

    // Config file builder
    public static class Builder {

        private final String file;
        private final String fileName; // Using the mod id suggested

        private final List<String> COMMENTS = new ArrayList<>();
        private final List<ConfigEntry> ENTRIES = new ArrayList<>();

        public Builder(String fileName) {
            this.fileName = fileName;
            this.file = FabricLoader.getInstance().getConfigDir().resolve(this.fileName + fileExtension).toString();
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
            ConfigEntry<Boolean> newEntry = new ConfigEntry<>(this, key, defaultValue);
            ENTRIES.add(newEntry);
            return newEntry;
        }

        // Integer
        public ConfigEntry<Integer> define(String key, int defaultValue) {
            ConfigEntry<Integer> newEntry = new ConfigEntry<>(this, key, defaultValue);
            ENTRIES.add(newEntry);
            return newEntry;
        }

        public IntRangeConfigEntry defineInRange(String key, int minValue, int maxValue, int defaultValue) {
            IntRangeConfigEntry newEntry = new IntRangeConfigEntry(this, key, minValue, maxValue, defaultValue);
            ENTRIES.add(newEntry);
            return newEntry;
        }
        
        // Double
        public ConfigEntry<Double> define(String key, double defaultValue) {
            ConfigEntry<Double> newEntry = new ConfigEntry<>(this, key, defaultValue);
            ENTRIES.add(newEntry);
            return newEntry;
        }

        // Long
        public ConfigEntry<Long> define(String key, long defaultValue) {
            ConfigEntry<Long> newEntry = new ConfigEntry<>(this, key, defaultValue);
            ENTRIES.add(newEntry);
            return newEntry;
        }

        // String
        public ConfigEntry<String> define(String key, String defaultValue) {
            ConfigEntry<String> newEntry = new ConfigEntry<>(this, key, defaultValue);
            ENTRIES.add(newEntry);
            return newEntry;
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
                for (ConfigEntry entry : ENTRIES) {
                    String entrySeparator = "=";

                    if (entry.getComment() != null) {
                        writer.write("# " + entry.getComment() + newline);
                    }

                    if (entry instanceof IntRangeConfigEntry) {
                        writer.write("# Range: min=" + ((IntRangeConfigEntry) entry).getMinValue() +
                                        ", max=" + ((IntRangeConfigEntry) entry).getMaxValue() + newline);
                    }

                    writer.write(entry.getKey() + entrySeparator + entry.getValue() + newline);
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
                        throw new IllegalConfigValueException("Invalid value type in config file \"" + this.getConfigFilePath() + "\" on line " + line);
                    }

                    return true;
                } else {
                    throw new IllegalConfigValueException("Syntax error in config file \"" + this.getConfigFilePath() + "\" on line " + line);
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

        private ConfigEntry(Builder parent, String key, T defaultValue) {
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

        public void setValue(T value) {
            this.value = value;
        }

        // The comment get placed before the actual field
        public ConfigEntry<T> comment(String comment) {
            this.comment = comment;
            return this;
        }

        private String getComment() {
            return comment;
        }

    }

    public static class IntRangeConfigEntry extends ConfigEntry<Integer> {

        private final int minValue;
        private final int maxValue;

        private IntRangeConfigEntry(Builder parent, String key, int minValue, int maxValue, int defaultValue) {
            super(parent, key, defaultValue);
            this.minValue = minValue;
            this.maxValue = maxValue;
        }

        public int getMinValue() {
            return minValue;
        }

        public int getMaxValue() {
            return maxValue;
        }

        @Override
        public void setValue(Integer value) {
            if (value < minValue) {
                super.setValue(minValue);
            } else if (value > maxValue){
                super.setValue(maxValue);
            } else {
                super.setValue(value);
            }
        }

        @Override
        public IntRangeConfigEntry comment(String comment) {
            super.comment(comment);
            return this;
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

    public static class IllegalConfigValueException extends IllegalArgumentException {

        public IllegalConfigValueException() {
            super();
        }

        public IllegalConfigValueException(String s) {
            super(s);
        }

        public IllegalConfigValueException(String message, Throwable cause) {
            super(message, cause);
        }

        public IllegalConfigValueException(Throwable cause) {
            super(cause);
        }

    }

}
