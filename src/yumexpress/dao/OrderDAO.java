/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yumexpress.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import static yumexpress.dao.CustomerDAO.getNewId;
import yumexpress.dbutil.DBConnection;
import yumexpress.pojo.CustomerPojo;
import yumexpress.pojo.OrderPojo;
import yumexpress.pojo.PlaceOrderPojo;

/**
 *
 * @author Isha Rathore
 */
public class OrderDAO {
       public static String getNewId()throws SQLException{
       Connection conn =DBConnection.getConnection();
       Statement st=conn.createStatement();
       ResultSet rs=st.executeQuery("Select max(order_id) from orders");
       rs.next();
       String id=rs.getString(1);
       String ordId="";
       if(id!=null){
           id=id.substring(4);
           ordId="ORD-"+(Integer.parseInt(id)+1);
       }
       else{
           ordId="ORD-101";
       }
       return ordId;
        
       }
        public static String placeOrder(PlaceOrderPojo placeOrder)throws SQLException{
        Connection conn =DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into orders values(?,?,?,?,?,?,?,?)");
        placeOrder.setOrderId(getNewId());
        ps.setString(1,placeOrder.getOrderId());
        ps.setString(2,placeOrder.getProductId());
        ps.setString(3,placeOrder.getCustomerId());
        ps.setString(4,placeOrder.getDeliveryStaffId());
        ps.setString(5,"");
        ps.setString(6,"ORDERED");
        ps.setString(7,placeOrder.getCompanyId());
        Random rn=new Random();
        int otp=rn.nextInt(10000);
        ps.setInt(8,otp);
        
        if(ps.executeUpdate()==1)return placeOrder.getOrderId();
        return null;
        
    }
      public static OrderPojo getOrderDetailsByOrderId(String orderId) throws SQLException {
        Connection conn = DBConnection.getConnection();
        String qry = "SELECT c.customer_name, c.address, s.staff_name, c.mobile_no, co.company_name,co.email_id, p.product_name, p.product_price, o.otp "
                + "FROM orders o "
                + "JOIN products p ON o.product_id = p.product_id "
                + "JOIN companies co ON o.company_id = co.company_id "
                + "JOIN customers c ON o.customer_id = c.customer_id "
                + "JOIN staff s ON o.staff_id = s.staff_id "
                + "WHERE o.order_id = ?";
        PreparedStatement ps = conn.prepareStatement(qry);
        ps.setString(1, orderId);
        ResultSet rs = ps.executeQuery();
        OrderPojo order = null;
        if (rs.next()) {
            order = new OrderPojo();
            order.setOrderId(orderId);
            order.setCustomerName(rs.getString("customer_name"));
            order.setCustomerAddress(rs.getString("address"));
            order.setDeliveryStaffName(rs.getString("staff_name"));
            order.setCustomerPhoneNo(rs.getString("mobile_no"));
            order.setCompanyName(rs.getString("company_name"));
            order.setCompanyEmailId(rs.getString("email_id"));
            order.setProductName(rs.getString("product_name"));
            order.setProductPrice(rs.getDouble("product_price"));
            order.setOtp(rs.getInt("otp"));

        }
        return order;
    }
     public static List<OrderPojo> getNewOrdersForStaff(String staffId) throws SQLException {
        Connection conn = DBConnection.getConnection();
        String qry = "SELECT o.order_id, o.otp, p.product_name, p.product_price, c.customer_name, c.address, c.mobile_no "
                + "FROM orders o "
                + "JOIN products p ON o.product_id = p.product_id "
                + "JOIN customers c ON o.customer_id = c.customer_id "
                + "WHERE o.staff_id = ? "
                + "  AND o.status = 'ORDERED' "
                + "ORDER BY o.order_id DESC";

        PreparedStatement ps = conn.prepareStatement(qry);
        ps.setString(1, staffId);
        ResultSet rs = ps.executeQuery();
        List<OrderPojo> orderList = new ArrayList<>();
        OrderPojo order=null;
        while (rs.next()) {
            order = new OrderPojo();
            order.setOrderId(rs.getString("order_id"));
            order.setProductName(rs.getString("product_name"));
            order.setProductPrice(rs.getDouble("product_price"));
            order.setCustomerName(rs.getString("customer_name"));
            order.setCustomerAddress(rs.getString("address"));
            order.setCustomerPhoneNo(rs.getString("mobile_no"));
            order.setOtp(rs.getInt("otp"));
            orderList.add(order);

        }
        return orderList;
    }
     public static boolean confirmOrder(String orderId)throws SQLException{
         Connection conn=DBConnection.getConnection();
         PreparedStatement ps=conn.prepareStatement("update orders set status='DELIVERED' where order_id=?");
         ps.setString(1, orderId);
         return ps.executeUpdate()==1;
         
     }
}
