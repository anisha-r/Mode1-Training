function show() {
	var today=new Date();
	var fullyear = today.getFullYear();
	var future = new Date("August 15, "+fullyear);
	var diff = future.getTime()-today.getTime();
	var days=Math.ceil(diff / (1000 * 60 * 60 *24));
	var res = "Onlu <u>" + days +
	"</u> days left 'till Independence Day! ";
	document.getElementById("res").innerHTML=res;
}