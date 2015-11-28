'use strict';

angular.module('defaultApp.controllers', [])
    .controller('DefaultCtrl', ['$scope', 'defaultService',
                               function ($scope, defaultService) {
        $scope.message = '';

        $scope.init = function() {
        	defaultService.getMessage().then(
                function (resp) {
                	if (resp) {
                		$scope.message = resp;
                	}
                },
                function (error) {
                    console.log(error);
                }
            );
        };
        $scope.init();

    }]);