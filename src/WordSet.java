import java.io.*;

public class WordSet {
	private Element[] array;
	private String fileName;
	private int current;
	public WordSet () {
	}
	public WordSet (String fileName) {
		this.fileName = fileName;
		array = new Element[]{
			new Element("grass", "herbe"),
			new Element("ball", "ballon"),
			new Element("tree", "arbre"),
			new Element("three", "trois"),
			new Element("bed", "lit"),
			new Element("browser", "navigateur"),
			new Element("hour", "heure"),
			new Element("trash", "poubelle"),
		};
	}
	public String next () {
		if (array == null || array.length == 0) {
			return null; // TODO Should throw an exception
		}
		current = (current + 1) % array.length;
		return array[current].getFrench();
	}
	public String answer () {
		if (array == null || array.length == 0) {
			return null;
		}
		return array[current].getEnglish();
	}
	public boolean check (String guess) {
		if (array == null || array.length == 0) {
			return false; // TODO Should throw an exception
		}
		return array[current].check(new Translation("en", guess));
	}
	public void load (String fileName) {
		this.fileName = fileName;
		try {
			Object tmp = XMLTools.decodeFromFile(fileName);
			if (tmp instanceof WordSet) {
				array = ((WordSet) tmp).getWords();
			} else {
				throw new UnknownLanguageException();
			}
		} catch (IOException e) {
			System.err.println("Reading failed.");
			System.exit(1);
		} catch (UnknownLanguageException e) {
			System.err.println("File corrupted. One language was unknown.");
			System.exit(1);
		}
	}
	public void save () {
		try {
			XMLTools.encodeToFile(this, fileName);
		} catch (IOException e) {
			System.err.println("Saving failed.");
		}
	}
	public void save (String fileName) {
		this.fileName = fileName;
		this.save();
	}
	public Element[] getWords () {
		return this.array;
	}
	public void setWords (Element[] words) {
		this.array = words;
	}
	public static void main (String[] args) {
		WordSet ws = new WordSet();
		ws.load("set.ovc");
		ws.save("out.ovc");
	}
}
