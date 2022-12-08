package excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class Test {


    public static void main(String[] args) {

        try {

            File file = new File("C:\\Users\\Mehmet Demircioglu\\Desktop\\112_Acil\\test.xlsx");

            FileInputStream inputStream = new FileInputStream(file);

            Workbook workbook = new XSSFWorkbook(inputStream);

            Sheet sheet = workbook.getSheetAt(0);

            Iterator<Row> iterator = sheet.iterator();

            while (iterator.hasNext()) {

                Row row = iterator.next();

                Cell cell1 = row.getCell(0);
                Cell cell2 = row.getCell(1);

                System.out.println(cell1.getStringCellValue());
                System.out.println(cell2.getStringCellValue());


            }


        }
        catch (IOException ex) {

            System.out.println(ex.getMessage());
        }



    }
}
