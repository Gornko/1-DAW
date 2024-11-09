document.addEventListener("DOMContentLoaded", function(){

    var boton1=document.getElementById("b1")
    var boton2=document.getElementById("b2")
    var boton3=document.getElementById("b3")
    var boton4=document.getElementById("b4")
    boton1.addEventListener("click", centrarH1)
    boton2.addEventListener("click", cambiarColor)
    boton3.addEventListener("click", eliminarInput)
    boton4.addEventListener("click", insertarLi)



    function centrarH1(){
        var h1=document.getElementsByTagName("h1")[0]
        h1.style.textAlign="center"
    }

    function cambiarColor(){
        var section1=document.getElementById("section1")
        var h2=section1.getElementsByTagName("h2")[0]
        h2.style.color="red"
    }
    function eliminarInput(){
        var input=document.getElementById("myInput")
        input.remove()

    }
    function insertarLi(){
        var ul=document.getElementsByTagName("ul")[1]
        var li=document.createElement("li")
        var texto=document.createTextNode("Elemento 4")
        li.appendChild(texto)
        ul.appendChild(li)
    }
























})