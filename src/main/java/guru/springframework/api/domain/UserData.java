package guru.springframework.api.domain;

import java.util.List;

/**
 * @author Juan Carlos - 2018/01/31
 *
 */
public class UserData {
	List<User> data;

	public List<User> getData() {
		return data;
	}

	public void setData(List<User> data) {
		this.data = data;
	}	
}
