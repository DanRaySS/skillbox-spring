import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.ArrayList;

public class DB {

    private final String HOST = "localhost";
    private final String PORT = "3306";
    private final String DB_NAME = "java_db";
    private final String LOGIN = "root";
    private final String PASS = "root";

    private Connection dbConn = null;

    public ArrayList<Integer> usersIDs = new ArrayList<>();

    public ArrayList<Integer> itemsIDs = new ArrayList<>();

    public ArrayList<String> itemsCategories = new ArrayList<>();

    public ArrayList<String> usersLogins = new ArrayList<>();


    private Connection getDbConnection() throws ClassNotFoundException, SQLException {
        String connStr = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DB_NAME;
        Class.forName("com.mysql.cj.jdbc.Driver");

        dbConn = DriverManager.getConnection(connStr, LOGIN, PASS);
        return dbConn;
    }

    public void insertArticle(int user_id, int items_id) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO `orders` (user_id, item_id) VALUES (?, ?)";

        PreparedStatement prSt = getDbConnection().prepareStatement(sql);
        prSt.setInt(1, user_id);
        prSt.setInt(2, items_id);

        prSt.executeUpdate();
    }

    public void getArticles(String table) throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM " + table + " WHERE `login` = 'john'";

        Statement statement = getDbConnection().createStatement();
        ResultSet res = statement.executeQuery(sql);
        while (res.next()) {
            int userId = res.getInt("id");
            String usersLogin = res.getString("login");
            usersIDs.add(userId);
            usersLogins.add(usersLogin);
        }
    }

    public void getArticles2 (String table) throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM " + table + " WHERE `category` = 'hats'";

        Statement statement = getDbConnection().createStatement();
        ResultSet res = statement.executeQuery(sql);
        while (res.next()) {
            int itemsId = res.getInt("id");
            String usersCategorie = res.getString("title");
            itemsCategories.add(usersCategorie);
            itemsIDs.add(itemsId);
        }
    }
}
