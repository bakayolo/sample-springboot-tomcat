'use strict';

angular.module('defaultApp.routes', ['ngRoute'])
    .config(['$routeProvider', function ($routeProvider) {
    	$routeProvider.when('/default', { templateUrl: 'html/default.html', controller: 'DefaultCtrl' });
        $routeProvider.otherwise({ redirectTo: '/default' });
    }]);
