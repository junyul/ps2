package pkgShape;

import static org.junit.Assert.*;

public class Test {

public void testEven() {
		MyInteger I1=new MyInteger(8);
		assertEquals(I1.isEven(),true);
}
public void testOdd() {
		MyInteger I2=new MyInteger(7);
		assertEquals(I2.isOdd(),true);	
}
public void testPrime() {
		MyInteger I3=new MyInteger(7);
		assertEquals(I3.isPrime(),true);	
}
}