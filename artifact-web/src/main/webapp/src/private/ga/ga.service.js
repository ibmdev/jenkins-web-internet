(function() {
    'use strict';
	angular.module('app.ga').factory('gaService', gaService);
    function gaService () {
		function initGA() {
			
			console.log('Initialisation Service Google Analytics');
		}
		return {
			initGA : initGA
		};		
    }
})();