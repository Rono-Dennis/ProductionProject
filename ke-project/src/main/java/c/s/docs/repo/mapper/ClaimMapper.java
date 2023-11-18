package c.s.docs.repo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import c.s.docs.model.Claims;

public class ClaimMapper implements RowMapper<Claims> {

	@Override
	public Claims mapRow(ResultSet rs, int rowNum) throws SQLException {
		Claims claims =  new Claims();
		claims.setId(rs.getInt("id"));
		claims.setMemberNames(rs.getString("member_Names"));
		claims.setMemberNumber(rs.getString("member_Number"));
		claims.setProvider(rs.getString("client_provider_name"));
		claims.setServiceType(rs.getString("service_type"));
                claims.setInteg_member_number(rs.getString("integ_member_number"));
                claims.setGlobal_id(rs.getString("global_id"));
                claims.setVisit_number(rs.getString("visit_number"));
                claims.setProv_id(rs.getInt("prov_id"));
		return claims;
	}

}








