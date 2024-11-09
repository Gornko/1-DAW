var pasos=window.prompt("Indique numero de pasos")
var coste
var base=0.5
if (pasos<=5){
    coste=pasos*0.1
}else{
    coste=base+(pasos-5)*0.05
}
alert("El precio de la llamada es "+coste+" euros.")