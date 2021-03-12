package org.obrii.mit.dp2021.shmat.ShmatKateryna2021.dao;

import org.obrii.mit.dp2021.shmat.ShmatKateryna2021.Data;

import java.util.ArrayList;

public interface UserDao extends Dao<Data>{
    ArrayList<Data> filterByLogin(String login);
}
