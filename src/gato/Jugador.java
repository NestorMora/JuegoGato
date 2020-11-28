package gato;


public class Jugador {
    boolean turno;
    String Signo;

    public Jugador(boolean turno, String Signo) {
        this.turno = turno;
        this.Signo = Signo;
    }

    public boolean isTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }

    public String getSigno() {
        return Signo;
    }

    public void setSigno(String Signo) {
        this.Signo = Signo;
    }

    @Override
    public String toString() {
        return "Jugador{" + "turno=" + turno + ", Signo=" + Signo + '}';
    }
    
    
}
