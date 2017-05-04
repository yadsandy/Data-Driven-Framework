/**
 * @author sandeepyadav
 *
 */
package utility;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.testng.annotations.DataProvider;
import utility.ReadExcel;

public class DataProviderForLogin {

	public static HSSFRow Row;
	public static HSSFCell cell;
	public static String FilePath = System.getProperty("user.dir") + "/resource/TestData.xls";
	public static String SheetName = "Login";
	public static HSSFSheet Sheet;
	ReadExcel ex = new ReadExcel();

	@DataProvider
	public static Object[][] getLoginData() throws Exception {

		Sheet = ReadExcel.DataSheet(FilePath, SheetName);
		// Get username and passsword from testdata.xls
		String username = Sheet.getRow(1).getCell(0).toString();
		String password = Sheet.getRow(1).getCell(1).toString();
		return new Object[][] { { username, password } };
	}

}
