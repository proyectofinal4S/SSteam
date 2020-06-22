/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Proyecto_Final;

/**
 * 
 * @author YaSabesQuienSoy =D
 */
class ListaArraysVideojuegos {
     //declaracion de un arreglo estatico de objetos tipo Videojuegos
    private final Videojuegos [] lista;
    //capacidad maxima del arreglo
    private final int MAX=100;
    //contador de objetos tipo videojuego
    private int N;

    public ListaArraysVideojuegos() {
        lista =  new Videojuegos[MAX];
        N=0;
    }
    
    //Metodo ADD añade una persona a la lista
    public void add(Videojuegos v){
        lista[N] = v;
        N=N+1;
    }
    
    //modifica los datos del juego en la lista
    public void edit(Videojuegos v, int pos){
        lista[pos] = v;
    }
    
    //elimina a una persona del la lista
    public void delete (int pos){
        for (int i = pos; i<N-1; i++)
            lista [i] = lista [i+1];
        N=N-1;
    }
    
//    //buscar a una persona en la lista
//    //el metodo equals se ocupa para tipo string cadenas
//    public int buscar(String ced){
//        int pos = -1;
//        for(int i=0; i<N;i++){
//            if (lista[i].getCedula().equals(ced))
//                pos = i;
//        }
//    return pos;
//    }
//    
//    //muestra la lista con videojuegos
    public void imprimeLista(){
        for(int i=0; i<N; i++)
            System.out.println(lista[i].toString());
    }
//    
//    //retorna una persona dada una posicion
//    //nombre de acceso 
//    //que regresa
//    //nombre del metodo
//    //recibe 
//    public Persona get_persona(int pos){
//        if (pos>=0 && pos <N)
//            return lista[pos];
//        else 
//            return null;
//    }
    
    
    //regresa el numero de personas dentro de la lista
    public int count(){
        return N;
    }
    
}
