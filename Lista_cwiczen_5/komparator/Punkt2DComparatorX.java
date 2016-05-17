package komparator;

import wspolrzedne.Punkt2D;

public class Punkt2DComparatorX implements Punkt2DComparator{

	@Override
	public CompareResult compare(Punkt2D a, Punkt2D b) {
		if(a.getX() < b.getX())return CompareResult.LESS;
		if(a.getX() == b.getX())return CompareResult.EQUAL;
		if(a.getX() > b.getX())return CompareResult.HIGHER;
		return null;
	}

}
