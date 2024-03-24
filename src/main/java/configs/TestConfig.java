package configs;

import static configs.TargetBrowserEnum.*;

public class TestConfig {
    //Переменная для выбора браузера в котором будет происходить тестирование
    public static final TargetBrowserEnum TARGET_BROWSER = CHROME; // YANDEX
    //Настройки для запуска яндекс браузера
    //Путь к исполняемому файлу Яндекс браузера
    public static final String YANDEX_BROWSER_EXE_PATH = "C:/Users/sv3-t/AppData/Local/Yandex/YandexBrowser/Application/browser.exe";
    //Путь к хром драйверу для работы с Яндекс браузером.
    public static final String YANDEX_BROWSER_CHRONIUM_DRIVER_PATH = "D:/fed/ChromeDriver/chromedriver.exe";

    public static final Integer IMPLICIT_WAIT_SECONDS = 10;  //Таймаут WEB драйвера
    public static final String HOME_PAGE_URL = "https://stellarburgers.nomoreparties.site/"; //Стартовая страница
    public static final String LOCALE_FOR_TEST = "ru-RU"; //Локаль для javafaker
    public static final Integer PASSWORD_MIN_LENGTH = 6; //Минимальная длина генерируемого пароля
    public static final Integer PASSWORD_MAX_LENGTH = 15; //Максимальная длина генерируемого пароля

}