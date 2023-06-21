package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.model1;
import com.example.demo.Repository.Repo2;

@RestController
@CrossOrigin("http://localhost:3000")
	@RequestMapping("/connect")



public class Controller1 {
	@Autowired
	Repo2 repo;
	@PostMapping("/bookingdata")
	public String meth(@RequestBody model1 d)

	{
	repo.save(d);
	return "inserted ";
	}
	
	
	
@PutMapping("/put/{name}")
public String editdata
(@PathVariable String name,@RequestBody model1 d)
{
model1 m=repo.findById(name).get();
if(m!=null) {
m.setAge(d.getAge());
m.setPhonenumber(d.getPhonenumber());
repo.save(m);
return "Updated";
}
else {

return "no update";

}
}

@DeleteMapping("/delete/{name}")
public String deletedata(@PathVariable String name)
{
repo.deleteById(name);

return "Deleted";
}
@GetMapping("/bookingdat")
public List<model1> getDelete(){
	return repo.findAll();	
	}

}