public class Language {
	private static String[] map = {"en", "fr"};
	private static String[] human = {"English", "French"};
	private int id;
	public Language () {
		id = 0; // Redundant
	}
	public Language (String lang) throws UnknownLanguageException {
		setId(lang);
	}
	public String getId () { // not storing id because it is not a good portable solution
		return map[id];
	}
	public void setId (String lang) throws UnknownLanguageException  {
		int i;
		for (i = 0; i < map.length; ++i) {
			if (map[i].equals(lang)) {
				break;
			}
		}
		if (i == map.length) {
			throw new UnknownLanguageException();
		} else {
			this.id = i;
		}
	}
	public String toString () {
		return human[id];
	}
	public boolean equals (Object o) {
		if (o instanceof Language) {
			return id == ((Language) o).id;
		}
		return false;
	}
}
