package in.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entiry.Contact;
import in.ashokit.service.ContactService;
import net.bytebuddy.asm.Advice.Return;

@RestController
public class ContactRestController {
	@Autowired
	private ContactService contactService;
	@PostMapping("/contact")
	public String upsert (@RequestBody Contact contact){
	
		return contactService.upsert(contact);}
	
@GetMapping("/contacts")
public ResponseEntity<List<Contact>> getAllContacts(){
	return contactService. getAllContacts();
}


@GetMapping("/contact/{cid}")
public ResponseEntity<Contact> getContact(@PathVariable int cid){
	return contactService.getContact(cid);
}
@DeleteMapping("/contact/{id}")
public ResponseEntity<String> deleteContact(@PathVariable int cid){
	return contactService.deleteContact(cid);
}



}
