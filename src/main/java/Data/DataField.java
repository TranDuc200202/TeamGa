package Data;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataField {
    XSSFWorkbook work_book;
    XSSFSheet sheet;
    public File s;
    public FileInputStream stream;
    public String filePath;

    public DataField(String excelfilePath) {
        try {
            filePath = excelfilePath;
            s = new File(excelfilePath);
            stream = new FileInputStream(s);
            work_book = new XSSFWorkbook(stream);
            sheet = work_book.getSheetAt(0);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String getData(int row, int column) {
        return sheet.getRow(row).getCell(column).getStringCellValue();
    }

    public int getRowCount(int sheetIndex) {
        int row = work_book.getSheetAt(sheetIndex).getLastRowNum();
        row = row + 1;
        return row;
    }

    public void closeWorkBook() throws IOException {
        stream.close();
    }

    public void write(String text, int row, int column) throws IOException {
        work_book = new XSSFWorkbook( new FileInputStream(s));
        sheet = work_book.getSheetAt(0);
        var row1 = sheet.createRow(row);
        var cell = row1.createCell(column);

        System.out.println(cell);
        cell.setCellValue(text);
        FileOutputStream output = new FileOutputStream(filePath);
        work_book.write(output);
        output.close();
    }
}

