package org.obrii.mit.dp2021.shmat.ShmatKateryna2021.dao.impl;

import org.obrii.mit.dp2021.shmat.ShmatKateryna2021.Data;
import org.obrii.mit.dp2021.shmat.ShmatKateryna2021.dao.Dao;
import org.obrii.mit.dp2021.shmat.ShmatKateryna2021.connection.ConnectionFactory;
import org.obrii.mit.dp2021.shmat.ShmatKateryna2021.dao.UserDao;

import java.sql.*;
import java.util.ArrayList;

public class UserDaoImpl implements UserDao {

    private Connection getConnection() throws SQLException {
        Connection conn;
        conn = ConnectionFactory.getInstance().getConnection();
        return conn;
    }

    @Override
    public void create(Data entity) {
        String insertQuery = "INSERT INTO users(name, f_name, age, email) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = getConnection().prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, entity.getName());
            statement.setString(2, entity.getFamilyname());
            statement.setInt(3, entity.getAge());
            statement.setString(4, entity.getEmail());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Data findById(int id) {
        String selectQuery = "SELECT * FROM users WHERE id=?";
        try (PreparedStatement statement = getConnection().prepareStatement(selectQuery)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                final Data user = new Data();
                user.setNumber(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setFamilyname(resultSet.getString("f_name"));
                user.setEmail(resultSet.getString("email"));
                user.setAge(resultSet.getInt("age"));
                return user;
            } else {
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public ArrayList<Data> findAll() {
        String selectQuery = "SELECT * FROM users";
        ArrayList<Data> rows = new ArrayList<>();
        try (PreparedStatement statement = getConnection().prepareStatement(selectQuery)) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                final Data user = new Data();
                user.setNumber(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setFamilyname(resultSet.getString("f_name"));
                user.setEmail(resultSet.getString("email"));
                user.setAge(resultSet.getInt("age"));
                rows.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rows;
    }

    @Override
    public void update(Data entity) {
        String updateQuery = "UPDATE users SET name=?, f_name=?, age=?, email=? WHERE id=?";
        try (PreparedStatement statement = getConnection().prepareStatement(updateQuery)) {
            statement.setString(1, entity.getName());
            statement.setString(2, entity.getFamilyname());
            statement.setInt(3, entity.getAge());
            statement.setString(4, entity.getEmail());
            statement.setInt(5, entity.getNumber());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        String queryString = "DELETE FROM users WHERE id=?";
        try (PreparedStatement statement = getConnection().prepareStatement(queryString)) {
            statement.setInt(1, id);
            statement.executeUpdate();
            System.out.println("User deleted successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<Data> filterByLogin(String name) {
        String selectQuery = "SELECT * FROM users WHERE name=?";
        ArrayList<Data> rows = new ArrayList<>();
        try (PreparedStatement statement = getConnection().prepareStatement(selectQuery)) {
            statement.setString(1, name);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                final Data user = new Data();
                user.setNumber(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setFamilyname(resultSet.getString("f_name"));
                user.setEmail(resultSet.getString("email"));
                user.setAge(resultSet.getInt("age"));
                rows.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rows;
    }
}
