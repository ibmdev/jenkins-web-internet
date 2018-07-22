(function() {
	'use strict';
	var foncModule = angular.module('app.fonction', ['ui.router', 'app.ga']);
	foncModule.config(['$stateProvider','gaProvider', function($stateProvider, gaProvider){
			console.log('configuration de la navigation du module fonction');
			$stateProvider
				.state('home', {
					resolve: { 
					     homeResolve: function () { 
					       console.log('Resolve Google Analytics for Home Page');
					       gaProvider.sendAnalytics();
					       
					     } 
					},
					onEnter: function(){
					    console.log('Generate Google Analytics Enter Home Page');
					},
					controller: 'fonctionController',
					controllerAs: 'vm',
					templateUrl: 'src/private/fonction/fonction.html'
			});
	}]);
})();
