public class ObserverPatternDemo {
	public static void main(String[] args) {
		
		
		Subject subject = new Subject();

		new HexaObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);

		System.out.println("Ilk Durum Degisikligi: 15");	
		subject.setState(15);
		
		System.out.println("****************");
		
		System.out.println("Ikinci Durum Degisikligi: 10");	
		subject.setState(10);
	}
}
