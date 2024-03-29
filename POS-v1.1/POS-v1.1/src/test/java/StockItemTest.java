package ee.ut.math.tvt.salessystem.dataobjects;

import org.junit.Test;
import static org.junit.Assert.*;

public class StockItemTest {

	@Test(timeout = 4000)
	public void testGetId() throws Throwable {
	    Long long0 = Long.valueOf(899L);
	    StockItem stockItem0 = new StockItem(long0, "", "}$", 899L, 204);
	    stockItem0.getId();
	    assertEquals("}$", stockItem0.getDescription());
	    assertEquals("", stockItem0.getName());
	    assertEquals(899.0, stockItem0.getPrice(), 0.01);
	    assertEquals(204, stockItem0.getQuantity());
	}

	@Test(timeout = 4000)
	public void testSetId() throws Throwable {
	    Long long0 = Long.valueOf(899L);
	    StockItem stockItem0 = new StockItem(long0, "", "}$", 899L, 204);
	    stockItem0.setId(long0);
	    assertEquals("}$", stockItem0.getDescription());
	    assertEquals("", stockItem0.getName());
	    assertEquals(204, stockItem0.getQuantity());
	    assertEquals(899.0, stockItem0.getPrice(), 0.01);
	}

	@Test(timeout = 4000)
	public void testGetName() throws Throwable {
	    Long long0 = new Long((-1L));
	    StockItem stockItem0 = new StockItem(long0, "Wwy9A@H})v@8M0i=", "27rLT|c6/]0`j", (-969.36265721), 1);
	    stockItem0.getName();
	    assertEquals((-969.36265721), stockItem0.getPrice(), 0.01);
	    assertEquals(1, stockItem0.getQuantity());
	}

	@Test(timeout = 4000)
	public void testToString() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    String string0 = stockItem0.toString();
	    assertEquals("StockItem{id=null, name='null'}", string0);
	}

	@Test(timeout = 4000)
	public void testGetPrice() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    double double0 = stockItem0.getPrice();
	    assertEquals(0.0, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testSetDescription() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    stockItem0.setDescription("");
	    assertNull(stockItem0.getId());
	}

	@Test(timeout = 4000)
	public void testSetPrice() throws Throwable {
	    Long long0 = Long.valueOf(899L);
	    StockItem stockItem0 = new StockItem(long0, "", "}$", 899L, 204);
	    stockItem0.setPrice(899L);
	    assertEquals(204, stockItem0.getQuantity());
	    assertEquals(899.0, stockItem0.getPrice(), 0.01);
	    assertEquals("}$", stockItem0.getDescription());
	    assertEquals("", stockItem0.getName());
	}

	@Test(timeout = 4000)
	public void testSetQuantity() throws Throwable {
	    Long long0 = Long.valueOf(899L);
	    StockItem stockItem0 = new StockItem(long0, "", "}$", 899L, 204);
	    stockItem0.setQuantity(0);
	    assertEquals(0, stockItem0.getQuantity());
	}

	@Test(timeout = 4000)
	public void testGetDescription() throws Throwable {
	    Long long0 = Long.valueOf(899L);
	    StockItem stockItem0 = new StockItem(long0, "", "}$", 899L, 204);
	    String string0 = stockItem0.getDescription();
	    assertEquals("", stockItem0.getName());
	    assertEquals("}$", string0);
	    assertEquals(204, stockItem0.getQuantity());
	    assertEquals(899.0, stockItem0.getPrice(), 0.01);
	}

	@Test(timeout = 4000)
	public void testSetName() throws Throwable {
	    Long long0 = Long.valueOf(899L);
	    StockItem stockItem0 = new StockItem(long0, "", "}$", 899L, 204);
	    assertEquals("", stockItem0.getName());
	    stockItem0.setName("}$");
	    assertEquals(899.0, stockItem0.getPrice(), 0.01);
	}

	@Test(timeout = 4000)
	public void testGetQuantity() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    int int0 = stockItem0.getQuantity();
	    assertEquals(0, int0);
	}

}