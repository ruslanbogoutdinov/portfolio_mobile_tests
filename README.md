# Демо-проект по автоматизации тестирования мобильного приложения Wikipedia

<img title="Wikipedia" src="src/test/resources/media/images/WikiLogo.jpg" alt="Wikipedia"/>

## Содержание

* <a href="#cases">Реализованные проверки</a>

* <a href="#console">Запуск тестов из терминала</a>

* <a href="#jenkins">Запуск тестов в Jenkins</a>

* <a href="#allure">Отчеты в Allure Report</a>

* <a href="#allure-testops">Интеграция с Allure TestOps</a>

* <a href="#telegram">Telegram уведомление</a>

* <a href="#video">Видео пример прогона автотеста через BrowserStack</a>

<a id="cases"></a>
##  Реализованные проверки

-  Проверка поиска статей
-  Проверка раздела с сохраненными статьями
-  Проверка раздела настроек (добавление / удаление языка)

<a id="console"></a>
##  Запуск тестов из терминала
### Локальный запуск тестов

```
gradle clean test -DdeviceHost=local
```

### Удаленный запуск тестов

```
gradle clean test -DdeviceHost=browserstack
```

<a id="jenkins"></a>
## <img src="src/test/resources/media/logos/Jenkins.svg" alt="Jenkins" width="25" height="25"/> Запуск тестов в [Jenkins](https://jenkins.autotests.cloud/job/mobile_automation_portfolio/)

#### Главная страница Jenkins

<p align="center">
<img title="Jenkins" src="src/test/resources/media/screenshots/Jenkins.png" alt="Jenkins"/>

> Для запуска сборки необходимо нажать <strong>*Build Now*</strong>.
</p>

<a id="allure_report_and_allure_testops"></a>
#### Значки Allure Report и Allure TestOps

<p align="center">
<img title="Allure buttons in Jenkins" src="src/test/resources/media/screenshots/AllureButtons.png" alt="Allure buttons in Jenkins">

> Клик по иконкам <strong>*Allure TestOps*</strong> и <strong>*Allure Report*</strong> позволяет перейти
> на просмотр страниц с тестовой документацией и отчетов.
</p>

<a id="allure"></a>
## <img src="src/test/resources/media/logos/AllureReport.svg" alt="Allure Report" width="25" height="25"/></a> Отчеты в [Allure Report](https://jenkins.autotests.cloud/job/mobile_automation_portfolio/allure/)

#### Главная страница Allure Report

<p align="center">
<img title="Allure Report overview" src="src/test/resources/media/screenshots/AllureReportMain.png" alt="Allure Report overview">

> Ссылка на отчеты выше может не работать. Для того, чтобы увидеть свежую информацию о прогоне тестов,
> стоит открыть отчет последнего тестового прогона вручную, как показано в разделе <a href="#allure_report_and_allure_testops">Значки Allure Report и Allure TestOps</a>.
</p>

#### Тесты

<p align="center">
<img title="Allure Report tests" src="src/test/resources/media/screenshots/AllureTests.png" alt="Allure Report tests">
</p>

#### Графики

<p align="center">
<img title="Allure Report graphs" src="src/test/resources/media/screenshots/AllureGraphs.png" alt="Allure Report graphs">
</p>

<a id="allure-testops"></a>
## <img src="src/test/resources/media/logos/AllureTestOps.svg" width="25" height="25"/></a> Интеграция с [Allure TestOps](https://allure.autotests.cloud/project/4186/dashboards)

>Allure TestOps поддерживает подход <strong>*Test cases as a code*</strong>, что позволяет из кода поддерживать тестовую документацию в актуальном состоянии.

#### Тест-кейсы

<p align="center">
<img title="Allure TestOps tests" src="src/test/resources/media/screenshots/AllureTestOpsTests.png" alt="Allure TestOps tests">
</p>

#### Дашборды

<p align="center">
<img title="Allure TestOps dashboards" src="src/test/resources/media/screenshots/AllureTestOpsDashboards.png" alt="Allure TestOps dashboards">
</p>

<a id="telegram"></a>
## <img src="src/test/resources/media/logos/Telegram.svg" width="25" height="25"/></a> Telegram уведомление

#### Оповещение о результатах сборки

<p>
<img title="Telegram notification" src="src/test/resources/media/screenshots/Telegram.png" width="500" alt="Telegram notification">
</p>

<a id="video"></a>
## <img src="src/test/resources/media/logos/Browserstack.svg" width="25" height="25"/></a> Видео пример прогона автотеста через BrowserStack

<p align="center">
<img title="Browserstack video" src="src/test/resources/media/video/BrowserStackTestVideo.gif" width="500" alt="Browserstack video">
</p>