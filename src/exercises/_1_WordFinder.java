package exercises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _1_WordFinder {

	public static void main(String[] args) {
		/* Print all the words beginning with P that are over 10 characters. */		
		List<String> words = loadWordList();
		Stream<String> streamOfWords = words.stream();
		
		List<String> resultWords = streamOfWords
				.filter(word -> word.toUpperCase().charAt(0)=='P')
				.filter(word -> word.length() > 10)
				.collect(Collectors.toList());
		
		System.out.println(resultWords);	
	}

	public static List<String> loadWordList() {
		List<String> messages = new ArrayList<String>();
		File file = new File("resource/words.txt");

		try {
			BufferedReader buffer = new BufferedReader(new FileReader(file));
			String aLine;
			while ((aLine = buffer.readLine()) != null) {
				messages.add(aLine);
			}
			buffer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return messages;
	}

}
