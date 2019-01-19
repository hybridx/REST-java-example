assignment.controller('studentController', 
		['$scope','$http','$timeout',"factoryServices", 
	function($scope,$http,$timeout,factoryServices){

	$scope.addStudent = function(){
		
		var fd = new FormData();
        fd.append('rollNo', $scope.studentInfo.rollNo);
        fd.append('name', $scope.studentInfo.name);
		
        factoryServices.postStudentData(fd);

		$scope.studentInfo.name = null;
		$scope.studentInfo.rollNo = null;
		
		
		$timeout(get,500);
		
	};
	
	function get(){
		factoryServices.getStudentData().then(function successCallback(response){
			$scope.students=response;
	    }, function errorCallback(response){
	       console.log("Error");
	    });
	}
	
	
	factoryServices.getStudentData().then(function successCallback(response){
		$scope.students=response;
    }, function errorCallback(response){
       console.log("Error");
    });
	

}]);