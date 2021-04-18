package observer;

import java.util.ArrayList;
import java.util.List;

public class Match implements Observable {

	private List<Observer> observers;
	private String match;
	
	public Match() {
		this.observers = new ArrayList<>();
	}

	@Override
	public void subscribe(Observer observer) {
		this.observers.add(observer);
		observer.setMatch(this);
	}

	@Override
	public void unsubscribe(Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer: this.observers) {
			observer.update();
		}
	}

	@Override
	public String getUpdate() {
		return this.match;
	}
	
	public void setMatch(String newMatch) {
		this.match = newMatch;
		this.notifyObservers();
	}
	

}
