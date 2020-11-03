package cn.dangao.dao.Type;
import cn.dangao.entity.Type;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import cn.dangao.utils.DBUtil;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;

public interface TypeDao
{
    /**
     * 获取所有类别
     * @return
     * @throws SQLException
     */
    public List<Type> GetAllType() throws SQLException;
   /* public List<Type> GetAllType() throws SQLException {
        QueryRunner r=new QueryRunner(DBUtil.getDataSource());
        String sql="select * from type";
        return r.query(sql,new BeanListHandler<Type>(Type.class));
    }*/

    /**
     * 根据类别id查询
     * @param typeid
     * @return
     * @throws SQLException
     */
    public Type selectTypeNameByID(@Param("typeid") int typeid) throws SQLException; /*{
        QueryRunner r=new QueryRunner(DBUtil.getDataSource());
        String sql="select * from type where id=?";
        return r.query(sql,new BeanHandler<Type>(Type.class),typeid);
    }*/

    /**
     * 根据id 查询
     * @param id
     * @return
     * @throws SQLException
     */
    public Type select(@Param("id") int id) throws SQLException;/* {
        QueryRunner r = new QueryRunner(DBUtil.getDataSource());
        String sql = "select * from type where id = ?";
        return r.query(sql, new BeanHandler<Type>(Type.class),id);
    }*/

    /**
     * 新增
     * @param t
     * @throws SQLException
     */
    public void insert(@Param("t") Type t) throws SQLException;/*{
        QueryRunner r = new QueryRunner(DBUtil.getDataSource());
        String sql = "insert into type(name) values(?)";
        r.update(sql,t.getName());
    }*/

    /**
     * 修改
     * @param t
     * @throws SQLException
     */
    public void update(@Param("t") Type t) throws SQLException; /*{
        QueryRunner r = new QueryRunner(DBUtil.getDataSource());
        String sql = "update type set name=? where id = ?";
        r.update(sql,t.getName(),t.getId());
    }*/

    /**
     * 删除
     * @param id
     * @throws SQLException
     */
    public void delete(@Param("id") int id) throws SQLException;/*{
        QueryRunner r = new QueryRunner(DBUtil.getDataSource());
        String sql = "delete from type where id = ?";
        r.update(sql,id);
    }*/
}
