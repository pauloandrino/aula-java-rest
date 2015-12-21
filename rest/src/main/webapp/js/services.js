'use strict';

/* Services */

var restServices = angular.module('restServices', ['ngResource']);

restServices.factory('Produto', ['$resource',
  function($resource){
    return $resource('/rest/rest/produto/find-all', {}, {
      query: {method:'GET',  isArray:true}
    });
  }]);
