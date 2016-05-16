package pojazd.poduszkowiec;

public class Poduszkowiec extends PojazdPoduszkowiec {

	public Poduszkowiec(String nazwa) {
		super(nazwa);
	}

	@Override
	public void wyplyn() {
		System.out.println("Poduszkowiec ruszy³ w drogê!");

	}

	@Override
	public void rozpocznijJazde() {
		System.out.println("Poduszkowiec wyp³ywa w rejs!");

	}

}
