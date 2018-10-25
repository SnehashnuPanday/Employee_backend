package com.example.demo.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeDto;

public class ExcelView extends AbstractXlsxView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		// change the file name
		response.setHeader("Content-Disposition", "attachment; filename=\"user_report.xlsx\"");

		@SuppressWarnings("unchecked")
		List<EmployeeDto> users = (List<EmployeeDto>) model.get("users");

		// create excel xls sheet
		Sheet sheet = workbook.createSheet("User Detail");
		sheet.setDefaultColumnWidth(30);

		// create style for header cells
		CellStyle style = workbook.createCellStyle();
		Font font = workbook.createFont();
		font.setFontName("Arial");
		style.setFillForegroundColor(HSSFColor.BLUE.index);
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		font.setBold(true);
		font.setColor(HSSFColor.WHITE.index);
		style.setFont(font);

		// create header row
		Row header = sheet.createRow(0);
		header.createCell(0).setCellValue("Skill");
		header.getCell(0).setCellStyle(style);
		header.createCell(1).setCellValue("Resource Name");
		header.getCell(1).setCellStyle(style);
		header.createCell(2).setCellValue("SOW Name");
		header.getCell(2).setCellStyle(style);
		header.createCell(3).setCellValue("Location");
		header.getCell(3).setCellStyle(style);
		header.createCell(4).setCellValue("Client Manager");
		header.getCell(4).setCellStyle(style);
		header.createCell(5).setCellValue("Vendor");
		header.getCell(5).setCellStyle(style);
		header.createCell(6).setCellValue("Project");
		header.getCell(6).setCellStyle(style);
		header.createCell(7).setCellValue("Location");
		header.getCell(7).setCellStyle(style);
		header.createCell(8).setCellValue("Comments");
		header.getCell(8).setCellStyle(style);
		header.createCell(9).setCellValue("MSA Rate");
		header.getCell(9).setCellStyle(style);
		header.createCell(10).setCellValue("Rate ($)");
		header.getCell(10).setCellStyle(style);
		header.createCell(11).setCellValue("Jan");
		header.getCell(11).setCellStyle(style);
		header.createCell(12).setCellValue("Feb");
		header.getCell(12).setCellStyle(style);
		header.createCell(13).setCellValue("Mar");
		header.getCell(13).setCellStyle(style);
		header.createCell(14).setCellValue("Apr");
		header.getCell(14).setCellStyle(style);
		header.createCell(15).setCellValue("May");
		header.getCell(15).setCellStyle(style);
		header.createCell(16).setCellValue("Jun");
		header.getCell(16).setCellStyle(style);
		header.createCell(17).setCellValue("Jul");
		header.getCell(17).setCellStyle(style);
		header.createCell(18).setCellValue("Aug");
		header.getCell(18).setCellStyle(style);
		header.createCell(19).setCellValue("Sep");
		header.getCell(19).setCellStyle(style);
		header.createCell(20).setCellValue("Oct");
		header.getCell(20).setCellStyle(style);
		header.createCell(21).setCellValue("Nov");
		header.getCell(21).setCellStyle(style);
		header.createCell(22).setCellValue("Dec");
		header.getCell(22).setCellStyle(style);
		header.createCell(23).setCellValue("Total Hours");
		header.getCell(23).setCellStyle(style);
		header.createCell(24).setCellValue("Fee ($) After Discount");
		header.getCell(24).setCellStyle(style);

		int rowCount = 1;

		for (EmployeeDto user : users) {
			Row userRow = sheet.createRow(rowCount++);
			userRow.createCell(0).setCellValue(user.getSkill());
			userRow.createCell(1).setCellValue(user.getResourceName());
			userRow.createCell(2).setCellValue(user.getSowName());
			userRow.createCell(3).setCellValue(user.getLocationType());
			userRow.createCell(4).setCellValue(user.getClientManager());
			userRow.createCell(5).setCellValue(user.getVendor());
			userRow.createCell(6).setCellValue(user.getProject());
			userRow.createCell(7).setCellValue(user.getWorkLocation());
			userRow.createCell(8).setCellValue(user.getComments());
			userRow.createCell(9).setCellValue(user.getMsaRate());
			userRow.createCell(10).setCellValue(user.getRate());
			userRow.createCell(11).setCellValue(user.getJanHrs());
			userRow.createCell(12).setCellValue(user.getFebHrs());
			userRow.createCell(13).setCellValue(user.getMarHrs());
			userRow.createCell(14).setCellValue(user.getAprHrs());
			userRow.createCell(15).setCellValue(user.getMayHrs());
			userRow.createCell(16).setCellValue(user.getJunHrs());
			userRow.createCell(17).setCellValue(user.getJulHrs());
			userRow.createCell(18).setCellValue(user.getAugHrs());
			userRow.createCell(19).setCellValue(user.getSepHrs());
			userRow.createCell(20).setCellValue(user.getOctHrs());
			userRow.createCell(21).setCellValue(user.getNovHrs());
			userRow.createCell(22).setCellValue(user.getDecHrs());
			userRow.createCell(23).setCellValue(user.getTotalHours());
			userRow.createCell(24).setCellValue(user.getDiscountedFee());
		}

	}

}
