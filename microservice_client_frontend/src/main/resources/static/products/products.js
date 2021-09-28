angular.module('app').controller('productsController', function ($scope, $http) {
    const contextPath = 'http://localhost:8190/get-products';


    $scope.load = function () {
        $http({
            url: contextPath,
            method: 'GET',
        }).then(function (response) {
            $scope.products = response.data;
            console.log(response.data);
        });
    };

    $scope.load();
});