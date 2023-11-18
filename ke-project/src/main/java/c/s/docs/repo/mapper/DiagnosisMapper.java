package c.s.docs.repo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import c.s.docs.model.Diagnosis;

public class DiagnosisMapper implements RowMapper<Diagnosis> {

	@Override
	public Diagnosis mapRow(ResultSet rs, int rowNum) throws SQLException {
		Diagnosis diagnosis = new Diagnosis();
//		diagnosis.setDCode(rs.getString("d_code"));
//		diagnosis.setDName(rs.getString("d_name"));
		diagnosis.setDiagCode(rs.getString("diagCode"));
//		diagnosis.setDiagName(rs.getString("diagDesc"));
		return diagnosis;
	}

}
