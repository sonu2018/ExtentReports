package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilities {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static int rowcount;
	public static void main(String[] args) {
		getrowCount();
		getStringcelldata();
		getIntcelldata();
	}

	public static void getrowCount() {

		try {

			workbook = new XSSFWorkbook(System.getProperty("user.dir") + "/Excel/Testdata.XLSX");
			sheet = workbook.getSheet("Sheet1");
			rowcount = sheet.getPhysicalNumberOfRows();
			System.out.println("Total noumber of rows: " + rowcount);

		} catch (Exception e) {

			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();

		}

	}


	public static void getStringcelldata() {
		try {

			workbook = new XSSFWorkbook(System.getProperty("user.dir") + "/Excel/Testdata.XLSX");
			sheet = workbook.getSheet("Sheet1");
			String celldata = sheet.getRow(0).getCell(0).getStringCellValue();
			System.out.println("Cell data is :" + celldata);

		} catch (Exception e) {

			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();

		}

	}

	public static void getIntcelldata() {
		try {

			workbook = new XSSFWorkbook(System.getProperty("user.dir") + "/Excel/Testdata.XLSX");
			sheet = workbook.getSheet("Sheet1");
			double celldata = sheet.getRow(1).getCell(1).getNumericCellValue();
			System.out.println("Cell data is :" + celldata);

		} catch (Exception e) {

			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();

		}

	}

}
