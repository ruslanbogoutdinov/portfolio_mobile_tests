# Демо-проект по автоматизации тестирования мобильного приложения Wikipedia

<a><img src="src/test/resources/media/images/wiki_logo.jpg" alt="Wikipedia"/></a>

## Содержание

* <a href="#cases">Реализованные проверки</a>

* <a href="#console">Запуск тестов из терминала</a>

* <a href="#jenkins">Запуск тестов в Jenkins</a>

* <a href="#allure">Allure Report отчеты</a>

* <a href="#allure-testops">Интеграция с Allure TestOps</a>

* <a href="#telegram">Telegram уведомления</a>

* <a href="#video">Пример видео прогона автотеста</a>

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
<a><img src="src/test/resources/media/screenshots/Jenkins.png" alt="Jenkins"/></a>

> Для запуска сборки необходимо нажать <strong>*Build Now*</strong>.
</p>

#### Значки Allure Report и Allure TestOps

<p align="center">
<img src="src/test/resources/media/screenshots/AllureButtons.png" alt="Allure buttons in Jenkins">

> Клик по иконкам <strong>*Allure TestOps*</strong> и <strong>*Allure Report*</strong> позволяет перейти
> на просмотр страниц с тестовой документацией и отчетов.
</p>

<a id="allure"></a>
## <img src="src/test/resources/media/logos/AllureReport.svg" alt="Allure Report" width="25" height="25"/></a> Отчеты в [Allure Report](https://jenkins.autotests.cloud/job/mobile_automation_portfolio/30/allure/)

#### Главная страница Allure Report

<p align="center">
<img src="src/test/resources/media/screenshots/AllureReportMain.png">
</p>

#### Тесты

<p align="center">
<img src="src/test/resources/media/screenshots/AllureTests.png">
</p>

#### Графики

<p align="center">
<img src="src/test/resources/media/screenshots/AllureGraphs.png">
</p>

<a id="allure-testops"></a>
## <img src="src/test/resources/media/logos/AllureTestOps.svg" width="25" height="25"/></a> Интеграция с [Allure TestOps](https://allure.autotests.cloud/project/4186/dashboards)

>Allure TestOps поддерживает подход <strong>*Test cases as a code*</strong>, что позволяет из кода поддерживать тестовую документацию в актуальном состоянии.

#### Тест-кейсы

<p align="center">
<img title="Allure TestOps" src="src/test/resources/media/screenshots/AllureTestOpsTests.png">
</p>

#### Дашборды

<p align="center">
<img title="Allure TestOps" src="src/test/resources/media/screenshots/AllureTestOpsDashboard.png">
</p>

<a id="telegram"></a>
## <img src="media/logo/Telegram.svg" width="25" height="25"/></a> Telegram уведомления

<p >
<img title="telegram bot" src="media/screenshots/mobileBot.png">
</p>

<a id="video"></a>
## <img src="media/logo/Browserstack.svg" width="25" height="25"/></a> Пример видео прогона автотеста

<p align="center">
  <img title="Browserstack Video" src="media/video/currencyTestCut.gif">
</p>