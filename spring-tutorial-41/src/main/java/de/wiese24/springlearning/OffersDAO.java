package de.wiese24.springlearning;

import java.util.List;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import de.wiese24.springlearning.model.Offer;

public class OffersDAO {

	private JdbcTemplate jdbc;

	@Inject
	public void setDataSource(DataSource dataSource) {
		this.jdbc = new JdbcTemplate(dataSource);
	}

	public List<Offer> getOffers() {
		return null;
	}
}
