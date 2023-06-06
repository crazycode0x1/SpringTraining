package com.training.task1;


public class PythonWorld implements PythonLanguage {
	
	private JavaLanguage javalanguage;
	
	public PythonWorld (JavaLanguage javalanguage) {
		super();
		this.javalanguage=javalanguage;
		
	}
	
	
	
	 
	public String learningPython() {
		return javalanguage.LearningJava();
	}
	}
