module.exports = function (grunt) {
	
 'use strict';
	
 require('load-grunt-tasks')(grunt);

 grunt.initConfig({

	pkg: grunt.file.readJSON('package.json'),

	dirs:{
		src:  'src/main/webapp/src',
        views: 'src/main/webapp/views',
		test: 'src/test/js',
		build: 'src/main/webapp/build',
		css: 'src/main/webapp/css',
		vendor: 'src/main/webapp/vendor',
		bowerComponents: 'src/main/webapp/components'
	},

	src: {
		js: ['src/webapp/src/**/*.js'],
		templates: ['src/webapp/src/**/*.html']
	},

	clean: {
		build: {
			src: [ '<%=dirs.build%>']
		},
		bower: { 
			src: [ '<%=dirs.bowerComponents%>/*','!<%=dirs.bowerComponents%>/readme.txt']
		}
	},

	'bower-install-simple': {
		options: {
			color:       true,
			production:  false,
			directory:   '<%=dirs.bowerComponents%>'
		}
	},

	concat: {
		
		app : {
			src: [		      	
					'<%= dirs.bowerComponents %>/angular/angular.js',
					'<%= dirs.bowerComponents %>/angular-i18n/angular-locale_fr-fr.js',
					'<%= dirs.bowerComponents %>/angular-bootstrap/ui-bootstrap-tpls.min.js',
					'<%= dirs.bowerComponents %>/angular-ui-router/release/angular-ui-router.js',
					'<%= dirs.bowerComponents %>/angular-messages/angular-messages.min.js',
					'<%= dirs.bowerComponents %>/angular-file-upload/dist/angular-file-upload.min.js',
					'<%= dirs.bowerComponents %>/lodash-compat/lodash.min.js',
					'<%= dirs.vendor %>/jquery-2.1.4.js',
					'<%= dirs.vendor %>/bootstrap.js',
					'<%= dirs.vendor %>/bootstrap-datepicker.js',
					'<%= dirs.vendor %>/bootstrap-datepicker.fr.js',
					'<%= dirs.vendor %>/highcharts.js',
					'<%= dirs.src %>/public/**/*.module.js',
					'<%= dirs.src %>/public/**/*.service.js',
					'<%= dirs.src %>/public/**/*.controller.js',
					'<%= dirs.src %>/private/**/*.module.js',
					'<%= dirs.src %>/private/**/*.service.js',
					'<%= dirs.src %>/private/**/*.controller.js',					
					'<%= dirs.build %>/app.templates.js'
			      ],
			dest: '<%= dirs.build %>/app.js',
		}
	},

	ngAnnotate: {
		dist: {
			files: [{
				expand: true,
				cwd: '<%=dirs.build%>',
				src: 'app.js',
				dest: '<%=dirs.build%>'
			}]
		}
	},

	uglify: {
		options: {
			banner: '/* <%=pkg.name%>:<%=pkg.version%> (<%=process.env.USERNAME%>@<%=process.env.COMPUTERNAME%>/<%=grunt.template.today("isoDateTime")%>) */\n',
			sourceMap: '<%=dirs.build%>/source-map.js'
		},
		build: {
			files: {
				'<%=dirs.build%>/app.min.js': ['<%=dirs.build%>/app.js']
			}
		}
	},

	cssmin: {
		minify: {
			files: [{
				src: [ '<%= dirs.vendor %>/bootstrap-datepicker.min.css',
				       '<%= dirs.css %>/mv.css',
				       '<%= dirs.css %>/font-awesome.min.css'
				       ],
				dest: '<%=dirs.build%>/app.min.css'
          }]
		}
	},

	jshint: {
		options: {
			jshintrc: '.jshintrc',
			reporterOutput: ''
		},
		files: {
			src: ['Gruntfile.js', '<%= dirs.src %>/**/*.js']
		}
	},

	html2js: { // templates
         options: {
             module: 'mv.templates',
             base: 'src/main/webapp/',
             htmlmin: {collapseWhitespace: true},
             singleModule: true
         },
         main: {
             src: ['<%=dirs.views%>/*.html'],
             dest: '<%=dirs.build%>/app.templates.js'
         }
     },

     'string-replace': {
         templates: {
            files: 	{ '<%=dirs.build%>/app.js': ['<%=dirs.build%>/app.js']
            		},
            options: {
                replacements: [
                    {
                        pattern: /\/\*build:artifact.templates\*\//,
                        replacement:',"mv.templates"'
                    }
                ]
            }
         }
     },

	csslint: {
		options: { ids:false, 'adjoining-classes':false, 'box-model':false, 'important':false },
		files: {
			src: ['<%= dirs.src %>/**/*.css']
		}
	}

 });


 grunt.registerTask('default', ['build']);
 grunt.registerTask('build', 'Perform a normal build', ['jshint','csslint','html2js','concat','string-replace','ngAnnotate','uglify','cssmin']);
 grunt.registerTask('bower', ['clean:bower','bower-install-simple']);

};