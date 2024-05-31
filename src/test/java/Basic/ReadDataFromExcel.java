package Basic;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadDataFromExcel{
	
	@Test
	public void readData() throws EncryptedDocumentException, IOException
	{
	File file = new File("‪C:\\Users\\Suraj\\OneDrive\\Desktop\\Suraj Final Mock\\book.xlsx");
	
	FileInputStream f1 = new FileInputStream(file);
	Workbook wb = WorkbookFactory.create(f1);
	Sheet sheet = wb.getSheet("sheet1");
	int row = 2 , column =2;
	for(int i = 0; i<row;i++) {
		for(int j =0 ; j<column;j++) {
			String s1 = sheet.getRow(1).getCell(2).toString();
			System.out.println(s1);	
		}
		
	}
	}

}