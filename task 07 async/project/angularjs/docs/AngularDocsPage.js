function AngularDocsPage() {

    var listNavItems = $$('aio-nav-menu aio-nav-item div .vertical-menu-item.level-1');
    var listTutorials = $$('div.heading-children.level-1 aio-nav-item div .vertical-menu-item.level-2[href^="tutorial"]');
    var listVersions = $$('ul.form-select-dropdown.ng-star-inserted li.ng-star-inserted');
    var listSections = $$('div.search-area h3');

    return {

        getMenuButton: $('button.hamburger.mat-button'),
        getVersionButton: $('button.form-select-button'),
        getShell: $('aio-shell'),

        getFindField: $('input[aria-label="search"]'),
        getSearchResults: $('h2.visually-hidden'),
        getSearchResultsArea: $('div.search-results'),
        getResultsLabel: $('div.search-results p.ng-star-inserted'),
        getSectionSearchResults: listSections,

        getSideNav: $('mat-sidenav.sidenav.mat-sidenav'),
        getLinkHome: $('a.nav-link.home[href="/"]'),
        getLinkDocs: $('a.nav-link[href="docs"]'),
        getLinkFeatures: $('a.nav-link[href="features"]'),
        getLinkResources: $('a.nav-link[href="resources"]'),
        getLinkEvents: $('a.nav-link[href="events"]'),
        getLinkBlog: $('a.nav-link[href="https://blog.angular.io/"]'),

        /**
         * getListNavItems
         * [0] - Getting Started
         * [1] - Tutorial
         * [2] - Fundamentals
         * [3] - Techniques
         * [4] - API
         * @type {ElementArrayFinder}
         */
        getListNavItems: listNavItems,
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
        getListTutorials: listTutorials,
        /**
         * getListVersions
         * [0] - next
         * [1] - stable(v5.2.10) - текущая версия
         * [2] - v4 (LTS)
         * [3] - v2
         * [4] - AngularDart
         * @returns {ElementArrayFinder}
         */
        getListVersions: listVersions

    };
}

module.exports = new AngularDocsPage();