
package tubesdw;

class listTim {
    String IDTIM,NAMATIM;
    int BONUSGAJI;
    
    public listTim(String IDTIM, String NAMATIM, int BONUSGAJI){
        this.BONUSGAJI=BONUSGAJI;
        this.IDTIM=IDTIM;
        this.NAMATIM=NAMATIM;
    }

    public String getIDTIM() {
        return IDTIM;
    }

    public void setIDTIM(String IDTIM) {
        this.IDTIM = IDTIM;
    }

    public String getNAMATIM() {
        return NAMATIM;
    }

    public void setNAMATIM(String NAMATIM) {
        this.NAMATIM = NAMATIM;
    }

    public int getBONUSGAJI() {
        return BONUSGAJI;
    }

    public void setBONUSGAJI(int BONUSGAJI) {
        this.BONUSGAJI = BONUSGAJI;
    }
}
