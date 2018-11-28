package tn.cni.td.demo5555.services;

import javax.ejb.Remote;

import tn.cni.td.demo5555.entities.User;
import tn.cni.td.demo5555.utilities.IGenericDAO;

@Remote
public interface UserServiceRemote extends IGenericDAO<User> {

}
