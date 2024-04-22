package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tests.annotations.Layer;

import static io.qameta.allure.Allure.step;

@Layer("mobile tests")
@Feature("Проверка поиска статей")
public class SearchTests extends BaseTest {
    private static final String searchArticleTitle = "Java";
    @Test
    @Story("Поиск через поисковое поле")
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
    @Story("Открытие статьи путем поиска через поисковое поле")
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