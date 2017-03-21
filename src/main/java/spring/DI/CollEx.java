package spring.DI;

import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollEx {
	
	List listValue;
	Map mapValue;
	Properties propValue;
	
	public void setListValue(List listValue) {
		this.listValue = listValue;
	}
	
	public void setMapValue(Map mapValue) {
		this.mapValue = mapValue;
	}
	
	public void setPropValue(Properties propValue) {
		this.propValue = propValue;
	}
	
	
}
