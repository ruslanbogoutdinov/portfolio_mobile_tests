<h1>Демо-проект по автоматизации тестирования мобильного приложения Wikipedia</h1>

<a><img src="src/test/resources/media/images/wiki_logo.jpg" alt="Wikipedia"/></a>

## Содержание

* <a href="#cases">Реализованные проверки</a>

* <a href="#console">Запуск тестов из терминала</a>

* <a href="#jenkins">Запуск тестов в Jenkins</a>

* <a href="#allure">Allure Report отчеты</a>

* <a href="#allure-testops">Интеграция с Allure TestOps</a>

* <a href="#jira">Интеграция с Jira</a>

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
gradle clean test "-DdeviceHost=local"
```

### Удаленный запуск тестов

```
gradle clean test "-DdeviceHost=browserstack" 
```

<a id="jenkins"></a>
## <img src="src/test/resources/media/logos/Jenkins.svg" alt="Jenkins" width="25" height="25"/></a> Запуск тестов в [Jenkins](https://jenkins.autotests.cloud/job/AD_demo_mobile_wb/)
## <img src="media/logo/Jenkins.svg" width="25" height="25"/></a> Запуск тестов в [Jenkins](https://jenkins.autotests.cloud/job/AD_demo_mobile_wb/)

<p align="center">

<a href="https://jenkins.autotests.cloud/job/AD_demo_mobile_wb/"><img src="media/screenshots/JenkinsMobile.png" alt="Jenkins"/></a>

> Для запуска сборки необходимо нажать "Собрать сейчас". Клик по иконкам Allure TestOps и Allure Report позволяет перейти
> на просмотр страниц с тестовой документацией и отчетов.
</p>

<a id="allure"></a>
## <img src="media/logo/Allure.svg" width="25" height="25"/></a> [Allure Report](https://jenkins.autotests.cloud/job/AD_demo_mobile_wb/4/allure/) отчеты

### Основное окно

<p align="center">
<img title="Allure Dashboard" src="media/screenshots/AllureMobile.png">
</p>

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