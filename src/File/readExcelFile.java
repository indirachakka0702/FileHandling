package File;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class readExcelFile {

	public static void main(String[] args) 
	{
		String sFile = System.getProperty("user.dir")+"\\InstructorInfo.xls";
		// Java will not give any in build method for Excel files
		// there are third party libraries which is available
		// you hava download and added to ur jar files
		//poi<version>.jar -->you guys will get it from google drive
      // go to project +rigrt click+ buildpath+configubuildpath+libraries+add Externaljar+
		//download selectfile poi+ add+Apply and close
		try {
			//FileInputStream fi = new FileInputStream(sFile);
			HSSFWorkbook myExcelBook = new HSSFWorkbook(new FileInputStream(sFile));
			HSSFSheet myExcelSheet = myExcelBook.getSheet("InstructorInfo");
			HSSFRow row1 = myExcelSheet.getRow(0);
			System.out.println(row1.getCell(0).getStringCellValue());
			System.out.println(row1.getCell(1).getStringCellValue());
			System.out.println(row1.getCell(2).getStringCellValue());
			
		}
		catch(Exception a) 
		{
			System.out.println(a);
		}
		
	}

}
