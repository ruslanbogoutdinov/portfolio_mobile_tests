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
## <img src="src/test/resources/media/logos/jenkins.svg" alt="Jenkins" width="25" height="25"/> Запуск тестов в [Jenkins](https://jenkins.autotests.cloud/job/mobile_automation_portfolio/)

#### Главная страница Jenkins

<p align="center">

<a><img src="src/test/resources/media/screenshots/Jenkins.png" alt="Jenkins"/></a>

> Для запуска сборки необходимо нажать <strong>*Build Now*</strong>. Клик по иконкам <strong>*Allure TestOps*</strong> и <strong>*Allure Report*</strong> позволяет перейти
> на просмотр страниц с тестовой документацией и отчетов.
</p>

#### Значок Allure Report

<p align="center">
<img title="Allure Dashboard" src="src/test/resources/media/screenshots/AllureReportButton.svg" alt="Allure Report button in Jenkins">
</p>

<a id="allure"></a>
## <img src="src/test/resources/media/logos/AllureReport.svg" alt="Allure Report" width="25" height="25"/></a> [Allure Report](https://) отчеты

### Тесты

<p align="center">
<img title="Allure Tests" src="media/screenshots/AllureTestsMobile.png">
</p>

<a id="allure-testops"></a>
## <img src="media/logo/Allure_TO.svg" width="25" height="25"/></a> Интеграция с [Allure TestOps](https://allure.autotests.cloud/project/1910/dashboards)

>Allure TestOps поддерживает подход Test cases as a code, что позволяет из кода поддерживать тестовую документацию в актуальном состоянии.

<p align="center">
<img title="Allure TestOps" src="media/screenshots/TOpsMobile1.png">
</p>

<p align="center">
<img title="Allure TestOps" src="media/screenshots/TOpsTestsMobile.png">
</p>

<a id="jira"></a>
## <img src="media/logo/Jira.svg" width="25" height="25"/></a> Интеграция с [Jira](https://jira.autotests.cloud/browse/HOMEWORK-548)

<p align="center">
<img title="Jira" src="media/screenshots/jiraMobile.png">
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