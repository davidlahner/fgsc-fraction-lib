package ch.zuehlke.scfg.fraction;

public class Fraction {

	private int zaehler;
	private int nenner;

	public Fraction(int zaehler, int nenner) {
		this.zaehler = zaehler;
		this.nenner = nenner;
	}

	public Fraction add(Fraction other) {
		if (other.nenner == nenner) {
			return new Fraction(zaehler + other.zaehler, nenner);
		}
		Fraction left = new Fraction(zaehler * other.nenner, nenner
				* other.nenner);
		Fraction right = new Fraction(other.zaehler * nenner, other.nenner
				* nenner);
		return left.add(right);
	}

	@Override
	public String toString() {
		return zaehler + "/" + nenner;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + nenner;
		result = prime * result + zaehler;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fraction other = (Fraction) obj;
		if (nenner != other.nenner)
			return false;
		if (zaehler != other.zaehler)
			return false;
		return true;
	}

}
