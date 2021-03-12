package org.obrii.mit.dp2021.shmat.ShmatKateryna2021.dao;

import org.obrii.mit.dp2021.shmat.ShmatKateryna2021.Data;
import org.obrii.mit.dp2021.shmat.ShmatKateryna2021.dao.impl.UserDaoImpl;

public class DaoFactory {
    public static UserDao createUserDao() {
        return new UserDaoImpl();
    }
}
