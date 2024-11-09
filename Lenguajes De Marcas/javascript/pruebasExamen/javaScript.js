  
        
        function addLi(){
            var lista=document.getElementsByTagName("ul")
            var li=document.createElement("li")
            var texto=document.createTextNode("Pulsando el boton")
            li.appendChild(texto)
            lista[0].appendChild(li)
        }
        function centrar(){
            addLi()
            var cabecera=document.getElementsByTagName("header")

            
        }
        function cambiarImagen(){
            addLi()
            var elem=document.getElementById("i1")
            src.value
        }
        function eliminar(){
            
            var ul=document.getElementsByTagName("ul")
            ul[0].parentNode.removeChild("ul")
        }