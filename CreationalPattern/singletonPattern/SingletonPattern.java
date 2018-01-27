package singletonPattern;

//Thread Safe & Lazy Loaded singleton pattern
public class SingletonPattern {

	public static SingletonPattern instance = null;

	private SingletonPattern() {

	}

	public static SingletonPattern getInstance() {
		if (instance == null) {
			synchronized (SingletonPattern.class) {
				if (instance == null) {
					instance = new SingletonPattern();
				}
			}
		}
		return instance;
	}
}
