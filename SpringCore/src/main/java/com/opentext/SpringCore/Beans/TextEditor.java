package com.opentext.SpringCore.Beans;

public class TextEditor {
	private String name;
	private SpellChecker spellcheck;

	// Constructor
	public TextEditor(String name, SpellChecker spellcheck) {
		super();
		this.name = name;
		this.spellcheck = spellcheck;
	}

	// Setters and Getters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SpellChecker getSpellcheck() {
		return spellcheck;
	}

	public void setSpellcheck(SpellChecker spellcheck) {
		this.spellcheck = spellcheck;
	}
}// End Class
