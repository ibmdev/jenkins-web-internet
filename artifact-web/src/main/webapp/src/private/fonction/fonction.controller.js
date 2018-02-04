(function() {
	'use strict';
	angular
	.module('app.fonction')
	.controller('fonctionController',fonctionController);
	fonctionController.$inject = ['$http'];
	function fonctionController($http) {
		var vm = this;
		vm.apples= {};
		vm.initialiser = function() {
			console.log('initialisation du controller Fonction');
		};
		vm.callRest = function() {
			console.log('Appel du controller REST BackEnd');
			$http.get('api/apples/getAll')
	        .then(function(response) {
	        	console.log('Response Data',response.data);
	        	vm.apples = response.data;
	        })
	        .catch(function(error) {
	        	console.error('Error',error);
	        });
		};
		
		vm.initialiser();
		vm.callRest();
	}
})();
