package com.zilker.constant;

public class Constants {
	public static final String DB_URL = "jdbc:mysql://localhost/contactschema";
	// Database credentials
	public static final String USER = "root";
	public static final String PASS = "Ztech@123";
	public static final String PATH = "com.mysql.jdbc.Driver";
	public static final String INS = "insert into contact (first_name,last_name,emailid) values(?,?,?)";
	public static final String INSP = "insert into phone (extension,code,phoneno,phid) values(?,?,?,?)";
	public static final String RETID = "select contid from contact where first_name=?";
	public static final String SORT = "select first_name,last_name,emailid,extension,code,phoneno,phid from contact inner join phone "
			+ "where contact.contid=phone.contid order by first_name";
	public static final String SORTLAST = "select first_name,last_name,emailid,extension,code,phoneno,phid from contact "
			+ "inner join phone where contact.contid=phone.contid order by last_name";
	public static final String UPDATECONTACT = "update contact set emailid=? where first_name=?";
	public static final String RETRIEVE="select contact.contid,first_name,last_name,emailid,extension,code,phoneno,phid "
			+ "from contact inner join phone where contact.contid=phone.contid and first_name=? and last_name=?";
	public static final String UPDATEPHONE="update phone set phoneno=? where contid=?";

}
