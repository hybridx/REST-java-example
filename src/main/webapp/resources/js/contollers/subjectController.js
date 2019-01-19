assignment.controller('subjectController', 
		['$scope', '$uibModal',"factoryServices","$rootScope", 
	function ($scope,$uibModal,factoryServices,$rootScope){

	
	factoryServices.getSubjectData().then(function successCallback(response){
		$scope.subjects=response;
		/*console.log(response);*/
    }, function errorCallback(response){
       console.log("Error");
    });
	
	$rootScope.$on('reloadEvent', function(event) {
		factoryServices.getSubjectData().then(function successCallback(response){
			$scope.subjects=response;
			/*console.log(response);*/
	    }, function errorCallback(response){
	       console.log("Error");
	    });
	   });

	$scope.open = function(){
	$uibModal.open({
		templateUrl:'resources/views/modalSubject.html',
		controller:function ($scope,$uibModalInstance,factoryServices,$timeout){
			
			$scope.close = function(){$uibModalInstance.close();};
			
			$scope.postSubjectData = function () {
				
				var fd = new FormData();
		        fd.append('subjectId', $scope.subjectInfo.subjectId);
		        fd.append('subjectName', $scope.subjectInfo.subjectName);
		        
		        factoryServices.postSubjectData(fd);
		        
		        $scope.subjectInfo.subjectId=null;
		        $scope.subjectInfo.subjectName=null;
		        
		        $timeout(reload,500);
			};
			
			function reload()
			{
				$scope.$emit('reloadEvent');
			}
			
			

		}
		})
	};

}]);