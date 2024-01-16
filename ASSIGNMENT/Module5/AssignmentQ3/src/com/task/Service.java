package com.task;

public class Service 
{
	private Repositery repository;
	
   
	public Repositery getRepository() {
		return repository;
	}


	public void setRepository(Repositery repository) {
		this.repository = repository;
	}


	public void createUser(String userName) {
        System.out.println("Creating user: " + userName);
        repository.saveUser(userName);
    }
}
