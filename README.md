# Демо-проект по автоматизации тестирования мобильного приложения Wikipedia

<img title="Wikipedia" src="src/test/resources/media/images/WikiLogo.jpg" alt="Wikipedia"/>

## Содержание

* <a href="#cases">Реализованные проверки</a>

* <a href="#console">Запуск тестов из терминала</a>

* <a href="#jenkins">Запуск тестов в Jenkins</a>

* <a href="#allure">Отчет в Allure Report</a>

* <a href="#allure-testops">Интеграция с Allure TestOps</a>

* <a href="#telegram">Telegram уведомление</a>

* <a href="#video">Видео пример прогона автотеста через BrowserStack</a>

<a id="cases"></a>
##  Реализованные проверки

- [x] Проверка на успешный поиск статьи через поисковое поле
- [x] Проверка на успешное открытие найденной статьи путём поиска через поисковое поле
- [x] Проверка на корректное открытие раздела 'Saved' в нижнем боттом баре
- [x] Проверка создания нового списка с сохраненными статьями
- [x] Добавление нового языка в набор языков
- [x] Удаление выбранного языка

<a id="console"></a>
##  Запуск тестов из терминала
### Локальный запуск тестов

```bash
gradle clean test -DdeviceHost=local -Dos_version=12.0
```

### Удаленный запуск тестов

```bash
gradle clean test -DdeviceHost=browserstack -Dos_version=12.0
```

### Параметры запуска

<code>deviceHost</code> – хост (локальный / удаленный), на котором будут запускаться тесты (_по умолчанию - <code>browserstack</code>_).

<code>os_version</code> – версия платформы девайса, на котором предпологается запуск тестов (_по умолчанию - <code>12.0</code>_).

<a id="jenkins"></a>
## <img src="src/test/resources/media/logos/Jenkins.svg" alt="Jenkins" width="25" height="25"/> Запуск тестов в [Jenkins](https://jenkins.autotests.cloud/job/mobile_automation_portfolio/)

#### Главная страница Jenkins

<p align="center">
<img title="Jenkins" src="src/test/resources/media/screenshots/Jenkins.png" alt="Jenkins"/>
</p>

> Для запуска сборки необходимо нажать <code><strong>*Build Now*</strong></code>.

<a id="allure_report_and_allure_testops"></a>
#### Значки Allure Report и Allure TestOps

<p align="center">
<img title="Allure buttons in Jenkins" src="src/test/resources/media/screenshots/AllureButtons.png" alt="Allure buttons in Jenkins">

> Клик по иконкам <code><strong>*Allure TestOps*</strong></code> и <code><strong>*Allure Report*</strong></code> позволяет перейти
> на просмотр страниц с тестовой документацией и отчетов.
</p>

<a id="allure"></a>
## <img src="src/test/resources/media/logos/AllureReport.svg" alt="Allure Report" width="25" height="25"/></a> Отчет в [Allure Report](https://jenkins.autotests.cloud/job/mobile_automation_portfolio/allure/)

#### Главная страница Allure Report

<p align="center">
<img title="Allure Report overview" src="src/test/resources/media/screenshots/AllureReportMain.png" alt="Allure Report overview">
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

> Allure TestOps поддерживает подход <code><strong>*Test cases as a code*</strong></code>, что позволяет из кода поддерживать тестовую документацию в актуальном состоянии.

> В <code><strong>*Allure TestOps*</strong></code> есть возможность наблюдать за выполнением тестов в реальном времени.

> Данные для входа в <code><strong>*Allure TestOps*</strong></code>: <code><strong>*username:*</strong></code>allure8 <code><strong>*password:*</strong></code>allure8

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