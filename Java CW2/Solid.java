package co1105.cw2.st500;
// Imports compare functions
import java.lang.Comparable;
abstract class Solid implements Comparable<Solid> {
	// Creates protected integer variables for solid count and solid ID
	protected static int solidCount = 1;
	protected final int solidID = solidCount;
	

	// Abstract public constructors for Equals, HashCode and toString
  abstract public boolean equals (Object other);
  abstract public int hashCode();
  abstract public String toString();
  // Copies surface area variables so they can be compared against each other
  public int compareTo (Solid other) {
      double SA =  this.getSurface();
      double otherSA = other.getSurface();
      // Measures SA vs otherSA and returns which one is smaller/bigger or same size and returns -1, 0 or 1 depending on result
      if (SA < otherSA)
          return -1;
      else if (SA > otherSA)
          return 1;
      else return 0;
  }
  // Increments solidCount
  public Solid() {
	  solidCount = solidCount + 1;
  }
  // Retrieves the shapes SolidID
  public int getID() {
	  return this.solidID;
  }
  // Creates getSurface to be called to find the surface areas of the desired shape(s)
  public abstract double getSurface();
  
  // Creates getVolume to be called to find the volume of the desired shape(s)
  public abstract double getVolume();
  
  }
