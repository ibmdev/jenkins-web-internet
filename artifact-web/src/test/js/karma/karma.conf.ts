'use strict';

module.exports = function(config) {
    config.set({
      basePath: '',
      frameworks: ['jasmine'],
      plugins:[
        'karma-jasmine',
         'karma-chrome-launcher'
      ],
      files: ['./helloworld/helloworld.spec.js'],
      exclude: [
      ],
      preprocessors: {
      },
      reporters: ['progress'],
      port: 9876,
      colors: true,
      logLevel: config.LOG_INFO,
      autoWatch: false,
      browsers: ['Chrome'],
      singleRun: true,
      concurrency: Infinity
    });
  };
