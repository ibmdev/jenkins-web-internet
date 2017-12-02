(function() {
	'use strict';
	angular.module('app.shared')
	.controller('AppSharedController',AppSharedController);
	AppSharedController.$inject = [];
	function AppSharedController() {
		var vm = this;
		vm.initialiser = function() {
			console.log('initialisation du controller shared Fct1 ');
		};
		vm.initialiser();
	}
})();
