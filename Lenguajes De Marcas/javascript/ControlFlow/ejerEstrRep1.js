do{
    var num1Str=window.prompt("Introduce un numero mayor que 0")
    var num1=parseInt(num1Str)
    if(num1<1){
        alert("numero no valido")
    }

}while(num1<1)
do{
    var num2Str=window.prompt("Introduce otro numero mayor que 0")
    var num2=parseInt(num2Str)
    if(num1<1){
        alert("numero no valido")
    }
}while(num1<1)
var suma=0
for(let i=num1;i<=num2;i++){
    suma+=i
}

alert("la suma es "+suma)

