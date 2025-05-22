import java.io.*;
import java.util.*;
import java.util.concurrent.*;

class FileProcessor {
    static String inputFilePath;
    private String outputFilePath;
    private int wordCount;
    private int lineCount;

    public FileProcessor(String inputFilePath, String outputFilePath) {
        this.inputFilePath = inputFilePath;
        this.outputFilePath = outputFilePath;
    }

    public void readFile() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
        String line;
        lineCount = 0;
        wordCount = 0;

        while ((line = reader.readLine()) != null) {
            lineCount++;
            wordCount += line.split("\\s+").length;
        }
        reader.close();
    }

    public void writeResults() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));
        writer.write("Word Count: " + wordCount + "\n");
        writer.write("Line Count: " + lineCount + "\n");
        writer.close();
    }

    public int getWordCount() {
        return wordCount;
    }

    public int getLineCount() {
        return lineCount;
    }
}

class DataAnalyzer implements Runnable {
    private FileProcessor fileProcessor;
    private Map<String, Integer> results;

    public DataAnalyzer(FileProcessor fileProcessor) {
        this.fileProcessor = fileProcessor;
        this.results = new ConcurrentHashMap<>();
    }

    @Override
    public void run() {
        try {
            fileProcessor.readFile();
            results.put("Word Count", fileProcessor.getWordCount());
            results.put("Line Count", fileProcessor.getLineCount());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Map<String, Integer> getResults() {
        return results;
    }
}

class Statistics extends DataAnalyzer {
    private double averageWordsPerLine;
    private String longestWord;

    public Statistics(FileProcessor fileProcessor) {
        super(fileProcessor);
    }

    @Override
    public void run() {
        super.run();
        calculateStatistics();
    }

    private void calculateStatistics() {
        int lineCount = super.getResults().get("Line Count");
        int wordCount = super.getResults().get("Word Count");
        averageWordsPerLine = lineCount > 0 ? (double) wordCount / lineCount : 0;

        // Calculate longest word
        longestWord = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(FileProcessor.inputFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                for (String word : line.split("\\s+")) {
                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public double getAverageWordsPerLine() {
        return averageWordsPerLine;
    }

    public String getLongestWord() {
        return longestWord;
    }
}

public class Main {
    public static void main(String[] args) {
        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";

        FileProcessor fileProcessor = new FileProcessor(inputFilePath, outputFilePath);
        Statistics statistics = new Statistics(fileProcessor);

        Thread analysisThread = new Thread(statistics);
        analysisThread.start();

        try {
            analysisThread.join();
            statistics.getResults();
            System.out.println("Word Count: " + statistics.getResults().get("Word Count"));
            System.out.println("Line Count: " + statistics.getResults().get("Line Count"));
            System.out.println("Average Words per Line: " + statistics.getAverageWordsPerLine());
            System.out.println("Longest Word: " + statistics.getLongestWord());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
