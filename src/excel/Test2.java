package excel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {

    public static void main(String[] args) {


        try {

            File file = new File("C:\\Users\\Mehmet Demircioglu\\Desktop\\112_Acil\\test2.xlsx");

            if(!file.exists()) {
                file.createNewFile();
            }

            XSSFWorkbook workbook = new XSSFWorkbook();

            XSSFSheet sheet = workbook.createSheet("Data");

            Object[][] datatypes = {
                    {"Datatype", "Type", "Size(in bytes)"},
                    {"int", "Primitive", 2},
                    {"float", "Primitive", 4},
                    {"double", "Primitive", 8},
                    {"char", "Primitive", 1},
                    {"String", "Non-Primitive", "No fixed size"}
            };

            int rowNum = 0;
            for (Object[] datatype : datatypes) {

                Row row = sheet.createRow(rowNum++);

                // kolonlarıı tek tek yaz
                int cellNum = 0;
                for(Object object:datatype) {

                    Cell cell = row.createCell(cellNum++);
                    if (object instanceof String) {
                        cell.setCellValue((String) object);
                    } else if (object instanceof Integer) {
                        cell.setCellValue((Integer) object);
                    }
                }


            }

            FileOutputStream outputStream = new FileOutputStream(file);

            workbook.write(outputStream);

            workbook.close();



        }
        catch (IOException ex) {

        }


    }
}
