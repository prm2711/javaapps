package com.zilker.utilities;

import com.zilker.constant.Constants;

public class AdminValidation {
public int validateAdmin(String user,String password)
{
	if(user.equals(Constants.ADMIN))
	{
		if(password.equals(Constants.PASSWORD))
			return 1;
	}
	return 0;
}
}
