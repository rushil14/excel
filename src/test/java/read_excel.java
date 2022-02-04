import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class read_excel {
    public static void main(String argsp[]) throws IOException {
        FileInputStream f = new FileInputStream("C:\\Users\\rushi\\Downloads\\demo1.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(f);
        XSSFSheet s = wb.getSheetAt(0);
        int c = 0;
        int row = s.getLastRowNum();
        while (c <= row) {
            XSSFRow r = s.getRow(c);
            for (int j = 0; j <r.getLastCellNum(); j++) {

                System.out.println(r.getCell(j));
            }
            c++;
        }
    }
}