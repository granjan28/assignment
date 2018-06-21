package com.cgi.uswest.chimpls.assignment;

import java.math.BigDecimal;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(path="/assignment") 

public class AssignmentController {
	@Autowired
	private AssignmentRepository assignmentRepository;
	
//	@GetMapping(path="/all")
	@RequestMapping("/all")
	public @ResponseBody Iterable<Assignment> getAllAssignments() {
		// This returns a JSON or XML with the users
		return assignmentRepository.findAll();
	}
	
	@RequestMapping("/primaryAssignmentByIdCase/{id_case}")
	public @ResponseBody Assignment getPrimaryAssignmentByIdCase(@PathVariable("id_case") BigDecimal id_case) {
		return assignmentRepository.getPrimaryAssignmentByIdCase(id_case);
    }

	@RequestMapping("/primaryAssignmentByIdPrvd/{id_prvd}")
	public @ResponseBody Assignment getPrimaryAssignmentByIdPrvd(@PathVariable("id_prvd") BigDecimal id_prvd) {
		return assignmentRepository.getPrimaryAssignmentByIdPrvd(id_prvd);
    }
	
	@RequestMapping("/primaryAssignmentByIdPrsn/{id_prsn}")
	public @ResponseBody Set<Assignment> getPrimaryAssignmentByIdPrsn(@PathVariable("id_prsn") BigDecimal id_prsn) {
		return assignmentRepository.getPrimaryAssignmentByIdPrsn(id_prsn);
    }
}
