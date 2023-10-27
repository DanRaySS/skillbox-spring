import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ParameterResolutionException;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    @DisplayName("Проверка создания объекта с двумя параметрами")
    public void testTwoParametrs() {

        final String login = "login";
        final String email = "email";

        User user = new User(login, email);

        String userLogin = user.getLogin();
        String userEmail = user.getEmail();

        assertEquals(login, userLogin);
        assertEquals(email, userEmail);
    }

    @Test
    @DisplayName("Проверка установки параметров")
    public void testZeroParametrs() {

        final String login = "login";
        final String email = "email";

        User user = new User();
        User user2 = new User(login, email);

        assertNotEquals(user, user2);
        assertEquals(null, user.getLogin());
        assertEquals(null, user.getEmail());
    }

    @Nested
    @DisplayName("Проверка установки значений")
    class ValueSetting {

        @Test
        @DisplayName("Установка email")
        public void testCorrectEmail() {

            final String login = "login";
            final String email = "email@gmail.com";

            User user = new User(login, email);

            String userEmail = user.getEmail();

            assertTrue(userEmail.contains("@"));
            assertTrue(userEmail.contains("."));

        }

        @Test
        @DisplayName("Установка логина")
        public void testCorrectLogin() {

            final String login = "login";
            final String email = "email@gmail.com";

            User user = new User(login, email);

            String userLogin = user.getLogin();

            assertTrue(login.length() >= 5);

        }

    }

}