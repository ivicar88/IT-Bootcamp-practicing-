package config;

import java.io.FileInputStream;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;

public class ExcelConf {
	
	public static final String PATH = "C:\\Users\\win7\\Documents\\FinalProject\\Documents\\";
	public static final String EXCELFILE = "Data.xls";
	public static final String REGSHEET = "Registracija";
	public static final String POSTSHEET = "Tekst";

	
	private static HSSFSheet EWSheet;
	private static HSSFWorkbook EWBook;
	private static HSSFCell Cell;
	private static DataFormatter formatter;
	
	
	// use to set Excel file to pull info from it
	public static void setEFile(String path, String sheet) throws Exception {
		try {
			FileInputStream ExcelFile = new FileInputStream(path);

			EWBook = new HSSFWorkbook(ExcelFile);

			EWSheet = EWBook.getSheet(sheet);
			// convert to String
			formatter = new DataFormatter();
		} catch (Exception e) {
			throw (e);
		}

	}
	
	// use to fetch info from Excel
	public static String getEData(int rowNum, int colNum) throws Exception {
		try {

			Cell = EWSheet.getRow(rowNum).getCell(colNum);
			
			String data = formatter.formatCellValue(Cell);
			
			return data;
		} catch (Exception e) {
			return "";
		}

	}
	
	public static HSSFSheet getWorkSheet() {
		return EWSheet;
	}
		
	

}
