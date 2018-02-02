package guru.springframework.springrestclientexamples.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import guru.springframework.api.domain.User;
import guru.springframework.api.domain.UserData;

/**
 * @author Juan Carlos - 2018/01/31
 *
 */
@Service
public class ApiServiceImpl implements ApiService {
	
	private RestTemplate restTemplate;

	public ApiServiceImpl(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	/* (non-Javadoc)
	 * @see guru.springframework.springrestclientexamples.services.ApiService#getUsers(java.lang.Integer)
	 */
	@Override
	public List<User> getUsers(Integer limit) {
		UserData userData = restTemplate.getForObject("http://apifaketory.com/api/user?limit="+limit, UserData.class);
		return userData.getData();
	}

}
