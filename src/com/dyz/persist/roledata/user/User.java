package com.dyz.persist.roledata.user;

public class User {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_user.f_id
	 * @mbggenerated  Wed Jan 28 18:25:03 CST 2015
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_user.f_name
	 * @mbggenerated  Wed Jan 28 18:25:03 CST 2015
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_user.f_phonenumber
	 * @mbggenerated  Wed Jan 28 18:25:03 CST 2015
	 */
	private String phonenumber;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_user.f_email
	 * @mbggenerated  Wed Jan 28 18:25:03 CST 2015
	 */
	private String email;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_user.f_passwd
	 * @mbggenerated  Wed Jan 28 18:25:03 CST 2015
	 */
	private String passwd;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_user.f_regdate
	 * @mbggenerated  Wed Jan 28 18:25:03 CST 2015
	 */
	private Long regdate;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user.f_id
	 * @return  the value of t_user.f_id
	 * @mbggenerated  Wed Jan 28 18:25:03 CST 2015
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user.f_id
	 * @param id  the value for t_user.f_id
	 * @mbggenerated  Wed Jan 28 18:25:03 CST 2015
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user.f_name
	 * @return  the value of t_user.f_name
	 * @mbggenerated  Wed Jan 28 18:25:03 CST 2015
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user.f_name
	 * @param name  the value for t_user.f_name
	 * @mbggenerated  Wed Jan 28 18:25:03 CST 2015
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user.f_phonenumber
	 * @return  the value of t_user.f_phonenumber
	 * @mbggenerated  Wed Jan 28 18:25:03 CST 2015
	 */
	public String getPhonenumber() {
		return phonenumber;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user.f_phonenumber
	 * @param phonenumber  the value for t_user.f_phonenumber
	 * @mbggenerated  Wed Jan 28 18:25:03 CST 2015
	 */
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber == null ? null : phonenumber.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user.f_email
	 * @return  the value of t_user.f_email
	 * @mbggenerated  Wed Jan 28 18:25:03 CST 2015
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user.f_email
	 * @param email  the value for t_user.f_email
	 * @mbggenerated  Wed Jan 28 18:25:03 CST 2015
	 */
	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user.f_passwd
	 * @return  the value of t_user.f_passwd
	 * @mbggenerated  Wed Jan 28 18:25:03 CST 2015
	 */
	public String getPasswd() {
		return passwd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user.f_passwd
	 * @param passwd  the value for t_user.f_passwd
	 * @mbggenerated  Wed Jan 28 18:25:03 CST 2015
	 */
	public void setPasswd(String passwd) {
		this.passwd = passwd == null ? null : passwd.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user.f_regdate
	 * @return  the value of t_user.f_regdate
	 * @mbggenerated  Wed Jan 28 18:25:03 CST 2015
	 */
	public Long getRegdate() {
		return regdate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user.f_regdate
	 * @param regdate  the value for t_user.f_regdate
	 * @mbggenerated  Wed Jan 28 18:25:03 CST 2015
	 */
	public void setRegdate(Long regdate) {
		this.regdate = regdate;
	}
}