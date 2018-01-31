package guru.springframework.api.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Juan Carlos - 2018/01/30
 *
 */
public class ExpirationDate implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -75076699769638603L;
	String date;
	Integer timeZoneType;
	String timeZone;
	private Map<String, Object> additionalProperties = new HashMap<>();
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Integer getTimeZoneType() {
		return timeZoneType;
	}
	public void setTimeZoneType(Integer timeZoneType) {
		this.timeZoneType = timeZoneType;
	}
	public String getTimeZone() {
		return timeZone;
	}
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}
	public Map<String, Object> getAdditionalProperties() {
		return additionalProperties;
	}
	public void setAdditionalProperties(Map<String, Object> additionalProperties) {
		this.additionalProperties = additionalProperties;
	}
}
