package com.anudip.sb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.anudip.sb.entity.Students;
import com.anudip.sb.service.StudentsService;

@RestController
public class StudentsController {

	@Autowired
	StudentsService ss;

	@PostMapping("/Students/addStudents")
	public ResponseEntity<Students> saveStudenss(@RequestBody Students studenss) {
		return new ResponseEntity<>(ss.addStudents(studenss), HttpStatus.CREATED);
	}

	@GetMapping("/Students/gesstudents/{sid}")
	public ResponseEntity<Students> gesstudenss(@PathVariable("sid") int sid) {
		return new ResponseEntity<>(ss.getStudentsDetail(sid), HttpStatus.OK);
	}

	@DeleteMapping("Students/removeStudents/{sid}")
	public ResponseEntity<String> deleteStudenss(@PathVariable("sid") int sid) {
		ss.deleteStudentsDetail(sid);
		return new ResponseEntity<>("Deleted Successfully..", HttpStatus.OK);
	}

	@PutMapping("/Students/edisstudents/{sid}")
	public ResponseEntity<Students> edisstudenss(@PathVariable("sid") int sid, @RequestBody Students students) {
		return new ResponseEntity<>(ss.updateStudentsDetail(students, sid), HttpStatus.OK);
	}
}
