package org.personal.database;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RhombusMapper implements RowMapper<Rhombus> {

    public Rhombus mapRow(ResultSet rs, int rowNum) throws SQLException{

        Integer id = rs.getInt("id");
        String name = rs.getString("name");

        return new Rhombus(id, name);
    }
}
