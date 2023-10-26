import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        DB db = new DB();
        try {
            db.getArticles("users");
            db.getArticles2("items");
            var userIdList = db.usersIDs;
            var itemsIdList = db.itemsIDs;
            var itemsCategoriesList = db.itemsCategories;
            var itemsLoginsList = db.usersLogins;

            for (int i = 0; i < itemsIdList.size(); i++) {
                db.insertArticle(userIdList.get(0),itemsIdList.get(i));
                System.out.println(itemsLoginsList.get(0) + " - " + itemsCategoriesList.get(i));
            }

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}