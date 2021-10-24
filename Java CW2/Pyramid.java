package co1105.cw2.st500;
//Imports Objects to be used
import java.util.Objects;
public class Pyramid extends Solid {
	// Creates the public integer base and height.
	public int base;
	public int height;

	@Override
	public boolean equals(Object obj) {
		// Compares each object to check if they're valid
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
		return false;
		}
		Pyramid other = (Pyramid) obj;
		// Returns base and height of the other.shape
		return base == other.base && height == other.height;
	}

	@Override
	public int hashCode() {
		// returns hashcode for base and height
		return Objects.hash(base, height);
	}

	@Override
	public String toString() {
		// Format and outputs the string showing the pyramid id and the base and height on the same line
		String result = "Pyramid " + this.getID() + ": " +this.base+ "x" + this.height;
		return result;
	}
	public Pyramid(int b, int h) throws InvalidSolidException {
		// Assign base and height variables to b and h
		this.base = b;
		this.height = h;
		// if base or height  is less than or equal to 0 then throws InvalidSolidException
		if (b <= 0 ||h  <= 0 ) {
			throw new InvalidSolidException("Base and height must be > 0");
		}
	}
	public Pyramid(Pyramid other) {
		// Changes the value of this.base/height into other.base/height
		this.base = other.base;
		this.height = other.height;
	}
	// Calculates the surface area of the Pyramid using the equation below and returns the result
	public double getSurface() {
		double result = base * base + 2 * base * height;
		return result;
	}
	// Calculates the volume of the Pyramid using the equation below and returns the result
	public double getVolume() {
		double result = base * base * height / 3.0;
		return result;
	}
}

