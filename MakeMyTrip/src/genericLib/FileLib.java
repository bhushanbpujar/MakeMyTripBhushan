package genericLib;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib 
{
	public String getPropertyKeyValue(String path,String key)
	{
		FileInputStream ip=null;
		Properties prop=null;
		try
		{
			ip=new FileInputStream(path);
			prop=new Properties();
			prop.load(ip);
		}
		catch(Throwable e)
		{
			e.printStackTrace();
		}
		return prop.getProperty(key);
	}
	/**
	 * 
	 * @param path
	 * @param Sheet
	 * @param rowNum
	 * @param cellNum
	 * @return data
	 */
	public String getExcelData(String Excelpath,String Sheet, int rowNum,int cellNum) {
		FileInputStream ip=null;
		Workbook wb=null;

		try 
		{
			ip=new FileInputStream(Excelpath);
			wb=WorkbookFactory.create(ip);

		} catch (Throwable e) 
		{
			e.printStackTrace();
		}
		Sheet sh=wb.getSheet(Sheet);
		return sh.getRow(rowNum).getCell(cellNum).toString();



	}
}
