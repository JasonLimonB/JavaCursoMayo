package com.cursos.main.handleexceptions;

public class ExceptionsExample {
    public static void main(String[] args) {

        try{
            int x = 5/0;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Siempre me voy a ejecutar pase lo que pase");
        }

        /*
        * Tambien podemos anidar los catch ya que puede ir uno y enseguida otro y asi hasta usar todos aquellos que necesitemos
        * */

    }
}
