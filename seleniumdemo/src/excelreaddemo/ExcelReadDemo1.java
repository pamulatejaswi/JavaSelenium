package excelreaddemo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import net.bytebuddy.implementation.bytecode.constant.IntegerConstant;

public class ExcelReadDemo1
{ 
		@Test
		public void excelread() throws IOException
		{
			FileInputStream fin=new FileInputStream("C:\\Users\\abhista\\Downloads\\testdata (2).xlsx");
			XSSFWorkbook book=new XSSFWorkbook(fin);
			XSSFSheet sheet=book.getSheet("data");
			int rowcount=sheet.getPhysicalNumberOfRows();
			XSSFRow row=sheet.getRow(0);

			int cellcount=row.getPhysicalNumberOfCells();
			//System.out.println(cellcount);
			String cellvalue[]=new String[cellcount];
			for(int i=0;i<rowcount;i++)
			{
				

				for(int j=0;j<cellcount;j++)
				{
					XSSFRow row1=sheet.getRow(i);

					XSSFCell cell=row1.getCell(j);
					
					cellvalue[j]=cell.getStringCellValue();
		
					System.out.print(cellvalue[j]+"");

				}
				System.out.println();

			}
		}}	
		


