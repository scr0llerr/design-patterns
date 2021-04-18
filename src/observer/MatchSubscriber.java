package observer;

public class MatchSubscriber implements Observer {

	private String name;
	private Observable match;
	
	public MatchSubscriber(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		
		if(this.match == null) {
			System.out.println(this.getName() + " has no match");
			return;
		}

		String latestMatch = this.match.getUpdate();
		System.out.println(this.getName() + " received an update: " + latestMatch);

	}

	@Override
	public void setMatch(Observable match) {
		this.match = match;
	}

	public String getName() {
		return name;
	}

}
