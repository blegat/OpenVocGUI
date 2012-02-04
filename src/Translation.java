public class Translation {
	private Language lang;
	private String word;
	public Translation () {
	}
	public Translation (String lang, String word) throws UnknownLanguageException {
		this.lang = new Language(lang);
		this.word = word;
	} // isn't a constructor with (Language lang, String word) more appropriate ?
	public Language getLanguage () {
		return lang;
	}
	public void setLanguage (Language lang) {
		this.lang = lang;
		System.out.format("%s:%s\n", lang, word);
	}
	public boolean sameLanguage (Translation t) {
		return this.lang.equals(t.lang);
	}
	public String getWord () {
		return word;
	}
	public void setWord (String word) {
		this.word = word;
		System.out.format("%s:%s\n", lang, word);
	}
}
