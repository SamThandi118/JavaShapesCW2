package co1105.cw2.st500;
// Imports Objects to be used later
import java.util.Objects;

public class Sphere extends Solid {
	// Creates the public integer radius
	public int radius;
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
		// Returns radius of the other.shape
		Sphere other = (Sphere) obj;
		return radius == other.radius;
	}

	@Override
	public int hashCode() {
		// Returns hashcode for radius
		return Objects.hash(radius);
	}

	@Override
	public String toString() {
		// Format and outputs the string showing the sphere id and the radius on the same line
		String result = "Sphere " + this.getID() + ": r=" + this.radius;
		return result;
	}
	public Sphere(int r) throws InvalidSolidException {
		// Assigns radius to variables r
		this.radius = r;
		// if radius is less than or equal to 0 then throws InvalidSolidException
		if (r <= 0 ) {
			throw new InvalidSolidException("Radius must be > 0");
		}
	}
	public Sphere(Sphere other) {
		// Changes value of the this.radius to other.radius
		this.radius = other.radius;
	}
	public double getSurface() {
		// Calculates the surface area of the sphere using the equation below and returns the result
		double result = 4.0 * Math.PI * radius * radius;
		return result;
	}
	public double getVolume() {
		// Calculates the volume of the sphere using the equation below and returns the result
		double result = 4.0 * Math.PI * radius * radius * radius / 3.0;
		return result;
	}
}
