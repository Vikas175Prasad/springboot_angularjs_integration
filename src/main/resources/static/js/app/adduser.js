app.controller("addController",function($scope,$http){
	
	$scope.createUser = function(){
		
		var userObj = {"name":$scope.name,"email":$scope.email,"phone":$scope.phone};
		console.log(userObj);
		
		$http({
			url:"http://localhost:8090/user/addUser",
			method:'POST',
			data: userObj
			
		}).then(function mySuccess(response){
			
			console.log(response);
			
		},function myError(response){
			console.log(response);
		}
			
		)
		
	}
	
});