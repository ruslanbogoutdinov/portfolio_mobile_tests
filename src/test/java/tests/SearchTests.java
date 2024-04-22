package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class SearchTests extends TestBase {
    private static final String searchArticleTitle = "Java";
    @Test
    @Feature("Issue в репозитории")
    @Story("Создание Issue")
    @Owner("ruslanbogoutdinov")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверка на успешный поиск статьи через поисковое поле")
    void articleSearchTest() {
        step("Ввод названия статьи в поисковое поле", () ->
            searchPO.enterValueIntoSearchField(searchArticleTitle)
        );

        step("Проверка на то, что в списке найденных элементов, есть хотя бы одно значение", () ->
                searchPO.verifyAmountOfFoundItemsInSearchList()
        );
    }

    @Test
    @Feature("Issue в репозитории")
    @Story("Создание Issue")
    @Owner("ruslanbogoutdinov")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверка на успешное открытие найденной статьи путём поиска через поисковое поле")
    void openFoundArticleTest(){
        step("Ввод названия статьи в поисковое поле", () ->
            searchPO.enterValueIntoSearchField(searchArticleTitle)
        );

        step("Выбираем первую найденную статью из списка и проверяем что страница со статьей открылась корректно", () -> {
            searchPO.selectNeededArticleInSearchFoundList(0);
            articlePO.verifyArticlePageOpens();
        });
    }
}