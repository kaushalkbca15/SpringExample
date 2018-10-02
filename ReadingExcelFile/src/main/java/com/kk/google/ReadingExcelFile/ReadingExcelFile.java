package com.kk.google.ReadingExcelFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.stream.Stream;

import com.coreoz.windmill.Windmill;
import com.coreoz.windmill.files.FileSource;
import com.sun.rowset.internal.Row;

public class ReadingExcelFile 
{
    public static void main( String[] args ) throws FileNotFoundException
    {
    	/*try (Stream<Row> rowStream = Windmill.parse(FileSource.of(new FileInputStream("D:\\user.xlsx")))) {
    		  rowStream
    		    // skip the header row that contains the column names
    		    .skip(1)
    		    .forEach(row -> {
    		      System.out.println(
    		        "row n°" + row.rowIndex()
    		        + " column 'User login' value : " + row.cell("User login").asString()
    		        + " column n°3 number value : " + row.cell(2).asDouble().value() // index is zero-based
    		      );
    		    });
    }}*/
}
