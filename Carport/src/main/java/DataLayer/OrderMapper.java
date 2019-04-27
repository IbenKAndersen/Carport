package DataLayer;

import DataLayer.Connector;
import LogicLayer.Carport;
import LogicLayer.Customer;
import LogicLayer.FogException;
import PresentationLayer.Order;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @authors Iben, Christian, Benjamin, Nicklas, Mikkel
 */
public class OrderMapper {

    public static void makeOrder( Carport carport, Customer customer ) throws FogException {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO orders (details, price) VALUES (?, ?)";
            PreparedStatement ps = con.prepareStatement( SQL, Statement.RETURN_GENERATED_KEYS );
            ps.setString( 1, carport.getDetails() );
            ps.setInt( 2, carport.getPrice() );
            ps.executeUpdate();
        } catch ( SQLException ex ) {
            throw new FogException( ex.getMessage() );
        }
    }
}
