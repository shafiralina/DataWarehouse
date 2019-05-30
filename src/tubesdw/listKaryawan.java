
package tubesdw;

class listKaryawan {
    String IDTIM,IDKARYAWAN,NAMAKARYAWAN,GENDER,ASAL;
    int TAHUNMASUK;
    float GAJI;
    
    public listKaryawan(String IDKARYAWAN, String NAMAKARYAWAN, String GENDER,String ASAL,
                        String IDTIM,float GAJI,int TAHUNMASUK){
        this.ASAL=ASAL;
        this.GAJI=GAJI;
        this.GENDER=GENDER;
        this.IDKARYAWAN=IDKARYAWAN;
        this.IDTIM=IDTIM;
        this.NAMAKARYAWAN=NAMAKARYAWAN;
        this.TAHUNMASUK=TAHUNMASUK;
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

    public String getIDKARYAWAN() {
        return IDKARYAWAN;
    }

    public void setIDKARYAWAN(String IDKARYAWAN) {
        this.IDKARYAWAN = IDKARYAWAN;
    }

    public int getTAHUNMASUK() {
        return TAHUNMASUK;
    }

    public void setTAHUNMASUK(int TAHUNMASUK) {
        this.TAHUNMASUK = TAHUNMASUK;
    }

    public float getGAJI() {
        return GAJI;
    }

    public void setGAJI(float GAJI) {
        this.GAJI = GAJI;
    }
    
    
    
}