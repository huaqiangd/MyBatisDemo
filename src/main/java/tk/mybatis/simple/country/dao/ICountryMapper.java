package tk.mybatis.simple.country.dao;

import java.util.List;

import tk.mybatis.simple.country.model.Country;


public interface ICountryMapper {
	public List<Country> selectAll();
}
