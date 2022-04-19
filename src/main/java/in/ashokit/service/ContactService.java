package in.ashokit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entiry.Contact;
import in.ashokit.repository.ContactRepository;
@Service
public interface ContactService {
	
	
	public static final ContactRepository contactRepository = null;
	
	public default Contact upsert(Contact contact) {
		 return contactRepository.save(contact);
	}

	public default List<Contact> getAllContacts(){
		List <Contact> contact=new ArrayList<Contact>();
		contactRepository.findAll();
		return contact;
	}


	public default Contact getContact(int cid) {
		return contactRepository.getById(cid);
	}


	public default void delete(int cid) {
		contactRepository.deleteById(cid);
	}


}
	 
