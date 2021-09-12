package week5.Day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel extends BaseClassExcel {

	public static String[][] reaData(String Sheet) throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook wb = new XSSFWorkbook("./data/CreateLead.xlsx");
		// get into worksheet
		XSSFSheet ws = wb.getSheet(Sheet);

		int rowcount = ws.getLastRowNum();
		System.out.println(rowcount);
		int cellcount = ws.getRow(0).getLastCellNum();
		System.out.println(cellcount);

		String[][] data = new String[rowcount][cellcount];
		for (int i = 1; i <= rowcount; i++) {
			for (int j = 0; j < cellcount; j++) {
				String T = ws.getRow(i).getCell(j).getStringCellValue();
				System.out.println(T);
				data[i - 1][j] = T;
			}
		}

		// last step
		wb.close();
		return data;

	}

}
