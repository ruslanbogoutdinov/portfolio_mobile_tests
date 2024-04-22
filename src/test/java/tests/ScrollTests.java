package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Feature("Открытие статей путем скрола")
public class ScrollTests extends TestBase {
    private static final String
            searchArticleTitle = "Java",
            searchArticleTitleInFoundList = "Java applet";
    @Test
    @Story("Открытие статьи на главной")
    @Owner("ruslanbogoutdinov")
    @Severity(SeverityLevel.MINOR)
    @DisplayName("Открыть первую найденную новостную ссылку путём скрола на главной странице")
    void scrollAndOpenFirstNewsArticleBlockTest() {
        step("Скролим до первой найденной новостной ссылки на главной странице, открываем её и проверяем, корректно ли она открылась", () -> {
            mainPagePO.openFirstFoundArticleByScrollingAndVerifyItOpens();
            articlePO.verifyArticleBlockOpens();
        });
    }

    @Test
    @Story("Открытие статьи в результате поиска")
    @Owner("ruslanbogoutdinov")
    @Severity(SeverityLevel.MINOR)
    @DisplayName("Открыть нужную статью через поисковое поле используя скрол")
    void openTalkPageInNeededArticle() {
        step("Вбиваем название нужной статьи и ищем её путём скрола в найденном списке", () -> {
            searchPO.enterValueIntoSearchField(searchArticleTitle);
            searchPO.scrollToNeededArticleInSearchFoundList(searchArticleTitleInFoundList);
        });
    }
}
