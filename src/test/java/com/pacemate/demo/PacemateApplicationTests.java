package com.pacemate.demo;

import com.pacemate.demo.util.CSVFileReader;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.net.URI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@SpringBootTest
class PacemateApplicationTests {

	private String FILE_PATH = "D:\\csv\\20210327.csv.csv";
	@Test
	void contextLoads() throws Exception {
		URI uri = new URI("file:///D:/csv/20210327.csv.csv");
		File file = new File(uri);
		CSVFileReader csvFileReader = new CSVFileReader(file);
		csvFileReader.readCSVFromStudentList();
	}
}
