

function randomColor() {
    var color1 = '#' + Math.random().toString(16).substr(2, 6);
    document.getElementById("favcolbutton").style.backgroundColor = color1;
  
    var color2 = '#' + Math.random().toString(16).substr(2, 6);
    document.getElementById("nameInput").style.backgroundColor = color2;
  
    //document.getElementById("favcolbutton").innerHTML = color;
    console.log(color1);
    console.log(color2);
  }