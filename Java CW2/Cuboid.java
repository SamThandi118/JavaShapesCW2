package co1105.cw2.st500;
// Imports objects and arrays to be used
import java.util.Arrays;
import java.util.Objects;
public class Cuboid extends Solid {
	// Creates the public integer height, width, length, and the array sortingList
	public int height;
	public int width;
	public int length;
	public int[] sortingList;

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
		Cuboid other = (Cuboid) obj;
		// Returns height, width, and length of the cuboid of the other.shape
		return height == other.height && width == other.width && length == other.length;
	}

	@Override
	public int hashCode() {
		// returns hashcode for height, width, and length
		return Objects.hash(height, width, length);
	}

	@Override
	public String toString() {
		// Format and outputs the string showing the cuboid id and the height, width, and length on the same line
		String result = "Cuboid " + this.getID() + ": " +this.height+ "x" + this.width + "x" + this.length;
		return result;
	}
	public Cuboid(int h, int w, int l) throws InvalidSolidException {
		// Assigns height, width and length variables to h, w, and l
        this.height = h;
        this.width = w;
        this.length = l;
		// if height, width, length is less than or equal to 0 then throws InvalidSolidException
        if (h <= 0 || w <= 0 || l <= 0) {
            throw new InvalidSolidException("All dimensions must be > 0");
        }
        // Sorts the order of the list and keeps it in a format so its always height,width,length
        sortingList = new int[]{height, width, length};
        Arrays.sort(sortingList);
        this.height = sortingList[0];
        this.width = sortingList[1];
        this.length = sortingList[2];
		}
	
	public Cuboid(Cuboid other) {
		// Changes the value of this.height/width/length into other.height/width/length
		this.height = other.height;
		this.width = other.width;
		this.length = other.length;
	}
	public double getSurface() {
		// Calculates the surface area of the cuboid using the equation below and returns the result
		double result = height * width * 2 + height * length * 2 + width * length * 2;
		return result;
	}
	public double getVolume() {
		// Calculates the volume of the cuboid using the equation below and returns the result
		double result = height * width * length;
		return result;
	}
}

