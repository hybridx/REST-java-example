assignment.controller('marksController', 
		['$scope','$mdDialog','$http',"factoryServices",
	function ($scope,$mdDialog,$http,factoryServices) {
	
	
	factoryServices.getMarksData().then(function successCallback(response){
		$scope.marksData=response;
		/*console.log(response);*/
		}, function errorCallback(response){
		       console.log("Error");
	 });
	
	 $scope.showAdvanced = function(ev) {
		    $mdDialog.show({
		      controller: marksFormController,
		      templateUrl: 'resources/views/marksForm.html',
		      parent: angular.element(document.body),
		      targetEvent: ev,
		      clickOutsideToClose:true
		    })
		    /*.then(function(answer) {
		      $scope.status = 'You said the information was "' + answer + '".';
		    }, function() {
		      $scope.status = 'You cancelled the dialog.';
		    });*/
		  };
		  
		  function marksFormController($scope, $mdDialog) {
			    $scope.hide = function() {
			      $mdDialog.hide();
			    };

			    $scope.cancel = function() {
			      $mdDialog.cancel();
			    };

			    $scope.answer = function(answer) {
			      $mdDialog.hide(answer);
			    };
			    
			    factoryServices.getStudentData().then(function successCallback(response){
					$scope.students=response;
			    }, function errorCallback(response){
			       console.log("Error");
			    });

			    factoryServices.getSubjectData().then(function successCallback(response){
					$scope.subjects=response;
					/*console.log(response);*/
			    }, function errorCallback(response){
			       console.log("Error");
			    });
			    
			    
			    $scope.postData = function(){

			    	var fd = new FormData();
			        fd.append('rollNo', $scope.markStudent.rollNo);
			        fd.append('subjectId', $scope.markSubject.subjectId);
			        fd.append('marks',$scope.mark);
			        
			        factoryServices.postMarksData(fd);
			        
			    	console.log($scope.markStudent.rollNo,
			    			$scope.markSubject.subjectId,
			    			$scope.mark);
			    	$scope.cancel();
			    };
			    
			  }
		  
}]);