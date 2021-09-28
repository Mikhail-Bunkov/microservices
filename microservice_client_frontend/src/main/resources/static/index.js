(function ($localStorage) {
    'use strict';

    angular
        .module('app', ['ngRoute', 'ngStorage'])
        .config(config)
        .run();

    function config($routeProvider) {
        $routeProvider
            .when('/products', {
                templateUrl: 'products/products.html',
                controller: 'productsController'
            })
            .otherwise({
                redirectTo: '/'
            });
    }
})();

angular.module('app').controller('indexController', function () {
});