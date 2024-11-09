
var notaStr=window.prompt("mete nota")
var nota=parseInt(notaStr)

switch (nota) {
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
        alert("tienes una F")
        break;
    case 6:
        alert("tienes una D")
    case 7:
        alert("tienes una C")
        break;
    case 8:
        alert("tienes una B")
        break;
    case 9:
    case 10:
        alert("tienes una A")
        break;

    default: alert("no valido")
        break;
}

    