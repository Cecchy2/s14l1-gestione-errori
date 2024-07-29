package esercizio3;

public class ContoOnLine extends ContoCorrente {
    private double maxPrelievo;

    public ContoOnLine(String titolare, double saldo, double maxP) {
        super(titolare, saldo);
        this.maxPrelievo = maxP;
    }


    public void stampaSaldo() {
        System.out.println("Titolare: " + getTitolare() + " - Saldo: " + getSaldo() + " - Num movimenti: " + getnMovimenti()
                + " - Massimo movimenti: " + getMaxMovimenti() + " - Massimo prelievo possibile: " + maxPrelievo);
    }

    public void preleva(double x) throws BancaException {
        if (x <= maxPrelievo) {
            super.preleva(x);
        }
        if (x > maxPrelievo) {
            throw new BancaException("il prelievo non è disponibile");
        }
    }

    public double getMaxPrelievo() {
        return maxPrelievo;
    }

    public void setMaxPrelievo(double maxPrelievo) {
        this.maxPrelievo = maxPrelievo;
    }
}
