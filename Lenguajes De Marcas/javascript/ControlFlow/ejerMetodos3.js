function ej3(num1,num2,num3){
    if (num1<num2&&num1<num3){
        return num1
    } else if(num2<num1&&num2<num3){
        return num2
    }else
        return num3
}
var n1=21, n2=33, n3=50
var min= ej3(n1,n2,n3)
console.log("el menor es: "+min)