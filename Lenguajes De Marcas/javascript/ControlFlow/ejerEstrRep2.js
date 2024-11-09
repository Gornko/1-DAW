var num1Str=window.prompt("Introduce numero inicial")
var num1=parseInt(num1Str)
var num2Str =window.prompt("Introduce numero final")
var num2=parseInt(num2Str)
var temp



if(num2<num1){
    temp=num1;
    num1=num2;
    num2=temp;
}



var imprimir=""

for(let i=num1;i<=num2;i++){
    
    imprimir+=i+","
}
imprimir=imprimir.slice(0,-1) 



alert(imprimir)