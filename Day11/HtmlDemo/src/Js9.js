/**
 * 
 */
function strDemo() {
	var res = "";
	var str = "welcome to HTML Programming....by Anisha";
	var len=str.length;
	res+="Length is " + len + "<br/>";
	res+="Lower-Case string is <b> " + str.toLowerCase() + "</b><br/>";
	res+="Upper-Case string is <b> " + str.toUpperCase() + "</b><br/>";
	res+="First Occurence of m is <b> " + str.indexOf("m") + "</b><br/>";
	res+="Char at 5th position is <b> " + str.charAt(5) + "</b><br/>";
	res+="Replaced String is <b> " + str.replace("HTML", "HTML 5") + "</b><br/>";
	
	document.getElementById("res").innerHTML=res;
  

  }