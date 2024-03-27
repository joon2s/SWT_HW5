package ee.ut.cs.swt.nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

public class GTv2 {

	@Test(timeout = 4000)
	public void testCreatesNextDate1() throws Throwable {
	    NextDate nextDate0 = new NextDate(31, 1, 1);
	    String string0 = nextDate0.run(1, 31, 2019);
	    assertEquals("2/1/2019", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate0() throws Throwable {
	    NextDate nextDate0 = new NextDate(11, 11, 11);
	    String string0 = nextDate0.run(11, 1829, 1829);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate3() throws Throwable {
	    NextDate nextDate0 = new NextDate(30, 30, 1990);
	    String string0 = nextDate0.run(11, 30, 1990);
	    assertEquals("12/1/1990", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate2() throws Throwable {
	    NextDate nextDate0 = new NextDate(2011, 2011, 2011);
	    String string0 = nextDate0.run(5, 2, 2011);
	    assertEquals("5/3/2011", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate5() throws Throwable {
	    NextDate nextDate0 = new NextDate(9, 2004, 9);
	    String string0 = nextDate0.run(9, 31, 2004);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate4() throws Throwable {
	    NextDate nextDate0 = new NextDate(11, 11, 11);
	    String string0 = nextDate0.run(11, 11, 1829);
	    assertEquals("11/12/1829", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithZero() throws Throwable {
	    NextDate nextDate0 = new NextDate(0, 0, 310);
	    String string0 = nextDate0.run(0, 310, 310);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithZeroAndZero() throws Throwable {
	    NextDate nextDate0 = new NextDate(0, 0, 0);
	    String string0 = nextDate0.run(0, 0, 0);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate14() throws Throwable {
	    NextDate nextDate0 = new NextDate(3, 3, 3);
	    String string0 = nextDate0.run(3, 30, 2021);
	    assertEquals("3/31/2021", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate13() throws Throwable {
	    NextDate nextDate0 = new NextDate(29, 29, 2011);
	    String string0 = nextDate0.run(2, 29, 2011);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate16() throws Throwable {
	    NextDate nextDate0 = new NextDate(8, 12, 12);
	    String string0 = nextDate0.run(8, 8, 1829);
	    assertEquals("8/9/1829", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate15() throws Throwable {
	    NextDate nextDate0 = new NextDate(7, 7, 2011);
	    String string0 = nextDate0.run(7, 7, 2011);
	    assertEquals("7/8/2011", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate18() throws Throwable {
	    NextDate nextDate0 = new NextDate(4, 4, 4);
	    String string0 = nextDate0.run(4, 4, 1839);
	    assertEquals("4/5/1839", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate17() throws Throwable {
	    NextDate nextDate0 = new NextDate(10, 10, 10);
	    String string0 = nextDate0.run(10, 10, 2001);
	    assertEquals("10/11/2001", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate19() throws Throwable {
	    NextDate nextDate0 = new NextDate(6, 6, 6);
	    String string0 = nextDate0.run(6, 6, 1801);
	    assertEquals("6/7/1801", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate7() throws Throwable {
	    NextDate nextDate0 = new NextDate(12, 12, 12);
	    String string0 = nextDate0.run(12, 12, 1829);
	    assertEquals("12/13/1829", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate6() throws Throwable {
	    NextDate nextDate0 = new NextDate(31, 12, 12);
	    String string0 = nextDate0.run(12, 31, 2019);
	    assertEquals("1/1/2020", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate9() throws Throwable {
	    NextDate nextDate0 = new NextDate(11, 11, 2004);
	    String string0 = nextDate0.run(2, 11, 2004);
	    assertEquals("2/12/2004", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate8() throws Throwable {
	    NextDate nextDate0 = new NextDate(6, 2021, 6);
	    String string0 = nextDate0.run(12, 31, 2021);
	    assertEquals("Invalid Next Year", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate10() throws Throwable {
	    NextDate nextDate0 = new NextDate((-38), (-38), (-38));
	    String string0 = nextDate0.run(2, 28, 2001);
	    assertEquals("3/1/2001", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate12() throws Throwable {
	    NextDate nextDate0 = new NextDate(30, 30, 2011);
	    String string0 = nextDate0.run(2, 30, 2011);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate11() throws Throwable {
	    NextDate nextDate0 = new NextDate(28, 28, 28);
	    String string0 = nextDate0.run(2, 28, 1912);
	    assertEquals("2/29/1912", string0);
	}

	@Test(timeout = 4000)
	public void testRunReturningNonEmptyString() throws Throwable {
	    NextDate nextDate0 = new NextDate(3, 3, 3);
	    String string0 = nextDate0.run(2, 29, 2000);
	    assertEquals("3/1/2000", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive1() throws Throwable {
	    NextDate nextDate0 = new NextDate(6, 6, 6);
	    String string0 = nextDate0.run(6, 6, 6);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive0() throws Throwable {
	    NextDate nextDate0 = new NextDate(28, 28, 28);
	    String string0 = nextDate0.run(28, 2, 3580);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive2() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 704, 3472);
	    assertEquals("invalid Input Date", string0);
	}

}