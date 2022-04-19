package in.ashokit.controller;

import java.security.PublicKey;
import java.util.List;

import javax.management.loading.PrivateClassLoader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entiry.Contact;
import in.ashokit.service.ContactService;

@RestController
//@RequestMapping("/")
public class ContactRestController {

	@Autowired
	private ContactService contactService;
	
	@PostMapping("/contact")
	public void upsert(@RequestBody Contact contact) {
		 contactService.upsert(contact);
		
	}
	@GetMapping("/contacts")
	public List<Contact> getAllContacts(){
		return contactService.getAllContacts();
	}
	@GetMapping("/contact/{cid}")
	public Contact getContact(@PathVariable int cid){
		return contactService.getContact(cid);
	}

	@DeleteMapping("/contact/{cid}")
		private void deleteContact(@PathVariable("id") int cid ) {
			 contactService.delete(cid);
		
	}
}
