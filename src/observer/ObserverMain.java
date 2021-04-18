package observer;

public class ObserverMain {

	public static void main(String[] args) {


		Match match = new Match();
		
		Observer observer1 = new MatchSubscriber("Reader 1");
		Observer observer2 = new MatchSubscriber("Reader 2");
		
		match.subscribe(observer1);
		match.subscribe(observer2);
		
		match.setMatch("Live: Barcelona scored the opening goal against Real Madrid!");
		
		match.setMatch("Live: Real Madrid makes it 1-1!");
		
		

	}

}
