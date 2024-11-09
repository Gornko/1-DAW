function ej2(num){
    var cadenaNum=num.toString()
    var ultimaCifra=cadenaNum.charAt(cadenaNum.length-1)
    return parseInt(ultimaCifra);
}
var digitos=ej2(1024)
console.log(digitos)