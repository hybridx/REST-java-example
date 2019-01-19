var assignment = angular.module('assignment',['ngRoute','ui.bootstrap','ngMaterial','ngAnimate','ngAria','ngMessages']);


assignment.config(['$routeProvider',function($routeProvider) {
	
	$routeProvider
	.when('/student',{
		templateUrl:'resources/views/student.html',
		controller:'studentController'
	})
	.when('/subject',{
		templateUrl:'resources/views/subject.html',
		controller:'subjectController'
	})
	.when('/marks',{
		templateUrl:'resources/views/marks.html',
		controller:'marksController'
	})
	.otherwise('/student',{
		redirectTo:'/student'
	});
}])
