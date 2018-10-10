<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.7/angular.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.7/angular-route.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.7/angular-messages.js"></script>

<script>
var Myapp = angular.module('Myapp', ["ngRoute"]);
Myapp.controller('orderFormController', ['$scope', '$http', function($scope, $http) {
$scope.formdata = {};

$scope.saveorder = function(formdata) {
    $scope.error = '';

    // Validate form here and set the error in form
    if (angular.isUndefined(formdata.item) == true) {
        $scope.error = "Name is required."
        return false;
    } else if(angular.isUndefined(formdata.rate) == true){
    	$scope.error = "Age is required."
    	return false;
    }else {
        $scope.error = '';
    }
    $http.post("homeservlet", formdata).success(function(res, status, headers, config) {
       	alert(res);
    	$scope.message = res;

    }).error(function(status, res) {
        $scope.message = res;
    });
}

}]);
</script>
</head>
<body>
<div ng-app="Myapp">
    <div ng-controller="orderFormController">
<span style="color:red">{{error}}</span><br>
        
        Name  :   <input type="text" name="item"  ng-model='formdata.item' required> <p></p>
     Age:   <input type="text" name="rate"  ng-model='formdata.rate' required> <p></p>
	
        <button type="button"  ng-click='saveorder(formdata)' >SAVE ORDER</button><br>{{message}}
    </div> 
	
</body>
</html>
