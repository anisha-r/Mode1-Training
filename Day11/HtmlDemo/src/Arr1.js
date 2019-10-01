/**
 * 
 */
function show() {
	var arr =[3,
	          'hello',
	          function() {
		return "Welcome";
	},
	{'city':'Hyderabad',
	'state':'TS'}
	
	];
	var res="";
	res+="First element" +arr[0] + "<br/>";
	res+="Second element" +arr[1] + "<br/>";
	res+="Third element" +arr[2]() + "<br/>";
	res+="Key value 1" +arr[3].city + "<br/>";
	res+="Key value 2" +arr[3].state + "<br/>";
	
	document.getElementById("res").innerHTML=res;
}