var angularPage = require('./AngularDocsPage.js');

describe('Страница angular.io', function () {

    beforeEach(function () {
        browser.get('https://angular.io/docs/');
    });

    describe('Боковая панель навигации', function () {

        it('Боковая панель видима', function () {
            expect(angularPage.getShell().getAttribute('class')).toContain('sidenav-open');
        });

        it('При клике на меню, боковая панель скроется', function () {
            var EC = protractor.ExpectedConditions;
            angularPage.getMenuButton().click();
            browser.wait(EC.invisibilityOf(angularPage.getSideNav()));
            expect(angularPage.getShell().getAttribute('class')).toContain('sidenav-closed');
        });

        it('Количество разделов боковой панели равно 5', function () {
            expect(angularPage.getListNavItems().count()).toBe(5);
        });

        it('При клике отобразиться страница GETTING STARTED', function () {
            angularPage.getListNavItems().get(0).click();
            expect(browser.getCurrentUrl()).toEqual('https://angular.io/guide/quickstart');
        });

        it('При клике развернётся список TUTORIAL', function () {
            angularPage.getListNavItems().get(1).click();
            expect(angularPage.getListNavItems().get(1).getAttribute('class')).toContain('expanded');
        });

        it('Количество подразделов Tutorial равно 8', function () {
            angularPage.getListNavItems().get(1).click();
            expect(angularPage.getListTutorials().count()).toBe(8);
        });

        it('Подразделы Tutorial selected', function () {
            angularPage.getListNavItems().get(1).click();
            angularPage.getListTutorials().each(function (items) {
                items.click();
                expect(items.getAttribute('class')).toContain('selected');
            });
        });

        it('При клике свернётся список разделов TUTORIAL', function () {
            angularPage.getListNavItems().get(1).click();
            angularPage.getListNavItems().get(1).click();
            expect(angularPage.getListNavItems().get(1).getAttribute('class')).toContain('collapsed');
        });

        it('При клике кнопки версий документации появится список версий Angular (5)', function () {
            angularPage.getVersionButton().click();
            expect(angularPage.getListVersions().count()).toBe(5);
        });

        it('При клике кнопки версий документации будет выбрана текущая версия', function () {
            angularPage.getVersionButton().click();
            expect(angularPage.getListVersions().get(1).getAttribute('class')).toContain('selected')
        })

    });

    describe('Верхнее меню', function () {

        it('Должна открыться страница features', function () {
            angularPage.getLinkFeatures().click();
            expect(browser.getCurrentUrl()).toEqual('https://angular.io/features');
        });

        it('Должна открыться страница docs', function () {
            angularPage.getLinkDocs().click();
            expect(browser.getCurrentUrl()).toEqual('https://angular.io/docs');
        });

        it('Должна открыться страница resources', function () {
            angularPage.getLinkResources().click();
            expect(browser.getCurrentUrl()).toEqual('https://angular.io/resources');
        });

        it('Должна открыться страница events', function () {
            angularPage.getLinkEvents().click();
            expect(browser.getCurrentUrl()).toEqual('https://angular.io/events');
        });

        it('Должна открыться страница blog', function () {
            browser.ignoreSynchronization = true;
            angularPage.getLinkBlog().click();
            expect(browser.getCurrentUrl()).toEqual('https://blog.angular.io/');
            browser.ignoreSynchronization = false;
        });

        it('Должна открыться стартовая страница home', function () {
            angularPage.getLinkHome().click();
            expect(browser.getCurrentUrl()).toEqual('https://angular.io/');
        });

        it('Поиск по значению api', function () {
            angularPage.getFindField().sendKeys('api');
            browser.waitForAngular(function () {
                angularPage.getSearchResults().getText().then(function (text) {
                    expect(text.toEquals('Search Results'));
                });
            });

        });

    });
});