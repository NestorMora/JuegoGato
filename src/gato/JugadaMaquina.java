
package gato;

import java.util.ArrayList;

public class JugadaMaquina {
    private Tablero tablero;
    private final ArrayList<Tablero> listaTablero;
    
    public JugadaMaquina(){
        listaTablero = new ArrayList();
        crearTableros();
    }
    
    public final boolean verificarEjes(int[][] partida, int s) {                             
        for (int i = 0; i < partida.length; i++) {
            if (partida[i][0] == s && partida[i][1] == s && partida[i][2] == s) 
                return true;
            else
                if (partida[0][i] == s && partida[1][i] == s && partida[2][i] == s) 
                    return true;
        }
        if ((partida[0][0] == s && partida[1][1] == s && partida[2][2] == s)) 
            return true;
         else if ((partida[0][2] == s && partida[1][1] == s && partida[2][0] == s)) 
            return true;
        return false;
    }
    public final boolean verificarEmpate(int[][] partida){
        for (int[] partida1 : partida) {
            for (int j = 0; j < partida1.length; j++) {
                if (partida1[j] == -1)  
                    return false;
            }
        }
        return true;
    }
    
    public int[] existeRaya(int[][] partida){
        for (int i = 0; i < partida.length; i++) {
            for (int j = 0; j < partida.length; j++) {
                if (partida[i][j] == -1)
                    return new int[]{i,j};
            }
        }
        return null;
    }  
    
    public int[] bloquearJuego(int[][] partida, int s, int ss){        
        for (int i = 0; i < partida.length; i++) {
             //Empezamos a recorre los ejes horizontales
            //Empezamos a recorre los ejes verticales
            if (partida[i][0] == s && partida[i][1] == s && partida[i][2] != ss) 
                return new int[]{i,2};                      //i = 0,2 - 1,2 - 2,2
            else if (partida[i][0] == s && partida[i][2] == s && partida[i][1] != ss) 
                return new int[]{i,1};                      //i = 0,1 - 1,1 - 2,1
            else if (partida[i][1] == s && partida[i][2] == s && partida[i][0] != ss) 
                return new int[]{i,0};                      //i = 0,0 - 1,0 - 2,0
           else if (partida[0][i] == s && partida[1][i] == s && partida[2][i] != ss) 
                return new int[]{2,i};                      //i = 2,0 - 2,1 - 2,2
           else if (partida[0][i] == s && partida[2][i] == s && partida[1][i] != ss) 
                return new int[]{1,i};                      //i = 1,0 - 1,1 - 1,2
            else if (partida[1][i] == s && partida[2][i] == s && partida[0][i] != ss) 
                return new int[]{0,i};                      //i = 0,0 - 0,1 - 0,2
        }
        //Ahora recorremos las diagonales
        if ((partida[0][0] == s && partida[2][2] == s && partida[1][1] != ss) || 
                (partida[0][2] == s && partida[2][0] == s && partida[1][1] != ss)) 
                return new int[]{1,1};                      //i = 1,1
        else if (partida[0][0] == s && partida[1][1] == s && partida[2][2] != ss) 
                return new int[]{2,2};                      //i = 2,2
        else if (partida[1][1] == s && partida[2][2] == s && partida[0][0] != ss) 
                return new int[]{0,0};                      //i = 0,0
        else if (partida[0][2] == s && partida[1][1] == s && partida[2][0] != ss) 
                return new int[]{2,0};                      //i = 2,0
        else if (partida[1][1] == s && partida[2][0] == s && partida[0][2] != ss) 
                return new int[]{0,2};                      //i = 0,2
        return null;
    } 
    
    public int[][] TableroElegido(){        
        int i = (int) Math.floor(Math.random()*(listaTablero.size()));
        return listaTablero.get(i).getTablero();
    }
    
    private void crearTableros(){
            //Tablero ganador 1
            tablero = new Tablero();
            tablero.setTablero(new int[][]{{0, -1, 0}, 
                                      {0, 0, -1}, 
                                      {0, -1, 0}});
            listaTablero.add(tablero);
            
            //Tablero ganador 2
            tablero = new Tablero();
            tablero.setTablero(new int[][]{{0, 0, 0}, {-1, 0, -1}, {0, -1, 0}});
            listaTablero.add(tablero);
            
            //Tablero ganador 3
            tablero = new Tablero();
            tablero.setTablero(new int[][]{{0, -1, 0}, {-1, 0, 0}, {0, -1, 0}});
            listaTablero.add(tablero);
            
            //Tablero ganador 4
            tablero = new Tablero();
            tablero.setTablero(new int[][]{{0, -1, 0}, {-1, 0, -1}, {0, 0, 0}});
            listaTablero.add(tablero);
            
            //Tablero ganador 5
            tablero = new Tablero();
            tablero.setTablero(new int[][]{{-1, 0, -1}, {0, 0, 0}, {-1, 0, -1}});
            listaTablero.add(tablero);
    
    }
}
