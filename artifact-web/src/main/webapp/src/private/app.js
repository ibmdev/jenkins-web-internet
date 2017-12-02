(function() {
    'use strict';
    var app =  angular.module('app',['app.fonction','app.shared','ui.router']);
    app.run(function ($rootScope,$location, $state) {
        console.log("initialisation de l'application Artifact");
        $state.go('home');
    });
})();
