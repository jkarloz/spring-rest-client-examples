package guru.springframework.api.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Juan Carlos - 2018/01/30
 *
 */
public class Billing implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6024110070985196558L;
	Card card;
	private Map<String, Object> additionalProperties = new HashMap<>();
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	public Map<String, Object> getAdditionalProperties() {
		return additionalProperties;
	}
	public void setAdditionalProperties(Map<String, Object> additionalProperties) {
		this.additionalProperties = additionalProperties;
	}
}
