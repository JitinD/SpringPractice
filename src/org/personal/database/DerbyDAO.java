package org.personal.database;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.util.List;


public class DerbyDAO {

    private DriverManagerDataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    public DerbyDAO(){
        setDataSource();
        setJdbcTemplate();
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource() {
        dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.apache.derby.jdbc.ClientDriver");
        dataSource.setUrl("jdbc:derby://localhost:1527/db");
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate() {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public Integer getRhombusCount(){
        String sql = "select count(*) from rhombus";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    public String getRhombusName(Integer rhombusId){
        String sql = "select name from rhombus where id  = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{rhombusId}, String.class);
    }

    public Rhombus getRhombus(Integer rhombusId){
        String sql = "select * from rhombus where id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{rhombusId}, new RhombusMapper());
    }

    public List<Rhombus> getAllRhombus(){
        String sql = "select * from rhombus";
        return jdbcTemplate.query(sql, new RhombusMapper());
    }
}
