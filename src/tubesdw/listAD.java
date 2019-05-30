
package tubesdw;

class listAD {
    String IDKARYAWAN,NAMAKARYAWAN,ASAL,NAMATIM;

    public listAD(String IDKARYAWAN, String NAMAKARYAWAN, String ASAL, String NAMATIM) {
        this.IDKARYAWAN = IDKARYAWAN;
        this.NAMAKARYAWAN = NAMAKARYAWAN;
        this.ASAL = ASAL;
        this.NAMATIM = NAMATIM;
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

    public String getASAL() {
        return ASAL;
    }

    public void setASAL(String ASAL) {
        this.ASAL = ASAL;
    }

    public String getNAMATIM() {
        return NAMATIM;
    }

    public void setNAMATIM(String NAMATIM) {
        this.NAMATIM = NAMATIM;
    }
    
}
