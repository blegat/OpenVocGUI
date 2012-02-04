public class Element {
	Translation en, fr;
	public Element () {
	}
	public Element (String en, String fr) {
		this.en = new Translation("en", en);
		this.fr = new Translation("fr", fr);
	}
	public String getEnglish () {
		return en.getWord();
	}
	public String getFrench () {
		return fr.getWord();
	}
	public boolean check (Translation t) throws UnknownLanguageException{
		if (en.sameLanguage(t)) {
			return en.getWord().equals(t.getWord());
		} else if (fr.sameLanguage(t)) {
			return fr.getWord().equals(t.getWord());
		} else {
			throw new UnknownLanguageException();
		}
	}
	public Translation[] getTranslations () {
		return new Translation[]{en, fr};
	}
	public void setTranslations (Translation[] t) {
		Language len = new Language("en"), lfr = new Language("fr");
		this.en = null;
		this.fr = null;
		for (Translation tr : t) {
			if (tr.getLanguage().equals(en)) {
				this.en = tr;
			} else if (tr.getLanguage().equals(fr)) {
				this.fr = tr;
			}
		}
	}
}
