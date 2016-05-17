package komparator;

import wspolrzedne.Punkt2D;

public class Punkt2DComparatorY implements Punkt2DComparator {

	@Override
	public CompareResult compare(Punkt2D a, Punkt2D b) {
		if(a.getY() < b.getY())return CompareResult.LESS;
		if(a.getY() == b.getY())return CompareResult.EQUAL;
		if(a.getY() > b.getY())return CompareResult.HIGHER;
		return null;
	}

}
