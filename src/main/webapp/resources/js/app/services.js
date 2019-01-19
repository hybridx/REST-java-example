assignment.factory('factoryServices', ["$http", function($http) {

	var service = {};
	var urlGetStudents = '/api/student/getStudent';
	var urlAddStudents = '/api/student/addStudent';
	var urlGetSubjects = '/api/subject/getSubject';
	var urlAddSubjects = '/api/subject/addSubject';
	var urlGetMarks = '/api/marks/getMarks';
	var urlAddMarks = '/api/marks/addMarks';
	
	service.getStudentData = function(){
		return $http.get(urlGetStudents).then(function(data){
				/*console.log("THIS IS GET!");
				console.log(data.data);*/
				return data.data;
			});
		};
		
	service.postStudentData = function(fd){
		$http.post(urlAddStudents,fd, {
	          transformRequest: angular.identity,
	          headers: {'Content-Type': undefined}
	       }).then(function(response) {
			console.log("Sucessful");
			/*console.log(response);*/
		}, function(errResponse) {
			console.error('ERROR!');
		});
	};
	
	
	
	service.getSubjectData = function(){
		return $http.get(urlGetSubjects).then(function(data){
				return data.data;
			});
		};
		
	service.postSubjectData = function(fd){
		$http.post(urlAddSubjects,fd, {
		        transformRequest: angular.identity,
		        headers: {'Content-Type': undefined}
		     }).then(function(response) {
		    	 console.log("Sucessful");
				/*console.log(response);*/
			}, function(errResponse) {
				console.error('ERROR!');
			});
		};
		
	service.getMarksData = function(){
		return $http.get(urlGetMarks).then(function(data){
				/*console.log("THIS IS GET!");
				console.log(data.data);*/
				return data.data;
			});
		};
		
	service.postMarksData = function(fd){
		$http.post(urlAddMarks,fd, {
			      transformRequest: angular.identity,
			      headers: {'Content-Type': undefined}
			   }).then(function(response) {
				   console.log("Sucessful");
					/*console.log(response);*/
			}, function(errResponse) {
				console.error('ERROR!');
			});
		};
		
	
	return service;
		
}]);
