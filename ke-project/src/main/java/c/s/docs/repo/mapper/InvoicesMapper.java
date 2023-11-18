package c.s.docs.repo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import c.s.docs.model.Invoices;

public class InvoicesMapper implements RowMapper<Invoices> {

	@Override
	public Invoices mapRow(ResultSet rs, int rowNum) throws SQLException {
		Invoices invoices = new Invoices();
		invoices.setId(rs.getInt("id"));
		invoices.setAmount(rs.getString("amount"));
		invoices.setBenefitDesc("benefitDesc");
		return invoices;
	}

}
