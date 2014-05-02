package de.wiese24.springlearning;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import de.wiese24.springlearning.model.Offer;

@Component("offersDao")
public class OffersDAO {

	private JdbcTemplate jdbc;

	@Inject
	public void setDataSource(DataSource dataSource) {
		this.jdbc = new JdbcTemplate(dataSource);
	}

	public List<Offer> getOffers() {

		return jdbc.query("SELECT * FROM offers", new RowMapper<Offer>() {

			Offer offer = null;

			public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {
				offer = new Offer();
				offer.setId(rs.getInt("id"));
				offer.setEmail(rs.getString("email"));
				offer.setName(rs.getString("name"));
				offer.setText(rs.getString("text"));
				return offer;
			}
		});
	}
}
