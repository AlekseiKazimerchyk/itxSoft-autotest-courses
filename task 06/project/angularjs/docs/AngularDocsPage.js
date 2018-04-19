function AngularDocsPage() {
    return {

        getMenuButton: function () {
            return $('button.hamburger.mat-button');
        },
        getVersionButton: function () {
            return $('button.form-select-button');
        },
        getShell: function () {
            return element(by.tagName('aio-shell'));
        },

        getSideNav: function () {
            return $('mat-sidenav.sidenav.mat-sidenav');
        },
        getLinkHome: function () {
            return $('a.nav-link.home[href="/"]');
        },
        getLinkDocs: function () {
            return $('a.nav-link[href="docs"]');
        },
        getLinkFeatures: function () {
            return $('a.nav-link[href="features"]');
        },
        getLinkResources: function () {
            return $('a.nav-link[href="resources"]');
        },
        getLinkEvents: function () {
            return $('a.nav-link[href="events"]');
        },
        getLinkBlog: function () {
            return $('a.nav-link[href="https://blog.angular.io/"]');
        },

        /**
         * getListTutorials
         * [0] - Introduction
         * [1] - The Application Shell
         * [2] - The Hero Editor
         * [3] - Displaying a List
         * [4] - Master/Detail Components
         * [5] - Services
         * [6] - Routing
         * [7] - HTTP
         * @type {ElementArrayFinder}
         */
        getListTutorials: function () {
            return $$('div.heading-children.level-1')
                .$$('aio-nav-item')
                .$$('div')
                .$$('.vertical-menu-item.level-2[href^="tutorial"]');
        },
        /**
         * getListNavItems
         * [0] - Getting Started
         * [1] - Tutorial
         * [2] - Fundamentals
         * [3] - Techniques
         * [4] - API
         * @type {ElementArrayFinder}
         */
        getListNavItems: function () {
            return $$('aio-nav-menu')
                .$$('aio-nav-item')
                .$$('div')
                .$$('.vertical-menu-item.level-1');
        },
        /**
         * getListVersions
         * [0] - next
         * [1] - stable(v5.2.10) - текущая версия
         * [2] - v4 (LTS)
         * [3] - v2
         * [4] - AngularDart
         * @returns {ElementArrayFinder}
         */
        getListVersions: function () {
            return $$('ul.form-select-dropdown.ng-star-inserted li.ng-star-inserted')
        }

    };
}

module.exports = new AngularDocsPage();