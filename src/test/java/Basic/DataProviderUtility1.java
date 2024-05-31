package Basic;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataProviderUtility1 {

	 public static Object[][] dwsLogin() throws EncryptedDocumentException, IOException{
		 Object[][]obj=new Object[2][2];
			FileInputStream fis=new FileInputStream("");
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet("sheet1");
			obj[0][0]=sh.getRow(0).getCell(0).toString();
			obj[0][1]=sh.getRow(0).getCell(1).toString();
			obj[1][0]=sh.getRow(1).getCell(0).toString();
			obj[1][1]=sh.getRow(1).getCell(1).toString();
			return obj;
}

	public static Object[][] dwsLogin1() {
		// TODO Auto-generated method stub
		return null;
	}
	}