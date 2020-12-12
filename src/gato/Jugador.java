package gato;


public class Jugador {
    boolean turno;
    int Signo;

    public Jugador(boolean turno, int Signo) {
        this.turno = turno;
        this.Signo = Signo;
    }

    public boolean getTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }

    public int getSigno() {
        return Signo;
    }

    public void setSigno(int Signo) {
        this.Signo = Signo;
    }

    @Override
    public String toString() {
        return "Jugador{" + "turno=" + turno + ", Signo=" + Signo + '}';
    }
    
    
}
