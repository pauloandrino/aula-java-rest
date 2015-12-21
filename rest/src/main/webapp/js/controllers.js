'use strict';

/* Controllers */

var phonecatApp = angular.module('phonecatApp', ['restServices']);

phonecatApp.controller('ProdutoListCtrl', ['$scope', 'Produto', function($scope, Produto) {
	  $scope.produtos = Produto.query();
	}]);



/*
// Se minify o javascript, use com o Inject
function ProdutoListCtrl($scope, $http) {
	$http.get('/rest/rest/produto/find-all').success(function(data) {
    $scope.produtos = data;
  });
}

ProdutoListCtrl.$inject = ['$scope','$http'];
phonecatApp.controller('ProdutoListCtrl', ProdutoListCtrl);
 */


// Processo Normal

/*
phonecatApp.controller('PhoneListCtrl', ['$scope', '$http', function($scope, $http) {
	$http.get('/rest/rest/produto/find-all').success(function(data) {
    $scope.produtos = data;
  });

}]);

*/