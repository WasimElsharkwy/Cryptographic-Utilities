import static org.junit.Assert.assertEquals;

import org.junit.Test;

import components.naturalnumber.NaturalNumber;
import components.naturalnumber.NaturalNumber2;

/**
 * @author Put your name here
 *
 */
public class CryptoUtilitiesTest {

    /*
     * Tests of reduceToGCD
     */

    @Test
    public void testReduceToGCD_0_0() {
        NaturalNumber n = new NaturalNumber2(0);
        NaturalNumber nExpected = new NaturalNumber2(0);
        NaturalNumber m = new NaturalNumber2(0);
        NaturalNumber mExpected = new NaturalNumber2(0);
        CryptoUtilities.reduceToGCD(n, m);
        assertEquals(nExpected, n);
        assertEquals(mExpected, m);
    }

    @Test
    public void testReduceToGCD_30_21() {
        NaturalNumber n = new NaturalNumber2(30);
        NaturalNumber nExpected = new NaturalNumber2(3);
        NaturalNumber m = new NaturalNumber2(21);
        NaturalNumber mExpected = new NaturalNumber2(0);
        CryptoUtilities.reduceToGCD(n, m);
        assertEquals(nExpected, n);
        assertEquals(mExpected, m);
    }

    @Test
    public void testReduceToGCD_SameNumber() {
        NaturalNumber n = new NaturalNumber2(45);
        NaturalNumber nExpected = new NaturalNumber2(45);
        NaturalNumber m = new NaturalNumber2(45);
        NaturalNumber mExpected = new NaturalNumber2(45);
        CryptoUtilities.reduceToGCD(n, m);
        assertEquals(nExpected, n);
        assertEquals(mExpected, m);
    }

    /*
     * Tests of isEven
     */

    @Test
    public void testIsEven_0() {
        NaturalNumber n = new NaturalNumber2(0);
        NaturalNumber nExpected = new NaturalNumber2(0);
        boolean result = CryptoUtilities.isEven(n);
        assertEquals(nExpected, n);
        assertEquals(true, result);
    }

    @Test
    public void testIsEven_1() {
        NaturalNumber n = new NaturalNumber2(1);
        NaturalNumber nExpected = new NaturalNumber2(1);
        boolean result = CryptoUtilities.isEven(n);
        assertEquals(nExpected, n);
        assertEquals(false, result);
    }

    @Test
    public void testIsEven_2() {
        NaturalNumber n = new NaturalNumber2(2);
        NaturalNumber nExpected = new NaturalNumber2(2);
        boolean result = CryptoUtilities.isEven(n);
        assertEquals(nExpected, n);
        assertEquals(true, result);
    }

    @Test
    public void testLargeOddNumber() {
        NaturalNumber n = new NaturalNumber2("24023990838120430509");
        NaturalNumber nExpected = new NaturalNumber2("24023990838120430509");
        boolean result = CryptoUtilities.isEven(n);
        assertEquals(nExpected, n);
        assertEquals(false, result);
    }

    @Test
    public void testLargeEvenNumber() {
        NaturalNumber n = new NaturalNumber2("70921739823124993902078");
        NaturalNumber nExpected = new NaturalNumber2("70921739823124993902078");
        boolean result = CryptoUtilities.isEven(n);
        assertEquals(nExpected, n);
        assertEquals(true, result);
    }
    /*
     * Tests of powerMod
     */

    @Test
    public void testPowerMod_0_0_2() {
        NaturalNumber n = new NaturalNumber2(0);
        NaturalNumber nExpected = new NaturalNumber2(1);
        NaturalNumber p = new NaturalNumber2(0);
        NaturalNumber pExpected = new NaturalNumber2(0);
        NaturalNumber m = new NaturalNumber2(2);
        NaturalNumber mExpected = new NaturalNumber2(2);
        CryptoUtilities.powerMod(n, p, m);
        assertEquals(nExpected, n);
        assertEquals(pExpected, p);
        assertEquals(mExpected, m);
    }

    @Test
    public void testPowerMod_17_18_19() {
        NaturalNumber n = new NaturalNumber2(17);
        NaturalNumber nExpected = new NaturalNumber2(1);
        NaturalNumber p = new NaturalNumber2(18);
        NaturalNumber pExpected = new NaturalNumber2(18);
        NaturalNumber m = new NaturalNumber2(19);
        NaturalNumber mExpected = new NaturalNumber2(19);
        CryptoUtilities.powerMod(n, p, m);
        assertEquals(nExpected, n);
        assertEquals(pExpected, p);
        assertEquals(mExpected, m);
    }

    @Test
    public void testPowerModEdgeCase() {
        NaturalNumber n = new NaturalNumber2(54);
        NaturalNumber nExpected = new NaturalNumber2(0);
        NaturalNumber p = new NaturalNumber2(6);
        NaturalNumber pExpected = new NaturalNumber2(6);
        NaturalNumber m = new NaturalNumber2(2);
        NaturalNumber mExpected = new NaturalNumber2(2);
        CryptoUtilities.powerMod(n, p, m);
        assertEquals(nExpected, n);
        assertEquals(pExpected, p);
        assertEquals(mExpected, m);
    }

    @Test
    public void testPowerModLargeNums() {
        NaturalNumber n = new NaturalNumber2(530495832);
        NaturalNumber nExpected = new NaturalNumber2(4680);
        NaturalNumber p = new NaturalNumber2(56);
        NaturalNumber pExpected = new NaturalNumber2(56);
        NaturalNumber m = new NaturalNumber2(8982);
        NaturalNumber mExpected = new NaturalNumber2(8982);
        CryptoUtilities.powerMod(n, p, m);
        assertEquals(nExpected, n);
        assertEquals(pExpected, p);
        assertEquals(mExpected, m);
    }

    @Test
    public void testIsWitnessToCompositenessEdgeCase() {
        NaturalNumber n = new NaturalNumber2(4);
        NaturalNumber nExpected = new NaturalNumber2(4);
        NaturalNumber w = new NaturalNumber2(2);
        NaturalNumber wExpected = new NaturalNumber2(2);
        boolean witness = CryptoUtilities.isWitnessToCompositeness(w, n);
        boolean witnessExpected = true;
        assertEquals(nExpected, n);
        assertEquals(wExpected, w);
        assertEquals(witnessExpected, witness);

    }

    @Test
    public void testIsWitnessToCompositenessLargeNums() {
        NaturalNumber n = new NaturalNumber2("9840928341221");
        NaturalNumber nExpected = new NaturalNumber2("9840928341221");
        NaturalNumber w = new NaturalNumber2("5742528");
        NaturalNumber wExpected = new NaturalNumber2("5742528");
        boolean witness = CryptoUtilities.isWitnessToCompositeness(w, n);
        boolean witnessExpected = true;
        assertEquals(nExpected, n);
        assertEquals(wExpected, w);
        assertEquals(witnessExpected, witness);

    }

    public void testIsPrime2_2() {
        NaturalNumber n = new NaturalNumber2(2);
        NaturalNumber nExpected = new NaturalNumber2(2);
        boolean prime = CryptoUtilities.isPrime2(n);
        boolean primeExpected = true;
        assertEquals(nExpected, n);
        assertEquals(primeExpected, prime);
    }

    public void testIsPrime2_3() {
        NaturalNumber n = new NaturalNumber2(3);
        NaturalNumber nExpected = new NaturalNumber2(3);
        boolean prime = CryptoUtilities.isPrime2(n);
        boolean primeExpected = true;
        assertEquals(nExpected, n);
        assertEquals(primeExpected, prime);
    }

    public void testIsPrime2_notPrimeLargeNum() {
        NaturalNumber n = new NaturalNumber2(879273924);
        NaturalNumber nExpected = new NaturalNumber2(879273924);
        boolean prime = CryptoUtilities.isPrime2(n);
        boolean primeExpected = false;
        assertEquals(nExpected, n);
        assertEquals(primeExpected, prime);
    }

    public void testIsPrime2_PrimeLargeNum() {
        NaturalNumber n = new NaturalNumber2(4535189);
        NaturalNumber nExpected = new NaturalNumber2(4535189);
        boolean prime = CryptoUtilities.isPrime2(n);
        boolean primeExpected = true;
        assertEquals(nExpected, n);
        assertEquals(primeExpected, prime);
    }

    public void generateNextLikelyPrime_2() {
        NaturalNumber n = new NaturalNumber2(2);
        NaturalNumber nExpected = new NaturalNumber2(2);
        CryptoUtilities.generateNextLikelyPrime(n);
        assertEquals(nExpected, n);

    }

    public void generateNextLikelyPrime_3() {
        NaturalNumber n = new NaturalNumber2(3);
        NaturalNumber nExpected = new NaturalNumber2(3);
        CryptoUtilities.generateNextLikelyPrime(n);
        assertEquals(nExpected, n);

    }

    public void generateNextLikelyPrime_4() {
        NaturalNumber n = new NaturalNumber2(4);
        NaturalNumber nExpected = new NaturalNumber2(5);
        CryptoUtilities.generateNextLikelyPrime(n);
        assertEquals(nExpected, n);
    }

    public void generateNextLikelyPrime_largeNum() {
        NaturalNumber n = new NaturalNumber2(4530189);
        NaturalNumber nExpected = new NaturalNumber2(4535189);
        CryptoUtilities.generateNextLikelyPrime(n);
        assertEquals(nExpected, n);

    }

}