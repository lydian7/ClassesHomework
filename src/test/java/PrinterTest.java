import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer();
    }

    @Test
    public void getSheets(){
        assertEquals(100, printer.getNumberOfSheets());
    }

    @Test
    public void canPrint(){
        printer.print(20,2);
        assertEquals(60, printer.getNumberOfSheets());
    }

    @Test
    public void cantPrint(){
        printer.print(50,3);
        assertEquals(100, printer.getNumberOfSheets());
    }

    @Test
    public void getToner(){
        assertEquals(100, printer.getTonerLevel());
    }

    @Test
    public void tonerReduces(){
        printer.print(40,2);
        assertEquals(20, printer.getTonerLevel());
    }
}
