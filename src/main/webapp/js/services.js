'use strict';

angular.module('defaultApp.services', ['ngResource'])
    .value('version', '1.0')
    .service('defaultService', ['$http', '$q', function($http, $q) {

    	var get = function(url) {
    		var deferred = $q.defer();
    		$http({
    			method : 'GET',
    			url : url
    		}).success(function(data) {
    			deferred.resolve(data ? data : data);
    		}).error(function(error) { 
    			deferred.reject(error ? error.return : error);
    		});
    		return deferred.promise;
    	};

    	var post = function(url, data) {
    		var deferred = $q.defer();
    		$http({
    			method : 'POST',
    			url : url,
    			data: data
    		}).success(function(data) {
    			deferred.resolve(data ? data : data);
    		}).error(function(error) { 
    			deferred.reject(error ? error.return : error);
    		});
    		return deferred.promise;
    	};

    	this.getMessage = function () {
    		return get('api/default');
    	};

    }]);