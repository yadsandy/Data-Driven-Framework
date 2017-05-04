/**
 * @author sandeepyadav
 *
 */
package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcel {
	public void write(String result) {
		String excelFilePath = System.getProperty("user.dir") + "/resource/TestData.xls";

		try {
			FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
			Workbook workbook = WorkbookFactory.create(inputStream);

			Sheet sheet = workbook.getSheet("Login");
			Cell cell2Update = sheet.getRow(1).getCell(2);
			cell2Update.setCellValue(result);
			inputStream.close();

			FileOutputStream outputStream = new FileOutputStream(
					System.getProperty("user.dir") + "/resource/TestData.xls");
			workbook.write(outputStream);
			workbook.close();
			outputStream.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
