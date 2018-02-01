package com.zilker.delegate;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zilker.bean.MatchWithName;
import com.zilker.factory.RetrieveMatchesFactory;
import com.zilker.interfaces.RetrieveMatchesInterface;

public class RetrieveMatchesFactoryDelegate {

	public ArrayList<MatchWithName> findMatches(HttpServletRequest request, HttpServletResponse response) {
		RetrieveMatchesFactory factory = new RetrieveMatchesFactory();
		String type = (String)request.getSession().getAttribute("type");
		RetrieveMatchesInterface interfaceMatch = factory.getType(type);
		ArrayList<MatchWithName> matchList = new ArrayList<MatchWithName>();
		matchList=interfaceMatch.retrieveMatch();
		return matchList;
	}
}
