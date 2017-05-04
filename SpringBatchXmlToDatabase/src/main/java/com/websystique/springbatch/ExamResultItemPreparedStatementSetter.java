package com.websystique.springbatch;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.batch.item.database.ItemPreparedStatementSetter;

import com.websystique.springbatch.model.ExamResult;

public class ExamResultItemPreparedStatementSetter implements ItemPreparedStatementSetter<ExamResult> {

	public void setValues(ExamResult result, PreparedStatement ps) throws SQLException {
		ps.setString(2, result.getStudentName());
		ps.setDate(3, new java.sql.Date(result.getDob().toDate().getTime()));
		ps.setDouble(4, result.getPercentage());
		ps.setInt(1, result.getStudentId());
	}

}