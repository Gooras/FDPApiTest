package com.asseco.cm;

import java.util.Date;
import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class FDPApiTools {

  public static XMLGregorianCalendar getXMLDate(Date date) throws DatatypeConfigurationException {
    GregorianCalendar calendar = new GregorianCalendar();
    calendar.setTime(date);
    XMLGregorianCalendar xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
    return xmlDate;
  }

  public static Date getDate(XMLGregorianCalendar date) throws DatatypeConfigurationException {
    if(date == null) {
      return null;
    }
      return date.toGregorianCalendar().getTime();
  }

}