package tk.mybatis.simple.generator.model;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table country
 *
 * @mbggenerated do_not_delete_during_merge
 */
public class Country {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column country.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column country.countryName
     *
     * @mbggenerated
     */
    private String countryname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column country.countryCode
     *
     * @mbggenerated
     */
    private String countrycode;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column country.id
     *
     * @return the value of country.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column country.id
     *
     * @param id the value for country.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column country.countryName
     *
     * @return the value of country.countryName
     *
     * @mbggenerated
     */
    public String getCountryname() {
        return countryname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column country.countryName
     *
     * @param countryname the value for country.countryName
     *
     * @mbggenerated
     */
    public void setCountryname(String countryname) {
        this.countryname = countryname == null ? null : countryname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column country.countryCode
     *
     * @return the value of country.countryCode
     *
     * @mbggenerated
     */
    public String getCountrycode() {
        return countrycode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column country.countryCode
     *
     * @param countrycode the value for country.countryCode
     *
     * @mbggenerated
     */
    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode == null ? null : countrycode.trim();
    }
}