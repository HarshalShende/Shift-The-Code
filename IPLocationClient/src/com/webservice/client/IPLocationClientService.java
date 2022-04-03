package com.webservice.client;

import java.util.Scanner;

import com.lavasoft.GeoIPService;
import com.lavasoft.GeoIPServiceSoap;

public class IPLocationClientService {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Ip Adress :: ");
		String ipaddress=scn.nextLine();
		
		GeoIPService ipservice=new GeoIPService();
		GeoIPServiceSoap geoIpServiceSoap=ipservice.getGeoIPServiceSoap();
		String location=geoIpServiceSoap.getIpLocation(ipaddress);
		System.out.println("Location From Webservice Call: "+location);
	}

}
