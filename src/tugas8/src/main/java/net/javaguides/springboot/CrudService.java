package net.javaguides.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CrudService {
	
	@Autowired
	private CustomerRepository repo;

	public List<Customer> listAll() {
		return (List<Customer>) repo.findAll();
	}

	public void save(Customer customer) {
		repo.save(customer);
	}

	public Customer get(int id) {
		return repo.findById(id).get();
	}

	public void delete(int id) {
		repo.deleteById(id);
	}

	public List<Customer> search(String keyword) {
		return repo.search(keyword);
	}
}
