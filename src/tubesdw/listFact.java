
package tubesdw;

class listFact {
    String IDKARYAWAN,NAMAKARYAWAN,GENDER,ASAL,IDTIM,NAMATIM;
    float GAJI,TAHUNMASUK;
    int BONUSGAJI;

    public listFact(String IDKARYAWAN, String NAMAKARYAWAN, String GENDER, String ASAL, String IDTIM, String NAMATIM, float GAJI, int BONUSGAJI, float TAHUNMASUK) {
        this.IDKARYAWAN = IDKARYAWAN;
        this.NAMAKARYAWAN = NAMAKARYAWAN;
        this.GENDER = GENDER;
        this.ASAL = ASAL;
        this.IDTIM = IDTIM;
        this.NAMATIM = NAMATIM;
        this.GAJI = GAJI;
        this.TAHUNMASUK = TAHUNMASUK;
        this.BONUSGAJI = BONUSGAJI;
    }
    
    

    public String getIDKARYAWAN() {
        return IDKARYAWAN;
    }

    public void setIDKARYAWAN(String IDKARYAWAN) {
        this.IDKARYAWAN = IDKARYAWAN;
    }

    public String getNAMAKARYAWAN() {
        return NAMAKARYAWAN;
    }

    public void setNAMAKARYAWAN(String NAMAKARYAWAN) {
        this.NAMAKARYAWAN = NAMAKARYAWAN;
    }

    public String getGENDER() {
        return GENDER;
    }

    public void setGENDER(String GENDER) {
        this.GENDER = GENDER;
    }

    public String getASAL() {
        return ASAL;
    }

    public void setASAL(String ASAL) {
        this.ASAL = ASAL;
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

    public float getGAJI() {
        return GAJI;
    }

    public void setGAJI(float GAJI) {
        this.GAJI = GAJI;
    }

    public float getTAHUNMASUK() {
        return TAHUNMASUK;
    }

    public void setTAHUNMASUK(float TAHUNMASUK) {
        this.TAHUNMASUK = TAHUNMASUK;
    }

    public int getBONUSGAJI() {
        return BONUSGAJI;
    }

    public void setBONUSGAJI(int BONUSGAJI) {
        this.BONUSGAJI = BONUSGAJI;
    }
}
