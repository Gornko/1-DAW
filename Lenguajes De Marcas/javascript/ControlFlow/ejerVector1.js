let notas=Array(10)
for(let indice in notas){
    notas[indice]=parseInt(prompt("Añadir nota: "))
}
function media(notas){
    let suma=0
    for(let indice in notas){
        suma= suma+notas[indice]
    }
    return suma/notas.length
}
console.log("La media de las notas es: "+media(notas))