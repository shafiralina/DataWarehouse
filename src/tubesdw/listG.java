
package tubesdw;

class listG {
    String IDKARYAWAN,NAMAKARYAWAN,NAMATIM;

    public listG(String IDKARYAWAN, String NAMAKARYAWAN, String NAMATIM, float GAJITOTAL) {
        this.IDKARYAWAN = IDKARYAWAN;
        this.NAMAKARYAWAN = NAMAKARYAWAN;
        this.NAMATIM = NAMATIM;
        this.GAJITOTAL = GAJITOTAL;
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

    public String getNAMATIM() {
        return NAMATIM;
    }

    public void setNAMATIM(String NAMATIM) {
        this.NAMATIM = NAMATIM;
    }

    public float getGAJITOTAL() {
        return GAJITOTAL;
    }

    public void setGAJITOTAL(float GAJITOTAL) {
        this.GAJITOTAL = GAJITOTAL;
    }
    float GAJITOTAL;
    
}
