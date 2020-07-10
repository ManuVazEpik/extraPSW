function validarTarjeta(e){

    /*Detectamos los eventos del teclado y lo guardamos en la variable*/ 
    var teclado = (document.all) ? e.keyCode : e.which;
    var tec = String.fromCharCode(teclado);

    /*Regex para detectar si es mastercard o VISA */ 
    var visaT = /^4\d{3}-?\d{4}-?\d{4}-?\d{4}$/;  //Visa
    var mastT = /^5[1-5]\d{2}-?\d{4}-?\d{4}-?\d{4}$/; //Mastercard

    var check = visaT.test(tec);

    if(check != true){

        check = mastT.test(tec);

    }

    return check;

}

function validarCodigo(e){

    var teclado = (document.all) ? e.keyCode : e.which;
    var tec = String.fromCharCode(teclado);
    
    var regex =/^{3}\d+$/;

    return regex.test(tec);

}

function validarPalabras(e){

    var teclado = (document.all) ? e.keyCode : e.which;
    var tec = String.fromCharCode(teclado);

    var regex = /^[A-Za-z\s]+$/;

    return regex.test(tec);

}
