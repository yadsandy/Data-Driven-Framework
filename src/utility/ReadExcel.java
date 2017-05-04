package utility;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

/**
 * Created by Sandeep yadav on 15/11/16.
 */
public class ReadExcel {
	public static Object[][] LoginData;
	public static Object[][] ShipmentData;
	public static HSSFRow Row;
	public static HSSFCell cell;
	public static HSSFSheet Sheet;
	public static HSSFWorkbook WBook = null;
	public static HSSFSheet WSheet = null;

	public static HSSFSheet DataSheet(String FilePath, String SheetName) {
		File file = new File(FilePath);
		try {
			FileInputStream fis = new FileInputStream(file);
			WBook = new HSSFWorkbook(fis);
			WSheet = WBook.getSheet(SheetName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return WSheet;
	}

	@SuppressWarnings("deprecation")
	public static String getCellData(String Sheet, int row, int col) {

		try {

			int index = WBook.getSheetIndex(Sheet);

			WSheet = WBook.getSheetAt(index);
			Row = WSheet.getRow(row);
			if (Row == null)
				return "";

			cell = Row.getCell(col);
			if (cell == null)
				return "";

			switch (cell.getCellType()) {
			case Cell.CELL_TYPE_STRING:
				return cell.getStringCellValue();

			case Cell.CELL_TYPE_BOOLEAN:
				return String.valueOf(cell.getBooleanCellValue());

			case Cell.CELL_TYPE_BLANK:
				return "";

			case Cell.CELL_TYPE_ERROR:
				return cell.getStringCellValue();

			case Cell.CELL_TYPE_NUMERIC:
				return String.valueOf(cell.getNumericCellValue());

			default:
				return "Cell not found";

			}
		} catch (Exception e) {
			e.printStackTrace();
			return "row " + row + " or column " + col + " does not exist in xls";
		}

	}

}