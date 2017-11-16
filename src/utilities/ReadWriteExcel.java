package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class ReadWriteExcel {
	private XSSFWorkbook workBook;
	private XSSFSheet xcelSheet;
	XSSFCell cell;
	XSSFRow row;

	// constructor
	public ReadWriteExcel(String filePath, String sheetName) throws IOException, FileNotFoundException {
		try {

			// Open the excel File
			FileInputStream inputStream = new FileInputStream(filePath);

			// Load the workbook
			workBook = new XSSFWorkbook(inputStream);

			// Load the first sheet
			xcelSheet = workBook.getSheet(sheetName);

		} catch (Exception e) {
			throw e;

		} finally {

		}

	}

	// constructor to get first sheet
	public ReadWriteExcel(String filePath) throws IOException, FileNotFoundException {
		try {

			// Open the excel File
			FileInputStream inputStream = new FileInputStream(filePath);

			// Load the workbook
			workBook = new XSSFWorkbook(inputStream);

			// Load the first sheet
			xcelSheet = workBook.getSheetAt(0);

		} catch (Exception e) {
			throw e;

		} finally {

		}

	}

	public void setExcelFile(String filePath, String sheetName) throws IOException, FileNotFoundException {
		try {

			// Open the excel File
			FileInputStream inputStream = new FileInputStream(filePath);

			// Load the workbook
			workBook = new XSSFWorkbook(inputStream);

			// Load the first sheet
			xcelSheet = workBook.getSheetAt(0);

		} catch (Exception e) {
			throw e;

		} finally {

		}

	}

}
