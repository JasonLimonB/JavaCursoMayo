package com.cursos.main.Genericoss;


class Transporte{}
class Coche extends Transporte{}
class Deportivos extends Transporte{}

class BeanGenerico<T extends  Transporte>{
    private T valor;

    public BeanGenerico(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }
}

public class GenericosEjemplo {
    public static void main(String[] args) {

        /*
        * Ahora podemos ver como un generico solo va a poder tomar el valor de las clasas desde Transporrte, Coche y Deportivo de lo contrario no funcionara
        *
        * Al crear las instancias podemos ver que funciona correctamente y no manda ningun problema
        * */

        BeanGenerico<Transporte> beanGenerico = new BeanGenerico<>(new Transporte());
        BeanGenerico<Transporte> beanGenerico1 = new BeanGenerico<>(new Coche());
        BeanGenerico<Transporte> beanGenerico2 = new BeanGenerico<>(new Deportivos());


        // Pero si intentamos agregar otro tipo de valor mandara un error como en el ejemplo siguiente

        // BeanGenerico<String>  b = new BeanGenerico<String>(new String);


    }
}
