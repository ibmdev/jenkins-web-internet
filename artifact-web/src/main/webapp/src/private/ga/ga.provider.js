(function() {
    'use strict';
	angular.module('app.ga').provider('ga', gaProvider);
    function gaProvider () {
    	
    	this.sendAnalytics = function() {
			console.log('Send analytics');
		};
    	
    	this.$get = function() {};
    }
})();