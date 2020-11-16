package main.obj;

public class Televisore {
	
	private boolean	accesso;
	private	int	volume;
	private	int	canale;
	private boolean	silenzioso;
	private final int MAXCANALE = 99;
	private final int MINCANALE = 0;

	private final int MAXVOLUME = 10;
	private final int MINVOLUME = 0;
	
	public Televisore() {
		accesso = false;
		volume = 0;
		canale = 0;
		silenzioso = false;
	}
	
	public Televisore(boolean accesso, int volume, int canale, boolean silenzioso) {
		this.accesso = accesso;
		this.volume = volume;
		this.canale = canale;
		this.silenzioso = silenzioso;
	}
	
	public void pulsanteRosso() { 
		accesso = cambiaBooleano(accesso); }
	public void pulsanteSilenzioso() {
		if(accesso)
			silenzioso = cambiaBooleano(silenzioso);
		
	}
	
	public void canaleSuccessivo() { 
		if(accesso)
			canale = aumentareIntero(canale, MAXCANALE);
	}
	
	public void canalePrecedente() { 
		if(accesso)
			canale = diminuireIntero(canale, MINCANALE);
	}
	
	public void aumentaVolume() {
		if(accesso)
			volume = aumentareIntero(volume, MAXVOLUME);
		}
	
	public void diminuisciVolume() {
		if(accesso)
			volume = diminuireIntero(volume, MINVOLUME);
		}

	public int getCanale() { return canale; }

	public void setCanale(int canale) {
		if(accesso) {
			if(canale >= MAXCANALE || canale <= MINCANALE)
				System.out.println("Numero non valido");
			else 
				this.canale = canale;
		}
	}
	
	public int getVolume() {
		if(accesso)
			return volume;
		return 0;
	}

	public void setVolume(int volume) {
		if(accesso)
			this.volume = volume;
	}

	private int aumentareIntero(int value, int MAX) {
		
		if (!(value == MAX)) {
			value++;
		}
		
		return value;
	}
	
	private int diminuireIntero(int value, int MIN) {
			
			if (!(value == MIN)) {
				value--;
			}
			
			return value;
		}
	
	private boolean cambiaBooleano(boolean value) {
		 value = (value) ? false : true;
		return value;
	}
	
}
