package in.ashokit.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import in.ashokit.entiry.Contact;
@Service
public interface ContactService {


public ResponseEntity<Contact> getContact(int cid);

public ResponseEntity<List<Contact>> getAllContacts();

public String upsert(Contact contact);

public ResponseEntity<String> deleteContact(int cid);
}
