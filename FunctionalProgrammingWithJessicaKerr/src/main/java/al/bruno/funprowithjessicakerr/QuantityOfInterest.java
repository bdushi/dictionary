package al.bruno.funprowithjessicakerr;

public interface QuantityOfInterest {
    String getName();

    /**
     * expected value for a particluar month
     * @param time month,  1 - 12
     * @return expected value 
     */

     double valueAt(final int time);
}