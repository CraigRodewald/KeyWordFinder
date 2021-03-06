package com.CraigAndZac.Search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class WebProcess {

	public static String doWebStuff(String website) {

		try {
			// Get URL content
			URL url = new URL(website);

			// Opens connection to the website
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();

			BufferedReader htmlInfo = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			
			//  Not needed
			String htmlInfoString = "";
			String inputLine;
			while ((inputLine = htmlInfo.readLine()) != null) {
				htmlInfoString += inputLine;
			}
			
			//System.out.println(htmlInfo);
			return htmlInfoString;
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
