import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement preStatement = null;
        ResultSet resultSet;

        try {
            connection = helper.getConnection();
            String sql = "delete from city where id = ?";

            System.out.println("veritabanına bağlanıldı");

            preStatement = connection.prepareStatement(sql);
            preStatement.setInt(1, 4082);
            preStatement.executeUpdate();
            System.out.println("kayıt silindi");

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            connection.close();
            preStatement.close();
        }
    }


    public static void select() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;

        try {
            connection = helper.getConnection();
            System.out.println("veritabanına bağlanıldı");

            statement = connection.createStatement();
            resultSet = statement.executeQuery("select Code,Name,Continent,Region from country");

            ArrayList<Country> countries = new ArrayList<Country>();

            while (resultSet.next()) {
                countries.add(new Country(
                        resultSet.getString("Code"),
                        resultSet.getString("Name"),
                        resultSet.getString("Continent"),
                        resultSet.getString("Region")));
            }
            System.out.println(countries.size());
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            connection.close();
        }

    }
    public static void insertData() throws SQLException{
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement preStatement = null;
        ResultSet resultSet;

        try {
            connection = helper.getConnection();
            String sql = "insert into city(Name,CountryCode,District,Population) values(?,?,?,?)";

            System.out.println("veritabanına bağlanıldı");

            preStatement = connection.prepareStatement(sql);
            preStatement.setString(1,"Konya");
            preStatement.setString(2,"TUR");
            preStatement.setString(3,"Turkey");
            preStatement.setInt(4,70000);
            preStatement.executeUpdate();
            System.out.println("kayıt eklendi");

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            connection.close();
            preStatement.close();
        }
    }
    public static void updateData() throws SQLException{
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement preStatement = null;
        ResultSet resultSet;

        try {
            connection = helper.getConnection();
            String sql = "update city set population=60000,district='TR' where id = ?";

            System.out.println("veritabanına bağlanıldı");

            preStatement = connection.prepareStatement(sql);
            preStatement.setInt(1, 4082);
            preStatement.executeUpdate();
            System.out.println("kayıt güncellendi");

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            connection.close();
            preStatement.close();
        }
    }
}
