package com.factory.service;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.factory.dao.UsersDao;
import com.factory.dto.UsersDTO;
import com.factory.model.Users;

@Service(value = "userService")
public class UsersService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UsersService.class);
	private String entityName = "Users";
	
	@Autowired
	private UsersDao usersDao;
	/*@Autowired
	private BCryptPasswordEncoder encoder;*/
	
	public UsersDTO findbyUserName(String username) {
		LOGGER.info("Invoked method: {} : findbyUserName with username : {}  ", entityName, username);
		Users entity = usersDao.findByUserName(username);
		if (entity != null) {
			LOGGER.info("{} fetched successfully with  code : {}  ", entityName, username);
			return convertToDto(entity);
		} else {
			LOGGER.warn(" {} cannot be found  with code : {}  ", entityName, username);
			return null;
		}
	}
	
	
	private UsersDTO convertToDto(Users entity) {
		ModelMapper modelMapper = new ModelMapper();
		UsersDTO dto = modelMapper.map(entity, UsersDTO.class);
		return dto;
	}
	

}
