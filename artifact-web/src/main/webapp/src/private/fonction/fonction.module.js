(function() {
	'use strict';
	angular.module('app.fonction', ['ui.router'])
	.config(['$stateProvider', function($stateProvider){
			console.log('configuration de la navigation du module fonction');
			$stateProvider
				.state('home', {
					controller: 'fonctionController',
					controllerAs: 'vm',
					templateUrl: 'src/private/fonction/fonction.html'
			});
	}]);
})();
