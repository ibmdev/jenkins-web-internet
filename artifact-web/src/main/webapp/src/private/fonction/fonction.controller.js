(function() {
	'use strict';
	angular
	.module('app.fonction')
	.controller('fonctionController',fonctionController);
	fonctionController.$inject = [];
	function fonctionController() {
		var vm = this;
		vm.initialiser = function() {
			console.log('initialisation du controller Fonction');
		};
		vm.initialiser();
	}
})();
