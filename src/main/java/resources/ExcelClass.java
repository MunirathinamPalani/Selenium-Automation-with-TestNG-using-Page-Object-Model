package resources;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelClass{
	public static String ExcelMethod(int i) throws IOException {
	FileInputStream fis=new FileInputStream("C:\\Study\\Eclipse Project Files\\Data Files\\Data.xlsx");
	XSSFWorkbook book=new XSSFWorkbook(fis);
	XSSFSheet sh= book.getSheetAt(0);
	Row r=sh.getRow(i);
	Cell c=r.getCell(0);
	String out=c.getStringCellValue();
	return out;
	}
}
