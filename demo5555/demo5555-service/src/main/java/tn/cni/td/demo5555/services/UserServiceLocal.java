package tn.cni.td.demo5555.services;

import javax.ejb.Local;

import tn.cni.td.demo5555.entities.User;
import tn.cni.td.demo5555.utilities.IGenericDAO;

@Local
public interface UserServiceLocal extends IGenericDAO<User> {

	User login(String login, String password);

}
