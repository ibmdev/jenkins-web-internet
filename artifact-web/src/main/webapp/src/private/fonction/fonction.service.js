(function() {
    'use strict';
	angular.module('app.fonction')
		   .factory('fonctionService', fonctionService);
    fonctionService.$inject = [ '$http'];
	function fonctionService ($http) {
		
		function init() {
			return $http.get( '/mv-web/api/fonction/' )
			.then(fonctionComplete)
			.catch(fonctionFailed);
			function fonctionComplete (response) {
				return response.data;
			}
			function fonctionFailed (error) {
				throw error.data;
			}
		}
		return {
			init : init
		};		
}
})();