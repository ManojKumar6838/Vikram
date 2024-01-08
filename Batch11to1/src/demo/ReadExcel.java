package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {

	public static void main(String[] args) throws Throwable {
		FileInputStream path=new FileInputStream("./Data/GoibiboTC.xlsx");
		Workbook wb=WorkbookFactory.create(path);
		Sheet sheet=wb.getSheet("TestData");
		int rowCount = sheet.getPhysicalNumberOfRows();
		int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
		for(int i=0;i<rowCount;i++) {
			for(int j=0;j<cellCount;j++) {
				String data=sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(data);
			}
		}
	}
}
