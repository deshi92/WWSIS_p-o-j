package operacje;

public enum OperacjaMatematyczna implements Dzialanie {
	DODAWANIE("+"),ODEJMOWANIE("-"),MNOZENIE("*"),DZIELENIE("/");

	private String symbol;
	
	OperacjaMatematyczna(String symbol)	{
		this.symbol = symbol;
	}
	
	@Override
	public String getSymbol() {
		return this.symbol;
	}

	@Override
	public OperacjaMatematyczna getBySymbol(String symbol) {
		for(OperacjaMatematyczna x : OperacjaMatematyczna.values()){
			if(symbol == x.getSymbol())return x;
		}return null;
	}
}

